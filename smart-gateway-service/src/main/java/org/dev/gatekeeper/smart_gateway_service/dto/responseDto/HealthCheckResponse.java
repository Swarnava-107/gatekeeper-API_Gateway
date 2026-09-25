package org.dev.gatekeeper.smart_gateway_service.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class HealthCheckResponse {
    private String serviceName;
    private String serviceDescription;
    private String healthStatus;
}
