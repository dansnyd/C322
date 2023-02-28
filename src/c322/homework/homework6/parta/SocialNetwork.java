package c322.homework.homework6.parta;

public interface SocialNetwork {
    Iterator createFriendsIterator(String profileId);
    Iterator createCoworkersIterator(String profileId);
}
