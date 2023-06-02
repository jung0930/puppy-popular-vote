package com.deepdive.puppypopularvote.puppy.repository.db;

import com.deepdive.puppypopularvote.domain.db.Puppy;

import java.util.List;

public interface PuppyCustomRepository {

    List<Puppy> findPuppyList();

}
