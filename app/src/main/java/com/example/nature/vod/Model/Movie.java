package com.example.nature.vod.Model;


public class Movie {
    private String title;
    private String description;
    private String duration;
    private String genre;
    private String writers;
    private String stars;
    private String image;
    private String backgroundImage;
    private String videoTrailer;

    public Movie(String title, String image, String backgroundImage, String videoTrailer) {
        this.title = title;
        this.image = image;
        this.backgroundImage = backgroundImage;
        this.videoTrailer = videoTrailer;
    }

    public Movie(String title, String duration, String genre, String description, String writers, String stars, String image, String backgroundImage, String videoTrailer) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.writers = writers;
        this.stars = stars;
        this.image = image;
        this.backgroundImage = backgroundImage;
        this.videoTrailer = videoTrailer;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getVideoTrailer() {
        return videoTrailer;
    }

    public void setVideoTrailer(String videoTrailer) {
        this.videoTrailer = videoTrailer;
    }
}
