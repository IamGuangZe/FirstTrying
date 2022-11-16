package cn.broken.client.mod.mods.movement;

import cn.broken.client.mod.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.input.Keyboard;
import java.awt.*;

public class ToggleSprint extends Mod {
    public ToggleSprint(){
        super ("Sprint",true);
        setKey(Keyboard.KEY_I);
    }

    @Override
    public void update(){
        if (Minecraft.getMinecraft().gameSettings.keyBindForward.isPressed()) {
            Minecraft.getMinecraft().thePlayer.setSprinting(true);
        }
    }
    public void render() {
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        int height = scaledResolution.getScaledHeight();
        FontRenderer font = Minecraft.getMinecraft().fontRendererObj;
        font.drawString("[ToggleSprint (Enabled)]", 2, height - font.FONT_HEIGHT - 2, new Color(255, 255, 255).getRGB());
    }
}