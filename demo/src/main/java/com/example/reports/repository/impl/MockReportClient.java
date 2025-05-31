package com.example.reports.repository.impl;

import com.example.reports.domain.*;
import com.example.reports.repository.ReportClient;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
/**
 *
 * @author juanr
 */
@Component
public class MockReportClient implements ReportClient {

    @Override
    public List<Report> fetchReports() {
        return List.of(
            new Report(UUID.randomUUID().toString(), "peer-A", ReportType.SYSTEM,
                       "CPU 45 %, RAM 2 GB", LocalDateTime.now().minusMinutes(5)),
            new Report(UUID.randomUUID().toString(), "peer-B", ReportType.SECURITY,
                       "Sin vulnerabilidades", LocalDateTime.now().minusMinutes(3)),
            new Report(UUID.randomUUID().toString(), "peer-C", ReportType.PERFORMANCE,
                       "Latencia promedio 12 ms", LocalDateTime.now().minusMinutes(1))
        );
    }
}
