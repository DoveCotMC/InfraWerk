package team.dovecot.infrawerk.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import team.dovecotmc.metropolis.block.AbstractBlockTracksideSignBase;
import team.dovecotmc.metropolis.util.MetroBlockUtil;

public class BlockBaseTracksideSign extends AbstractBlockTracksideSignBase {
    public BlockBaseTracksideSign(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        Direction facing = blockState.getValue(FACING);
        return Shapes.or(
                MetroBlockUtil.getVoxelShapeByDirection(
                        6, 0, 6,
                        10, 16, 10,
                        facing
                ),
                MetroBlockUtil.getVoxelShapeByDirection(
                        4, 3, 5.5,
                        12, 13, 8,
                        blockState.getValue(FACING)
                )
        );
    }
}
