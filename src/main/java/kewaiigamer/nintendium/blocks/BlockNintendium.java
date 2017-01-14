package kewaiigamer.nintendium.blocks;

import kewaiigamer.nintendium.Main;
import kewaiigamer.nintendium.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockNintendium extends Block {

    public BlockNintendium() {
        super(Material.ROCK);
        this.setResistance(6000000.0F);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe",16);
        this.setUnlocalizedName("nintendium_block");
        this.setRegistryName(Reference.MOD_ID + ":" + "nintendium_block");
        this.setCreativeTab(Main.Nintendium);
        this.setSoundType(SoundType.STONE);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}
