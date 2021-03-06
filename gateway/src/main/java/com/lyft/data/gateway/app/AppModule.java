package com.lyft.data.gateway.app;

import com.google.inject.AbstractModule;
import io.dropwizard.Configuration;
import lombok.Getter;

@Getter
public abstract class AppModule<T extends Configuration, E> extends AbstractModule {
  private final T configuration;
  private final E environment;

  public AppModule(T config, E env) {
    this.configuration = config;
    this.environment = env;
  }
}
