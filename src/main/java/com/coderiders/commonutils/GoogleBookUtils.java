package com.coderiders.commonutils;

import com.coderiders.commonutils.models.googleBooks.GoogleBook;
import com.coderiders.commonutils.models.googleBooks.IndustryIdentifier;

public class GoogleBookUtils {
    public static String getISBN10(GoogleBook googleBook) {
        if (googleBook.volumeInfo.industryIdentifiers == null) return null;

        return googleBook.volumeInfo.industryIdentifiers.stream()
                .filter(id -> id.getType().equalsIgnoreCase("ISBN_10"))
                .findFirst().map(IndustryIdentifier::getIdentifier)
                .orElse(null);
    }

    public static String getISBN13(GoogleBook googleBook) {
        if (googleBook.volumeInfo.industryIdentifiers == null) return null;

        return googleBook.volumeInfo.industryIdentifiers.stream()
                .filter(id -> id.getType().equalsIgnoreCase("ISBN_13"))
                .findFirst().map(IndustryIdentifier::getIdentifier)
                .orElse(null);
    }
}
