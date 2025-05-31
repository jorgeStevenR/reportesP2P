package com.example.reports.service;

import com.example.reports.domain.Report;
import java.util.List;
/**
 *
 * @author juanr
 */
public interface ReportService {
    List<Report> getAllReportsSorted();
}
