package org.zerhusen.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfiguration {
 
    public CacheConfiguration() {
        //Para Spring
    }
}
