package com.example.pokeapiapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.pokeapiapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PokemonViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);

//        binding.btnLike.setOnClickListener(v -> handleVote(true));
//        binding.btnDislike.setOnClickListener(v -> handleVote(false));

        loadInitialData();

        //  var list = new ArrayList<Pokemon>();
//        var call = NetworkClient.getInstance().getPokemonService().listRepos();
//        call.enqueue(new BaseCallback<>());
        // Log.d("tag", Arrays.toString(list.toArray()));
    }

    private void observeViewModel() {
        viewModel.currentPokemonName.observe(this, name -> {
            if (name != null) {
                loadPokemonDetails(name);
            } else {
                showNoMorePokemon();
            }
        });
    }

    private void loadInitialData() {
        var listcall = NetworkClient.getInstance().getPokemonService().getPokemonList(10, 0);
        listcall.enqueue(new BaseCallback<ItemsList>());

    }

    private void loadPokemonDetails(String name) {
        NetworkClient.getInstance().getPokemonService()
                .getPokemonDetails(name)
                .enqueue(new BaseCallback<>());
    }

    private void handleVote(boolean isLiked) {
        String currentName = viewModel.currentPokemonName.getValue();
        if (isLiked) {
            viewModel.addToLiked(currentName);
        } else {
            viewModel.addToDisliked(currentName);
        }
        viewModel.loadNextPokemon();
    }

    private void displayPokemon(PokemonDetails details) {
        // Реализуйте отображение данных в UI
//        binding.pokemonName.setText(details.getName());
        // Загрузите изображение через Picasso/Glide
    }

    private void showNoMorePokemon() {

    }


}