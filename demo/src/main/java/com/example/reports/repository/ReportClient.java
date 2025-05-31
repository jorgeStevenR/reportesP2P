package com.example.reports.repository;

import com.example.reports.domain.Report;
import java.util.List;
/**
 *
 * @author juanr
 */
public interface ReportClient {
    List<Report> fetchReports();          
}