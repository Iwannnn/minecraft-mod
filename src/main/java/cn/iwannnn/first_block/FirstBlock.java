package cn.iwannnn.first_block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FirstBlock extends Block {
    public FirstBlock() {
        super(Properties.of(Material.STONE).strength(5));
    }
}