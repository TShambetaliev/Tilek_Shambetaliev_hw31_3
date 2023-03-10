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


public class SecondFragment extends Fragment {

    private Button btnMenuFragment, btnFirstFragment, btnThirdFragment;
    private ArrayList<String> foodList;
    private RecyclerView foodRecycleView;
    private FoodAdapter foodAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initView();
        loadData();
        initListener();
        foodAdapter = new FoodAdapter(foodList);
        foodRecycleView.setAdapter(foodAdapter);
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

        btnThirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, new ThirdFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void loadData() {
        foodList = new ArrayList<>();
        foodList.add("????????");
        foodList.add("?????? ????????????");
        foodList.add("????????????");
        foodList.add("??????????");
        foodList.add("????????????");
        foodList.add("??????????????");
        foodList.add("??????????????????");
        foodList.add("????????????????");
        foodList.add("????????");
        foodList.add("????????????");
        foodList.add("??????????");
        foodList.add("??????????");
        foodList.add("??????????");
        foodList.add("??????????????");
        foodList.add("??????????-????");
        foodList.add("??????????????");
        foodList.add("??????????");
        foodList.add("??????????");
        foodList.add("????????");
        foodList.add("????????????");
        foodList.add("????????");
        foodList.add("??????????");
        foodList.add("??????????????");
        foodList.add("??????-??????");
        foodList.add("??????????????");
    }

    private void initView() {
        btnFirstFragment = requireActivity().findViewById(R.id.btn_firstl2);
        btnMenuFragment = requireActivity().findViewById(R.id.btn_menu2);
        foodRecycleView = requireActivity().findViewById(R.id.rv_food);
        btnThirdFragment = requireActivity().findViewById(R.id.btn_thirdl2);
    }
}