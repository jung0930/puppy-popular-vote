package com.deepdive.puppypopularvote.puppy.repository.redis;

import com.deepdive.puppypopularvote.domain.redis.RedisPuppyDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisPuppyDetailRepository extends CrudRepository<RedisPuppyDetail, Long> {
}
