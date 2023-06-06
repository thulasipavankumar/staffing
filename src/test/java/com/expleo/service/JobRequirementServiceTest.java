package com.expleo.service;
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

}
