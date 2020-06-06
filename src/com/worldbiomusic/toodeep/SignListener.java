package com.worldbiomusic.toodeep;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.md_5.bungee.api.ChatColor;

public class SignListener implements Listener
{
	@EventHandler
	public void onPlayerInteractWithTooDeepSign(PlayerInteractEvent e)
	{
		Player p=e.getPlayer();
		
		// right click block
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			
			// if block is sign_post
			if(e.getClickedBlock().getType().equals(Material.SIGN_POST))
			{
				Sign sign=(Sign)e.getClickedBlock().getState();
				
				String[] lines = sign.getLines();
				
				// check sign lines
				for(String lineText : lines) {
					
					// if same with "toodeep" save player
					if(lineText.equalsIgnoreCase("toodeep")) {
//						p.sendMessage("health: " + p.getHealth());
						if(p.getHealth() < 4.5) {
							p.sendMessage(ChatColor.RED + "[TooDeep] you need more health than 2 hearts");
							return;
						}
						
						p.sendMessage(ChatColor.GREEN + "[TooDeep] You are saved from toodeep");
						
						p.setHealth(p.getHealth() - 4);
						
						Location signLoc = sign.getLocation();
						
						World w=p.getWorld();
						Location top=w.getHighestBlockAt(signLoc).getLocation().add(0.5, 1, 0.5);
						
						p.teleport(top);
						return;
					}
				}
				
			}
			
		}

	}
}
