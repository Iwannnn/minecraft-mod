package cn.iwannnn.first_weapon;

import cn.iwannnn.first_item.FirstItemRegistry;
import cn.iwannnn.group.ModGroup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class FirstWeapon extends SwordItem {
    private static IItemTier itemTier = new IItemTier() {
        @Override
        public int getUses() {
            return 2000;
        }

        @Override
        public float getSpeed() {
            return 10.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            return 4.0F;
        }

        @Override
        public int getLevel() {
            return 3;
        }

        @Override
        public int getEnchantmentValue() {
            return 30;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(FirstItemRegistry.firstItem.get());
        }
    };

    public FirstWeapon() {
        super(itemTier, 3, -2.4F, new Item.Properties().tab(ModGroup.firstGroup));
    }

}
