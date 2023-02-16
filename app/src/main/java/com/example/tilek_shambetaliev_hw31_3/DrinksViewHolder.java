package com.example.tilek_shambetaliev_hw31_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DrinksViewHolder extends RecyclerView.ViewHolder {

    private TextView tvDrinks;

    public DrinksViewHolder(@NonNull View itemView) {
        super(itemView);

        tvDrinks = itemView.findViewById(R.id.tv_food);
    }

    void bind(String drinks) {
        tvDrinks.setText(drinks);
    }
}
