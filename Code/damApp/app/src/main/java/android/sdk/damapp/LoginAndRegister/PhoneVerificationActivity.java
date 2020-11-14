package android.sdk.damapp.LoginAndRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sdk.damapp.R;
import android.view.View;
import android.widget.Button;

public class PhoneVerificationActivity extends AppCompatActivity {

    private Button mContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);

        mContinue = findViewById(R.id.verify_phone_2_btn);
        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PhoneVerificationActivity.this,RegisterActivity.class));
            }
        });
    }
}