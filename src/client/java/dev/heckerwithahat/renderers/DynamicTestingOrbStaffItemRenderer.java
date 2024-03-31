package dev.heckerwithahat.renderers;

import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry.DynamicItemRenderer;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockModelRenderer;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import static com.mojang.text2speech.Narrator.LOGGER;
import static dev.heckerwithahat.StaffOfHolding.ORB_STAFF_MODEL_ITEM;
import static dev.heckerwithahat.StaffOfHolding.getStoredBlock;
import static dev.heckerwithahat.StaffOfHoldingClient.client;


public class DynamicTestingOrbStaffItemRenderer implements DynamicItemRenderer {


    @Override
    public void render(ItemStack stack, ModelTransformationMode renderMode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        BlockRenderManager blockRenderManager = MinecraftClient.getInstance().getBlockRenderManager();
        BakedModelManager bakedModelManager = MinecraftClient.getInstance().getBakedModelManager();


        // Get the held item from the staff's NBT
        Item heldItem = getStoredBlock(stack).asItem();

        // Render the held item within the staff's model
        // This involves translating and scaling the matrices to position the held item correctly within the staff
        matrices.push();
        // Example translation and scaling
        matrices.translate(0.5, 0.5, 0.5);
        itemRenderer.renderItem(new ItemStack(ORB_STAFF_MODEL_ITEM), renderMode, light, overlay, matrices, vertexConsumers, MinecraftClient.getInstance().world, 0);
        matrices.pop();



        matrices.push();

        matrices.scale(0.5f,0.5f,0.5f);
        matrices.translate(0.5,2.5,0.625);
        // Render the held item
        blockRenderManager.renderBlockAsEntity(getStoredBlock(stack).getDefaultState(), matrices, vertexConsumers, light, overlay);


        matrices.pop();


    }

}
