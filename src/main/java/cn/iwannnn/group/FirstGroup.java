package cn.iwannnn.group;

import cn.iwannnn.first_item.FirstItemRegistry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FirstGroup extends ItemGroup {
    public FirstGroup() {
        super("first_group");
    }
    
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(FirstItemRegistry.firstItem.get());
    }
}
