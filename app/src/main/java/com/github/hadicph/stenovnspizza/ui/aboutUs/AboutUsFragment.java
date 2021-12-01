package com.github.hadicph.stenovnspizza.ui.aboutUs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.github.hadicph.stenovnspizza.R;
import com.github.hadicph.stenovnspizza.databinding.FragmentAboutUsBinding;
import com.google.android.gms.maps.MapView;

public class AboutUsFragment extends Fragment {


    private Button facebook, instagram;
    private MapView mapView;
    private AboutUsViewModel aboutUsViewModel;
    private FragmentAboutUsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        aboutUsViewModel =
                new ViewModelProvider(this).get(AboutUsViewModel.class);

        binding = FragmentAboutUsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textView4;
//        aboutUsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });



        facebook =  root.findViewById(R.id.aboutUs_facebook);
        instagram = root.findViewById(R.id.aboutUs_instagram);
        mapView = root.findViewById(R.id.mapView);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String action = Intent.ACTION_VIEW;
                Uri uri = Uri.parse("https://www.facebook.com/Horsenspizza/");

                Intent intent = new Intent(action, uri);
                startActivity(intent);

            }
        });

        instagram.setOnClickListener(view -> {
            String action = Intent.ACTION_VIEW;
            Uri uri = Uri.parse("https://www.instagram.com/horsenspizza");

            Intent intent = new Intent(action, uri);
            startActivity(intent);
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}