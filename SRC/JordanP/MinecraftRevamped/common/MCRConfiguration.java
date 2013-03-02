package JordanP.MinecraftRevamped.common;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class MCRConfiguration{
public static MCRConfiguration instance;

public MCRConfiguration(){
instance = this;
}

Configuration config;
private MCRDataProxy data = MCRDataProxy.instance;

public void createConfig(FMLPreInitializationEvent event){
config = new Configuration(event.getSuggestedConfigurationFile());
config.load();

data.oreCopperID = config.getBlock("Copper Ore", 2000).getInt();
config.save();
}
}