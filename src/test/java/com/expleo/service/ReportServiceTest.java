package com.expleo.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.HashSet;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportServiceTest {
    ReportService reportService;
    @BeforeEach
    public void init() {
        reportService = new ReportService();
    }
    @Test
    @DisplayName("validate reports are not null")
    void getAllBooksTest()  {
        assertTrue(reportService.getAllReports().size()>0);
    }

}
