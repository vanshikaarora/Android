

package com.mission.chaze.chaze.screens.Homepage.LocalSearch;

import com.mission.chaze.chaze.repository.network.ICommonAPIManager;
import com.mission.chaze.chaze.screens.base.BasePresenter;
import com.mission.chaze.chaze.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;


/**
 * Created by Shubham Vishwakarma on 12/10/18.
 */

public class LocalSearchPresenter<V extends LocalSearchContract.View> extends BasePresenter<V>
        implements LocalSearchContract.Presentor<V> {

    public LocalSearchPresenter(ICommonAPIManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable, sessionManager);
    }
}
