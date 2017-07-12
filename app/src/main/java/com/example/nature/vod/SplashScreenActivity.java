package com.example.nature.vod;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends Activity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        int SPLASH_TIMEOUT = 5000;
            new Timer().schedule(new TimerTask() {

                @Override
                public void run() {
                    startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                    finish();
                }
            }, SPLASH_TIMEOUT);

        iv = (ImageView) findViewById(R.id.imageView1);

        LoadImageTask task = new LoadImageTask();
        task.execute(R.drawable.rtrk);
    }




    private class LoadImageTask extends AsyncTask<Integer, Void, Drawable> {

        protected Drawable doInBackground(Integer... ids) {
            return getResources().getDrawable(ids[0]);
        }

        protected void onPostExecute(Drawable result) {
            iv.setImageDrawable(result);
        }
    }
}