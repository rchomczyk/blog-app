package moe.rafal.blog.users.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

interface UserFacade {

  @GetMapping("/users/{id}")
  UserDto getUserById(final @PathVariable Long id);
}
