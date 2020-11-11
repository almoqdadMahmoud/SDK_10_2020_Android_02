package android.sdk.androidbasics.Activities.Intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.sdk.androidbasics.R;

public class IntentOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one);
        getSupportActionBar().setTitle(R.string.intent_one);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntentOneActivity.this, IntentTwoActivity.class);
                startActivity(intent);
            }
        },3000);

    }
}