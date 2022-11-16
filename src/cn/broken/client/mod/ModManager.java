package cn.broken.client.mod;

import cn.broken.client.mod.mods.movement.ToggleSprint;
import cn.broken.client.mod.mods.player.Cape;
import cn.broken.client.mod.mods.render.Hud;
import cn.broken.client.mod.mods.render.Welcome;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModManager {

    public void load (){
        mods.add(new Welcome ());
        mods.add(new ToggleSprint ());
        mods.add(new Hud ());
        mods.add(new Cape());
    }
    private final List<Mod> mods= new ArrayList<>();

    public List<Mod> getMods () {
        return mods;
    }

    public List<Mod> getEnableMods () {
        return mods.stream().filter(Mod::isEnable).collect(Collectors.toList());
    }

    public Mod getModuleByClass(Class<?> clazz){
        for (Mod mod : mods) {
            if (mod.getClass() == clazz) return mod;
        }
        return null;
    }

    public void onKey (int key) {
        for (Mod enableMod : mods) {
            if (enableMod.getKey() == key) {
                enableMod.setEnable(!enableMod.isEnable());
            }
        }
    }
}
