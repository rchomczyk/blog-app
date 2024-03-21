package moe.rafal.blog.discovery;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discovery")
class DiscoveryController {

  private final DiscoveryClient discoveryClient;

  @Autowired
  public DiscoveryController(final DiscoveryClient discoveryClient) {
    this.discoveryClient = discoveryClient;
  }

  @GetMapping("/services/{applicationName}")
  List<ServiceInstance> getServiceInstancesByApplicationName(
      final @PathVariable String applicationName) {
    return discoveryClient.getInstances(applicationName);
  }
}
