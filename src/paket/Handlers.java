package paket;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Handlers implements Listener {

    @EventHandler
    public void onHitByPetOwner(EntityDamageByEntityEvent event) {
        if(!(event.getDamager() instanceof Player)) return;
        Player owner = (Player) event.getDamager();

            }
}
