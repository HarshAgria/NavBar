package com.example.navbar.ui.Setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navbar.databinding.FragmentSettingBinding;

public class SettingFragment extends Fragment {

        private FragmentSettingBinding binding;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container,Bundle savedInstancesState){
            SettingViewModel settingViewModel=new ViewModelProvider(this).get(SettingViewModel.class);
            binding=FragmentSettingBinding.inflate(inflater,container,false);
            View root=binding.getRoot();
            final TextView textView=binding.textSetting;
            settingViewModel.getText().observe(getViewLifecycleOwner(),textView::setText);
            return root;
        }

        public void onDestroyView(){
            super.onDestroyView();
            binding=null;
        }

}
