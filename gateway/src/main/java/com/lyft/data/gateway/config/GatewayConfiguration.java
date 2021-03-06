package com.lyft.data.gateway.config;

import io.dropwizard.Configuration;
import java.util.List;
import lombok.Data;

@Data
public class GatewayConfiguration extends Configuration {
  private RequestRouterConfiguration requestRouter;

  private List<ProxyBackendConfiguration> backends;

  // List of Modules with FQCN (Fully Qualified Class Name)
  private List<String> modules;
}
