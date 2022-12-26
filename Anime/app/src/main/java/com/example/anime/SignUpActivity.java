package com.example.anime;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
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

                if (TextUtils.isEmpty(email)) {
                    etEmail.setError("Enter your email address!");
                    ;
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    etPassword.setError("Enter your Password");
                    return;
                }
                if (TextUtils.isEmpty(confirmPassowrd)) {
                    etConfirmPassword.setError("Enter your Confirm Password");

                    return;
                }
                if (TextUtils.isEmpty(fullName)) {
                    etConfirmPassword.setError("Enter your full name!");
                    return;
                }
                if (password.length() < 6) {
                    etPassword.setError("Password too short, enter minimum 6 charachter!");
                    return;
                }
                if (!confirmPassowrd.equals(password)) {
                    etConfirmPassword.setError("password doesn't match!");
                    return;
                }
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(SignUpActivity.this, "Sign up success", Toast.LENGTH_SHORT).show();
                                    User user = new User(email, fullName);
                                    String userId = task.getResult().getUser().getUid();
                                    //  String userId = mAuth.getCurrentUser().getUid();
                                    mRef = mRoot.child("users").child(userId);
                                    mRef.setValue(user);
                                } else {
                                    Toast.makeText(SignUpActivity.this, "Sign up failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}