package com.example.nature.vod;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetailsActivity extends AppCompatActivity {

    TextView movieTitle;
    ImageView movieImg;
    TextView movieDuration;
    TextView movieGenre;
    TextView movieDescription;
    TextView movieWriters;
    TextView movieStars;
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
        setContentView(R.layout.activity_movie_details);

        setupActionBar();

        String name = (String)getIntent().getSerializableExtra("name");
        String image = (String)getIntent().getSerializableExtra("image");
        String duration = (String)getIntent().getSerializableExtra("duration");
        String genre = (String)getIntent().getSerializableExtra("genre");
        String description = (String)getIntent().getSerializableExtra("description");
        String writers = (String)getIntent().getSerializableExtra("writers");
        String stars = (String)getIntent().getSerializableExtra("stars");

        movieImg = (ImageView) findViewById(R.id.picture);
        movieTitle = (TextView)findViewById(R.id.movieTitle);
        movieDuration = (TextView)findViewById(R.id.movieDuration);
        movieGenre = (TextView)findViewById(R.id.movieGenre);
        movieDescription = (TextView)findViewById(R.id.movieDescription);
        movieWriters = (TextView)findViewById(R.id.movieWriters);
        movieStars = (TextView)findViewById(R.id.movieStars);

        movieTitle.setText(name);
        Glide.with(getApplicationContext()).load(image).into(movieImg);
        movieDuration.setText(duration);
        movieGenre.setText(genre);
        movieDescription.setText(description);
        movieWriters.setText(writers);
        movieStars.setText(stars);
    }

    public void clickedImdb(View view) {
        String name = (String)getIntent().getSerializableExtra("name");

        Uri webpage = Uri.parse("http://www.imdb.com/find?s=all&q="+name);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickedPlay(View view) {
        Intent intent = new Intent(this, PlayMovieActivity.class);
        String url = (String)getIntent().getSerializableExtra("url");

        intent.putExtra("url", url);
        startActivity(intent);
    }

}
