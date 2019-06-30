package fr.caucorico.ccrcgeologicalmod.common.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlockAgateSandOre extends FallingBlock
{
    private int harvestLevel = 0;

    private ToolType harvestTool;

    public BlockAgateSandOre()
    {
        super(Block.Properties
                .create(Material.SAND)
                .hardnessAndResistance(1.0f)
                .sound(SoundType.SAND)
        );
        this.setRegistryName("agate_sand_ore_block");

        this.harvestLevel = 0;
        this.harvestTool = ToolType.SHOVEL;
    }

    @Override
    public int getHarvestLevel(BlockState state)
    {
        return this.harvestLevel;
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state)
    {
        return this.harvestTool;
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        if ( silktouch > 0 ) return 0;
        return 1;
    }
}
