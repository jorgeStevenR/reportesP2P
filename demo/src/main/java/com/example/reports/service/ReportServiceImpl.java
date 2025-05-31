package com.example.reports.service;

import com.example.reports.domain.Report;
import com.example.reports.repository.ReportClient;
import com.example.reports.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
/**
 *
 * @author juanr
 */
@Service
public class ReportServiceImpl implements ReportService {

    private final ReportClient reportClient;

    public ReportServiceImpl(ReportClient reportClient) { 
        this.reportClient = reportClient;
    }

    @Override
    public List<Report> getAllReportsSorted() {
        return reportClient.fetchReports()
                           .stream()
                           .sorted(Comparator.comparing(Report::generatedAt).reversed())
                           .toList();
    }
}
