package com.coderiders.commonutils.models.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AdditionalChallengeInfo (Double done, Double toGo, Double percentComplete) {}
