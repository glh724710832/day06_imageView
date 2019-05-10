package com.gary.day06_imageview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class BarTestActivity extends AppCompatActivity {
    private ProgressBar progress_lar;
    private TextView text_progress_lar;
    private ProgressBar progress_hor;
    private TextView text_progress_hor;
    private SeekBar seek;
    private TextView text_seek;
    private RatingBar rat;
    private TextView text_rat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_layout);
        view();
    }

    void view() {

        progress_lar = findViewById(R.id.progress_lar);
        text_progress_lar = findViewById(R.id.text_progress_lar);
        text_progress_lar.setText("当前进度" + progress_lar.getProgress() + "/" + progress_lar.getMax());

        progress_hor = findViewById(R.id.progress_hor);
        text_progress_hor = findViewById(R.id.text_progress_hor);
        text_progress_hor.setText("当前进度" + progress_hor.getProgress() + "/" + progress_hor.getMax());

        seek = findViewById(R.id.seek);
        text_seek = findViewById(R.id.text_seek);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                text_seek.setText("当前进度"+seek.getProgress()+"/"+seek.getMax());
                text_seek.setText("当前进度" + progress + "/" + seek.getMax());

                if (progress == seek.getMax()) {
                    Intent intent = new Intent(BarTestActivity.this, ListActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "按住seekbar,调整", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(BarTestActivity.this, "放开seekbar，调整完成", Toast.LENGTH_SHORT).show();

            }
        });


        rat = findViewById(R.id.rat);
        text_rat = findViewById(R.id.text_rat);
        rat.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                text_rat.setText("当前评价" + rating + "/" + rat.getNumStars());

                if (rating > rat.getNumStars() * 0.7) {
                    Toast.makeText(getApplicationContext(), "^_^感谢评价", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "感谢评价,为下次好评努力", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
