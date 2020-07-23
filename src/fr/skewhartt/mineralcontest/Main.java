package fr.skewhartt.mineralcontest;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ConsoleCommandSender console = Bukkit.getConsoleSender();
        console.sendMessage("--------------------------------------");
        console.sendMessage("             Plugin chargé            ");
        console.sendMessage("--------------------------------------");
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getConsoleSender();
        console.sendMessage("--------------------------------------");
        console.sendMessage("            Plugin déchargé           ");
        console.sendMessage("--------------------------------------");
    }
}
