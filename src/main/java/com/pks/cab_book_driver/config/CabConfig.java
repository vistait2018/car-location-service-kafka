package com.pks.cab_book_driver.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.pks.cab_book_driver.constants.AppConstants.CAB_LOCATION;


@Configuration
public class CabConfig {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name(CAB_LOCATION).build();
    }
}
