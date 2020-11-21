package android.sdk.androidbasics.Activities.LoginForm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sdk.androidbasics.Activities.MainActivity;
import android.sdk.androidbasics.R;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button loginBtn;
    private TextView registerTxt, doNotHaveAccountTxt;
    private String email, password;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

        mAuth = FirebaseAuth.getInstance();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = emailEditText.getText().toString();
                password = passwordEditText.getText().toString();
                loginSoGood(email, password);
            }
        });
    }

    private void init() {
        emailEditText = findViewById(R.id.login_form_user_email);
        passwordEditText = findViewById(R.id.login_form_user_password);
        loginBtn = findViewById(R.id.login_form_login_btn);
        registerTxt = findViewById(R.id.login_form_register);
        doNotHaveAccountTxt = findViewById(R.id.login_form_do_not_have_account);
    }


    private void loginSoGood(String email, String password) {
        if (email.isEmpty()) {
            emailEditText.requestFocus();
            emailEditText.setError("Please Enter an Email");
        }
        if (password.isEmpty()) {
            passwordEditText.requestFocus();
            passwordEditText.setError("Please Enter an Password");
        }

//        if(email.equals("ali@sdk.com") &&  password.equals("123456")){
//            Toast.makeText(this, "Login Successes", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//            startActivity(intent);
//            finish();
//        }else {
//            Toast.makeText(this, "Login Field", Toast.LENGTH_SHORT).show();
//        }

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Login Successes", Toast.LENGTH_SHORT).show();
                    Log.d("TAG", "createUserWithEmail:success");
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "Login Field", Toast.LENGTH_SHORT).show();
                    Log.d("TAG", "createUserWithEmail:Failed");
                    Log.e("Error",task.getException().getMessage());
                }
            }
        });
    }

}