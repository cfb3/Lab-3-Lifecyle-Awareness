package edu.uw.tcss450.lab3_lifecyleawareness.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.lab3_lifecyleawareness.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClickFragment extends Fragment {

    public ClickFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("CLICK FRAGMENT", "onCreate() current state-" + getLifecycle().getCurrentState());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_click, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CLICK FRAGMENT", "onStart() current state-" + getLifecycle().getCurrentState());

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("CLICK FRAGMENT", "onStop() current state-" + getLifecycle().getCurrentState());

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("CLICK FRAGMENT", "onDestroy() current state-" + getLifecycle().getCurrentState());

    }
}
