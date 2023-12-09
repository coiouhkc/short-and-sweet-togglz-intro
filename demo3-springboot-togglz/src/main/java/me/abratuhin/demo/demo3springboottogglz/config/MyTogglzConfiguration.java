package me.abratuhin.demo.demo3springboottogglz.config;

import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

@Configuration
public class MyTogglzConfiguration implements TogglzConfig {
  @Override
  public Class<? extends Feature> getFeatureClass() {
    return FeatureOptions.class;
  }

  @Override
  public StateRepository getStateRepository() {
    return new InMemoryStateRepository();
  }

  @Override
  public UserProvider getUserProvider() {
    return new UserProvider() {
      @Override
      public FeatureUser getCurrentUser() {
        return new SimpleFeatureUser("admin", true);
      }
    };
  }
}
