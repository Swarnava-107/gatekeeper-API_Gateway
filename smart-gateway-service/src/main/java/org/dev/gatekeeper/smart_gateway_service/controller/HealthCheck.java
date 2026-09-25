package org.dev.gatekeeper.smart_gateway_service.controller;

import org.dev.gatekeeper.smart_gateway_service.dto.responseDto.HealthCheckResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheck {

    private String serviceName;
    private String serviceDescription;

    public HealthCheck(@Value("${info.app.name}") String serviceName,
                       @Value("${info.app.description}") String serviceDescription) {
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
    }

    @GetMapping
    public ResponseEntity<HealthCheckResponse> healthCheck() {
        return ResponseEntity.ok(
                new HealthCheckResponse(serviceName,serviceDescription,"UP"));
    }
}
