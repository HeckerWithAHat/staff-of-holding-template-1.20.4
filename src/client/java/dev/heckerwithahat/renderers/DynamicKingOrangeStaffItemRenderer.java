package dev.heckerwithahat.renderers;

import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry.DynamicItemRenderer;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.BlockModelRenderer;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.data.client.Model;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.registry.Registries;
import org.joml.*;

import java.lang.Math;

import static com.mojang.text2speech.Narrator.LOGGER;
import static dev.heckerwithahat.StaffOfHolding.KING_ORANGE_STAFF_MODEL_ITEM;
import static dev.heckerwithahat.StaffOfHolding.getStoredBlock;
import static dev.heckerwithahat.StaffOfHoldingClient.client;


public class DynamicKingOrangeStaffItemRenderer implements DynamicItemRenderer {


    @Override
    public void render(ItemStack stack, ModelTransformationMode renderMode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {



        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        BlockModelRenderer blockModelRenderer = MinecraftClient.getInstance().getBlockRenderManager().getModelRenderer();

        // Get the held item from the staff's NBT
        Item heldItem = getStoredBlock(stack).asItem();

        // Render the held item within the staff's model
        // This involves translating and scaling the matrices to position the held item correctly within the staff
        matrices.push();
        // Example translation and scaling
        matrices.translate(0.5, 0.5, 0.5);
        itemRenderer.renderItem(new ItemStack(KING_ORANGE_STAFF_MODEL_ITEM), renderMode, light, overlay, matrices, vertexConsumers, MinecraftClient.getInstance().world, 0);
        matrices.pop();


        BlockRenderManager blockRenderManager = MinecraftClient.getInstance().getBlockRenderManager();

        matrices.push();

        matrices.scale(0.5f,0.5f,0.5f);
        matrices.translate(0.5,2.5,0.625);
        // Render the held item
        blockRenderManager.renderBlockAsEntity(getStoredBlock(stack).getDefaultState(), matrices, vertexConsumers, light, overlay);


        matrices.pop();


    }

}
