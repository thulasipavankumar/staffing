package com.expleo.repository;

import com.expleo.model.JobRequirement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IJobRequirementRepository extends MongoRepository<JobRequirement, String> {
    @Query("{jobId:'?0'}")
    JobRequirement findItemByJobId(String jobId);

    @Query(value="{jobTitle:'?0'}", fields="{'jobId' : 1, 'jobTitle' : 1}")
    List<JobRequirement> findAll(String jobTitle);

    public long count();
}
