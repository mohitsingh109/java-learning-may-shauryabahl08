package org.shauryabahl08.functions;

public class YoutubeAnalysis {

    // mobile view
    // web view
    // total view
    public static int mobileView(int currentView) {
        currentView++;
        return currentView;
    }

    public static int webView(int currentView) {
        currentView++;
        return currentView;
    }

    public static int totalView(int mobileVies, int webViews) {
        return mobileVies + webViews;
    }

    public static void main(String[] args) {
        int mobileView = 0;
        int webView = 0;

        mobileView = mobileView(mobileView); //1
        mobileView = mobileView(mobileView); //2
        mobileView = mobileView(mobileView); //3
        mobileView = mobileView(mobileView); //4

        webView = webView(webView); // 1 // webView(0) ==> webView = 1
        webView = webView(webView); // 2 // webView(1) ==> webView = 2
        webView = webView(webView); // 3 // webView(2) ==> webView = 3


        int totalViewCount = totalView(mobileView, webView); // totalView(4, 3)
        System.out.println("Total view: " + totalViewCount);

    }

}
