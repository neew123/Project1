package com.example.my.project1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CommunityFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.tv);
        txt_content.setText("第三三三个Fragment");
        return view;
    }

    public static CommunityFragment newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("ARGS", content);
        CommunityFragment fragment = new CommunityFragment();
        fragment.setArguments(args);
        return fragment;
    }


}