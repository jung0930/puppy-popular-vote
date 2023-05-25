package com.deepdive.puppypopularvote.repository;

import com.deepdive.puppypopularvote.entity.VoteInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface VoteInfoRepository extends JpaRepository<VoteInfo, Integer> {
}
