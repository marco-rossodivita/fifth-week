package com.corso.java.cronometro1.Repository;

import com.corso.java.cronometro1.Domain.TimeRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends MongoRepository<TimeRecord, String> {
}
