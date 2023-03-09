package c322.homework.homework6.partd;

import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    public List<Video> listVideos() {
        List<Video> videos = new ArrayList<>();

        // Send an API request to YouTube to retrieve the video list.
        String response = sendRequest("list_videos");

        // Parse the response and create Video objects.
        for (String videoData : response.split("\n")) {
            String[] fields = videoData.split(",");
            String id = fields[0];
            String title = fields[1];
            String author = fields[2];
            videos.add(new Video(id, title, author));
        }
        return videos;
    }

    public void getVideoInfo(String id) {
        // Get metadata about some video.
    }

    public void downloadVideo(String id) {
        // Download a video file from YouTube.
    }
}
