package com.example.livedataexample;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModels extends ViewModel {
    MutableLiveData<Boolean> currentState = new MutableLiveData<>(false);

}