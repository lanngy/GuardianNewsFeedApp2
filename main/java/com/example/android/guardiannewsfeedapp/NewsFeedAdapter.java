package com.example.android.guardiannewsfeedapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsFeedAdapter extends ArrayAdapter<NewsFeed> {

        public NewsFeedAdapter(Activity context, ArrayList<NewsFeed> news) {
            super(context,0,news);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View list = convertView;
            if(list==null) {
                list = LayoutInflater.from(getContext()).inflate(
                        R.layout.newsfeed_list_item, parent, false);
            }
            NewsFeed feed = getItem(position);
          TextView date =(TextView) list.findViewById(R.id.webPublicationDate);
            date.setText(feed.getDate());
            TextView title = (TextView) list.findViewById(R.id.webTitle);
            title.setText(feed.getWebTitle());
            TextView url = (TextView) list.findViewById(R.id.webUrl);
            url.setText(feed.getWebUrl());
            TextView author = (TextView) list.findViewById(R.id.author);
            author.setText(feed.getAuthor());
            return list;
        }
    }

