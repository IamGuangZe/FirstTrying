package cn.broken.client.mod.mods.render;

import cn.broken.client.Client;
import cn.broken.client.mod.Mod;
import cn.broken.client.mod.mods.movement.ToggleSprint;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;

import java.awt.*;
import java.util.List;

public class Hud extends Mod {
    public Hud (){
        super("Hud",true);
    }

    @Override
    public void render(){
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        int width = scaledResolution.getScaledWidth();
        int height = scaledResolution.getScaledHeight();

        List<Mod> enableMods = Client.modmanager.getEnableMods();
        FontRenderer font = Minecraft.getMinecraft().fontRendererObj;
        enableMods.sort((o1, o2)-> font.getStringWidth(o2.getName())-font.getStringWidth(o1.getName()));

        int y = 2;
        for (Mod enableMod : enableMods) {
            font.drawString(enableMod.getName(),width - font.getStringWidth(enableMod.getName()) - 2,y,new Color(255,255,255).getRGB());
            y += font.FONT_HEIGHT + 2;
        }
    }
}
