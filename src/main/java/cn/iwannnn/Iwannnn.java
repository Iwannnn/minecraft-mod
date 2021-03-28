package cn.iwannnn;

import cn.iwannnn.first_food.*;
import cn.iwannnn.first_item.*;
import cn.iwannnn.first_weapon.*;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("iwannnn")
public class Iwannnn {
    public Iwannnn() {
        // 注册进Mod总线
        FirstItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FirstFoodRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FirstWeaponRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}