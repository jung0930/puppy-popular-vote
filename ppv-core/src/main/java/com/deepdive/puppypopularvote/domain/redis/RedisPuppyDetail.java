package com.deepdive.puppypopularvote.domain.redis;

import com.deepdive.puppypopularvote.code.Sex;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Builder
@ToString
@RedisHash(value = "puppyDetail", timeToLive = 60 * 60 * 24 * 3)
public class RedisPuppyDetail {

    @Id
    private Long id;
    private String name;
    private String photoFileName;
    private String summaryDescription;
    private String detailDescription;
    private Sex sex;
    private Integer voteCount;

}
