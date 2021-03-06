package com.feed_the_beast.ftbquests.gui.tree;

import com.feed_the_beast.ftblib.lib.gui.Panel;
import com.feed_the_beast.ftblib.lib.gui.WidgetLayout;
import com.feed_the_beast.ftbquests.quest.Quest;
import com.feed_the_beast.ftbquests.quest.QuestChapter;
import com.feed_the_beast.ftbquests.quest.reward.QuestReward;
import net.minecraftforge.fml.common.Loader;

/**
 * @author LatvianModder
 */
public class PanelOtherButtons extends Panel
{
	public final GuiQuestTree treeGui;

	public PanelOtherButtons(Panel panel)
	{
		super(panel);
		treeGui = (GuiQuestTree) panel.getGui();
	}

	private boolean hasRewards()
	{
		if (treeGui.file.self == null)
		{
			return false;
		}

		for (QuestChapter chapter : treeGui.file.chapters)
		{
			for (Quest quest : chapter.quests)
			{
				if (quest.isComplete(treeGui.file.self))
				{
					for (QuestReward reward : quest.rewards)
					{
						if (!treeGui.file.isRewardClaimed(reward))
						{
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	@Override
	public void addWidgets()
	{
		if (treeGui.file.canEdit())
		{
			add(new ButtonAddChapter(this));
		}

		if (hasRewards())
		{
			add(new ButtonClaimAllRewards(this));
		}

		if (Loader.isModLoaded("ftbmoney"))
		{
			add(new ButtonOpenShop(this));
		}

		if (!treeGui.file.emergencyItems.isEmpty() && (treeGui.file.self != null || treeGui.file.canEdit()))
		{
			add(new ButtonEmergencyItems(this));
		}

		add(new ButtonWiki(this));

		if (treeGui.file.canEdit())
		{
			add(new ButtonEditSettings(this));
		}
	}

	@Override
	public void alignWidgets()
	{
		setSize(align(new WidgetLayout.Horizontal(1, 1, 0)), treeGui.chapterPanel.height);
		setX(getGui().width - width - 1);
	}
}