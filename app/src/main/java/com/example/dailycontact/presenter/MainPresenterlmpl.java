package com.example.dailycontact.presenter;

import com.example.dailycontact.contract.MainContract;
import com.example.dailycontact.interactor.MainInteractorlmpl;
import com.example.dailycontact.model.Friend;

public class MainPresenterlmpl implements MainContract.Presenter {

    private MainContract.View mainView;
    private MainContract.Interractor mainInteractor;

    public MainPresenterlmpl(MainContract.View mainView) {
        this.mainView = mainView;
        this.mainInteractor = new MainInteractorlmpl();
    }

    @Override
    public void saveFriend(Friend friend) {
        mainInteractor.saveFriend(friend);
        mainView.showFriend(mainInteractor.getAllFriend());
        mainView.clearInput();
    }
}
