package com.coderiders.commonutils.models;

import com.coderiders.commonutils.models.records.AdditionalChallengeInfo;
import com.coderiders.commonutils.models.records.DateProgress;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserChallengesExtraDTO {
    private Long id;
    private Long userChallengeId;
    private String name;
    private String description;
    private String frequency;
    private String type;
    private Integer threshold;
    private Integer duration;
    private String challengeStartDate;
    private String challengeEndDate;
    private Integer pointsAwarded;
    private String userChallengeStartDate;
    private String userChallengeEndDate;
    private String status;


    private DateProgress dateProgress;
    private AdditionalChallengeInfo additionalInfo;
}

