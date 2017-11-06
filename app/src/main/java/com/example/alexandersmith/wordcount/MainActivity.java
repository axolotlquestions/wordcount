package com.example.alexandersmith.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private EditText passageText;
    private Button wordcountButton;
    private TextView answerText;
    private Wordcount wordcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passageText = (EditText) findViewById(R.id.passageText);
        wordcountButton = (Button) findViewById(R.id.wordcountButton);
        answerText = (TextView) findViewById(R.id.answerText);
    }

    public void onwordcountButtonClick(View button) {
        String passagetobecountedtext = passageText.getText().toString();
        wordcount = new Wordcount(passagetobecountedtext);
        answerText.setText("The passage has " + wordcount.getWordcount() + " words");
    }
}
