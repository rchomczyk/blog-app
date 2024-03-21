package moe.rafal.blog.discovery;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DiscoveryApplicationTest {

  @Test
  void verifyWhetherContextLoads(final ApplicationContext context) {
    assertNotNull(context);
  }
}
