package com.example.addcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button  sb_btn;
private  Button sb_btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // onButtonClickDivide();
        //onButtonClick();
        //checkEmpty();
    }

    public void onButtonClick(View v){
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);

        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());

        if (num1 == ' '){
            Toast.makeText(MainActivity.this, "you must enter the first number to add", Toast.LENGTH_SHORT
            ).show();
        } else if (num2 == ' ') {
            Toast.makeText(MainActivity.this, "you must enter the second number to add", Toast.LENGTH_SHORT
            ).show();
        } else {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }
    public void onButtonClickDivide(View v){
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
        sb_btn = (Button) findViewById(R.id.button);

        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        if (num1 == ' '){

                            Toast.makeText(MainActivity.this, "The first field has no number must be filled with numbers", Toast.LENGTH_SHORT
                            ).show();

        } else if (num2 == ' ') {

                            Toast.makeText(MainActivity.this, "There is no number in the second field", Toast.LENGTH_SHORT
                            ).show();

        } else {
            int sum = num1 / num2;
            t1.setText(Integer.toString(sum));
        }
    }

    public void checkEmpty(){
sb_btn = (Button) findViewById(R.id.button);
sb_btn.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Both Fields must be filled with numbers", Toast.LENGTH_SHORT
                ).show();
            }

        });
    }
}
