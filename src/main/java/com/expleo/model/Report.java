package com.expleo.model;

import com.expleo.constants.JobTitle;
import com.expleo.constants.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Report {
    private long requestNumber;
    private JobTitle jobTitle;
    private String tribe, squad;
    private String chapterLead;
    private Date recievedOn,cvSentDate,itvDate;
    private long cvSentN,itvNL;
    private long starts;
    private String comments;
    private Status status;
    @Override
    public String toString(){
        return "StatusReport{} ";
    }
}
