package JordanP.MinecraftRevamped.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import JordanP.MinecraftRevamped.blocks.*;
import JordanP.MinecraftRevamped.common.*;

public class MCRBlocks{
public static MCRDataProxy data = MCRDataProxy.instance;

public static final Block oreCopper = new BlockCopperOre(data.oreCopperID).setResistance(4F).setBlockName("oreCopper");

}