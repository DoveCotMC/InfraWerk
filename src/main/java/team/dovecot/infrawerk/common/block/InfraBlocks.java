package team.dovecot.infrawerk.common.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import team.dovecot.infrawerk.ConstantsInfraWerk;

public final class InfraBlocks {
    public static final Block TRAIN_SPEED_LIMIT_SIGN = register("train_speed_limit_sign", new BlockBaseTracksideSign(BlockBehaviour.Properties.of().noOcclusion().strength(0.6f)));
    public static final Block TRAIN_WHISTLE_SIGN = register("train_whistle_sign", new BlockBaseTracksideSign(BlockBehaviour.Properties.of().noOcclusion().strength(0.6f)));

    private static Block register(String id, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ConstantsInfraWerk.MOD_ID, id), block);
    }

    public static void initialize() {
        ConstantsInfraWerk.LOGGER.info("Initializing Blocks");
    }

    public static final class InfraBlockEntities {
        private static <T extends BlockEntity> BlockEntityType<T> register(String id, BlockEntityType<T> blockEntityType) {
            return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(ConstantsInfraWerk.MOD_ID, id), blockEntityType);
        }
    }
}
