package c322.homework.homework4.parta;

public class Subscriber implements Observer{

    private String name;
    private DiscussionForum forum;

    public Subscriber(String name, DiscussionForum forum) {
        this.name = name;
        this.forum = forum;
    }

    public void update() {
        System.out.println(name + " there has been a new Discussion post.");
    }

    public void unsubscribe() {
        System.out.println(name + " unsubscribed from the Discussion Forum.");
        forum.removeSubscriber(this);
    }
}
