package com.coderiders.commonutils.models;

import com.coderiders.commonutils.models.enums.ActivityAction;
import com.coderiders.commonutils.models.enums.BadgeType;
import com.coderiders.commonutils.models.enums.ChallengeFrequency;
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
    private ChallengeFrequency frequency;
    private BadgeType type;
    private Integer threshold;
    private Integer duration;
    private LocalDateTime challengeStartDate;
    private LocalDateTime challengeEndDate;
    private Integer pointsAwarded;
    private LocalDateTime userChallengeStartDate;
    private LocalDateTime userChallengeEndDate;
    private ActivityAction status;


    private DateProgress dateProgress;
    private AdditionalChallengeInfo additionalInfo;
}

