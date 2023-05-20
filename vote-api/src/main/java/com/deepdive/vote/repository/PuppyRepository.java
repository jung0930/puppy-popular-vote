package com.deepdive.vote.repository;

import com.deepdive.vote.entity.Puppy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PuppyRepository extends JpaRepository<Puppy, Integer> {
}
