package com.rvapp.listadordefundos.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.rvapp.listadordefundos.model.entities.Fundo;
import com.rvapp.listadordefundos.model.FundoProvider;

import java.util.List;

public class FundoViewModel extends AndroidViewModel {
    private final MutableLiveData<List<Fundo>> fundosMutableLiveData = new MutableLiveData<>();
    private final Application application;
    private final FundoProvider provider;

    public FundoViewModel(@NonNull Application application) {
        super(application);
        this.application = application;
        provider = new FundoProvider(this);
        loadData();
    }

    private void loadData() {
        loadCache();
        provider.load();
    }

    public void loadCache() {
        provider.loadCacheFile();
    }

    public MutableLiveData<List<Fundo>> getFundos() {
        if (fundosMutableLiveData.getValue() == null) loadData();
        return fundosMutableLiveData;
    }

    public void loadByCategory(String category) {
        provider.loadCacheByCategory(category);
    }

    public void postToLiveData(List<Fundo> fundos) {
        fundosMutableLiveData.setValue(fundos);
    }

    public Application getApplication() {
        return application;
    }
}
