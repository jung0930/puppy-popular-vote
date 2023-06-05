package com.deepdive.puppypopularvote.repository.db;

import com.deepdive.puppypopularvote.domain.db.Puppy;

import java.util.List;

public interface PuppyCustomRepository {

    List<Puppy> findPuppyList();

}
