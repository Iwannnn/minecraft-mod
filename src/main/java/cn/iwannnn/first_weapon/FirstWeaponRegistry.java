package cn.iwannnn.first_weapon;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FirstWeaponRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "iwannnn");
    public static final RegistryObject<Item> firstWrapon = ITEMS.register("first_weapon", () -> {
        return new FirstWeapon();
    });
}
