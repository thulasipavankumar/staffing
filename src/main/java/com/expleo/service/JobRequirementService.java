package com.expleo.service;

import com.expleo.exception.NotImplementedException;
import com.expleo.exception.NotSuchRecordFoundException;
import com.expleo.model.JobRequirement;
import com.expleo.model.Report;
import com.expleo.repository.IJobRequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.query.Query;

import java.util.*;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
@EnableMongoRepositories
public class JobRequirementService {
    @Autowired
    IJobRequirementRepository jobRequirementRepository;
    public List<JobRequirement> getAllReports(){
        return jobRequirementRepository.findAll();
    }
    public JobRequirement getReport(String jobId){

        Optional<JobRequirement> requirement = jobRequirementRepository.findById(jobId);
        if(requirement.isPresent()){
            System.out.println(requirement.get().toString());
            return requirement.get();
        }else{
            System.out.println("Provided job id is not available");
            throw new NotSuchRecordFoundException("Provided job id is not available");
        }
    }
    public JobRequirement createRecord(JobRequirement requirement){
        jobRequirementRepository.insert(requirement);
        return jobRequirementRepository.findItemByJobId(requirement.getJobId());
    }
    public JobRequirement updateRecord(long id, Report report){
        throw new NotImplementedException();
    }


}
