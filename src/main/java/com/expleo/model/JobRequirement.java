package com.expleo.model;

import com.expleo.constants.JobTitle;
import com.expleo.constants.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Document("jobrequirement")
public class JobRequirement {
    private JobTitle jobTitle;
    @Id
    private String jobId;
    private Date recievedOn,cvSentDate,itvDate;
    private String tribe, squad;
    private String chapterLead;
    private List<Status> statusList;
    private List<String> comments;
    private long requestedNumber;
    @Override
    public String toString(){
        return "jobid:"+jobId+"\n"
                +"tribe:"+tribe+"\n"
                +"squad:"+squad+"\n"
                +"chapterLead:"+chapterLead+"\n"
                +"comments:"+comments+"\n"
                +"statusList:"+statusList+"\n";
    }
}
