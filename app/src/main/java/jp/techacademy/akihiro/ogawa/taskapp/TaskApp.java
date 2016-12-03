package jp.techacademy.akihiro.ogawa.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by ogawa on 2016/11/15.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
