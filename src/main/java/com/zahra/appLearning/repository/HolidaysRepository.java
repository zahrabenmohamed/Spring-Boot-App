package com.zahra.appLearning.repository;

import com.zahra.appLearning.model.Holiday;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidaysRepository extends CrudRepository<Holiday,Long> {
}
