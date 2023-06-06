package com.expleo.model;

import com.expleo.constants.JobTitle;
import com.expleo.constants.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

@Setter
@Getter
public class Report {

    @DBRef
    private JobRequirement jobRequirement;

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
