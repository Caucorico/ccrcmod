package fr.caucorico.ccrcgeologicalmod.common.biomes;

import fr.caucorico.ccrcgeologicalmod.CCRCGeologicalMod;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.common.Mod;

public class TestBiome extends Biome
{

    public TestBiome()
    {
        super((new Biome.Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder(SurfaceBuilder.NOPE, new SurfaceBuilderConfig(Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState()))).precipitation(Biome.RainType.SNOW).category(Biome.Category.ICY).depth(7.5F).scale(0.2F).temperature(-0.25F).downfall(0.3F).waterColor(4159204).waterFogColor(329011).parent((String)null));
        //super((new Biome.Builder()).surfaceBuilder(SurfaceBuilder.AIR, new SurfaceBuilderConfig(Blocks.SNOW_BLOCK.getDefaultState(), Blocks.SNOW_BLOCK.getDefaultState(), Blocks.GRAVEL.getDefaultState())).precipitation(Biome.RainType.SNOW).category(Biome.Category.ICY).depth(7.5F).scale(0.2F).temperature(-0.25F).downfall(0.3F).waterColor(4159204).waterFogColor(329011).parent((String)null));
        this.setRegistryName("test_biome");
    }
}
