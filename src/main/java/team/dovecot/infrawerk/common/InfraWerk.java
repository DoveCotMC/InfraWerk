package team.dovecot.infrawerk.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import team.dovecot.infrawerk.ConstantsInfraWerk;
import team.dovecot.infrawerk.common.block.InfraBlocks;
import team.dovecot.infrawerk.common.item.InfraItems;
import team.dovecotmc.metropolis.item.MetroItems;

public class InfraWerk implements ModInitializer {
    public static final CreativeModeTab TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            new ResourceLocation(ConstantsInfraWerk.MOD_ID, "basics"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(MetroItems.ITEM_BENCH))
                    .title(Component.literal("InfraWerk."))
                    .displayItems((parameters, output) -> {
                        for (Item tabItem : InfraItems.getTabItems()) {
                            output.accept(tabItem);
                        }
                    })
                    .build()
    );

    @Override
    public void onInitialize() {
        InfraBlocks.initialize();
        InfraItems.initialize();
    }
}
