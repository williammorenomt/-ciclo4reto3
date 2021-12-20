package com.example.bicipartes.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.bicipartes.Inicio;
import com.example.bicipartes.Login;
import com.example.bicipartes.NuevoProductoActivity;
import com.example.bicipartes.R;
import com.example.bicipartes.databinding.FragmentGalleryBinding;
import android.content.Intent;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    public void Ingresar(View v){
        Intent in = new Intent(GalleryFragment.this, NuevoProductoActivity.class);
        startActivity(in);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}