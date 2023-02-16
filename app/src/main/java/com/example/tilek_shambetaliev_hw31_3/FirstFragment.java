package com.example.tilek_shambetaliev_hw31_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private Button btnMenu, btnSecondFragment, btnThirdFragment;

    private ArrayList<String> pizzaList;
    private RecyclerView pizzaRecyclerView;
    private PizzaAdapter pizzaAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initListener();
        pizzaAdapter = new PizzaAdapter(pizzaList);
        pizzaRecyclerView.setAdapter(pizzaAdapter);
    }

    private void initListener() {
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, new MenuFragment()).commit();
            }
        });
        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, new SecondFragment()).addToBackStack(null).commit();
            }
        });
        btnThirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, new ThirdFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void initView() {
        pizzaRecyclerView = requireActivity().findViewById(R.id.rv_pizza);
        btnMenu = requireActivity().findViewById(R.id.btn_menu1);
        btnSecondFragment = requireActivity().findViewById(R.id.btn_secondl1);
        btnThirdFragment= requireActivity().findViewById(R.id.btn_thirdl1);
    }

    private void loadData() {
        pizzaList = new ArrayList<>();
        pizzaList.add("Пеперони");
        pizzaList.add("4 Сыра");
        pizzaList.add("Мясной");
        pizzaList.add("Шашлычний");
        pizzaList.add("Куринный");
        pizzaList.add("Овощной");
        pizzaList.add("Ассорти");
        pizzaList.add("Детский");
        pizzaList.add("Италиянская пицца");
        pizzaList.add("От Шефа");
        pizzaList.add("Фирменная");
        pizzaList.add("Турецкая");
        pizzaList.add("Чили");
        pizzaList.add("Маргарита");
        pizzaList.add("Цезарь");
        pizzaList.add("Деревянская");
    }
}