package com.example.viewpagerrvdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpagerrvdemo.R;

public class MyReceiveFragement extends Fragment {

    private RecyclerView mRvReceive;

    public static MyReceiveFragement getInstance(){
        Bundle bundle = new Bundle();
        MyReceiveFragement fragement = new MyReceiveFragement();
        fragement.setArguments(bundle);
        return fragement;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_receive_layout, null);
        mRvReceive = view.findViewById(R.id.rv_receive);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
