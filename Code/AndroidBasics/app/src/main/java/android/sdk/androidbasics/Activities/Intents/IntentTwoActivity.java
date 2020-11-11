package android.sdk.androidbasics.Activities.Intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.sdk.androidbasics.R;

public class IntentTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_two);
        getSupportActionBar().setTitle("Intent Two Activity");
    }
}