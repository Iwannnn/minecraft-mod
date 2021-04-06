package cn.iwannnn;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("iwannnn")
public class Iwannnn {
    public Iwannnn() {
        // 注册进Mod总线
        cn.iwannnn.first_item.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        cn.iwannnn.first_food.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        cn.iwannnn.first_weapon.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        cn.iwannnn.first_block.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        cn.iwannnn.first_block.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        cn.iwannnn.first_block_state.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        cn.iwannnn.first_block_state.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
