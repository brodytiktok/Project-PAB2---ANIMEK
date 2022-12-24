package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpActivity extends AppCompatActivity {
    private EditText etEmail, etPassword, etConfirmPassword, etFullName;
    private Button btnSignup, btnSignIn, btnForgotPassword;
    private ProgressBar progressBar;
    private FirebaseDatabase mDatabase;
    private DatabaseReference mRef, mRoot;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance();
        mRoot = mDatabase.getReference();

        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        etConfirmPassword = findViewById(R.id.et_fullname);
        btnSignup = findViewById(R.id.btn_signup);
        btnSignIn = findViewById(R.id.btn_signin);
        btnForgotPassword = findViewById(R.id.btn_reset_password);
        progressBar = findViewById(R.id.proggressbar);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                String confirmPassowrd = etConfirmPassword.getText().toString();
                String fullName = etFullName.getText().toString();

                if (TextUtils.isEmpty(email)){
                    etEmail.setError("Enter your email address!");;
                    return;
                }  if (TextUtils.isEmpty(email)){
                    etPassword.setError("Enter your Password");
                    return;
                } if (TextUtils.isEmpty(email)){
                    etConfirmPassword.setError("Enter your Confirm Password");;
                    return;
                } else {
                    
                }
            }
        });



    }
}