package com.example.reports.controller;

import com.example.reports.service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author juanr
 */
@Controller
public class ReportsController {

    private final ReportService reportService;

    public ReportsController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/")
    public String listReports(Model model) {
        model.addAttribute("reports", reportService.getAllReportsSorted());
        return "reports/list";
    }
}
