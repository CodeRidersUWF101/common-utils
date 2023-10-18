package com.coderiders.commonutils.models.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DateProgress {
    private Double progress;
    private Integer daysCompleted;
    private Integer daysRemaining;
}