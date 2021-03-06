package net.tropicraft.registry;

import net.minecraft.tileentity.TileEntity;
import net.tropicraft.block.tileentity.TileEntityAirCompressor;
import net.tropicraft.block.tileentity.TileEntityBambooChest;
import net.tropicraft.block.tileentity.TileEntityBambooMug;
import net.tropicraft.block.tileentity.TileEntityCurareBowl;
import net.tropicraft.block.tileentity.TileEntityEIHMixer;
import net.tropicraft.block.tileentity.TileEntityFirePit;
import net.tropicraft.block.tileentity.TileEntityKoaChest;
import net.tropicraft.block.tileentity.TileEntityPurchasePlate;
import net.tropicraft.block.tileentity.TileEntitySifter;
import net.tropicraft.block.tileentity.TileEntityTropicraftFlowerPot;
import cpw.mods.fml.common.registry.GameRegistry;

public class TCTileEntityRegistry {

	public static void init() {
		registerTE(TileEntityTropicraftFlowerPot.class, "TCFlowerPot");
		registerTE(TileEntityFirePit.class, "TCFirePit");
		registerTE(TileEntityAirCompressor.class, "TCAirCompressor");
		registerTE(TileEntityBambooChest.class, "TCBambooChest");
		registerTE(TileEntitySifter.class, "TCSifter");
		registerTE(TileEntityCurareBowl.class, "TCCurareBowl");
		registerTE(TileEntityKoaChest.class, "TCKoaChest");
		registerTE(TileEntityPurchasePlate.class, "TCTradePlate");
		registerTE(TileEntityBambooMug.class, "TCBambooMug");
		registerTE(TileEntityEIHMixer.class, "TCEIHMixer");
	}
	
	private static void registerTE(Class<? extends TileEntity> clazz, String name) {
		GameRegistry.registerTileEntity(clazz, name);
	}
}
