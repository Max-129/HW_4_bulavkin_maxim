package com.example.hw_4_bulavkin_maxim;

import android.annotation.SuppressLint;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class FilmAdapter extends RecyclerView.Adapter<FilmVH> {
    private onClick onClick;
    private ArrayList<Model> filmsList;

    public FilmAdapter(ArrayList<Model> filmsList, onClick onClick1) {
        this.filmsList = filmsList;
        this.onClick = onClick1;
    }

    @NonNull
    @Override
    public FilmVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new FilmVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_film, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmVH viewHolder, @SuppressLint("RecyclerView") int position) {
        viewHolder.bind(filmsList.get(position));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.onClick(filmsList.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return filmsList.size();
    }
}
