package com.shreyraj.library_consumer.jpa;

import com.shreyraj.library_consumer.entity.FailureRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FailureRecordRepository extends CrudRepository<FailureRecord,Integer> {
    List<FailureRecord> findAllByStatus(String status);
}
