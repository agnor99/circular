package dev.agnor99.circular;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ScreenOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void event(ScreenOpenEvent event) {
        if (event.getScreen() instanceof InventoryScreen inventoryScreen) {
            event.setScreen(new CircularScreen(inventoryScreen.getMenu(), Minecraft.getInstance().player.getInventory(), inventoryScreen.getTitle()));
        }
    }
}
