package dev.heckerwithahat.abilities;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;

import static dev.heckerwithahat.StaffOfHolding.addAbilityToBlock;
import static dev.heckerwithahat.StaffOfHoldingClient.client;

public class fenceAbilities {
    public fenceAbilities() {
        addAbilityToBlock(Blocks.ACACIA_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.ACACIA_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.ACACIA_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.ACACIA_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.ACACIA_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.ACACIA_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.BAMBOO_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.BAMBOO_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.BAMBOO_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.BAMBOO_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.BAMBOO_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.BAMBOO_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.BIRCH_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.BIRCH_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.BIRCH_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.BIRCH_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.BIRCH_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.BIRCH_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.CHERRY_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.CHERRY_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.CHERRY_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.CHERRY_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.CHERRY_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.CHERRY_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.CRIMSON_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.CRIMSON_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.CRIMSON_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.CRIMSON_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.CRIMSON_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.CRIMSON_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.DARK_OAK_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.DARK_OAK_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.DARK_OAK_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.DARK_OAK_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.DARK_OAK_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.DARK_OAK_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.JUNGLE_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.JUNGLE_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.JUNGLE_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.JUNGLE_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.JUNGLE_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.JUNGLE_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.OAK_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.OAK_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.OAK_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.OAK_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.OAK_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.OAK_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.SPRUCE_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SPRUCE_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.SPRUCE_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.SPRUCE_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SPRUCE_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.SPRUCE_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.WARPED_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.WARPED_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.WARPED_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.WARPED_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.WARPED_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.WARPED_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.MANGROVE_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.MANGROVE_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.MANGROVE_FENCE.getDefaultState());
            }
        });
        addAbilityToBlock(Blocks.MANGROVE_FENCE, 2, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.MANGROVE_FENCE_GATE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.MANGROVE_FENCE_GATE.getDefaultState());
            }
        });


        addAbilityToBlock(Blocks.NETHER_BRICK_FENCE, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.BLOCK) {
                BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
                int x = 0;
                if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.SHORT_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.TALL_GRASS) {
                    x = -1;
                } else if (client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos()).getBlock() == Blocks.NETHER_BRICK_FENCE) {
                    x = -1;
                }
                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(0,1+x,0), Blocks.NETHER_BRICK_FENCE.getDefaultState());
            }
        });

    }

}
