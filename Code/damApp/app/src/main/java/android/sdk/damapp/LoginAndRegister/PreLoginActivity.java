package android.sdk.damapp.LoginAndRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sdk.damapp.R;
import android.view.View;
import android.widget.Button;

public class PreLoginActivity extends AppCompatActivity {

    private Button loginWithMobile , loginWithFacebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login);
        init();


        loginWithMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreLoginActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        loginWithFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void init() {
        loginWithMobile = findViewById(R.id.login_with_phone_btn);
        loginWithFacebook = findViewById(R.id.login_with_facebook_btn);

    }
}