package com.example.nature.vod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.nature.vod.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Movie> moviesList = new ArrayList<>();

        Movie movieTwows = new Movie("The wolf of wall street", "3h", "Biography, Comedy, Crime", "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.", "Terence Winter (screenplay), Jordan Belfort (book)", " Leonardo DiCaprio, Jonah Hill, Margot Robbie", "http://89.216.58.236/vod/posters/the_wolf_of_wall_street.jpg", "", "http://89.216.58.236/vod/trailers/the_wolf_of_wall_street_official_trailer.mp4");
        Movie movieRush = new Movie("Rush",  "2h 3min", "Action, Biography, Drama", "The merciless 1970s rivalry between Formula One rivals James Hunt and Niki Lauda.", "Peter Morgan", "Daniel Brühl, Chris Hemsworth, Olivia Wilde", "http://89.216.58.236/vod/posters/rush.jpg", "", "http://89.216.58.236/vod/trailers/rush_official_trailer.mp4");
        Movie movieDkr = new Movie("Dark knight rises", "2h 3min", "Action, Thriller ", "Eight years after the Joker's reign of anarchy, the Dark Knight, with the help of the enigmatic Catwoman, is forced from his exile to save Gotham City, now on the edge of total annihilation, from the brutal guerrilla terrorist Bane.", " Jonathan Nolan (screenplay), Christopher Nolan (screenplay)", " Christian Bale, Tom Hardy, Anne Hathaway", "http://89.216.58.236/vod/posters/dark_knight_rises.jpg", "", "http://89.216.58.236/vod/trailers/the_dark_knight_rises_official_trailer.mp4");
        Movie movieHttyd2 = new Movie("How to train your dragon 2", "1h 42min", " Animation, Action, Adventure", "When Hiccup and Toothless discover an ice cave that is home to hundreds of new wild dragons and the mysterious Dragon Rider, the two friends find themselves at the center of a battle to protect the peace.", " Dean DeBlois, Cressida Cowell", "Jay Baruchel, Cate Blanchett, Gerard Butler ", "http://89.216.58.236/vod/posters/how_to_train_your_dragon_2.jpg", "", "http://89.216.58.236/vod/trailers/how_to_train_your_dragon_2_official_trailer.mp4");
        Movie movieTe3 = new Movie("The Expendables 3", "2h 6min", "Action, Adventure, Thriller", "Barney augments his team with new blood for a personal battle: to take down Conrad Stonebanks, the Expendables co-founder and notorious arms trader who is hell bent on wiping out Barney and every single one of his associates.", "Sylvester Stallone (screenplay), Creighton Rothenberger (screenplay)", " Sylvester Stallone, Jason Statham, Jet Li", "http://89.216.58.236/vod/posters/the_expendables_3.jpg", "", "http://89.216.58.236/vod/trailers/the_expendables_3_official_trailer.mp4");
        Movie movieTasm2 = new Movie("The amazing spider man 2", "2h 22min", "Action, Adventure, Sci-Fi ", "When New York is put under siege by Oscorp, it is up to Spider-Man to save the city he swore to protect as well as his loved ones.", " Alex Kurtzman (screenplay), Roberto Orci (screenplay)", " Andrew Garfield, Emma Stone, Jamie Foxx", "http://89.216.58.236/vod/posters/the_amazing_spider_man_2.jpg", "", "http://89.216.58.236/vod/trailers/the_amazing_spider_man_2_official_trailer.mp4");
        Movie movie22js = new Movie("22 jump street", "1h 52min", "Action, Comedy, Crime", "After making their way through high school (twice), big changes are in store for officers Schmidt and Jenko when they go deep undercover at a local college.", " Michael Bacall (screenplay), Oren Uziel (screenplay)", "Channing Tatum, Jonah Hill, Ice Cube", "http://89.216.58.236/vod/posters/22_jump_street.jpg", "", "http://89.216.58.236/vod/trailers/22_jump_street_official_trailer.mp4");
        Movie movieGotg = new Movie("Guardians of the galaxy", "2h 1min", "Action, Adventure, Sci-Fi", "A group of intergalactic criminals are forced to work together to stop a fanatical warrior from taking control of the universe.", " James Gunn, Nicole Perlman ", " Chris Pratt, Vin Diesel, Bradley Cooper", "http://89.216.58.236/vod/posters/guardians_of_the_galaxy.jpg", "", "http://89.216.58.236/vod/trailers/guardians_of_the_galaxy_official_trailer.mp4");
        Movie movieMaleficent = new Movie("Maleficent", "1h 37min", "Action, Adventure, Family", "A vengeful fairy is driven to curse an infant princess, only to discover that the child may be the one person who can restore peace to their troubled land.", " Linda Woolverton (screenplay), Charles Perrault", " Angelina Jolie, Elle Fanning, Sharlto Copley", "http://89.216.58.236/vod/posters/maleficent.jpg", "",  "http://89.216.58.236/vod/trailers/maleficent_official_trailer.mp4");
        Movie movieTs3 = new Movie("Toy story 3", "1h 43min", "Animation, Adventure, Comedy", "The toys are mistakenly delivered to a day-care center instead of the attic right before Andy leaves for college, and it's up to Woody to convince the other toys that they weren't abandoned and to return home.", " John Lasseter (story by), Andrew Stanton", " Tom Hanks, Tim Allen, Joan Cusack", "http://89.216.58.236/vod/posters/toy_story_3.jpg", "", "http://89.216.58.236/vod/trailers/toy_story_3_official_trailer.mp4");
        Movie movieDm2 = new Movie("Despicable me 2", "1h 38min", "Animation, Adventure, Comedy", "When Gru, the world's most super-bad turned super-dad has been recruited by a team of officials to stop lethal muscle and a host of Gru's own, He has to fight back with new gadgetry, cars, and more minion madness.",  "Cinco Paul, Ken Daurio", " Steve Carell, Kristen Wiig, Benjamin Bratt", "http://89.216.58.236/vod/posters/despicable_me_2.jpg", "",  "http://89.216.58.236/vod/trailers/despicable_me_2_official_trailer.mp4");
        Movie movieSj = new Movie("Space jam", "1h 28min", "Animation, Adventure, Comedy", "In a desperate attempt to win a basketball match and earn their freedom, the Looney Tunes seek the aid of retired basketball champion, Michael Jordan.", "Leo Benvenuti, Steve Rudnick", "Michael Jordan, Wayne Knight, Theresa Randle", "http://89.216.58.236/vod/posters/space_jam.jpg", "", "http://89.216.58.236/vod/trailers/space_jam_official_trailer.mp4");
        Movie movieGodzilla = new Movie("Godzilla", "2h 3min", "Action, Adventure, Sci-Fi", "The world is beset by the appearance of monstrous creatures, but one of them may be the only one who can save humanity.", "Max Borenstein (screenplay), Dave Callaham (story)", " Aaron Taylor-Johnson, Elizabeth Olsen, Bryan Cranston", "http://89.216.58.236/vod/posters/godzilla.jpg", "", "http://89.216.58.236/vod/trailers/godzilla_official_trailer.mp4");
        Movie movieWi = new Movie("What if", "1h 38min", "Comedy, Romance", "Wallace, who is burned out from a string of failed relationships, forms an instant bond with Chantry, who lives with her longtime boyfriend. Together, they puzzle out what it means if your best friend is also the love of your life.", " Elan Mastai, T.J. Dawe (play)", "Daniel Radcliffe, Zoe Kazan, Megan Park", "http://89.216.58.236/vod/posters/what_if.jpg", "",  "http://89.216.58.236/vod/trailers/what_if_official_trailer.mp4");
        Movie movieLbc = new Movie("Lets be cops", "1h 44min", "Comedy", "Two struggling pals dress as police officers for a costume party and become neighborhood sensations. But when these newly-minted \"heroes\" get tangled in a real life web of mobsters and dirty detectives, they must put their fake badges on the line.", "Luke Greenfield, Nicholas Thomas", " Jake Johnson, Damon Wayans Jr., Rob Riggle", "http://89.216.58.236/vod/posters/lets_be_cops.jpg", "", "http://89.216.58.236/vod/trailers/lets_be_cops_official_trailer.mp4");

        moviesList.add(movieTwows);
        moviesList.add(movieRush);
        moviesList.add(movieDkr);
        moviesList.add(movieHttyd2);
        moviesList.add(movieTe3);
        moviesList.add(movieTasm2);
        moviesList.add(movie22js);
        moviesList.add(movieGotg);
        moviesList.add(movieMaleficent);
        moviesList.add(movieTs3);
        moviesList.add(movieDm2);
        moviesList.add(movieSj);
        moviesList.add(movieGodzilla);
        moviesList.add(movieWi);
        moviesList.add(movieLbc);

        // Initialization of a recycler view
        RecyclerView mMoviesRecyclerView = (RecyclerView) findViewById(R.id.rv_movies);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mMoviesRecyclerView.setLayoutManager(mLayoutManager);

        MoviesRecyclerListAdapter moviesRecyclerListAdapter = new MoviesRecyclerListAdapter(moviesList);
        mMoviesRecyclerView.setAdapter(moviesRecyclerListAdapter);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.list_view, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return true;

    }


}
