package fr.caucorico.ccrcgeologicalmod.common.generation;

import fr.caucorico.ccrcgeologicalmod.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.*;

import java.util.Random;


public class BlockAgateSandOreFeature extends Feature<ProbabilityConfig>
{
    public BlockAgateSandOreFeature() {
        super(ProbabilityConfig::deserialize);
    }

    @Override
    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, ProbabilityConfig config) {
        BlockPos.MutableBlockPos mpos = new BlockPos.MutableBlockPos(pos);

        while ( worldIn.getBlockState(mpos).equals(Blocks.WATER.getDefaultState()) || worldIn.isAirBlock(mpos) )
        {
            mpos.setY(mpos.getY()-1);
        }

        if ( worldIn.getBlockState(mpos).equals(Blocks.SAND.getDefaultState()) )
        {
            float f = rand.nextFloat();
            if ( f < config.probability )
            {
                worldIn.setBlockState(mpos, ModBlocks.BLOCK_AGATE_SAND_ORE.getDefaultState() , 1 );
            }
            return true;
        }
        return false;
    }
}
