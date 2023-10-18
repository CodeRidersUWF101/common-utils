package com.coderiders.commonutils.models.records;

import com.coderiders.commonutils.models.enums.BadgeType;

import java.time.LocalDateTime;

public record UserBadge (
        long id,
        String name,
        String description,
        int threshold,
        BadgeType type,
        short tier,
        String imageUrl,
        int pointsAwarded,
        LocalDateTime dateEarned
) {

}
