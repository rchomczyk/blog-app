package moe.rafal.blog.posts;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class PostsApplicationTest {

  @Test
  void verifyWhetherContextLoads(final ApplicationContext context) {
    assertNotNull(context);
  }
}
