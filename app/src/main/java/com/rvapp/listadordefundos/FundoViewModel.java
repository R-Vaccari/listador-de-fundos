package com.rvapp.listadordefundos;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.rvapp.listadordefundos.entities.Fundo;

import java.util.List;

public class FundoViewModel extends AndroidViewModel {
    private final MutableLiveData<List<Fundo>> fundosMutableLiveData = new MutableLiveData<>();
    private final Application application;

    public FundoViewModel(@NonNull Application application) {
        super(application);
        this.application = application;
        loadData();
    }

    private void loadData() {
        FundoProvider provider = new FundoProvider(this);
        provider.loadCacheFile();
        provider.load();
    }


    public MutableLiveData<List<Fundo>> getFundos() {
        if (fundosMutableLiveData.getValue() == null) loadData();
        return fundosMutableLiveData;
    }

    public void postToLiveData(List<Fundo> fundos) {
        fundosMutableLiveData.setValue(fundos);
    }

    public Application getApplication() {
        return application;
    }
}
