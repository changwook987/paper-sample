package io.github.changwook987.papersample.plugin

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class PaperSamplePlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("enable")

        EventListener().register()
    }

    private fun Listener.register() = server.pluginManager.registerEvents(this, this@PaperSamplePlugin)
}