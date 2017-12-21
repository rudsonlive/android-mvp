package br.com.liveo.mvp.di.components;

import javax.inject.Singleton;

import br.com.liveo.mvp.di.modules.HelperModule;
import dagger.Component;

/**
 * Created by rudsonlima on 9/2/17.
 */

@Singleton
@Component(modules = {HelperModule.class})
public interface ApplicationComponent extends BaseApplicationComponent {
}
