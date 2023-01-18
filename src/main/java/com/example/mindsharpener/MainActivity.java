package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final TextView helloTextView = (TextView) findViewById(R.id.text_view_id);
            helloTextView.setText(R.string.text1);
        }
            public void rb1(View view) {
                Toast.makeText(this, "You choose easy", Toast.LENGTH_SHORT).show();
            }
        public void rb2(View view) {
            Toast.makeText(this, "You choose medium", Toast.LENGTH_SHORT).show();
        }
        public void rb3(View view) {
            Toast.makeText(this, "You choose hard", Toast.LENGTH_SHORT).show();
        }
    }