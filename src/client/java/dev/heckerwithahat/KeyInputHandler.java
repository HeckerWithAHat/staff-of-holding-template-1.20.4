package dev.heckerwithahat;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

import java.util.List;
import java.util.Objects;

import static dev.heckerwithahat.StaffOfHolding.*;

public class KeyInputHandler {
    public final static String KEYBIND_CATEGORY = "key.category.staffofholding.keybinds";
    public final static String KEYBIND_ABILITY1 = "key.staffofholding.Ability1";
    public final static String KEYBIND_ABILITY2 = "key.staffofholding.Ability2";
    public final static String KEYBIND_ABILITY3 = "key.staffofholding.Ability3";
    public final static String KEYBIND_ABILITY4 = "key.staffofholding.Ability4";
    public final static String KEYBIND_ABILITY5 = "key.staffofholding.Ability5";


    public static KeyBinding ability1;
    public static KeyBinding ability2;
    public static KeyBinding ability3;
    public static KeyBinding ability4;
    public static KeyBinding ability5;


    public static void registerKeybinds() {
        ability1 = KeyBindingHelper.registerKeyBinding(new KeyBinding(KEYBIND_ABILITY1, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Z, KEYBIND_CATEGORY));
        ability2 = KeyBindingHelper.registerKeyBinding(new KeyBinding(KEYBIND_ABILITY2, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_X, KEYBIND_CATEGORY));
        ability3 = KeyBindingHelper.registerKeyBinding(new KeyBinding(KEYBIND_ABILITY3, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_C, KEYBIND_CATEGORY));
        ability4 = KeyBindingHelper.registerKeyBinding(new KeyBinding(KEYBIND_ABILITY4, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_V, KEYBIND_CATEGORY));
        ability5 = KeyBindingHelper.registerKeyBinding(new KeyBinding(KEYBIND_ABILITY5, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_B, KEYBIND_CATEGORY));
    }

    public static void registerKeybindActions() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (ability1.wasPressed()) {
                returnIfItemIsNotStaffType(client);
                String path = Registries.BLOCK.getId(getStoredBlock(client.player.getInventory().getMainHandStack())).getPath();
                Runnable runnable = ABILITIES.get(new Identifier(MOD_ID, path + "_1"));
                if (runnable != null) runnable.run();
            }
            if (ability2.wasPressed()) {
                returnIfItemIsNotStaffType(client);
                String path = Registries.BLOCK.getId(getStoredBlock(client.player.getInventory().getMainHandStack())).getPath();
                Runnable runnable = ABILITIES.get(new Identifier(MOD_ID, path + "_2"));
                if (runnable != null) runnable.run();

            }
            if (ability3.wasPressed()) {
                returnIfItemIsNotStaffType(client);
                String path = Registries.BLOCK.getId(getStoredBlock(client.player.getInventory().getMainHandStack())).getPath();
                Runnable runnable = ABILITIES.get(new Identifier(MOD_ID, path + "_3"));
                if (runnable != null) runnable.run();

            }
            if (ability4.wasPressed()) {
                returnIfItemIsNotStaffType(client);
                String path = Registries.BLOCK.getId(getStoredBlock(client.player.getInventory().getMainHandStack())).getPath();
                Runnable runnable = ABILITIES.get(new Identifier(MOD_ID, path + "_4"));
                if (runnable != null) runnable.run();

            }
            if (ability5.wasPressed()) {
                returnIfItemIsNotStaffType(client);
                String path = Registries.BLOCK.getId(getStoredBlock(client.player.getInventory().getMainHandStack())).getPath();
                Runnable runnable = ABILITIES.get(new Identifier(MOD_ID, path + "_5"));
                if (runnable != null) runnable.run();

            }
        });

    }
    public static void returnIfItemIsNotStaffType(MinecraftClient client) {
        if (!List.of(new ItemStack(KING_ORANGE_STAFF), new ItemStack(YELLOW_STAFF), new ItemStack(ORB_STAFF)).contains(client.player.getInventory().getMainHandStack())) return;
    }
}
