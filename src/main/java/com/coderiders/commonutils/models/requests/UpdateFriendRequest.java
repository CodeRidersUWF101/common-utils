package com.coderiders.commonutils.models.requests;

import com.coderiders.commonutils.models.UtilsUser;
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
public class UpdateFriendRequest {
    private String clerkId;
    private String friendId;
    private String status;
}
