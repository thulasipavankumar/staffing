package com.expleo.service;

import com.expleo.model.Report;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {
    public List<Report> getAllReports(){
        List<Report> reports = new ArrayList<Report>();
        return reports;
    }
    public Report getReport(long id){
        return  null;
    }
    public Report createRecord(Report report){
        return  null;
    }
    public Report updateRecord(long id, Report report){
        return  null;
    }


}
