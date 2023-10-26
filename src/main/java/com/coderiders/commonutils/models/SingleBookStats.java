package com.coderiders.commonutils.models;

import com.coderiders.commonutils.models.enums.ActivityAction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleBookStats {
    private String pagesRead;
    private String dateRead;
}
