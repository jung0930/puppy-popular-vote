package com.deepdive.puppypopularvote.puppy.repository.db;

import com.deepdive.puppypopularvote.domain.db.VoteInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteInfoRepository extends JpaRepository<VoteInfo, Integer> {
}
