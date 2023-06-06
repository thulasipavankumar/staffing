package com.expleo.controller;
import com.expleo.model.Report;
import com.google.gson.Gson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class JobRequirementControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    @DisplayName("validate status report of talent management is array ")
    void getAllBooksTest() throws Exception {
        mockMvc.perform(get("/api/v1/statusreport"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$").isArray());
    }
    @Test
    @DisplayName("validate creating a new record ")
    void createRecord()  throws Exception{
        Report report = new Report();
        String json = ObjectToJson(report);
        mockMvc.perform(post("/api/v1/statusreport")
                .contentType("application/json")
                .content(json))
                .andExpect(status().isOk());
    }
    @Test
    @DisplayName("validate status report of talent management is array ")
    void getRecord() throws Exception {
        mockMvc.perform(get("/api/v1/statusreport/"+1))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$").isArray());
    }
    @Test
    @DisplayName("validate status report of talent management is array ")
    void updateRecord() throws Exception {
        Report report = new Report();
        String json = ObjectToJson(report);
        mockMvc.perform(put("/api/v1/statusreport/"+1)
                .contentType("application/json")
                .content(json))
                .andExpect(status().isOk());
    }

    private String ObjectToJson(Object toConvert){
        Gson gson = new Gson();
        String json = gson.toJson(toConvert);
        return json;
    }
}
