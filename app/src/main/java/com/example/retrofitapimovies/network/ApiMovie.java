package com.example.retrofitapimovies.network;

import android.telecom.Call;

import com.example.retrofitapimovies.model.Movie;

import java.util.List;

import retrofit2.http.GET;

//Describe todas las opraciones que se solicitaran desde la API
public interface ApiMovie {
    @GET("movies/list.php")
    retrofit2.Call<List<Movie>> getMovies();

}
