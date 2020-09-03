package com.example.example1.viewmodel;

import android.renderscript.BaseObj;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.lifecycle.ViewModel;

import com.example.example1.BR;
import com.example.example1.model.ATM;

import java.util.Set;

public class ATMViewModel extends BaseObservable {


    public ATMViewModel() {
    }


    @Bindable
    public boolean textChange = false;


    public boolean getText() {
        return textChange;
    }


    public void SetText(boolean textChange) {
        this.textChange = textChange;
        notifyPropertyChanged(BR.textChange);

    }

    public void checkText(CharSequence character) {
            if (character.length()==0){
                    SetText(false);

            }else {
                SetText(true);
            }
    }
}
