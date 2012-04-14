/* *************************************************************** *
 * MobAllies v 0.0.1 
 * -----------------
 * 
 * Written by AntagonistXX @ http://www.mayhemservers.net
 * 
 * 
 * NOTES:
 * Feel free to redistribute and alter at your own will. 
 * All I ask is you leave the commented sections in, as well as
 * leave proper credits.
 * 
 * Special thanks to : Samkio (for his helpful tutorials)
 *                     Bukkit Dev Team (for making this happen)
 * *************************************************************** */


package com.github.antagonistxx.MobAllies;

// ------------------------------------------------------------------
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.*;
import java.util.logging.Logger;


//------------------------------------------------------------------
public class MobAllies extends JavaPlugin {
	
	
	// Create plugin directory, set up path for configuration
	static String maindirectory = "plugins/MobAllies/";
	static File config = new File(maindirectory + "config.yml");
	
	// Instance of logger, used for server console/logfile
	Logger log;
	
	// Called when server starts up
	public void onEnable() {
		
		
		// Log to ensure plugin was enabled successfully
		log = this.getLogger();
		log.info("MobAllies has been enabled!");
	
		// Make directory + config file here
		new File(maindirectory).mkdir();
		if (!config.exists())
		{
			try		{
				// Create config file if it doesn't exist
				config.createNewFile();
				log.info("Configuration File Created!");
			} catch(IOException e)  {
				// Server error message	
				log.info("[CRITICAL] - Could not create configuration file!");
			}
			
		}
		
		// Load the configuration file
		LoadSettings.loadMain();

	}

	// Called when MobAllies is disabled
	public void onDisable() {
		log.info("MobAllies has been disabled!");	
		
	}
	
	// ---------------------------------------------------------//
	// Command Handler 
	// ---------------------------------------------------------//
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(cmd.getName().equalsIgnoreCase("moballies")){ 
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.RED + "Mob Allies version 0.0.1.");
				return true;
			}
			
			if (args[0].equalsIgnoreCase("enable"))
			{
				//Enable
				return true;
			}
	
			if (args[0].equalsIgnoreCase("disable"))
			{
				//Disable
				return true;
			}
			
			if (args[0].equalsIgnoreCase("help"))
			{
				// Help Menu
				return true;
			}
			
		} 
		return false; 
	}

}
