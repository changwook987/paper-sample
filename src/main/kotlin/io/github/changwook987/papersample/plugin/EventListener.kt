package io.github.changwook987.papersample.plugin

import net.kyori.adventure.text.Component.text
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class EventListener : Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        event.joinMessage(text("뷁"))
    }
}