package com.coderiders.commonutils.models;

import com.coderiders.commonutils.models.enums.ActivityAction;
import com.coderiders.commonutils.models.enums.BadgeType;
import com.coderiders.commonutils.models.enums.ChallengeFrequency;
import com.coderiders.commonutils.models.records.AdditionalChallengeInfo;
import com.coderiders.commonutils.models.records.DateProgress;
import com.coderiders.commonutils.models.records.UserChallengesDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserChallengesExtraDTO {
    private long id;
    private long userChallengeId;
    private String name;
    private String description;
    private String frequency;
    private String type;
    private int threshold;
    private int duration;
    private LocalDateTime challengeStartDate;
    private LocalDateTime challengeEndDate;
    private int pointsAwarded;
    private LocalDateTime userChallengeStartDate;
    private LocalDateTime userChallengeEndDate;
    private String status;


    private DateProgress dateProgress;
    private AdditionalChallengeInfo additionalInfo;
}

