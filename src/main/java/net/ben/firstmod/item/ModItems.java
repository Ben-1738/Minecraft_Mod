package net.ben.firstmod.item;

import net.ben.firstmod.FirstMcMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMcMod.MOD_ID);

    public static final RegistryObject<Item> ICHOR = ITEMS.register("ichor",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ICHOR = ITEMS.register("raw_ichor",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
