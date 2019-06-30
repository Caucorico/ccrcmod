package fr.caucorico.ccrcgeologicalmod.init;

import fr.caucorico.ccrcgeologicalmod.common.generation.BlockAgateSandOreFeature;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.common.BiomeManager;

public class ModGen
{
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
