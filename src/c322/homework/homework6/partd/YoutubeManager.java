package c322.homework.homework6.partd;

public class YoutubeManager {
    protected ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        service.getVideoInfo(id);
        // Render the video page.
    }

    public void renderListPanel() {
        service.listVideos();
        // Render the list of video thumbnails.
    }

    public void reactOnUserInput() {
        renderVideoPage();
        renderListPanel();
    }
}
