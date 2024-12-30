package dev.butterflysky.neoforge;

import net.neoforged.fml.common.Mod;

import dev.butterflysky.DiscordAuthForMC;

@Mod(DiscordAuthForMC.MOD_ID)
public final class DiscordAuthForMCNeoForge {
    public DiscordAuthForMCNeoForge() {
        // Run our common setup.
        DiscordAuthForMC.init();
    }
}
