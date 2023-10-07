package com.coderiders.commonutils.models.googleBooks;

import com.coderiders.commonutils.models.UserLibraryWithBookDetails;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveBookRequest {
    private String clerkId;
    private UserLibraryWithBookDetails book;
}
