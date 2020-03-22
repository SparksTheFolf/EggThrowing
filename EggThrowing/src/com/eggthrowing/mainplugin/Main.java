package com.eggthrowing.mainplugin;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		
		System.out.println("EggThrowing ENABLED");
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	public void onDisbale() {
		
		System.out.println("EggThrowing DISABLED");

	}

	@EventHandler
	public void onThrow(PlayerEggThrowEvent e) {
		
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.RED + "Egg Thrown!");
		e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_NOTE_PLING, 1.0F, 1.0F);
	}

}
