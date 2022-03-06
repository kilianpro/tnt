

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class PlacedTNT implements Listener {

    @EventHandler
    public void onPlaced(PlayerInteractEvent event) {
        if(!isValid(event))
            return;

        Player player = event.getPlayer();
        TNTPrimed TNT = player.getWorld().spawn(event.getPlayer().getLocation(), TNTPrimed.class);  
        GameMode gamemode = player.getGameMode();
        if(!gamemode.equals(GameMode.CREATIVE))
        {
        event.getItem().setAmount(event.getItem().getAmount()-1);
        }
        
        
        
        Vector vector = generateMomentumForce(
                player.getLocation().getDirection());

        TNT.setVelocity(vector);
        TNT.setYield(10);

        event.setCancelled(true);
    }

    
    @EventHandler
    public void onInHand(PlayerInteractEvent event) {
        if(!isValid(event))
            return;

        Player player = event.getPlayer();
        TNTPrimed TNT = player.getWorld().spawn(event.getPlayer().getLocation(), TNTPrimed.class);  
        GameMode gamemode = player.getGameMode();
        if(!gamemode.equals(GameMode.CREATIVE))
        {
        event.getItem().setAmount(event.getItem().getAmount()-1);
        }
        
        
        
        Vector vector = generateMomentumForce(
                player.getLocation().getDirection());

        TNT.setVelocity(vector);
        TNT.setYield(10);

        event.setCancelled(true);
    }

    private boolean isValid(PlayerInteractEvent event) {
        ItemStack item = event.getItem();
        Player  p = event.getPlayer();
        if(item == null)
            return false;
        
        Util.sendMessageEvent(p," Material :"+item.getData().getItemType().toString());
        Util.sendMessageEvent(p,"displayname : "+item.getItemMeta().getDisplayName());

      
        if(item.getItemMeta().getDisplayName() == null)
            return false;
        if(!(item.getData().getItemType() == Material.TNT && item.getItemMeta().getDisplayName().equals("§c§lBomba")))
            return false;
        return true;
    }

   

    private Vector generateMomentumForce(Vector vector) {
        vector.setY(1);
        return vector.multiply(0.8);
    }
}
