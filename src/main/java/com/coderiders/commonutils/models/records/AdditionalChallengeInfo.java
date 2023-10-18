package com.coderiders.commonutils.models.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalChallengeInfo {
    private Double done;
    private Double toGo;
    private Double percentComplete;
}
