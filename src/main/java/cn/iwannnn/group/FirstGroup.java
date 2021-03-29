package cn.iwannnn.group;

import cn.iwannnn.first_item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class FirstGroup extends ItemGroup {
    public FirstGroup() {
        super("first_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.firstItem.get());
    }
}
