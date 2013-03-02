package JordanP.MinecraftRevamped;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import JordanP.MinecraftRevamped.common.MCRConfiguration;
import JordanP.MinecraftRevamped.common.MCRDataProxy;
import JordanP.MinecraftRevamped.common.MCRBlocks;
import JordanP.MinecraftRevamped.common.MCRPathing;
//import JordanP.MinecraftRevamped.common.MCRPathing;
//import JordanP.MinecraftRevamped.common.MCRRecipeRegistry;
import JordanP.MinecraftRevamped.common.MCRNaming;

@Mod(modid = "JordanP_MCR", name = "Minecraft Revamped", version = "In-Dev 0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MCR
{
//public static MCRItems items;
public static MCRConfiguration config;
public static MCRDataProxy data;
public static MCRPathing pathing;
//public static MCRRecipeRegistry recipeRegistry;
public static MCRNaming naming;
public static MCRBlocks blocks;
//public static CreativeTabs tabMinecraftRevamped = new TabMinecraftRevamped(CreativeTabs.getNextID(), "TabMinecraftRevamped");

@Init
public void Init(FMLInitializationEvent event){
//recipeRegistry.addRecipes();
naming.addItemNames();
}

private void prePreInitialization(){
//items = new MCRItems();
blocks = new MCRBlocks();
data = new MCRDataProxy();
pathing = new MCRPathing();
//recipeRegistry = new MCRRecipeRegistry();
naming = new MCRNaming();
}

@cpw.mods.fml.common.Mod.PreInit
public void PreInit(FMLPreInitializationEvent event){
System.out.println("Minecraft Revamped By Jordan_Pryor Loading!");
prePreInitialization();
config = new MCRConfiguration();
config.createConfig(event);
}
}