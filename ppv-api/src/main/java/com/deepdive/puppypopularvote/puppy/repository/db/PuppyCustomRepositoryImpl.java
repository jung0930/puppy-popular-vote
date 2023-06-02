package com.deepdive.puppypopularvote.puppy.repository.db;

import com.deepdive.puppypopularvote.domain.db.Puppy;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class PuppyCustomRepositoryImpl implements PuppyCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Puppy> findPuppyList() {
//        jpaQueryFactory.select(
//
//                ).from(puppy)
//                .where(
//
//                )
//                .orderBy(
//
//                )
//                .offset()
//                .limit()
//        ;
        return null;
    }

}
