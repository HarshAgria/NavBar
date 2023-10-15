package com.example.navbar.ui.Setting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SettingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Settings Section of the App.\n\nHere,you can edit settings of the app.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}