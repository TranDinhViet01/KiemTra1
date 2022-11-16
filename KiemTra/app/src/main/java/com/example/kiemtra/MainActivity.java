package com.example.kiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button dn;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dn = findViewById(R.id.btn_actLogin_login);
        user = findViewById(R.id.txt_actlogin_user);
        pass = findViewById(R.id.txt_actlogin_pass);

        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg, userText,passText;
                userText = ""+ user.getText();
                passText = ""+ pass.getText();

                    if(userText.equals("sa") && passText.equals("12345")){
                            msg = "Dang Nhap Thanh Cong";
                            Intent intent = new Intent(MainActivity.this,TrangChu.class);
                            startActivity(intent);
                    }
                    else
                        msg = "Dang Nhap That Bai \n user hoac pass sai";

                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });
    }
}