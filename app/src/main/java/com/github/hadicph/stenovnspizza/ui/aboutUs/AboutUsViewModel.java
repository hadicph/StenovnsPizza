package com.github.hadicph.stenovnspizza.ui.aboutUs;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.github.hadicph.stenovnspizza.R;

public class AboutUsViewModel extends ViewModel {

    // Dorin Chira

    private MutableLiveData<String> mText;

    public AboutUsViewModel() {
//        mText = new MutableLiveData<>();
//        mText.setValue("This is about us fragment");






    }

    public LiveData<String> getText() {
        return mText;
    }
}