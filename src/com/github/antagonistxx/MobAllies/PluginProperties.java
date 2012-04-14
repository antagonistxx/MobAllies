package com.github.antagonistxx.MobAllies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PluginProperties extends Properties {
 
	static final long serialVersionUID = 0L;
	private String fileName;
	
	public PluginProperties(String file) {
		this.fileName = file;
	}
	
	
	// ---------------------------------------------------------//
	// Configuration Editing Functions (load/save)
	// ---------------------------------------------------------//
	
	// Load Config
	public void load(){
		File file = new File(this.fileName);
		if(file.exists()) {
			try {
				load(new FileInputStream(this.fileName));
			} catch (IOException e) {
				// Server message if fail here
			}
		}
	}

	// Save Config
	public void saveConfig(String start) {
		// TODO Auto-generated method stub
		try{
			store(new FileOutputStream(this.fileName), start);
		} catch (IOException e){
			
		}
	}
	
	
	// ---------------------------------------------------------//
	// Configuration Parsing Functions
	// ---------------------------------------------------------//
	
	// Get String
	public String getString(String key, String value) {
		// TODO Auto-generated method stub
		if(containsKey(key)){
			return getProperty(key);
		}
		put(key, value);
		return value;
	}
	
	// Get Integer
	public int getInteger(String key, int value) {
		if(containsKey(key)) {
			return Integer.parseInt(getProperty(key));
		}
		put(key, value);
		return value;
	}
	
	// Get Boolean
	public boolean getBoolean(String key, boolean value) {
		if(containsKey(key)) {
			return Boolean.parseBoolean(key);
		}
		put(key, value);
		return value;
	}
}
