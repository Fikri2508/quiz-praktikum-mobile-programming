package com.example.dailycontact.contract;

import com.example.dailycontact.model.Friend;

import java.util.List;

public interface MainContract {
    interface View{
        void showFriend(List<Friend> FriendList);
        void clearInput();
    }

    interface Interractor{
        void saveFriend(Friend friend);
        List<Friend> getAllFriend();
    }
    interface Presenter{
        void saveFriend(Friend friend);
    }
}
