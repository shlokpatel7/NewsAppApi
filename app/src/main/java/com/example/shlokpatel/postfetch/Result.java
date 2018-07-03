package com.example.shlokpatel.postfetch;

import java.util.ArrayList;

public class Result {
    String status;
    int totalResults;
    ArrayList<News> articles;

    public Result(String status, int totalResults, ArrayList<News> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public ArrayList<News> getArticles() {
        return articles;
    }
}
