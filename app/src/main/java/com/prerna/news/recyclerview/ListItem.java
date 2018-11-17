package com.prerna.news.recyclerview;

public class ListItem {

    private String mHeading;
    private String mDescription;
    private String mImageURL;
    private String mDetailURL;

    public ListItem(String heading, String description, String imageURL, String detailURL) {
        this.mHeading = heading;
        this.mDescription = description;
        this.mImageURL = imageURL;
        this.mDetailURL = detailURL;
    }

    public String getmHeading() {
        return mHeading;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmImageURL() {
        return mImageURL;
    }

    public String getmDetailURL() {
        return mDetailURL;
    }
}
