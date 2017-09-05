package br.com.liveo.mvp.screen.home.di;

import br.com.liveo.mvp.data.source.remote.ApiEndPoint;
import br.com.liveo.mvp.di.scopes.ActivityScoped;
import br.com.liveo.mvp.screen.home.HomeContract;
import br.com.liveo.mvp.screen.home.HomeInteractor;
import br.com.liveo.mvp.screen.home.HomePresenter;
import br.com.liveo.mvp.util.scheduler.BaseScheduler;
import br.com.liveo.mvp.util.scheduler.InjectionScheduler;
import dagger.Module;
import dagger.Provides;

/**
 * Created by rudsonlima on 9/2/17.
 */
@Module
public class HomeModule {

    @Provides
    @ActivityScoped
    HomeInteractor provideHomeInteractor(ApiEndPoint apiEndPoint){
        return new HomeInteractor(apiEndPoint);
    }

    @Provides
    @ActivityScoped
    HomeContract.Presenter provideHomePresenter(HomeInteractor homeInteractor,
                                  BaseScheduler scheduler) {
        return new HomePresenter(homeInteractor, scheduler);
    }

    @Provides
    BaseScheduler provideScheduleProvider() {
        return InjectionScheduler.schedulerProvider();
    }
}
