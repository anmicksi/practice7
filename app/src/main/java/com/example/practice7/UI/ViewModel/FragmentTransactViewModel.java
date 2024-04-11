package com.example.practice7.UI.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.practice7.DATA.Model.FragmentDataTransaction;

public class FragmentTransactViewModel extends ViewModel {
    private MutableLiveData<FragmentDataTransaction> transactData = new MutableLiveData<>();
    public FragmentTransactViewModel() {
        transactData.setValue(new FragmentDataTransaction());
    }
    public MutableLiveData<FragmentDataTransaction> getTransactData() {
        return transactData;
    }
}
