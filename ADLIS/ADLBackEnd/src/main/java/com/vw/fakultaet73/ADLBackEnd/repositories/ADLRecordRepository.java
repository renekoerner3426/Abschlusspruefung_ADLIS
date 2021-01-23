package com.vw.fakultaet73.ADLBackEnd.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.vw.fakultaet73.ADLBackEnd.entitites.ADLRecord;

@Repository
public interface ADLRecordRepository extends MongoRepository<ADLRecord, Long> {
}