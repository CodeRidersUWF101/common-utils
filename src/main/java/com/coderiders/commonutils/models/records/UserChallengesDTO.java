package com.coderiders.commonutils.models.records;



import com.coderiders.commonutils.models.enums.ActivityAction;
import com.coderiders.commonutils.models.enums.BadgeType;
import com.coderiders.commonutils.models.enums.ChallengeFrequency;

import java.time.LocalDateTime;

public record UserChallengesDTO (
        long id,
        long userChallengeId,
        String name,
        String description,
        ChallengeFrequency frequency,
        BadgeType type,
        int threshold,
        int duration,
        LocalDateTime challengeStartDate,
        LocalDateTime challengeEndDate,
        int pointsAwarded,
        LocalDateTime userChallengeStartDate,
        ActivityAction status
) {}