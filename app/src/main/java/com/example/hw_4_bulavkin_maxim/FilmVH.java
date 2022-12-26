package com.example.hw_4_bulavkin_maxim;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class FilmVH extends RecyclerView.ViewHolder {

    TextView tvDesc, tvTitle, tvReyt;
    onClick onClick;
    ImageView img;
    CardView cardView;

    public FilmVH(@NonNull View itemView) {
        super(itemView);

        tvTitle = itemView.findViewById(R.id.tv_title);
        tvDesc = itemView.findViewById(R.id.tv_desc);
        tvReyt = itemView.findViewById(R.id.tv_reyt);
        img = itemView.findViewById(R.id.image);
    }

    public void bind(Model film) {
        tvTitle.setText(film.getTitle());
        tvDesc.setText(film.getDescription());
        tvReyt.setText(film.getReyting());
        img.setImageResource(film.getImage());

    }



}
