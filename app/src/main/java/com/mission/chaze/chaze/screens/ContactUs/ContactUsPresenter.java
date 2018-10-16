

package com.mission.chaze.chaze.screens.ContactUs;

import com.mission.chaze.chaze.repository.network.ICommonAPIManager;
import com.mission.chaze.chaze.screens.base.BasePresenter;
import com.mission.chaze.chaze.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;


/**
 * Created by Shubham Vishwakarma on 12/10/18.
 */

public class ContactUsPresenter<V extends ContactUsContract.View> extends BasePresenter<V>
        implements ContactUsContract.Presentor<V> {

    public ContactUsPresenter(ICommonAPIManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable, sessionManager);
    }
}
