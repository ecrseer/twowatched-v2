package br.twowatch.twowatch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tmdb_id;

    private String original_title;
    private String title;
    private String backdrop_path;
    private String imdb_id;
    private String original_language;
    private String overview;
    private float popularity;
    private String poster_path;
    private String release_date;
    private float revenue;
    private float runtime;
    private String status;
    private String tagline;

    public Filme() {
    }

    public Filme(String original_title, String title, String tmdb_id, String backdrop_path, String imdb_id, String original_language, String overview, float popularity, String poster_path, String release_date, float revenue, float runtime, String status, String tagline) {
        this.original_title = original_title;
        this.title = title;
        this.tmdb_id = tmdb_id;
        this.backdrop_path = backdrop_path;
        this.imdb_id = imdb_id;
        this.original_language = original_language;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.revenue = revenue;
        this.runtime = runtime;
        this.status = status;
        this.tagline = tagline;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTmdb_id() {
        return tmdb_id;
    }

    public void setTmdb_id(String tmdb_id) {
        this.tmdb_id = tmdb_id;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public float getRuntime() {
        return runtime;
    }

    public void setRuntime(float runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }
}
