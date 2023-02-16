package com.example.tilek_shambetaliev_hw31_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PizzaViewHolder extends RecyclerView.ViewHolder {

    private TextView tvPizza;

    public PizzaViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPizza=itemView.findViewById(R.id.tv_pizza);
    }

    void bind(String pizza) {
        tvPizza.setText(pizza);
    }
}
