package com.test_bot.command;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.List;

public interface ICommand {
    String getName();
    String getDescription();
    List<OptionData> getOptions();
    void excute(SlashCommandInteractionEvent event);
}
