package com.example.tilek_shambetaliev_hw31_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MenuFragment extends Fragment {

    private Button btnFirstFragment, btnSecondFragment, btnThirdFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
    }

    private void initListener() {
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

        btnThirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, new ThirdFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void initView() {
        btnFirstFragment = requireActivity().findViewById(R.id.btn_firstl);
        btnSecondFragment = requireActivity().findViewById(R.id.btn_secondl);
        btnThirdFragment = requireActivity().findViewById(R.id.btn_thirdl);
    }
}