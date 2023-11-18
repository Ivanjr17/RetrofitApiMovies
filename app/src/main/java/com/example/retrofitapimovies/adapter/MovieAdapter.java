package com.example.retrofitapimovies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.retrofitapimovies.R;
import com.example.retrofitapimovies.model.Movie;

import java.util.List;

//Incorpora el diseño y componentes que contiene el archivo item_movie.xml
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<Movie> movies;
    private Context context;

    //Generando Constructor
    public MovieAdapter(List<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View View = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie,parent,false);
        return new ViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.tv_titulo.setText(movies.get(position).getTitulo());
        Glide.with(context).load(movies.get(position).getPortada()).into(holder.iv_portada);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //La clase ViewHolder especifica que componentes del archivo item_movie.xml se utilizaran para mostrar datos del gson

        private ImageView iv_portada;
        private TextView tv_titulo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_portada = itemView.findViewById(R.id.iv_portada);
            tv_titulo = itemView.findViewById(R.id.tv_titulo);
        }
    }
}
