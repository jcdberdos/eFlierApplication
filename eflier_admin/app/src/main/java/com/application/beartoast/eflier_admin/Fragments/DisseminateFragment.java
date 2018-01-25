package com.application.beartoast.eflier_admin.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.application.beartoast.eflier_admin.R;

/**
 * Created by John Carlo Berdos on 21/01/2018.
 */

public class DisseminateFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_disseminate, container, false);
        return view;
    }
}