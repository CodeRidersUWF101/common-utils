package com.coderiders.commonutils.models.records;

import com.coderiders.commonutils.models.enums.BadgeType;

public record Badge (
        long id,
        String name,
        String description,
        int threshold,
        BadgeType type,
        short tier,
        String imageUrl,
        int pointsAwarded
) {}
