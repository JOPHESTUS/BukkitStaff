package me.jophestus.bukkitstaff;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class bukkitstaff extends JavaPlugin {
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		sender.sendMessage(ChatColor.DARK_GREEN + "+------------------------------+");
		sender.sendMessage(ChatColor.DARK_AQUA + command.getName() + " is awesome!");
		sender.sendMessage(ChatColor.DARK_GREEN + "+------------------------------+");
		return true;
	}

}
