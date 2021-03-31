package cn.iwannnn.first_block_state;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;

public class FirstBlockState extends Block {
    private static IntegerProperty STATE =
        IntegerProperty.create("face", 0, 1); //自定义一个方块状态 状态名为face 最小值0 最大值1

    public FirstBlockState() {
        super(Properties.of(Material.STONE).strength(5));
        this.registerDefaultState(this.defaultBlockState());
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
        super.createBlockStateDefinition(builder);
    }
}
