package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Register extends AppCompatActivity {
    private EditText passwordEditText ;
    private EditText confirmPasswordEditText ;
    private Button registerButton;
    private EditText EmailEditText;
    private EditText NameEditText;
    private EditText PhoneEditText;
    private RadioButton MaleButton;
    private RadioButton FeMaleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        passwordEditText = findViewById(R.id.editTextPassword);
        confirmPasswordEditText = findViewById(R.id.editTextPasswordAgaint);
        registerButton = findViewById(R.id.Register);
        EmailEditText = findViewById(R.id.editTextEmailAddress);
        NameEditText = findViewById(R.id.editTextName);
        PhoneEditText = findViewById(R.id.editTextPhone);
        MaleButton = findViewById(R.id.radioButtonMale);
        FeMaleButton = findViewById(R.id.radioButtonFeMale);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = passwordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();
                String name = NameEditText.getText().toString();
                String email = EmailEditText.getText().toString();
                String phone = PhoneEditText.getText().toString();
                boolean isMale = MaleButton.isChecked();
                boolean isFeMale = FeMaleButton.isChecked();
                if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()
                        && !confirmPassword.isEmpty() && !phone.isEmpty()
                        && (isFeMale || isMale)) {
                    if (password.equals(confirmPassword)) {
                        // Mật khẩu trùng khớp, cho phép đăng ký
                        // Thêm mã xử lý đăng ký tại đây
                        Toast.makeText(MainActivity_Register.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                    } else {
                        // Mật khẩu không trùng khớp, hiển thị thông báo lỗi
                        Toast.makeText(MainActivity_Register.this, "Mật khẩu không khớp!", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                    Toast.makeText(MainActivity_Register.this, "Vui lòng nhập đủ thông tin!", Toast.LENGTH_SHORT).show();



            }
        });
        TextView Login =  findViewById(R.id.Login);
        TextView Register =  findViewById(R.id.RegisterNav);


        // Gắn sự kiện nghe cho TextView
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi TextView được nhấp vào
                Intent intent = new Intent(MainActivity_Register.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
