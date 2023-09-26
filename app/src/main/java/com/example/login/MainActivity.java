package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Login =  findViewById(R.id.Login);
        TextView Register =  findViewById(R.id.RegisterNav);


        // Gắn sự kiện nghe cho TextView
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi TextView được nhấp vào
                Intent intent = new Intent(MainActivity.this,MainActivity_Register.class);
                startActivity(intent);
            }
        });
        emailEditText = findViewById(R.id.editTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextPassword);
        loginButton = findViewById(R.id.Login_Button);

        // Gắn sự kiện nghe cho nút "Đăng nhập"
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ các ô nhập liệu
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Kiểm tra tên tài khoản và mật khẩu
                if (email.equals("lephuocduc2510@gmail.com") && password.equals("12345")) {
                    // Nếu tài khoản đúng, hiển thị thông báo thành công
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                } else {
                    // Nếu tài khoản sai, hiển thị thông báo lỗi
                    Toast.makeText(MainActivity.this, "Sai tên tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}