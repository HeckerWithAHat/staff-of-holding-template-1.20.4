package dev.heckerwithahat.items;

import dev.heckerwithahat.StaffOfHolding;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static dev.heckerwithahat.StaffOfHolding.*;

public class OrbStaff extends Item {
    public static final String BLOCK_NBT_KEY = "StoredBlock";

    public OrbStaff(Settings settings) {
        super(settings);
    }



    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!user.isSneaking()) return TypedActionResult.fail(user.getStackInHand(hand));
        if (hand == Hand.OFF_HAND) {
            return TypedActionResult.fail(user.getStackInHand(hand));
        }
        if (user.getStackInHand(Hand.OFF_HAND).isEmpty() && !getStoredBlock(user.getStackInHand(hand)).equals(Blocks.AIR)) {
            user.getInventory().setStack(PlayerInventory.OFF_HAND_SLOT, new ItemStack(getStoredBlock(user.getStackInHand(hand))));
            removeStoredBlock(user.getStackInHand(hand));
        } else if (!user.getStackInHand(Hand.OFF_HAND).isEmpty() && getStoredBlock(user.getStackInHand(hand)).equals(Blocks.AIR) && user.getStackInHand(Hand.OFF_HAND).getItem() instanceof BlockItem) {
            StaffOfHolding.LOGGER.debug("1");
            setStoredBlock(user.getStackInHand(hand), ((BlockItem)user.getStackInHand(Hand.OFF_HAND).getItem()).getBlock()); //WHY IS THERE AN ISSUE
            StaffOfHolding.LOGGER.debug("2");
            user.getStackInHand(Hand.OFF_HAND).decrement(1);
            StaffOfHolding.LOGGER.debug("3");
            StaffOfHolding.LOGGER.debug("4");
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
