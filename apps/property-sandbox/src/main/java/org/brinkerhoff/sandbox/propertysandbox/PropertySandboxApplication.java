package org.brinkerhoff.sandbox.propertysandbox;

import org.brinkerhoff.sandbox.propertysandbox.models.StateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
// @EnableAutoConfiguration
public class PropertySandboxApplication implements CommandLineRunner {


  private AppComponent app;

  @Autowired
  public PropertySandboxApplication(AppComponent app){
    this.app=app;
  }

  public void run(String... args){
    app.doStuff();
  }

  public static void main(String[] args) {
    SpringApplication.run(PropertySandboxApplication.class, args);
  }
}
