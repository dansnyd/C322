package c322.homework.homework4.parta;

import java.util.ArrayList;
import java.util.List;

public class DiscussionForum {

    private List<Observer> subscribers = new ArrayList<>();

    public void addSubscriber(Observer subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Observer subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void addPost(String post) {
        System.out.println("New post: " + post);
        notifySubscribers();
    }
}
