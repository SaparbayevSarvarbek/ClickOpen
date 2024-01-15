package com.example.clickopen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.clickopen.databinding.ActivityMainBinding;
import com.example.clickopen.databinding.FragmentBlankBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private ActivityMainBinding binding;
     private List<Data> dataList;
     private  Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Load();
       adapter= new Adapter(getSupportFragmentManager(),dataList);
       binding.viewpager.setAdapter(adapter);

       binding.tablyout.setupWithViewPager(binding.viewpager);
    }

    private void Load() {
        dataList=new ArrayList<>();
        dataList.add(new Data(R.drawable.img1, "Click va Paymega o’tish xizmati","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."));
        dataList.add(new Data(R.drawable.img2, "Barcha operatorlar bo’yicha statistika","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."));
        dataList.add(new Data(R.drawable.img1, "Tariflarni filtrlash","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."));
        dataList.add(new Data(R.drawable.img1, "Yangi imkoniyatlar","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."));
    }
}