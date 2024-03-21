package moe.rafal.blog.posts.post;

import java.time.Instant;

record PostDto(String username, String message, Instant creationTime) {}
