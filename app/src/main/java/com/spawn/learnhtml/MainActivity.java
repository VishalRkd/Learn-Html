package com.spawn.learnhtml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    Button submit;
    EditText userNameFeild, passwordFeild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btn);
        userNameFeild = findViewById(R.id.userName);
        passwordFeild =findViewById(R.id.passWord);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameFeild.getText().toString().trim();
                String passWord = passwordFeild.getText().toString().trim();

                if (userName.isEmpty() || passWord.isEmpty()){
                    Toast.makeText(MainActivity.this, "Fill The Inputs !", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, userName+", Welocme To Learn Html App!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                    finish();
                }

            }
        });




    }
    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}

