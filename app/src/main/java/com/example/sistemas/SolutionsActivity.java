package com.example.sistemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SolutionsActivity extends AppCompatActivity {
    ImageButton backButtonSolutions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutions);

        backButtonSolutions = (ImageButton)findViewById(R.id.backButtonSolutions);
        backButtonSolutions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);


        setButtonClickListener(button1, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/epV8x-1RNr0?si=5-2V2bnZxDcq6ru6\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        setButtonClickListener(button2, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/knFFAnBqzAc?si=5dG6ujc6iPWBSIuc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        setButtonClickListener(button3, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3SxKyMnHJO4?si=Ch_K24oqFONOpO_N\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        setButtonClickListener(button4, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8dZsb9KhuGI?si=iwQB7CCWpN_uvoqZ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");

    }

    private void setButtonClickListener(Button button, final String videoUrl) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SolutionsActivity.this, VideoActivity.class)
                        .putExtra("videoUrl", videoUrl));
            }
        });
    }
}
