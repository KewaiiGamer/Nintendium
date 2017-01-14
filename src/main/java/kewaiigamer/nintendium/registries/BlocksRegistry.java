package kewaiigamer.nintendium.registries;

import kewaiigamer.nintendium.blocks.BlockNintendium;

//Referenced in CommonProxy in PreInt

public final class BlocksRegistry {

	public static BlockNintendium block_nintendium;
    public static final void init() {
		block_nintendium = new BlockNintendium();
    }
    
    
}
