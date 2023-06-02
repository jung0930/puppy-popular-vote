package com.deepdive.puppypopularvote.puppy.repository.db;

import com.deepdive.puppypopularvote.domain.db.Puppy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PuppyRepository extends JpaRepository<Puppy, Long> {

    Optional<List<Puppy>> findAllBy();

}
