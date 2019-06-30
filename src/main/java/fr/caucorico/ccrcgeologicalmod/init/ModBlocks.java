package fr.caucorico.ccrcgeologicalmod.init;

import fr.caucorico.ccrcgeologicalmod.CCRCGeologicalMod;
import fr.caucorico.ccrcgeologicalmod.common.blocks.BlockAgateSandOre;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = CCRCGeologicalMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
    @ObjectHolder(CCRCGeologicalMod.MODID + ":agate_sand_ore_block")
    public static final BlockAgateSandOre BLOCK_AGATE_SAND_ORE = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new BlockAgateSandOre());
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(
                ModBlocks.BLOCK_AGATE_SAND_ORE,
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
                .setRegistryName(ModBlocks.BLOCK_AGATE_SAND_ORE.getRegistryName()
                ));

    }
}
