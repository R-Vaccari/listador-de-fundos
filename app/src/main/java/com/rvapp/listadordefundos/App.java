package com.rvapp.listadordefundos;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.cache.disc.DiskCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.utils.IoUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initImageLoader(this);
    }

    public void initImageLoader(Context context) {
        DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
                .cacheOnDisk(true)
                .showImageOnFail(R.drawable.ic_launcher_foreground)
                .showImageForEmptyUri(R.drawable.ic_launcher_foreground)
                .build();
        ImageLoaderConfiguration.Builder config = new ImageLoaderConfiguration.Builder(context)
                .defaultDisplayImageOptions(displayImageOptions);
        ImageLoader.getInstance().init(config.build());
    }
}
