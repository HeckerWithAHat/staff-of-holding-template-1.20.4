package dev.heckerwithahat.abilities;

import net.minecraft.block.Blocks;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;

import static dev.heckerwithahat.StaffOfHolding.addAbilityToBlock;
import static dev.heckerwithahat.StaffOfHoldingClient.client;

public class glassAbilities {
    public glassAbilities() {

        addAbilityToBlock(Blocks.GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.RED_STAINED_GLASS, 1, () -> {

            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.RED_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.ORANGE_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.ORANGE_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.YELLOW_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.YELLOW_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.LIME_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.LIME_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.GREEN_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.GREEN_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.CYAN_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.CYAN_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.LIGHT_BLUE_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.LIGHT_BLUE_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.BLUE_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.BLUE_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.PURPLE_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.PURPLE_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.MAGENTA_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.MAGENTA_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.PINK_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.PINK_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.BROWN_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.BROWN_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.BLACK_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.BLACK_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.WHITE_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.WHITE_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.TINTED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.TINTED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.GRAY_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.GRAY_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });

        addAbilityToBlock(Blocks.LIGHT_GRAY_STAINED_GLASS, 1, () -> {
            client.player.setInvisible(!client.player.isInvisible());
        });
        addAbilityToBlock(Blocks.LIGHT_GRAY_STAINED_GLASS, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) return;
            EntityHitResult entityHitResult = (EntityHitResult) client.crosshairTarget;
            entityHitResult.getEntity().setGlowing(!entityHitResult.getEntity().isGlowing());
        });
    }
}
