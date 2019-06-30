package fr.caucorico.ccrcgeologicalmod.init;

import fr.caucorico.ccrcgeologicalmod.CCRCGeologicalMod;
import fr.caucorico.ccrcgeologicalmod.common.items.ItemAgateStone;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = CCRCGeologicalMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{
    @ObjectHolder(CCRCGeologicalMod.MODID + ":" + ItemAgateStone.REGISTRY_NAME)
    public static final ItemAgateStone ITEM_AGATE_STONE = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new ItemAgateStone());
    }
}
