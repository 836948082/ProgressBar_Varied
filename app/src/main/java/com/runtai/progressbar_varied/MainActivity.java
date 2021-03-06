package com.runtai.progressbar_varied;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.runtai.progressbar_varied.progressbar.CircleProgressBar;
import com.runtai.progressbar_varied.progressbar.FloatTextProgressBar;
import com.runtai.progressbar_varied.progressbar.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);

        final FloatTextProgressBar floatTextProgressBar = (FloatTextProgressBar) findViewById(R.id.floatTextProgressBar);

        final CircleProgressBar circleProgressBar = (CircleProgressBar) findViewById(R.id.circleProgressBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                floatTextProgressBar.setProgress(progress);
                circleProgressBar.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
