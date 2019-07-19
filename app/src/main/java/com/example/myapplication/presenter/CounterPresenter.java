package com.example.myapplication.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.myapplication.view.CounterView;


@InjectViewState
public class CounterPresenter extends MvpPresenter<CounterView> {
    private int mCount;

    public CounterPresenter(){
        getViewState().showCount(mCount);
    }

    public void onPlusClick(){
        mCount++;
        getViewState().showCount(mCount);
    }

}
