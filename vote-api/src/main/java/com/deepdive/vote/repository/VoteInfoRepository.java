package com.deepdive.vote.repository;

import com.deepdive.vote.entity.VoteInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface VoteInfoRepository extends JpaRepository<VoteInfo, Integer> {
}
