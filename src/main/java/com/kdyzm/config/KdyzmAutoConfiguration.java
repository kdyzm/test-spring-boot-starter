package com.kdyzm.config;

import com.kdyzm.beans.DemoBean;
import com.kdyzm.properties.TestProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TestProperties.class)
public class KdyzmAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public DemoBean demoBean(TestProperties testProperties) {
        String url = testProperties.getUrl();
        return new DemoBean(url);
    }

}
