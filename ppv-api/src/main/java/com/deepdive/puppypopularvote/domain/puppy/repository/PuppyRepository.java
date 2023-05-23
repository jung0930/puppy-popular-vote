package com.deepdive.puppypopularvote.domain.puppy.repository;

import com.deepdive.puppypopularvote.entity.Puppy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public interface PuppyRepository extends JpaRepository<Puppy, Long> {

    Optional<List<Puppy>> findAllBy();

}
