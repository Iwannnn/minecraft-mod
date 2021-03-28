package cn.iwannnn.first_food;

import cn.iwannnn.group.ModGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FirstFood extends Item {
    private static Food food = (new Food.Builder()).nutrition(10).saturationMod(20).build();

    public FirstFood() {
        super(new Properties().food(food).tab((ModGroup.firstGroup)));
    }
}
