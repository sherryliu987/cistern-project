package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetupActivity extends AppCompatActivity {

    Button btnLogin;
    EditText username;
    EditText csize;
    FileIOHelper fio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        btnLogin = findViewById(R.id.btnLogin);
        username = findViewById(R.id.edtUsername);
        csize = findViewById(R.id.edtCisternSize);

        fio = new FileIOHelper();
    }

    public void setup(View view){
        String name = username.getText().toString();
        String size = csize.getText().toString();
        Log.d("NAMEEE", name);
        Log.d("SIZEEE", size);
        User user = new User(name, size);
        fio.writeToFile(user.toString(), this);
        Intent intent = new Intent(this, DashBoardActivity.class);
        startActivity(intent);
    }
}