package com.example.nature.vod;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;

public class PlayMovieActivity extends AppCompatActivity implements View.OnClickListener {

    private VideoView vv;
    private MediaController mediacontroller;
    private Uri uri;
    private boolean isContinuously = false;
    private ProgressBar progressBar;

    public boolean canGoHome = true;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setupActionBar() {
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(canGoHome);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_movie);

        setupActionBar();

        progressBar = (ProgressBar) findViewById(R.id.progrss);

        Button btncontinuously = (Button) findViewById(R.id.btnconti);
        btncontinuously.setOnClickListener(this);

        Button btnstop = (Button) findViewById(R.id.btnstop);
        btnstop.setOnClickListener(this);

        Button btnplay = (Button) findViewById(R.id.btnplay);
        btnplay.setOnClickListener(this);

        vv = (VideoView) findViewById(R.id.vv);

        mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(vv);

        String movieTrailerUrl = (String)getIntent().getSerializableExtra("url");
        uri = Uri.parse(movieTrailerUrl);

        isContinuously = false;
        progressBar.setVisibility(View.VISIBLE);
        vv.setMediaController(mediacontroller);
        vv.setVideoURI(uri);
        vv.requestFocus();
        vv.start();

        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if(isContinuously){
                    vv.start();
                }
            }
        });

        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            // Close the progress bar and play the video
            public void onPrepared(MediaPlayer mp) {
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnconti:
                isContinuously = true;
                progressBar.setVisibility(View.VISIBLE);
                vv.setMediaController(mediacontroller);
                vv.setVideoURI(uri);
                vv.requestFocus();
                vv.start();
                break;
            case R.id.btnplay:
                vv.start();
                break;
            case R.id.btnstop:
                vv.pause();
                break;
        }
    }
}
