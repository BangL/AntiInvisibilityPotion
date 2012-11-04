package tsuttsu305.Main;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public static Main plugin;
	
	//public static String Msg;
	
	
	Logger logger = Logger.getLogger("Minecraft");

	public void onEnable()
	{
		PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + "version" + pdfFile.getVersion() + " is Enabled");
		getServer().getPluginManager().registerEvents(new Event(), this);
		/*
		getConfig().options().copyDefaults(true);
		saveConfig();
		ConfigLoad();
		*/
		
	}

	public void onDisable()
	{
		PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + "version" + pdfFile.getVersion() + " is Disabled");
	}
	/*
	public void ConfigLoad(){
		Msg = this.getConfig().getString("BlockMessage");
		return;
	}
	*/
	

	
}