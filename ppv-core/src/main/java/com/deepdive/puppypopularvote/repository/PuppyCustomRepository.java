package com.deepdive.puppypopularvote.repository;

import com.deepdive.puppypopularvote.entity.Puppy;

import java.util.List;

public interface PuppyCustomRepository {

    List<Puppy> findPuppyList();

}
