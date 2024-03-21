package moe.rafal.blog.posts.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("blog-users")
public interface UserClient {

  @GetMapping("/users/{id}")
  UserDto getUserById(final @PathVariable Long id);
}
