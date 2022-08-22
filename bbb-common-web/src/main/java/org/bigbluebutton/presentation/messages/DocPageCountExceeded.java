package org.bigbluebutton.presentation.messages;

public class DocPageCountExceeded implements IDocConversionMsg {
  public final String podId;
  public final String meetingId;
  public final String presId;
  public final String presInstance;
  public final String filename;
  public final String uploaderId;
  public final String authzToken;
  public final Boolean downloadable;
  public final Boolean removable;
  public final String key;
  public final Integer numPages;
  public final Integer maxNumPages;
  public final String temporaryPresentationId;

  public DocPageCountExceeded(String podId, String meetingId, String presId, String presInstance,
                              String filename, String uploaderId, String authzToken,
                              Boolean downloadable, Boolean removable,  String key,
                              Integer numPages, Integer maxNumPages, String temporaryPresentationId) {
    this.podId = podId;
    this.meetingId = meetingId;
    this.presId = presId;
    this.presInstance = presInstance;
    this.filename = filename;
    this.uploaderId = uploaderId;
    this.authzToken = authzToken;
    this.downloadable = downloadable;
    this.removable = removable;
    this.key = key;
    this.numPages = numPages;
    this.maxNumPages = maxNumPages;
    this.temporaryPresentationId = temporaryPresentationId;
  }
}
