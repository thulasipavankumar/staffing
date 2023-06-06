package com.expleo.controller;
import com.expleo.model.JobRequirement;
import com.expleo.model.Report;
import com.expleo.service.JobRequirementService;
import io.swagger.annotations.ApiOperation;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class JobRequirementController {
    @Autowired
    private JobRequirementService jobRequirementService;
    @GetMapping("/statusreport")
    @ApiOperation(value = "List all books", response = JobRequirement.class)
    @PermitAll
    public List<JobRequirement> getAllBook() {
        return jobRequirementService.getAllReports();
    }

    @GetMapping("/statusreport/{id}")
    @ApiOperation(value = "List a report summary by id", response = JobRequirement.class)
    @PermitAll
    public JobRequirement getBookById(@PathVariable("id") String id) {
        return jobRequirementService.getReport(id);
    }
    @PostMapping("/statusreport")
    @ApiOperation(value = "Add a record")
    @PermitAll
    public JobRequirement createStatusRecord(@RequestBody JobRequirement requirement) {
        return jobRequirementService.createRecord(requirement);
    }
    @PutMapping("/statusreport/{id}")
    @ApiOperation(value = "Update a record")
    @PermitAll
    public JobRequirement updateRecord(@PathVariable("id") Long id, @RequestBody Report report) {
        return jobRequirementService.updateRecord(id, report);
    }
}
