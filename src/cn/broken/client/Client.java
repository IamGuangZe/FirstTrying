package cn.broken.client;

import cn.broken.client.mod.ModManager;
import org.lwjgl.opengl.Display;

public class Client {
    public static final String NAME = "Broken";
    public static final String VERSION = "0.1.0";
    public static ModManager modmanager;

    public static void start() {
        modmanager = new ModManager();
        modmanager.load();
        Display.setTitle(NAME + " Client " + "[1.8.9-" + VERSION + "]" );
    }

    public static void stop() {
        System.out.println("GameStop!");
    }
}
