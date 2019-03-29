package com.example.a7_minutes_workout;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewWorkout extends AppCompatActivity {
    int idImage;
    String name;
    TextView tvTime, tvTitle;
    ImageView imDetailImage;
    Button btnStart;
    boolean isRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_workout);
        tvTime = findViewById(R.id.tv_time);
        tvTitle = findViewById(R.id.tv_titlew);
        imDetailImage = findViewById(R.id.im_detail_image);
        btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isRunning) {
                    btnStart.setText("DONE");
                    new CountDownTimer(30000, 1000) {

                        @Override
                        public void onTick(long millisUntilFinished) {
                            tvTime.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            Toast.makeText(ViewWorkout.this, "Finish!", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }.start();
                } else {
                    Toast.makeText(ViewWorkout.this, "Finish!", Toast.LENGTH_SHORT).show();
                    finish();
                }
                isRunning = !isRunning;
            }
        });
        tvTime.setText("");
        if (getIntent() != null) {
            idImage = getIntent().getIntExtra("id_image", -1);
            name = getIntent().getStringExtra("name");
            imDetailImage.setImageResource(idImage);
            tvTitle.setText(name);
        }
    }
}
