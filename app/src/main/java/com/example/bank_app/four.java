package com.example.bank_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class four extends AppCompatActivity {
    public Button mButton;
    public TextView mText;
    public EditText mEditText;
    public String getSting;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);


        mButton  = (Button)findViewById(R.id.paynow4);
        mText = (TextView) findViewById(R.id.balance4);
        mEditText = (EditText) findViewById(R.id.amount4);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSting = mEditText.getText().toString();
                mText.setText(getSting);


                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT,mText.getText().toString());
                editor.apply();
            }
        });
        update();
    }
    private void update() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        String text = sharedPreferences.getString(TEXT, "Previous BMI was:");
        mText.setText(text);
    }
}



