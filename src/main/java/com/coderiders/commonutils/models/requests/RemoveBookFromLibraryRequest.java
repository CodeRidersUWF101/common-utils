package com.coderiders.commonutils.models.requests;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RemoveBookFromLibraryRequest {
    private String clerkId;
    private String bookId;
}
