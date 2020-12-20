package com.rvapp.listadordefundos;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.rvapp.listadordefundos.entidades.Fundo;

import java.util.List;

public class FundoViewModel extends AndroidViewModel {
    private final MutableLiveData<List<Fundo>> fundoMutableLiveData;
    private FundoProvider provider;


    public FundoViewModel(@NonNull Application application) {
        super(application);
        fundoMutableLiveData = new MutableLiveData<>();
        loadData();
    }

    private void loadData() {
        provider = new FundoProvider();
        fundoMutableLiveData.setValue(provider.getFundos());
    }

    public MutableLiveData<List<Fundo>> getFundos() {
        if (fundoMutableLiveData.getValue() == null) loadData();
        return fundoMutableLiveData;
    }
}
