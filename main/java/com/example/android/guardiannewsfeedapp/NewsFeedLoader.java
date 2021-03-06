package com.example.android.guardiannewsfeedapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;


public class NewsFeedLoader extends AsyncTaskLoader<List<NewsFeed>> {
    private static final String LOG_TAG = NewsFeedLoader.class.getName();
    private String mUrl;
    public NewsFeedLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }
    @Override
    protected void onStartLoading() {
        forceLoad();
    }
    @Override
    public List<NewsFeed> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<NewsFeed> news = QueryUtils.fetchData(mUrl);
        return news;
    }
}

