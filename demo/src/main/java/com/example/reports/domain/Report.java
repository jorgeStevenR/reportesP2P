package com.example.reports.domain;

/**
 *
 * @author juanr
 */
import java.time.LocalDateTime;

public record Report(
        String id,
        String peerId,
        ReportType type,
        String summary,
        LocalDateTime generatedAt
) {}
