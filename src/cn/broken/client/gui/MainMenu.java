package cn.broken.client.gui;

import cn.broken.client.Client;
import net.minecraft.client.gui.*;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class MainMenu extends GuiScreen {
    @Override
    public void drawScreen (int mouseX,int mouseY ,float partialTicks) {
        drawBackground (0);

        mc.getTextureManager().bindTexture(new ResourceLocation("textures/gui/title/background/background_1.png"));
        int picwidth = 3280 * height / 1080;
        Gui.drawModalRectWithCustomSizedTexture(- ( picwidth - width ) / 2, 0, 0, 0, width * 2,height, picwidth,height);

        FontRenderer font = mc.fontRendererObj;
        font.drawString (Client.NAME + " Client " + "[1.8.9-" + Client.VERSION + "]", 2, height - font.FONT_HEIGHT,0xFFFFFFFF);
        font.drawString ("Optifine 1.8.9 HD U M5", 2, height -  font.FONT_HEIGHT  * 2, 0xFFFFFFFF);

        super.drawScreen (mouseX,mouseY,partialTicks);
    }

    public void initGui () {
        int j = this.height / 4 + 48;
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, j + 72 + 12, 98, 20, I18n.format("menu.options", new Object[0])));
        this.buttonList.add(new GuiButton(4, this.width / 2 + 2, j + 72 + 12, 98, 20, I18n.format("menu.quit", new Object[0])));
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100,j, I18n.format("menu.singleplayer", new Object[0])));
        this.buttonList.add(new GuiButton(2, this.width / 2 - 100, j+ 24, I18n.format("menu.multiplayer", new Object[0])));

    }

    protected void actionPerformed(GuiButton button) throws IOException {

        if (button.id == 0)
        {
            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
        }

        if (button.id == 4)
        {
            this.mc.shutdown();
        }

        if (button.id == 1)
        {
            this.mc.displayGuiScreen(new GuiSelectWorld(this));
        }

        if (button.id == 2)
        {
            this.mc.displayGuiScreen(new GuiMultiplayer(this));
        }

        super.actionPerformed(button);
    }
}
