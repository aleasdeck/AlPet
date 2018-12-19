package paket;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Handlers implements Listener {

    @EventHandler
    public void onHitByPetOwner(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Player)) return;
        Player owner = (Player) event.getDamager();
    }

    @EventHandler
    public void onOwnerMove(PlayerMoveEvent e) {

    }
}
