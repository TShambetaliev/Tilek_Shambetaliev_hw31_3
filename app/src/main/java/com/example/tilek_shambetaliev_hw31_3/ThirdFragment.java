package com.example.tilek_shambetaliev_hw31_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {

    private Button btnMenuFragment, btnFirstFragment, btnSecondFragment;
    private ArrayList<String> drinksList;
    private RecyclerView drinksRecycleView;
    private DrinksAdapter drinksAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initListener();
        drinksAdapter = new DrinksAdapter(drinksList);
        drinksRecycleView.setAdapter(drinksAdapter);
    }

    private void initListener() {
        btnMenuFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, new MenuFragment()).commit();
            }
        });
        btnFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, new FirstFragment()).addToBackStack(null).commit();
            }
        });
        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, new SecondFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void loadData() {
        drinksList = new ArrayList<>();
        drinksList.add("Черный чай");
        drinksList.add("Зеленный чай");
        drinksList.add("Кофе");
        drinksList.add("Американо");
        drinksList.add("Капучино");
        drinksList.add("Компот");
        drinksList.add("Кола");
        drinksList.add("Натуральный сок");
        drinksList.add("Чалап");
        drinksList.add("Максым");
        drinksList.add("Жарма");
        drinksList.add("Кымыз");
        drinksList.add("Курут");
        drinksList.add("Аралаш");
        drinksList.add("Тан");
        drinksList.add("Лимонады");
        drinksList.add("Воды");
        drinksList.add("Боржоми");
        drinksList.add("Энергетики");
        drinksList.add("Холодный чай");
        drinksList.add("Чай с бергамутом");
        drinksList.add("Латте");
        drinksList.add("Горячий шоколад");
        drinksList.add("Фруктовый чай");
        drinksList.add("Фреш");
        drinksList.add("Мохито");
    }

    private void initView() {
        btnMenuFragment = requireActivity().findViewById(R.id.btn_menu3);
        btnFirstFragment = requireActivity().findViewById(R.id.btn_firstl3);
        btnSecondFragment = requireActivity().findViewById(R.id.btn_secondl3);
        drinksRecycleView = requireView().findViewById(R.id.rv_drinks);

    }
}