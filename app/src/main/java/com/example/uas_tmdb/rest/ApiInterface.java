package com.example.uas_tmdb.rest;

import com.example.uas_tmdb.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("movie/popular")
    Call<MovieResponse> getMovies(@Query("api_key") String apiKey);

}
