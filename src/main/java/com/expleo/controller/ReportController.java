package com.expleo.controller;
import com.expleo.model.Report;
import com.expleo.service.ReportService;
import io.swagger.annotations.ApiOperation;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReportController {
    @Autowired
    private ReportService reportService;
    @GetMapping("/statusreport")
    @ApiOperation(value = "List all books", response = Report.class)
    @PermitAll
    public List<Report> getAllBook() {
        return reportService.getAllReports();
    }

    @GetMapping("/statusreport/{id}")
    @ApiOperation(value = "List a report summary by id", response = Report.class)
    @PermitAll
    public Report getBookById(@PathVariable("id") Long id) {
        return reportService.getReport(id);
    }
    @PostMapping("/statusreport")
    @ApiOperation(value = "Add a record")
    @PermitAll
    public Report createStatusRecord(@RequestBody Report report) {
        return reportService.createRecord(report);
    }
    @PutMapping("/statusreport/{id}")
    @ApiOperation(value = "Update a record")
    @PermitAll
    public Report updateRecord(@PathVariable("id") Long id, @RequestBody Report report) {
        return reportService.updateRecord(id, report);
    }
}
