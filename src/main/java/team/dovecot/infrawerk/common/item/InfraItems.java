package team.dovecot.infrawerk.common.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import team.dovecot.infrawerk.ConstantsInfraWerk;
import team.dovecot.infrawerk.common.block.InfraBlocks;

import java.util.ArrayList;
import java.util.List;

public final class InfraItems {
    private static final List<Item> TAB_ITEMS = new ArrayList();

    public static final Item TRAIN_SPEED_LIMIT_SIGN = register("train_speed_limit_sign", new BlockItem(InfraBlocks.TRAIN_SPEED_LIMIT_SIGN, new Item.Properties()));

    public static Item register(String id, Item item) {
        return register(id, item, true);
    }

    public static Item register(String id, Item item, boolean displayInTab) {
        Item registered = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ConstantsInfraWerk.MOD_ID, id), item);
        if (displayInTab) {
            TAB_ITEMS.add(registered);
        }

        return registered;
    }

    public static List<Item> getTabItems() {
        return TAB_ITEMS;
    }

    public static void initialize() {
        ConstantsInfraWerk.LOGGER.info("Initializing Items");
    }
}
