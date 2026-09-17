package net.ben.firstmod.block;

import net.ben.firstmod.FirstMcMod;
import net.ben.firstmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMcMod.MOD_ID);

    public static final RegistryObject<Block> ICHOR_BLOCK = registerBlock("ichor_block",
            () -> new Block(Block.Properties.of().
                    strength(4f).requiresCorrectToolForDrops().sound(SoundType.LODESTONE)));

    public static final RegistryObject<Block> RAW_ICHOR_BLOCK = registerBlock("raw_ichor_block",
            () -> new Block(Block.Properties.of().
                    strength(4f).requiresCorrectToolForDrops().sound(SoundType.LODESTONE)));

    private static<T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

