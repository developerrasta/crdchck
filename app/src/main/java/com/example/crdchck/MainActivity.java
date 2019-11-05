package com.example.crdchck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt1,txt2;
   String de , ef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.editText);
        txt2=findViewById(R.id.editText3);
        de=txt1.getText().toString();
        ef=txt2.getText().toString();

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if((de.equals("android")) && (ef.equals("123")))
                {
                    Intent i= new Intent(MainActivity.this,welcome.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"success",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Inavlid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
