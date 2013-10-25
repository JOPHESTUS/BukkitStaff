package me.jophestus.bukkitstaff;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;
import java.util.logging.Logger;



public class bukkitstaff extends JavaPlugin {

    Logger log = Logger.getLogger("Minecraft");
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		sender.sendMessage(ChatColor.DARK_GREEN + "+------------------------------+");
		sender.sendMessage(ChatColor.DARK_AQUA + command.getName() + " is awesome!");
		sender.sendMessage(ChatColor.DARK_GREEN + "+------------------------------+");
        return true;
	}
                    public void onEnable(){
                        this.getLogger().log(Level.SEVERE,
                                "Works");
                    }

}
