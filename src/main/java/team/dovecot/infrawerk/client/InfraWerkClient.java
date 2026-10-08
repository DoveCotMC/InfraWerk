package team.dovecot.infrawerk.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import team.dovecot.infrawerk.common.block.InfraBlocks;

public class InfraWerkClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerRenderLayers();
    }

    private void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(InfraBlocks.TRAIN_SPEED_LIMIT_SIGN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfraBlocks.TRAIN_WHISTLE_SIGN, RenderType.cutout());
    }
}
