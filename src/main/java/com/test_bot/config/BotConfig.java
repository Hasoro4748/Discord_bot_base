package com.test_bot.config;

import com.test_bot.listener.BotListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.security.auth.login.LoginException;

@Configuration
public class BotConfig {
    @Value("${discord.bot.token}")
    private String token;

    @Bean
    public JDA startBot() {
        JDA jda = JDABuilder.createDefault(token)
                .setActivity(Activity.playing("명령 대기중"))
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new BotListener())
                .build();

        return jda;
    }
}