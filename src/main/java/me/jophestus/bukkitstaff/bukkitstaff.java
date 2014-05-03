package me.jophestus.bukkitstaff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bukkitstaff extends JavaPlugin implements Listener {
    Set<String> set = new HashSet<String>();
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        SetupStaff();
    }

    private void SetupStaff() {

        try {
            Document doc = Jsoup.connect("http://forums.bukkit.org/XenStaff/").get();

            Elements staff = doc.select("a.username");

            for (Element member : staff)            {
             set.add(member.text());
            set.remove("unimatrix");
                set.remove("Steve");
                set.remove("Arcdigital");
                set.remove("Kaelten");
                set.remove("Net");
                set.remove("MentalPower");
                set.remove("Telshin");
                set.remove("wishfire");
                set.remove("Alexia");
                set.remove("rapture");
                set.remove("prencher");
                set.remove("collink");
                set.remove("Shankill");



            }
        } catch (Exception e) {
            System.out.println("There appears to be an error. Make a ticket with the following stacktrace:");
            e.printStackTrace();

        }


    }

    @EventHandler
    public void onCommandPreprocess(PlayerCommandPreprocessEvent event) {
String cmd = event.getMessage();
        cmd = cmd.replace("/", "");
        Player sender = event.getPlayer();

        if (set.contains(cmd)){

            sender.sendMessage(ChatColor.DARK_GREEN + "+------------------------------+");
            sender.sendMessage(ChatColor.DARK_AQUA + cmd + " is awesome!");
            sender.sendMessage(ChatColor.DARK_GREEN + "+------------------------------+");
            event.setCancelled(true);
        } else {
event.setCancelled(false);
        }


    }
}







