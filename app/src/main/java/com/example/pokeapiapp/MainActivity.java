package com.example.pokeapiapp;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pokeapiapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

      //  var list = new ArrayList<Pokemon>();
//        var call = NetworkClient.getInstance().getPokemonService().listRepos();
//        call.enqueue(new BaseCallback<>());

        var listcall = NetworkClient.getInstance().getPokemonService().getPokemonList(10, 0);
        listcall.enqueue(new BaseCallback<ItemsList>());
        // Log.d("tag", Arrays.toString(list.toArray()));
    }

}