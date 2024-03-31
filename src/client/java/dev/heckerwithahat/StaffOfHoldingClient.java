package dev.heckerwithahat;

import dev.heckerwithahat.abilities.*;
import dev.heckerwithahat.renderers.DynamicKingOrangeStaffItemRenderer;
import dev.heckerwithahat.renderers.DynamicOrbStaffItemRenderer;
import dev.heckerwithahat.renderers.DynamicTestingOrbStaffItemRenderer;
import dev.heckerwithahat.renderers.DynamicYellowStaffItemRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.MinecraftClient;

public class StaffOfHoldingClient implements ClientModInitializer {

	public static MinecraftClient client;
	@Override
	public void onInitializeClient() {
		// ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
		// CustomStaffRenderer customStaffRenderer = new CustomStaffRenderer(MinecraftClient.getInstance(), MinecraftClient.getInstance().getTextureManager(), MinecraftClient.getInstance().getBakedModelManager(), ItemColors.create(MinecraftClient.getInstance().getBlockColors()), MinecraftClient.getInstance().getItemRenderer());
		BuiltinItemRendererRegistry.INSTANCE.register(StaffOfHolding.KING_ORANGE_STAFF, new DynamicKingOrangeStaffItemRenderer());
		BuiltinItemRendererRegistry.INSTANCE.register(StaffOfHolding.YELLOW_STAFF, new DynamicYellowStaffItemRenderer());
		//BuiltinItemRendererRegistry.INSTANCE.register(StaffOfHolding.ORB_STAFF, new DynamicOrbStaffItemRenderer());
		BuiltinItemRendererRegistry.INSTANCE.register(StaffOfHolding.ORB_STAFF, new DynamicTestingOrbStaffItemRenderer());
		client = MinecraftClient.getInstance();

		KeyInputHandler.registerKeybinds();
		KeyInputHandler.registerKeybindActions();
		new fenceAbilities();
		new saplingAbilities();
		new railAbilities();
		new glassAbilities();
		new oreBlockAbilitiesCodeFixed();
	}
	public static MinecraftClient getClient() {
		return client;
	}


}