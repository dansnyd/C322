package c322.homework.homework6.parta;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements Iterator {

        private Facebook facebook;
        private String type;
        private String email;
        private int currentPosition = 0;

        private List<String> emails = new ArrayList<>();
        private List<Profile> profiles = new ArrayList<>();

        public FacebookIterator(Facebook facebook, String type, String email) {
            this.facebook = facebook;
            this.type = type;
            this.email = email;
        }

        @Override
        public Boolean hasMore() {
            return currentPosition < emails.size();
        }

        @Override
        public Profile getNext() {
            if (!hasMore()) {
                return null;
            }
            String friendEmail = emails.get(currentPosition);
            Profile friendProfile = profiles.get(currentPosition);
            if (friendProfile == null) {
                friendProfile = facebook.requestProfileFromFacebook(friendEmail);
                profiles.set(currentPosition, friendProfile);
            }
            currentPosition++;
            return friendProfile;
        }
}
