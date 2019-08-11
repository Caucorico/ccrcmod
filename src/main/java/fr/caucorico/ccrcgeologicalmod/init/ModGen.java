package fr.caucorico.ccrcgeologicalmod.init;

import fr.caucorico.ccrcgeologicalmod.CCRCGeologicalMod;
import fr.caucorico.ccrcgeologicalmod.common.biomes.TestBiome;
import fr.caucorico.ccrcgeologicalmod.common.blocks.BlockAgateSandOre;
import fr.caucorico.ccrcgeologicalmod.common.generation.BlockAgateSandOreFeature;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Optional;

@Mod.EventBusSubscriber(modid = CCRCGeologicalMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModGen
{
    @ObjectHolder(CCRCGeologicalMod.MODID + ":test_biome")
    public static final TestBiome TEST_BIOME = null;

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event)
    {
        event.getRegistry().register(new TestBiome());
    }

    public static void addBlockAgateSandOreToTheGen()
    {
        for ( Biome biome : Biome.BIOMES )
        {
            String test = biome.getDisplayName().getString();

            if (  biome.getDisplayName().getString().equals("River")
                || biome.getDisplayName().getString().equals("Frozen River") )
            {
                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Biome.createDecoratedFeature(
                                new BlockAgateSandOreFeature(),
                                new ProbabilityConfig(0.5f),
                                Placement.COUNT_RANGE,
                                new CountRangeConfig(15,70,80,81)
                        )
                );
            }

        }
    }
}
