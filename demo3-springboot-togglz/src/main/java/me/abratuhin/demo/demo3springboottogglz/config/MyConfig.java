package me.abratuhin.demo.demo3springboottogglz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

@Configuration
public class MyConfig {
  @Bean
  public FeatureProvider featureProvider() {
    return new EnumBasedFeatureProvider(FeatureOptions.class);
  }
}
