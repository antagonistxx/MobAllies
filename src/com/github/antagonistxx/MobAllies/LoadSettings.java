package com.github.antagonistxx.MobAllies;

public class LoadSettings {

	static String maEnabled;
	
	public static void loadMain(){
		String propertiesFile = MobAllies.maindirectory + "config.yml";
		PluginProperties properties = new PluginProperties(propertiesFile);
		properties.load();
		
		maEnabled = properties.getString("Plugin-Enabled", "true");
		properties.saveConfig("=== MobAllies Main Configuration===");
	}
}
