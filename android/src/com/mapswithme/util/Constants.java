package com.mapswithme.util;

import com.mapswithme.maps.BuildConfig;

public final class Constants
{
  public static final int KB = 1024;
  public static final int MB = 1024 * 1024;
  public static final int GB = 1024 * 1024 * 1024;

  static final int CONNECTION_TIMEOUT_MS = 5000;
  static final int READ_TIMEOUT_MS = 10000;

  public static class Url
  {
    public static final String SHORT_SHARE_PREFIX = "om://";
    public static final String HTTP_SHARE_PREFIX = "https://omaps.app/";

    public static final String MAILTO_SCHEME = "mailto:";
    public static final String MAIL_SUBJECT = "?subject=";
    public static final String MAIL_BODY = "&body=";

    public static final String FB_OM_COMMUNITY_HTTP = "https://www.facebook.com/OrganicMaps";
    public static final String FB_OM_COMMUNITY_NATIVE = "fb://profile/102378968471811";
    public static final String TWITTER = "https://twitter.com/OrganicMapsApp";
    public static final String TELEGRAM = "https://t.me/OrganicMaps";
    public static final String INSTAGRAM = "https://www.instagram.com/organicmaps.app";

    public static final String SUPPORT_US = "https://organicmaps.app/support-us";

    public static final String WEB_SITE = "https://organicmaps.app";
    public static final String GITHUB = "https://github.com/organicmaps/organicmaps";

    public static final String COPYRIGHT = "file:///android_asset/copyright.html";
    public static final String FAQ = "file:///android_asset/faq.html";
    public static final String OPENING_HOURS_MANUAL = "file:///android_asset/opening_hours_how_to_edit.html";

    public static final String OSM_REGISTER = "https://www.openstreetmap.org/user/new";
    public static final String OSM_RECOVER_PASSWORD = "https://www.openstreetmap.org/user/forgot-password";
    public static final String OSM_ABOUT = "https://wiki.openstreetmap.org/wiki/About_OpenStreetMap";

    private Url() {}
  }

  public static class Email
  {
    public static final String FEEDBACK = "android@organicmaps.app";
    public static final String SUPPORT = BuildConfig.SUPPORT_MAIL;
    public static final String RATING = "rating@organicmaps.app";

    private Email() {}
  }

  public static class Package
  {
    public static final String FB_PACKAGE = "com.facebook.katana";

    private Package() {}
  }

  private Constants() {}
}
