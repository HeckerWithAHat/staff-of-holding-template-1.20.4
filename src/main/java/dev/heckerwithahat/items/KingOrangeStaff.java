package dev.heckerwithahat.items;

import dev.heckerwithahat.StaffOfHolding;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static dev.heckerwithahat.StaffOfHolding.*;

public class KingOrangeStaff extends Item {
    public static final String BLOCK_NBT_KEY = "StoredBlock";

    public KingOrangeStaff(Settings settings) {
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
            setStoredBlock(user.getStackInHand(hand), ((BlockItem)user.getStackInHand(Hand.OFF_HAND).getItem()).getBlock());
            StaffOfHolding.LOGGER.debug("2");
            user.getStackInHand(Hand.OFF_HAND).decrement(1);
            StaffOfHolding.LOGGER.debug("3");
            StaffOfHolding.LOGGER.debug("4");
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (getStoredBlock(stack).equals(Blocks.NETHERITE_BLOCK)) {
            target.setVelocity(Vec3d.fromPolar(attacker.getPitch(), attacker.getHeadYaw()).multiply(9f));

            target.setHealth(target.getHealth() - ((float)attacker.getVelocity().length()*9f));
        } else if (getStoredBlock(stack).equals(Blocks.DIAMOND_BLOCK)) {
            target.setVelocity(Vec3d.fromPolar(attacker.getPitch(), attacker.getHeadYaw()).multiply(7f));

            target.setHealth(target.getHealth() - ((float)attacker.getVelocity().length()*7f));
        } else if (getStoredBlock(stack).equals(Blocks.GOLD_BLOCK)) {
            target.setVelocity(Vec3d.fromPolar(attacker.getPitch(), attacker.getHeadYaw()).multiply(5f));

            target.setHealth(target.getHealth() - ((float)attacker.getVelocity().length()*5f));
        } else if (getStoredBlock(stack).equals(Blocks.IRON_BLOCK)) {
            target.setVelocity(Vec3d.fromPolar(attacker.getPitch(), attacker.getHeadYaw()).multiply(3f));

            target.setHealth(target.getHealth() - ((float)attacker.getVelocity().length()*3f));
        }
        return true;
    }
}
