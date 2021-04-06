package edu.uw.tcss450.lab3_lifecyleawareness.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.lab3_lifecyleawareness.R;
import edu.uw.tcss450.lab3_lifecyleawareness.databinding.FragmentClickBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClickFragment extends Fragment {

    private int mCount;

    public ClickFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("CLICK FRAGMENT", "onCreate() current state-" + getLifecycle().getCurrentState());
        mCount = 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_click, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentClickBinding binding = FragmentClickBinding.bind(getView());

        binding.textCount.setText("The count is: " + mCount);

        binding.buttonIncrement.setOnClickListener(button -> {
            mCount++;
            binding.textCount.setText("The count is: " + mCount);
        });

//        //Obtain access to the ViewModel. If this fragment object is new, the ViewModel
//        //will be re/created. Note the parameter to the ViewModelProvider constructor.
//        IncrementorViewModel model =
//                new ViewModelProvider(getActivity()).get(IncrementorViewModel.class);
//
//        //Add an observer the the MutableLiveData - mCount.
//        model.addCountObserver(getViewLifecycleOwner(), count ->
//                binding.textCount.setText("My Count is: " + model.getCount()));
//
//        //On button click, increase the MutableLiveData - mCount
//        binding.buttonIncrement.setOnClickListener(button -> model.increment());
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
