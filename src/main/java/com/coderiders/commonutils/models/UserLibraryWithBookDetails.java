package com.coderiders.commonutils.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLibraryWithBookDetails {
    private String book_id;
    private String api_id;
    private String title;
    private String[] author;
    private String publisher;
    private String published_date;
    private String description;
    private String isbn_10;
    private String isbn_13;
    private Integer page_count;
    private String print_type;
    private String[] categories;
    private Double average_rating;
    private Integer ratings_count;
    private String maturity_rating;
    private String small_thumbnail;
    private String thumbnail;
    private String reading_status;
    private Integer last_page_read;
    private Timestamp last_reading_update;
}

