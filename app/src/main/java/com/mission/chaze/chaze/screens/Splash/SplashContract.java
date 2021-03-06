package com.mission.chaze.chaze.screens.Splash;

import com.mission.chaze.chaze.screens.base.MvpContract;


/**
 * Created by Shubham Vishwakarma on 4/10/18.
 */

public class SplashContract {

    public interface View extends MvpContract.View {

        void openLoginActivity();

        void openHomeActivity();

    }


    public interface Presentor<V extends View> extends MvpContract.Presenter<V> {

    }
}
