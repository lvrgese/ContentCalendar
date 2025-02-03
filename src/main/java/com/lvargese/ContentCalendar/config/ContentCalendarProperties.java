package com.lvargese.ContentCalendar.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value="cc")
public record ContentCalendarProperties(String welcomeMessage) {
}
