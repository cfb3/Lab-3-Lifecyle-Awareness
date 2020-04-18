package edu.uw.tcss450.lab3_lifecyleawareness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MAIN ACTIVITY", "onCreate() current state-" + getLifecycle().getCurrentState());

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MAIN ACTIVITY", "onStop() current state-"  + getLifecycle().getCurrentState());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MAIN ACTIVITY", "onStart() current state-" + getLifecycle().getCurrentState());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MAIN ACTIVITY", "onDestroy() current state-" + getLifecycle().getCurrentState());
    }
}
