package android.sdk.androidbasics.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sdk.androidbasics.Activities.Intents.IntentOneActivity;
import android.sdk.androidbasics.Activities.Menu.MenuActivity;
import android.sdk.androidbasics.R;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToIntentOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToIntentOne = findViewById(R.id.button1);
        goToIntentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}