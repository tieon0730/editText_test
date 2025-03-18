package com.example.edittext_test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etext1,etext2,etext3;
    private Button ebutton;
    private TextView etextview1,etextview2,etextview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etext1 = (EditText) findViewById(R.id.edittext1);
        etext2 = (EditText) findViewById(R.id.edittext2);
        etext3 = (EditText) findViewById(R.id.edittext3);
        ebutton = (Button) findViewById(R.id.button);
        etextview1 = (TextView) findViewById(R.id.textView1);
        etextview2 = (TextView) findViewById(R.id.textView2);
        etextview3 = (TextView) findViewById(R.id.textView3);
    }

    public void onClicked(View view) {
     String str1 = etext1.getText().toString();
     String str2 = etext2.getText().toString();
     String str3 = etext3.getText().toString();
     etextview1.setText("아이디: "+str1);
     etextview2.setText("패스워드: "+str2);
     etextview3.setText("전화번호: "+str3);
    }

}