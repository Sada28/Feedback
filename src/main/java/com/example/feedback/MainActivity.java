package com.example.feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_feed;
    RatingBar rtbar_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_feed=findViewById(R.id.tv_feed);
        rtbar_1=findViewById(R.id.rtbar_1);

        rtbar_1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromuser) {
                if (rating ==0) {
                    tv_feed.setText("very Disatisfied");

                } else if (rating ==1) {
                    tv_feed.setText("Disatisfied");
                } else if (rating ==2 || rating ==3) {
                    tv_feed.setText("ok");
                } else if (rating ==4) {
                    tv_feed.setText("satisfied");
                } else if (rating ==5) {
                    tv_feed.setText("very satisfied");
                } else {

                }
            }
            });

    }
}