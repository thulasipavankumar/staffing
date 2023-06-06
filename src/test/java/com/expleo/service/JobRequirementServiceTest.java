package com.expleo.service;
import com.expleo.model.JobRequirement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JobRequirementServiceTest {
    JobRequirementService jobRequirementService;
    @BeforeEach
    public void init() {
        jobRequirementService = new JobRequirementService();
    }
    @Test
    @DisplayName("validate reports are not null")
    void getAllBooksTest()  {
        assertTrue(jobRequirementService.getAllReports().size()>0);
    }

    @Test
    @DisplayName("validate create record")
    void createJobRequirementTest()  {
        JobRequirement requirement = new JobRequirement();
        requirement.setJobId("J001");
        assertTrue(jobRequirementService.getAllReports().size()>0);
        assertEquals(jobRequirementService.createRecord(requirement).getJobId(),requirement.getJobId());
    }

}
