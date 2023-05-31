package com.deepdive.puppypopularvote.puppy.repository;

import com.deepdive.puppypopularvote.entity.VoteInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteInfoRepository extends JpaRepository<VoteInfo, Integer> {
}
