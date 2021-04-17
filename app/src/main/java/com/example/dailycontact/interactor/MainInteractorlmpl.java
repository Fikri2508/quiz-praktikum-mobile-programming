package com.example.dailycontact.interactor;

import com.example.dailycontact.contract.MainContract;
import com.example.dailycontact.model.Friend;

import java.util.ArrayList;
import java.util.List;

public class MainInteractorlmpl implements MainContract.Interractor {

    private List<Friend> friendList = new ArrayList<>();

    @Override
    public void saveFriend(Friend friend) {
        friendList.add(friend);
    }

    @Override
    public List<Friend> getAllFriend() {
        return friendList;
    }


}
