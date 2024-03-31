package dev.heckerwithahat.abilities;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.random.Random;

import java.util.List;

import static dev.heckerwithahat.StaffOfHolding.addAbilityToBlock;
import static dev.heckerwithahat.StaffOfHoldingClient.client;

public class saplingAbilities {
    public saplingAbilities() {
        addAbilityToBlock(Blocks.ACACIA_SAPLING, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                Block hitBlock = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock();
                if (!List.of(Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.MYCELIUM, Blocks.ROOTED_DIRT, Blocks.MOSS_BLOCK, Blocks.FARMLAND, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS).contains(hitBlock)) {
                    return;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1,0), Blocks.ACACIA_SAPLING.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.ACACIA_SAPLING, 2, () -> {
            client.player.getInventory().getMainHandStack();
            
        });


        addAbilityToBlock(Blocks.BIRCH_SAPLING, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                Block hitBlock = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock();
                if (!List.of(Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.MYCELIUM, Blocks.ROOTED_DIRT, Blocks.MOSS_BLOCK, Blocks.FARMLAND, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS).contains(hitBlock)) {
                    return;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1,0), Blocks.BIRCH_SAPLING.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.CHERRY_SAPLING, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                Block hitBlock = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock();
                if (!List.of(Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.MYCELIUM, Blocks.ROOTED_DIRT, Blocks.MOSS_BLOCK, Blocks.FARMLAND, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS).contains(hitBlock)) {
                    return;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1,0), Blocks.CHERRY_SAPLING.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.DARK_OAK_SAPLING, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                Block hitBlock = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock();
                if (!List.of(Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.MYCELIUM, Blocks.ROOTED_DIRT, Blocks.MOSS_BLOCK, Blocks.FARMLAND, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS).contains(hitBlock)) {
                    return;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1,0), Blocks.DARK_OAK_SAPLING.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.JUNGLE_SAPLING, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                Block hitBlock = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock();
                if (!List.of(Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.MYCELIUM, Blocks.ROOTED_DIRT, Blocks.MOSS_BLOCK, Blocks.FARMLAND, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS).contains(hitBlock)) {
                    return;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1,0), Blocks.JUNGLE_SAPLING.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.OAK_SAPLING, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                Block hitBlock = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock();
                if (!List.of(Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.MYCELIUM, Blocks.ROOTED_DIRT, Blocks.MOSS_BLOCK, Blocks.FARMLAND, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS).contains(hitBlock)) {
                    return;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1,0), Blocks.OAK_SAPLING.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.SPRUCE_SAPLING, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                Block hitBlock = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock();
                if (!List.of(Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.MYCELIUM, Blocks.ROOTED_DIRT, Blocks.MOSS_BLOCK, Blocks.FARMLAND, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS).contains(hitBlock)) {
                    return;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1,0), Blocks.SPRUCE_SAPLING.getDefaultState());
            }
        });

    }

}
