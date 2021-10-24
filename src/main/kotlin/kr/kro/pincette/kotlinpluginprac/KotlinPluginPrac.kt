package kr.kro.`pincette-mcserver`.kotlinpluginprac

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import net.md_5.bungee.api.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.entity.PlayerDeathEvent

class KotlinPluginPrac : JavaPlugin(),Listener {
    override fun onEnable() {
        logger.info("${ChatColor.BLUE}플러그인이 활성화되었습니다.")
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    override fun onDisable() {
        logger.info("${ChatColor.RED}플러그인이 비활성화되었습니다.")
    }

    @EventHandler
    fun onPlayerDeath(event: PlayerDeathEvent) {
        event.deathMessage = null

        event.deathMessage = "${ChatColor.RED}사람이 죽었다."
    }
}

fun String.removeLang(): String {
    return this.replace("([a-zA-Z])|([ㄱ-힣])|([0-9])".toRegex(), "＊")
}
