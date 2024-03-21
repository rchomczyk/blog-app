package moe.rafal.blog.users.user;

import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController implements UserFacade {

  @Override
  public UserDto getUserById(final Long id) {
    return new UserDto(id.toString(), "user" + id, "user" + id + "@example.com");
  }
}
