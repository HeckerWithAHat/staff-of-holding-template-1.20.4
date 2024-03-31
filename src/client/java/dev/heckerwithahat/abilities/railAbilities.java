package dev.heckerwithahat.abilities;

import net.minecraft.block.Blocks;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;

import static dev.heckerwithahat.StaffOfHolding.addAbilityToBlock;
import static dev.heckerwithahat.StaffOfHoldingClient.client;

public class railAbilities {
    public railAbilities() {
        addAbilityToBlock(Blocks.RAIL, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.RAIL) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.RAIL.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.RAIL, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.RAIL) {
                    client.getServer().getWorld(client.world.getRegistryKey()).spawnEntity(new MinecartEntity(client.getServer().getWorld(client.world.getRegistryKey()), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ()));
                }
            }
        });


        addAbilityToBlock(Blocks.POWERED_RAIL, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.POWERED_RAIL) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.POWERED_RAIL.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.POWERED_RAIL, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.POWERED_RAIL) {
                    client.getServer().getWorld(client.world.getRegistryKey()).spawnEntity(new MinecartEntity(client.getServer().getWorld(client.world.getRegistryKey()), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ()));
                }
            }
        });

        addAbilityToBlock(Blocks.ACTIVATOR_RAIL, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.ACTIVATOR_RAIL) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.ACTIVATOR_RAIL.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.ACTIVATOR_RAIL, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.ACTIVATOR_RAIL) {
                    client.getServer().getWorld(client.world.getRegistryKey()).spawnEntity(new MinecartEntity(client.getServer().getWorld(client.world.getRegistryKey()), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ()));
                }
            }
        });


        addAbilityToBlock(Blocks.DETECTOR_RAIL, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.DETECTOR_RAIL) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.DETECTOR_RAIL.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.DETECTOR_RAIL, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.DETECTOR_RAIL) {
                    client.getServer().getWorld(client.world.getRegistryKey()).spawnEntity(new MinecartEntity(client.getServer().getWorld(client.world.getRegistryKey()), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ()));
                }
            }
        });
    }
}
