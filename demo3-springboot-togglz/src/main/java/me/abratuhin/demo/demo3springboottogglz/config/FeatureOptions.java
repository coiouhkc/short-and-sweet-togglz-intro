package me.abratuhin.demo.demo3springboottogglz.config;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum FeatureOptions implements Feature {
  @EnabledByDefault
  @Label("say-my-name")
  FEATURE_SAYMYNAME;

  public boolean isActive() {

    return FeatureContext.getFeatureManager().isActive(this);
  }
}
