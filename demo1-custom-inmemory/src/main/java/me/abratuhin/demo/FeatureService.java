package me.abratuhin.demo;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@ApplicationScoped
public class FeatureService {
  private Map<Features, Boolean> featureMap =
      Arrays.stream(Features.values())
          .collect(Collectors.toMap(features -> features, features -> true));

  public Map<Features, Boolean> getFeatures() {
    return this.featureMap;
  }

  public void activate(Features features) {
    featureMap.put(features, true);
  }

  public void deactivate(Features features) {
    featureMap.put(features, false);
  }

  public boolean isActive(Features features) {
    return featureMap.get(features);
  }
}
