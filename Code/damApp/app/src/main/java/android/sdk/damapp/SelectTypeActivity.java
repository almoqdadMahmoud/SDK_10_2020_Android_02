package android.sdk.damapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sdk.damapp.LoginAndRegister.LoginActivity;
import android.view.View;
import android.widget.ImageView;

public class SelectTypeActivity extends AppCompatActivity {

    private ImageView goToDonor , goToReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_type);
        inti();

        goToDonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectTypeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        goToReceiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectTypeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inti() {
        goToDonor = findViewById(R.id.main_donor_btn);
        goToReceiver = findViewById(R.id.main_receiver_btn);
    }
}