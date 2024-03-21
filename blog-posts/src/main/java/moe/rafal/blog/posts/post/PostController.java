package moe.rafal.blog.posts.post;

import static java.time.Instant.now;

import java.util.List;
import moe.rafal.blog.posts.user.UserDto;
import moe.rafal.blog.posts.user.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PostController {

  private final UserClient userClient;

  @Autowired
  public PostController(final UserClient userClient) {
    this.userClient = userClient;
  }

  @GetMapping("/posts/{userId}")
  List<PostDto> getPosts(final @PathVariable Long userId) {
    final UserDto user = userClient.getUserById(userId);
    return List.of(
        new PostDto(user.username(), "Hello, world!", now()),
        new PostDto(user.username(), "Goodbye, world!", now()));
  }
}
