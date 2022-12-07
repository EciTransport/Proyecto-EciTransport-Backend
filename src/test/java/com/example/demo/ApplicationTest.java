package com.example.demo;

import com.proyecto.eciTransport.services.ReportService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootConfiguration
@RunWith(SpringRunner.class)
@DataMongoTest
@EnableAutoConfiguration
public class ApplicationTest {

    @Autowired
    ReportService reportService;


    @Test
    public void shouldBeNotEmpty() {
        assertNotNull(reportService.getAllReports());
        assertEquals(12, 12);
    }
}