package com.example.texttospeech_calculator;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech ts;
    EditText  e1,e2;
    TextView t1;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
           ts.setSpeechRate(0.7f);
           ts.setLanguage(Locale.ENGLISH);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()) {
                    ts.speak("Please Enter Number",TextToSpeech.QUEUE_FLUSH,null);
                    Toast.makeText(MainActivity.this, "Please Enter Number", Toast.LENGTH_SHORT).show();
                }else{
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 + f2;
                    String s3 = Float.toString(f3);
                    t1.setText(s3);
                    Toast.makeText(MainActivity.this, "The Result is" + s3, Toast.LENGTH_SHORT).show();
                    ts.speak("The Result is" + s3, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()) {
                    ts.speak("Please Enter Number",TextToSpeech.QUEUE_FLUSH,null);
                    Toast.makeText(MainActivity.this, "Please Enter Number", Toast.LENGTH_SHORT).show();
                }else{
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 -f2;
                    String s3 = Float.toString(f3);
                    t1.setText(s3);
                    Toast.makeText(MainActivity.this, "The Result is" + s3, Toast.LENGTH_SHORT).show();
                    ts.speak("The Result is" + s3, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()) {
                    ts.speak("Please Enter Number",TextToSpeech.QUEUE_FLUSH,null);
                    Toast.makeText(MainActivity.this, "Please Enter Number", Toast.LENGTH_SHORT).show();
                }else{
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 / f2;
                    String s3 = Float.toString(f3);
                    t1.setText(s3);
                    Toast.makeText(MainActivity.this, "The Result is" + s3, Toast.LENGTH_SHORT).show();
                    ts.speak("The Result is" + s3, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()) {
                    ts.speak("Please Enter Number",TextToSpeech.QUEUE_FLUSH,null);
                    Toast.makeText(MainActivity.this, "Please Enter Number", Toast.LENGTH_SHORT).show();
                }else{
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 * f2;
                    String s3 = Float.toString(f3);
                    t1.setText(s3);
                    Toast.makeText(MainActivity.this, "The Result is" + s3, Toast.LENGTH_SHORT).show();
                    ts.speak("The Result is" + s3, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
}