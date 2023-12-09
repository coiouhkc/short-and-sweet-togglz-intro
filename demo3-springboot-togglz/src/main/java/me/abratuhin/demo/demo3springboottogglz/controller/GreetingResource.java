package me.abratuhin.demo.demo3springboottogglz.controller;

import me.abratuhin.demo.demo3springboottogglz.config.FeatureOptions;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

@Controller
public class GreetingResource {

  private FeatureManager manager;

  public GreetingResource(FeatureManager manager) {
    this.manager = manager;
  }

  @RequestMapping("/hello")
  public ResponseEntity<?> hello(@RequestParam("name") String name) {
    if (manager.isActive(FeatureOptions.FEATURE_SAYMYNAME)) {
      return ResponseEntity.ok("Hello " + name);
    } else {
      return ResponseEntity.ok("Hello from SpringBoot");
    }
  }
}
