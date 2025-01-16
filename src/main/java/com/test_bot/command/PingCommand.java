package com.test_bot.command;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.List;

public class PingCommand implements ICommand {
    @Override
    public String getName() {
        return "핑";
    }

    @Override
    public String getDescription() {
        return "봇에게 핑 보내기";
    }

    @Override
    public List<OptionData> getOptions() {
        return null;
    }

    @Override
    public void excute(SlashCommandInteractionEvent event) {
        event.reply("퐁!").setEphemeral(false).queue();
    }
}
