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
        String longText = "Este es un informe muy detallado generado por el peer. Incluye múltiples métricas sobre el rendimiento del sistema, "
            + "incluyendo carga promedio, uso de CPU por núcleo, estado de la memoria, procesos en ejecución, "
            + "y recomendaciones para optimización. ".repeat(20); // genera texto de ~1000 palabras

        return List.of(
            new Report(UUID.randomUUID().toString(), "peer-A", ReportType.SYSTEM,
                       longText, LocalDateTime.now().minusMinutes(5)),
            new Report(UUID.randomUUID().toString(), "peer-B", ReportType.SECURITY,
                       "Revisión completa del sistema. No se encontraron vulnerabilidades activas. Estado general: SEGURO.", LocalDateTime.now().minusMinutes(3)),
            new Report(UUID.randomUUID().toString(), "peer-C", ReportType.PERFORMANCE,
                       "Rendimiento óptimo. Tiempo promedio de respuesta: 11 ms. No se detectaron cuellos de botella.", LocalDateTime.now().minusMinutes(1))
        );
    }
}
