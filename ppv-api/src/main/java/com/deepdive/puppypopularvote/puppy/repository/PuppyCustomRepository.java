package com.deepdive.puppypopularvote.puppy.repository;

import com.deepdive.puppypopularvote.entity.Puppy;

import java.util.List;

public interface PuppyCustomRepository {

    List<Puppy> findPuppyList();

}
