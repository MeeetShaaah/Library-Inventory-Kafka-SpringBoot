package com.shreyraj.library_consumer.jpa;

import com.shreyraj.library_consumer.entity.LibraryEvent;
import org.springframework.data.repository.CrudRepository;

public interface LibraryEventsRepository extends CrudRepository<LibraryEvent,Integer> {
}
