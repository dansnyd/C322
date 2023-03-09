package c322.homework.homework6.partd;

import java.util.ArrayList;
import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeClass service;
    private List<String> listCache, videoCache;
    private boolean needReset;

    public CachedYoutubeClass(ThirdPartyYoutubeClass service) {
        this.service = service;
    }

    public void listVideos() {
        if (listCache == null || needReset) {
            listCache = new ArrayList<String>();
            service.listVideos();
        }
    }

    public void getVideoInfo(String id) {
        if (videoCache == null || needReset) {
            videoCache = new ArrayList<String>();
            service.getVideoInfo(id);
        }
    }

    public void downloadVideo(String id) {
        if (!downloadExists(id) || needReset) {
            service.downloadVideo(id);
        }
    }

    private boolean downloadExists(String id) {
        // Check if video file already exists on disk.
    }
}

