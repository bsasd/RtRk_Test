package com.example.nature.vod;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.nature.vod.Model.Movie;

import java.util.List;

 class MoviesRecyclerListAdapter extends RecyclerView.Adapter<MoviesRecyclerListAdapter.MoviesViewHolder> {

    private List<Movie> moviesList;
    private Context mContext = VoDApplication.getAppContext();

    public MoviesRecyclerListAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new MoviesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        final Movie movie = moviesList.get(position);
        holder.tvMovieTitle.setText(movie.getTitle());
        Glide.with(mContext).load(movie.getImage()).into(holder.ivMovieImage);
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


    class MoviesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView ivMovieImage;
        private TextView tvMovieTitle;
        private LinearLayout llListRow;

        MoviesViewHolder(View itemView) {
            super(itemView);
            ivMovieImage = (ImageView) itemView.findViewById(R.id.icon);
            tvMovieTitle = (TextView) itemView.findViewById(R.id.item);
            llListRow = (LinearLayout) itemView.findViewById(R.id.ll_list_row);
            llListRow.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ll_list_row:
                    Context context = v.getContext();

                    final Movie movie = moviesList.get(getAdapterPosition());

                    Toast.makeText(mContext, "#" + getAdapterPosition() + " - " + movie.getTitle(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(mContext, MovieDetailsActivity.class);
                    intent.putExtra("image", movie.getImage());
                    intent.putExtra("name", movie.getTitle());
                    intent.putExtra("description", movie.getDescription());
                    intent.putExtra("duration", movie.getDuration());
                    intent.putExtra("genre", movie.getGenre());
                    intent.putExtra("description", movie.getDescription());
                    intent.putExtra("writers", movie.getWriters());
                    intent.putExtra("stars", movie.getStars());
                    intent.putExtra("url", movie.getVideoTrailer());

                    context.startActivity(intent);
                    break;
            }
        }

    }
}
