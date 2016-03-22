package com.os.operando.navigationviewactionssample.fradment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.os.operando.navigationviewactionssample.R;

public class BigButtonFragment extends Fragment {

    public static BigButtonFragment newInstance() {
        return new BigButtonFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_big_button, container, false);
    }

}
