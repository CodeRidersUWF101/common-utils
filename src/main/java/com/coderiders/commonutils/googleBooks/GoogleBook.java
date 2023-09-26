package com.coderiders.commonutils.googleBooks;

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
public class GoogleBook {

  public String kind;
  public String id;
  public String etag;
  public String selfLink;
  public VolumeInfo volumeInfo;
  public SearchInfo searchInfo;
}
