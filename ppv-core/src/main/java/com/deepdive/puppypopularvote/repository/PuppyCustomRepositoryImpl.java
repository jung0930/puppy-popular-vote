package com.deepdive.puppypopularvote.repository;

import com.deepdive.puppypopularvote.entity.Puppy;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.deepdive.puppypopularvote.entity.QPuppy.puppy;

@RequiredArgsConstructor
@Repository
public class PuppyCustomRepositoryImpl implements PuppyCustomRepository{

    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<Puppy> findPuppyList() {
        JPAQueryFactory.select(

        ).from(puppy)
                .where(

                )
                .orderBy(

                )
                .offset()
                .limit()
        ;
        return null;
    }

}
