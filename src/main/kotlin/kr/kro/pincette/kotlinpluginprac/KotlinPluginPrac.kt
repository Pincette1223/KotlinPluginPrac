package kr.kro.pincette.kotlinpluginprac

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class KotlinPluginPrac : JavaPlugin(),Listener {
    override fun onEnable() {
        logger.info("Plugin Enable")
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    override fun onDisable() {
        logger.info("Plugin Disable")
    }
}