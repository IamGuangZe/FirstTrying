package cn.broken.client.mod.mods.render;

import cn.broken.client.mod.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import java.awt.*;

public class Welcome extends Mod {
    public Welcome() {
        super("Welcome", true);
    }

    @Override
    public void render(){
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        int width = scaledResolution.getScaledWidth();

        String WelcomeText = "Welcome "+Minecraft.getMinecraft().thePlayer.getName()+"!";
        FontRenderer font = Minecraft.getMinecraft().fontRendererObj;
        font.drawString(WelcomeText,width / 2 - font.getStringWidth(WelcomeText) / 2,3, new Color(255, 127, 0).getRGB());
    }
}
