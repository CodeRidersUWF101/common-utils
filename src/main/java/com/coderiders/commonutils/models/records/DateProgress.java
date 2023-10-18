package com.coderiders.commonutils.models.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DateProgress(Double progress, Integer daysCompleted, Integer daysRemaining) {}