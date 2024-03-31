package dev.heckerwithahat.abilities;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

import java.util.Arrays;

import static dev.heckerwithahat.StaffOfHolding.addAbilityToBlock;
import static dev.heckerwithahat.StaffOfHoldingClient.client;

public class oreBlockAbilities {
    public oreBlockAbilities() {
        addAbilityToBlock(Blocks.NETHERITE_BLOCK, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.ENTITY) return;
            BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
            Direction direction = blockHitResult.getSide();
            switch (direction) {
                case NORTH: {
                    Block[][][] blocks = new Block[9][9][9];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE Z
                    for (int x = -4; x < 5; x++) {
                        for (int y = -4; y < 5; y++) {
                            for (int z = 0; z < 9; z++) {
                                int modifier=0;
                                if (Math.abs(x)==4 || Math.abs(y)==4) modifier=0; else if (Math.abs(x)==3 || Math.abs(y)==3) modifier=1; else if (Math.abs(x)==2 || Math.abs(y)==2) modifier=2; else if (Math.abs(x)==1 || Math.abs(y)==1) modifier=3; else if (Math.abs(x)==0 || Math.abs(y)==0) modifier=4;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*9), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*9), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*(9+modifier)));
                                blocks[x+4][y+4][z] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+4][y+4][z].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case SOUTH: {
                    Block[][][] blocks = new Block[9][9][9];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE Z
                    for (int x = -4; x < 5; x++) {
                        for (int y = -4; y < 5; y++) {
                            for (int z = -8; z < 1; z++) {
                                int modifier=0;
                                if (Math.abs(x)==4 || Math.abs(y)==4) modifier=0;
                                else if (Math.abs(x)==3 || Math.abs(y)==3) modifier=1;
                                else if (Math.abs(x)==2 || Math.abs(y)==2) modifier=2;
                                else if (Math.abs(x)==1 || Math.abs(y)==1) modifier=3;
                                else if (Math.abs(x)==0 || Math.abs(y)==0) modifier=4;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*9), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*9), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*(9+modifier)));
                                blocks[x+4][y+4][z+8] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+4][y+4][z+8].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case EAST: {
                    Block[][][] blocks = new Block[9][9][9];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE X
                    for (int x = 0; x < 9; x++) {
                        for (int y = -4; y < 5; y++) {
                            for (int z = -4; z < 5; z++) {
                                int modifier=0;
                                if (Math.abs(z)==4 || Math.abs(y)==4) modifier=0;
                                else if (Math.abs(z)==3 || Math.abs(y)==3) modifier=1;
                                else if (Math.abs(z)==2 || Math.abs(y)==2) modifier=2;
                                else if (Math.abs(z)==1 || Math.abs(y)==1) modifier=3;
                                else if (Math.abs(z)==0 || Math.abs(y)==0) modifier=4;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(9+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*9), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*9));
                                blocks[x][y+4][z+4] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x][y+4][z+4].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case WEST: {
                    Block[][][] blocks = new Block[9][9][9];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE X
                    for (int x = -8; x < 1; x++) {
                        for (int y = -4; y < 5; y++) {
                            for (int z = -4; z < 5; z++) {
                                int modifier=0;
                                if (Math.abs(z)==4 || Math.abs(y)==4) modifier=0;
                                else if (Math.abs(z)==3 || Math.abs(y)==3) modifier=1;
                                else if (Math.abs(z)==2 || Math.abs(y)==2) modifier=2;
                                else if (Math.abs(z)==1 || Math.abs(y)==1) modifier=3;
                                else if (Math.abs(z)==0 || Math.abs(y)==0) modifier=4;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(9+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*9), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*9));
                                blocks[x+8][y+4][z+4] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+8][y+4][z+4].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case UP: {
                    Block[][][] blocks = new Block[9][9][9];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE Y
                    for (int x = -4; x < 5; x++) {
                        for (int y = 0; y < 9; y++) {
                            for (int z = -4; z < 5; z++) {
                                int modifier=0;
                                if (Math.abs(z)==4 || Math.abs(x)==4) modifier=0;
                                else if (Math.abs(z)==3 || Math.abs(x)==3) modifier=1;
                                else if (Math.abs(z)==2 || Math.abs(x)==2) modifier=2;
                                else if (Math.abs(z)==1 || Math.abs(x)==1) modifier=3;
                                else if (Math.abs(z)==0 || Math.abs(x)==0) modifier=4;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*9), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*(9+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*9));
                                blocks[x+4][y][z+4] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+4][y][z+4].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case DOWN: {
                    Block[][][] blocks = new Block[9][9][9];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE Y
                    for (int x = -4; x < 5; x++) {
                        for (int y = -8; y < 1; y++) {
                            for (int z = -4; z < 5; z++) {
                                int modifier=0;
                                if (Math.abs(z)==4 || Math.abs(x)==4) modifier=0;
                                else if (Math.abs(z)==3 || Math.abs(x)==3) modifier=1;
                                else if (Math.abs(z)==2 || Math.abs(x)==2) modifier=2;
                                else if (Math.abs(z)==1 || Math.abs(x)==1) modifier=3;
                                else if (Math.abs(z)==0 || Math.abs(x)==0) modifier=4;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(9+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*9), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*9));
                                blocks[x+4][y+8][z+4] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+4][y+8][z+4].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
            }
        });




        addAbilityToBlock(Blocks.DIAMOND_BLOCK, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.ENTITY) return;
            BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
            Direction direction = blockHitResult.getSide();
            switch (direction) {
                case NORTH: {
                    Block[][][] blocks = new Block[7][7][7];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE Z
                    for (int x = -3; x < 4; x++) {
                        for (int y = -3; y < 4; y++) {
                            for (int z = 0; z < 7; z++) {
                                int modifier=0;
                                if (Math.abs(x)==3 || Math.abs(y)==3) modifier=0; else if (Math.abs(x)==2 || Math.abs(y)==2) modifier=1; else if (Math.abs(x)==1 || Math.abs(y)==1) modifier=2; else if (Math.abs(x)==0 || Math.abs(y)==0) modifier=3;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*7), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*7), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*(7+modifier)));
                                blocks[x+3][y+3][z] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+3][y+3][z].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case SOUTH: {
                    Block[][][] blocks = new Block[7][7][7];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE Z
                    for (int x = -3; x < 4; x++) {
                        for (int y = -3; y < 4; y++) {
                            for (int z = -6; z < 1; z++) {
                                int modifier=0;
                                if (Math.abs(x)==3 || Math.abs(y)==3) modifier=0;
                                else if (Math.abs(x)==2 || Math.abs(y)==2) modifier=1;
                                else if (Math.abs(x)==1 || Math.abs(y)==1) modifier=2;
                                else if (Math.abs(x)==0 || Math.abs(y)==0) modifier=3;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*7), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*7), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*(7+modifier)));
                                blocks[x+3][y+3][z+6] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+3][y+3][z+6].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case EAST: {
                    Block[][][] blocks = new Block[7][7][7];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE X
                    for (int x = 0; x < 7; x++) {
                        for (int y = -3; y < 4; y++) {
                            for (int z = -3; z < 4; z++) {
                                int modifier=0;
                                if (Math.abs(z)==3 || Math.abs(y)==3) modifier=0;
                                else if (Math.abs(z)==2 || Math.abs(y)==2) modifier=1;
                                else if (Math.abs(z)==1 || Math.abs(y)==1) modifier=2;
                                else if (Math.abs(z)==0 || Math.abs(y)==0) modifier=3;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(7+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*7), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*7));
                                blocks[x][y+3][z+3] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x][y+3][z+3].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case WEST: {
                    Block[][][] blocks = new Block[7][7][7];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE X
                    for (int x = -6; x < 1; x++) {
                        for (int y = -3; y < 4; y++) {
                            for (int z = -3; z < 4; z++) {
                                int modifier=0;
                                if (Math.abs(z)==3 || Math.abs(y)==3) modifier=0;
                                else if (Math.abs(z)==2 || Math.abs(y)==2) modifier=1;
                                else if (Math.abs(z)==1 || Math.abs(y)==1) modifier=2;
                                else if (Math.abs(z)==0 || Math.abs(y)==0) modifier=3;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(7+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*7), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*7));
                                blocks[x+6][y+3][z+3] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+6][y+3][z+3].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case UP: {
                    Block[][][] blocks = new Block[7][7][7];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE Y
                    for (int x = -3; x < 4; x++) {
                        for (int y = 0; y < 7; y++) {
                            for (int z = -3; z < 4; z++) {
                                int modifier=0;
                                if (Math.abs(z)==3 || Math.abs(x)==3) modifier=0;
                                else if (Math.abs(z)==2 || Math.abs(x)==2) modifier=1;
                                else if (Math.abs(z)==1 || Math.abs(x)==1) modifier=2;
                                else if (Math.abs(z)==0 || Math.abs(x)==0) modifier=3;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*7), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*(7+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*7));
                                blocks[x+3][y][z+3] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+3][y][z+3].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case DOWN: {
                    Block[][][] blocks = new Block[7][7][7];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE Y
                    for (int x = -3; x < 4; x++) {
                        for (int y = -6; y < 1; y++) {
                            for (int z = -3; z < 4; z++) {
                                int modifier=0;
                                if (Math.abs(z)==3 || Math.abs(x)==3) modifier=0;
                                else if (Math.abs(z)==2 || Math.abs(x)==2) modifier=1;
                                else if (Math.abs(z)==1 || Math.abs(x)==1) modifier=2;
                                else if (Math.abs(z)==0 || Math.abs(x)==0) modifier=3;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*7), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*(7+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*7));
                                blocks[x+3][y+6][z+3] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+3][y+6][z+3].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
            }
        });

        addAbilityToBlock(Blocks.GOLD_BLOCK, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.ENTITY) return;
            BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
            Direction direction = blockHitResult.getSide();
            switch (direction) {
                case NORTH: {
                    Block[][][] blocks = new Block[5][5][5];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE Z
                    for (int x = -2; x < 3; x++) {
                        for (int y = -2; y < 3; y++) {
                            for (int z = 0; z < 5; z++) {
                                int modifier=0;
                                if (Math.abs(x)==2 || Math.abs(y)==2) modifier=0;
                                else if (Math.abs(x)==1 || Math.abs(y)==1) modifier=1;
                                else if (Math.abs(x)==0 || Math.abs(y)==0) modifier=2;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*5), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*5), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*(5+modifier)));
                                blocks[x+2][y+2][z] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+2][y+2][z].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case SOUTH: {
                    Block[][][] blocks = new Block[5][5][5];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE Z
                    for (int x = -2; x < 3; x++) {
                        for (int y = -2; y < 3; y++) {
                            for (int z = -4; z < 1; z++) {
                                int modifier=0;
                                if (Math.abs(x)==2 || Math.abs(y)==2) modifier=0;
                                else if (Math.abs(x)==1 || Math.abs(y)==1) modifier=1;
                                else if (Math.abs(x)==0 || Math.abs(y)==0) modifier=2;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*5), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*5), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*(5+modifier)));
                                blocks[x+2][y+2][z+4] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+2][y+2][z+4].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case EAST: {
                    Block[][][] blocks = new Block[5][5][5];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE X
                    for (int x = 0; x < 5; x++) {
                        for (int y = -2; y < 3; y++) {
                            for (int z = -2; z < 3; z++) {
                                int modifier=0;
                                if (Math.abs(z)==2 || Math.abs(y)==2) modifier=0;
                                else if (Math.abs(z)==1 || Math.abs(y)==1) modifier=1;
                                else if (Math.abs(z)==0 || Math.abs(y)==0) modifier=2;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(5+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*5), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*5));
                                blocks[x][y+2][z+2] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x][y+2][z+2].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case WEST: {
                    Block[][][] blocks = new Block[5][5][5];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE X
                    for (int x = -4; x < 1; x++) {
                        for (int y = -2; y < 3; y++) {
                            for (int z = -2; z < 3; z++) {
                                int modifier=0;
                                if (Math.abs(z)==2 || Math.abs(y)==2) modifier=0;
                                else if (Math.abs(z)==1 || Math.abs(y)==1) modifier=1;
                                else if (Math.abs(z)==0 || Math.abs(y)==0) modifier=2;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(5+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*5), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*5));
                                blocks[x+4][y+2][z+2] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+4][y+2][z+2].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case UP: {
                    Block[][][] blocks = new Block[5][5][5];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE Y
                    for (int x = -2; x < 3; x++) {
                        for (int y = 0; y < 5; y++) {
                            for (int z = -2; z < 3; z++) {
                                int modifier=0;
                                if (Math.abs(z)==2 || Math.abs(x)==2) modifier=0;
                                else if (Math.abs(z)==1 || Math.abs(x)==1) modifier=1;
                                else if (Math.abs(z)==0 || Math.abs(x)==0) modifier=2;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*5), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*(5+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*5));
                                blocks[x+2][y][z+2] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+2][y][z+2].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case DOWN: {
                    Block[][][] blocks = new Block[5][5][5];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE Y
                    for (int x = -2; x < 3; x++) {
                        for (int y = -4; y < 1; y++) {
                            for (int z = -2; z < 3; z++) {
                                int modifier=0;
                                if (Math.abs(z)==2 || Math.abs(x)==2) modifier=0;
                                else if (Math.abs(z)==1 || Math.abs(x)==1) modifier=1;
                                else if (Math.abs(z)==0 || Math.abs(x)==0) modifier=2;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*5), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*(5+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*5));
                                blocks[x+2][y+4][z+2] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+2][y+4][z+2].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
            }
        });

        addAbilityToBlock(Blocks.IRON_BLOCK, 1, () -> {
            if (client.crosshairTarget.getType() == HitResult.Type.ENTITY) return;
            BlockHitResult blockHitResult = (BlockHitResult) client.crosshairTarget;
            Direction direction = blockHitResult.getSide();
            switch (direction) {
                case NORTH: {
                    Block[][][] blocks = new Block[3][3][3];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE Z
                    for (int x = -1; x < 2; x++) {
                        for (int y = -1; y < 2; y++) {
                            for (int z = 0; z < 3; z++) {
                                int modifier=0;
                                if (Math.abs(x)==1 || Math.abs(y)==1) modifier=0;
                                else if (Math.abs(x)==0 || Math.abs(y)==0) modifier=1;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*3), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*3), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*(3+modifier)));
                                blocks[x+1][y+1][z] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+1][y+1][z].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case SOUTH: {
                    Block[][][] blocks = new Block[3][3][3];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE Z
                    for (int x = -1; x < 2; x++) {
                        for (int y = -1; y < 2; y++) {
                            for (int z = -2; z < 1; z++) {
                                int modifier=0;
                                if (Math.abs(x)==1 || Math.abs(y)==1) modifier=0;
                                else if (Math.abs(x)==0 || Math.abs(y)==0) modifier=1;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*3), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*3), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*(3+modifier)));
                                blocks[x+1][y+1][z+2] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+1][y+1][z+2].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case EAST: {
                    Block[][][] blocks = new Block[3][3][3];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE X
                    for (int x = 0; x < 3; x++) {
                        for (int y = -1; y < 2; y++) {
                            for (int z = -1; z < 2; z++) {
                                int modifier=0;
                                if (Math.abs(z)==1 || Math.abs(y)==1) modifier=0;
                                else if (Math.abs(z)==0 || Math.abs(y)==0) modifier=1;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(3+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*3), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*3));
                                blocks[x][y+1][z+1] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x][y+1][z+1].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case WEST: {
                    Block[][][] blocks = new Block[3][3][3];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE X
                    for (int x = -2; x < 1; x++) {
                        for (int y = -1; y < 2; y++) {
                            for (int z = -1; z < 2; z++) {
                                int modifier=0;
                                if (Math.abs(z)==1 || Math.abs(y)==1) modifier=0;
                                else if (Math.abs(z)==0 || Math.abs(y)==0) modifier=1;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*(3+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*3), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*3));
                                blocks[x+2][y+1][z+1] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+2][y+1][z+1].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case UP: {
                    Block[][][] blocks = new Block[3][3][3];
                    Vec3i lookDirOffsetWithCone = null;
                    // POSITIVE Y
                    for (int x = -1; x < 2; x++) {
                        for (int y = 0; y < 3; y++) {
                            for (int z = -1; z < 2; z++) {
                                int modifier=0;
                                if (Math.abs(z)==1 || Math.abs(x)==1) modifier=0;
                                else if (Math.abs(z)==0 || Math.abs(x)==0) modifier=1;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*3), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*(3+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*3));
                                blocks[x+1][y][z+1] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+1][y][z+1].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
                case DOWN: {
                    Block[][][] blocks = new Block[3][3][3];
                    Vec3i lookDirOffsetWithCone = null;
                    // NEGATIVE Y
                    for (int x = -1; x < 2; x++) {
                        for (int y = -2; y < 1; y++) {
                            for (int z = -1; z < 2; z++) {
                                int modifier=0;
                                if (Math.abs(z)==1 || Math.abs(x)==1) modifier=0;
                                else if (Math.abs(z)==0 || Math.abs(x)==0) modifier=1;
                                lookDirOffsetWithCone = new Vec3i((int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().x*3), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().y*(3+modifier)), (int) (Vec3d.fromPolar(client.player.getPitch(), client.player.getHeadYaw()).normalize().z*3));
                                blocks[x+1][y+2][z+1] = client.getServer().getWorld(client.world.getRegistryKey()).getBlockState(blockHitResult.getBlockPos().add(x, y, z)).getBlock();
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(lookDirOffsetWithCone).add(x,y,z),blocks[x+1][y+2][z+1].getDefaultState());
                                client.getServer().getWorld(client.world.getRegistryKey()).setBlockState(blockHitResult.getBlockPos().add(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }break;
            }
        });
    }
}
