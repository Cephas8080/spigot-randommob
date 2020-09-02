package com.random.mob.cephas.command;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import java.util.Random;



public class command implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "only player can use this command!!!");
            return true;
        }
        Player player =(Player) sender;
        if(command.getName().equalsIgnoreCase("randmob")){
            EntityType[] end = {EntityType.BAT,EntityType.BLAZE,EntityType.CAVE_SPIDER,EntityType.CHICKEN,EntityType.COW,EntityType.CREEPER,EntityType.DONKEY,EntityType.ELDER_GUARDIAN,EntityType.ENDER_DRAGON,EntityType.ENDERMAN,EntityType.ENDERMITE,EntityType.EVOKER,EntityType.GHAST,EntityType.GIANT,EntityType.GUARDIAN,EntityType.HORSE,EntityType.HUSK,EntityType.ILLUSIONER,EntityType.IRON_GOLEM,EntityType.LLAMA,EntityType.LLAMA_SPIT,EntityType.MAGMA_CUBE,EntityType.MULE,EntityType.MUSHROOM_COW,EntityType.OCELOT,EntityType.PARROT,EntityType.PIG,EntityType.PIG_ZOMBIE,EntityType.POLAR_BEAR,EntityType.RABBIT,EntityType.SHEEP,EntityType.SHULKER,EntityType.SILVERFISH,EntityType.SKELETON,EntityType.SKELETON_HORSE,EntityType.SLIME,EntityType.SNOWMAN,EntityType.SPIDER,EntityType.SQUID,EntityType.VEX,EntityType.VILLAGER,EntityType.VINDICATOR,EntityType.WITCH,EntityType.WITHER,EntityType.WITHER_SKELETON,EntityType.WOLF,EntityType.ZOMBIE,EntityType.ZOMBIE_HORSE,EntityType.ZOMBIE_VILLAGER};
            Random rand = new Random();
            int abc = rand.nextInt(49);
            player.getWorld().spawnEntity(player.getLocation(), end[abc]);
            sender.sendMessage("Spawned a random mob");
        }

        return true;
    }
}
