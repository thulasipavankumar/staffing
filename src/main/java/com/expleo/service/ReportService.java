package com.expleo.service;

import com.expleo.NotImplementedException;
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
        throw new NotImplementedException();
    }
    public Report createRecord(Report report){
        throw new NotImplementedException();
    }
    public Report updateRecord(long id, Report report){
        throw new NotImplementedException();
    }


}
