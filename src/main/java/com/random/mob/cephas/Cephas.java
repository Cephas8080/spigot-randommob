package com.random.mob.cephas;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Random;
import com.random.mob.cephas.command.command;

public final class Cephas extends JavaPlugin {

    @Override
    public void onEnable() {
    command cmd = new command();
    getCommand("randmob").setExecutor(cmd);
    getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "You successfully install the randmob plugin!!!");


    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "ByeByes");
    }
}
