package hobby.servah.morphvasion.util

import hobby.servah.morphvasion.MorphVasion
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.entity.Player

class Utils {

    companion object{

        var prefix = ""

        fun convert(message: String): Component {
            return MiniMessage.miniMessage().deserialize(message)
        }

        fun chat(message: String, p: Player) {
            p.sendMessage(MiniMessage.miniMessage().deserialize(prefix + message))
        }

        fun console(message: String) {
            Bukkit.getConsoleSender().sendMessage(MiniMessage.miniMessage()
                .deserialize(prefix + message))
        }

        fun configString(path: String, plugin: MorphVasion): Component {
            return convert(plugin.config.getString(path).toString())
        }

        fun move(world: World, p: Player) {
            p.teleport(Location(world,0.0,0.0, 0.0))
        }

    }

}