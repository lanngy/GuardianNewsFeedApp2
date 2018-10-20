package com.example.android.guardiannewsfeedapp;

public class NewsFeed {
    private String mdate;
    private String mwebTitle;
    private String mwebUrl;
    private String mauthor;

    public NewsFeed ( String date, String webTitle, String webUrl, String author) {
        mdate=date;
        mwebTitle=webTitle;
        mwebUrl=webUrl;
        mauthor=author;
    }
    public String getDate() {
        return mdate;
    }
    public String getWebTitle() {
        return mwebTitle;
    }
    public String getWebUrl() {
        return mwebUrl;
    }
    public String getAuthor() { return mauthor; }
}

