package com.feed_the_beast.ftbquests.gui;

import com.feed_the_beast.ftblib.lib.gui.GuiHelper;
import com.feed_the_beast.ftblib.lib.gui.Theme;
import com.feed_the_beast.ftblib.lib.gui.WidgetType;
import com.feed_the_beast.ftblib.lib.icon.Color4I;
import com.feed_the_beast.ftblib.lib.icon.Icon;
import com.feed_the_beast.ftbquests.FTBQuests;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

/**
 * @author LatvianModder
 */
public class FTBQuestsTheme extends Theme
{
	public static final FTBQuestsTheme INSTANCE = new FTBQuestsTheme();
	public static final Color4I GREEN_IN = Color4I.rgb(0x9BC600);
	public static final Color4I GREEN_OUT = Color4I.rgb(0x408300);

	public static final Icon ADD = new Icon()
	{
		@Override
		public void draw(int x, int y, int w, int h, Color4I col)
		{
			GlStateManager.disableTexture2D();
			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder buffer = tessellator.getBuffer();
			buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_COLOR);

			double dw = w / 16D;
			double dh = h / 16D;

			int r = GREEN_OUT.redi();
			int g = GREEN_OUT.greeni();
			int b = GREEN_OUT.bluei();
			int a = GREEN_OUT.alphai();

			buffer.pos(x + dw * 6, y + dh * 2, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 6, y + dh * 14, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 10, y + dh * 14, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 10, y + dh * 2, 0).color(r, g, b, a).endVertex();

			buffer.pos(x + dw * 2, y + dh * 6, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 2, y + dh * 10, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 14, y + dh * 10, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 14, y + dh * 6, 0).color(r, g, b, a).endVertex();

			r = GREEN_IN.redi();
			g = GREEN_IN.greeni();
			b = GREEN_IN.bluei();
			a = GREEN_IN.alphai();

			buffer.pos(x + dw * 7, y + dh * 3, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 7, y + dh * 13, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 9, y + dh * 13, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 9, y + dh * 3, 0).color(r, g, b, a).endVertex();

			buffer.pos(x + dw * 3, y + dh * 7, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 3, y + dh * 9, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 13, y + dh * 9, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 13, y + dh * 7, 0).color(r, g, b, a).endVertex();

			tessellator.draw();
			GlStateManager.enableTexture2D();
		}
	};

	public static final Icon COMPLETED = new Icon()
	{
		@Override
		public void draw(int x, int y, int w, int h, Color4I col)
		{
			GlStateManager.disableTexture2D();
			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder buffer = tessellator.getBuffer();
			buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_COLOR);

			double dw = w / 16D;
			double dh = h / 16D;

			int r = GREEN_OUT.redi();
			int g = GREEN_OUT.greeni();
			int b = GREEN_OUT.bluei();
			int a = GREEN_OUT.alphai();

			buffer.pos(x + dw * 0, y + dh * 8, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 6, y + dh * 14, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 6, y + dh * 8, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 3, y + dh * 5, 0).color(r, g, b, a).endVertex();

			buffer.pos(x + dw * 6, y + dh * 8, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 6, y + dh * 14, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 16, y + dh * 4, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 13, y + dh * 1, 0).color(r, g, b, a).endVertex();

			r = GREEN_IN.redi();
			g = GREEN_IN.greeni();
			b = GREEN_IN.bluei();
			a = GREEN_IN.alphai();

			buffer.pos(x + dw * 0 + dw, y + dh * 8, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 6, y + dh * 14 - dh, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 6, y + dh * 8 + dh, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 3, y + dh * 5 + dh, 0).color(r, g, b, a).endVertex();

			buffer.pos(x + dw * 6, y + dh * 8 + dh, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 6, y + dh * 14 - dh, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 16 - dw, y + dh * 4, 0).color(r, g, b, a).endVertex();
			buffer.pos(x + dw * 13, y + dh * 1 + dh, 0).color(r, g, b, a).endVertex();

			tessellator.draw();
			GlStateManager.enableTexture2D();
		}
	};

	public static final Icon ALERT = Icon.getIcon(FTBQuests.MOD_ID + ":textures/gui/alert.png");

	@Override
	public void drawGui(int x, int y, int w, int h, WidgetType type)
	{
		int r, g, b, a;

		if (type == WidgetType.DISABLED)
		{
			r = g = b = 180;
			a = 255;
		}
		else
		{
			r = g = b = 255;
			a = 220;
		}

		double m = 64D;

		BACKGROUND_SQUARES.bindTexture();
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder buffer = tessellator.getBuffer();
		buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_COLOR);
		buffer.pos(x, y + h, 0).tex(x / m, (y + h) / m).color(r, g, b, a).endVertex();
		buffer.pos(x + w, y + h, 0).tex((x + w) / m, (y + h) / m).color(r, g, b, a).endVertex();
		buffer.pos(x + w, y, 0).tex((x + w) / m, y / m).color(r, g, b, a).endVertex();
		buffer.pos(x, y, 0).tex(x / m, y / m).color(r, g, b, a).endVertex();
		tessellator.draw();
	}

	@Override
	public void drawButton(int x, int y, int w, int h, WidgetType type)
	{
		GuiHelper.drawHollowRect(x, y, w, h, type == WidgetType.DISABLED ? Color4I.GRAY.withAlpha(80) : Color4I.WHITE.withAlpha(150), false);

		if (type == WidgetType.MOUSE_OVER)
		{
			Color4I.WHITE.withAlpha(33).draw(x + 1, y + 1, w - 2, h - 2);
		}
	}

	@Override
	public void drawContainerSlot(int x, int y, int w, int h)
	{
		GuiHelper.drawHollowRect(x - 1, y - 1, w + 2, h + 2, Color4I.WHITE.withAlpha(150), false);
	}

	@Override
	public void drawContextMenuBackground(int x, int y, int w, int h)
	{
		GuiHelper.drawHollowRect(x, y, w, h, Color4I.GRAY, true);
		drawGui(x + 1, y + 1, w - 2, h - 2, WidgetType.DISABLED);
	}

	@Override
	public void drawScrollBarBackground(int x, int y, int w, int h, WidgetType type)
	{
		Color4I.BLACK.withAlpha(70).draw(x, y, w, h);
	}

	@Override
	public void drawScrollBar(int x, int y, int w, int h, WidgetType type, boolean vertical)
	{
		getContentColor(WidgetType.NORMAL).withAlpha(100).withOutline(Color4I.GRAY.withAlpha(100), false).draw(x, y, w, h);
	}
}