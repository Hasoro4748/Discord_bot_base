package com.test_bot.listener;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        User user = event.getAuthor();
        TextChannel channel = event.getChannel().asTextChannel();
        Message message = event.getMessage();

        //해당 유저가 봇이면 진행하지 않고 바로 반환
        if (user.isBot()){
            return;
        }

        String returnMessage = user.getName() + "님이 "
                + channel.getName() + "채널에 ["
                + message.getContentRaw() +"] (이)라고 입력했습니다.";

        channel.sendMessage(returnMessage).queue();

    }
}
