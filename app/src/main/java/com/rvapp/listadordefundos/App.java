package com.rvapp.listadordefundos;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.cache.disc.DiskCache;
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
        Application application = this;
        ImageLoaderConfiguration.Builder config = new ImageLoaderConfiguration.Builder(context);
        config.diskCache(new DiskCache() {
            @Override
            public File getDirectory() {
                return new File(application.getCacheDir().getAbsolutePath());
            }

            @Override
            public File get(String imageUri) {
                return new File(imageUri);
            }

            @Override
            public boolean save(String imageUri, InputStream imageStream, IoUtils.CopyListener listener) throws IOException {
                return false;
            }

            @Override
            public boolean save(String imageUri, Bitmap bitmap) throws IOException {
                return false;
            }

            @Override
            public boolean remove(String imageUri) {
                return false;
            }

            @Override
            public void close() {

            }

            @Override
            public void clear() {

            }
        });
        ImageLoader.getInstance().init(config.build());
    }

}
