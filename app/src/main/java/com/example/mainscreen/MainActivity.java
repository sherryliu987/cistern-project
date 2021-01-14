package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        FileIOHelper fio = new FileIOHelper();

        String user_info = fio.readFromFile(this);

        if(user_info.equals("NONE")){
            Intent intent = new Intent(this, SetupActivity.class);
            startActivity(intent);
        }else{
            System.out.println(user_info);
            Intent intent = new Intent(this, DashBoardActivity.class);
            startActivity(intent);
        }


    }


}