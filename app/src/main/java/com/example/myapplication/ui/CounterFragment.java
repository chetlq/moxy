package com.example.myapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.myapplication.R;
import com.example.myapplication.presenter.CounterPresenter;
import com.example.myapplication.view.CounterView;

import moxy.MvpAppCompatFragment;

public class CounterFragment extends MvpAppCompatFragment implements CounterView {
    @InjectPresenter
    CounterPresenter counterPresenter;

    TextView textView;
    Button button;
    ////
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.sign_in_fragment, container, false);
        button = view.findViewById(R.id.buttonfragment);
        button.setOnClickListener(v->counterPresenter.onPlusClick());
        textView = view.findViewById(R.id.textViewFragment);
        return view;

    }

    @Override
    public void showCount(int count) {

        textView.setText(String.valueOf(count));
    }

}
