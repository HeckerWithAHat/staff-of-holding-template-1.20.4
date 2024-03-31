package dev.heckerwithahat;

import dev.heckerwithahat.items.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static dev.heckerwithahat.items.KingOrangeStaff.BLOCK_NBT_KEY;

public class StaffOfHolding implements ModInitializer {
	public static final String MOD_ID = "staffofholding";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	public static final Item KING_ORANGE_STAFF = new KingOrangeStaff(new FabricItemSettings().maxCount(1));
	public static final Item KING_ORANGE_STAFF_MODEL_ITEM = new KingOrangeStaffModelItem(new FabricItemSettings().maxCount(1));
	public static final Item YELLOW_STAFF = new YellowStaff(new FabricItemSettings().maxCount(1));
	public static final Item YELLOW_STAFF_MODEL_ITEM = new YellowStaffModelItem(new FabricItemSettings().maxCount(1));
	public static final Item ORB_STAFF = new OrbStaff(new FabricItemSettings().maxCount(1));
	public static final Item ORB_STAFF_MODEL_ITEM = new OrbStaffModelItem(new FabricItemSettings().maxCount(1));
	public static final RegistryKey<Registry<Runnable>> ABILITIES_REGISTRY_KEY = RegistryKey.ofRegistry(new Identifier(MOD_ID, "abilities"));
	public static final Registry<Runnable> ABILITIES = FabricRegistryBuilder.createSimple(ABILITIES_REGISTRY_KEY)
			.attribute(RegistryAttribute.SYNCED) // Example attribute
			.buildAndRegister();

	//   ALL ABILITIES IN THE REGISTRY MUST FOLLOW THIS FORMAT TO BE REGISTERED
	// Registry.registerReference(ABILITIES, new Identifier("staffofholding", <USE PATH FROM BLOCK REGISTRY IDENTIFIER> + "_" + <ABILITY NUMBER 1|2|3|4|5>), () -> {});


	@Override
	public void onInitialize() {

		LOGGER.info("Hello world!");

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "king_orange_staff"), KING_ORANGE_STAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "king_orange_staff_model_item"), KING_ORANGE_STAFF_MODEL_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "yellow_staff"), YELLOW_STAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "yellow_staff_model_item"), YELLOW_STAFF_MODEL_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "orb_staff"), ORB_STAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "orb_staff_model_item"), ORB_STAFF_MODEL_ITEM);



		// Now you can use your custom registry


	}

	public static void addAbilityToBlock(Block block, int abilityNumber, Runnable runnable) {
		Registry.registerReference(ABILITIES, new Identifier(MOD_ID, Registries.BLOCK.getId(block).getPath() + "_" + abilityNumber), runnable);
	}


	public static void setStoredBlock(ItemStack stack, Block block) {
		NbtCompound nbt = stack.getOrCreateNbt();
		nbt.putString(BLOCK_NBT_KEY, Registries.BLOCK.getId(block).toString());
	}

	public static Block getStoredBlock(ItemStack stack) {
		NbtCompound nbt = stack.getNbt();
		if (nbt != null && nbt.contains(BLOCK_NBT_KEY)) {
			Identifier id = new Identifier(nbt.getString(BLOCK_NBT_KEY));
			return Registries.BLOCK.get(id);
		}
		return Blocks.AIR; // Default to air if no block is stored
	}

	public static void removeStoredBlock(ItemStack stack) {
		NbtCompound nbt = stack.getNbt();
		if (nbt != null && nbt.contains(BLOCK_NBT_KEY)) {
			nbt.remove(BLOCK_NBT_KEY);
		}
	}

}