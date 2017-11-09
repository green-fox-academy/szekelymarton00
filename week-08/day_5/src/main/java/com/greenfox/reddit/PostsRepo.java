package com.greenfox.reddit;

import org.springframework.data.repository.CrudRepository;

public interface PostsRepo extends CrudRepository<Post,Long> {

}
