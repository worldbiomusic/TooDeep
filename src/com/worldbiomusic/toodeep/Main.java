package com.worldbiomusic.toodeep;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "TooDeep ON");
		
		getServer().getPluginManager().registerEvents(new SignListener(), this);
	}
}
