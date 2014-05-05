package com.factati.basedroid;

import android.accounts.AccountManager;
import android.content.Context;

import com.factati.basedroid.authenticator.BootstrapAuthenticatorActivity;
import com.factati.basedroid.authenticator.LogoutService;
import com.factati.basedroid.core.TimerService;
import com.factati.basedroid.ui.BootstrapTimerActivity;
import com.factati.basedroid.ui.MainActivity;
import com.factati.basedroid.ui.CheckInsListFragment;
import com.factati.basedroid.ui.NavigationDrawerFragment;
import com.factati.basedroid.ui.NewsActivity;
import com.factati.basedroid.ui.NewsListFragment;
import com.factati.basedroid.ui.UserActivity;
import com.factati.basedroid.ui.UserListFragment;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module(
        complete = false,

        injects = {
                BootstrapApplication.class,
                BootstrapAuthenticatorActivity.class,
                MainActivity.class,
                BootstrapTimerActivity.class,
                CheckInsListFragment.class,
                NavigationDrawerFragment.class,
                NewsActivity.class,
                NewsListFragment.class,
                UserActivity.class,
                UserListFragment.class,
                TimerService.class
        }
)
public class BootstrapModule {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    LogoutService provideLogoutService(final Context context, final AccountManager accountManager) {
        return new LogoutService(context, accountManager);
    }

}
