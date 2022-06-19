package ir.mjahanbazi.navigationcomponetexample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import ir.mjahanbazi.navigationcomponetexample.R;

public class MainFragment extends Fragment implements View.OnClickListener {
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        view.findViewById(R.id.main_fragment_got_to_first).setOnClickListener(this);
        view.findViewById(R.id.main_fragment_got_to_second).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_fragment_got_to_first:
                navController.navigate(R.id.action_mainFragment_to_firstFragment);
                break;
            case R.id.main_fragment_got_to_second:
                navController.navigate(R.id.action_mainFragment_to_secondFragment);
                break;
        }
    }
}
