package com.withings.webradio.ui;

import com.withings.webradio.network.WebRadiosRemoteRepository;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class WebRadioListFragment_MembersInjector implements ak0.b<WebRadioListFragment> {
    private final Provider<WebRadiosRemoteRepository> webRadiosRemoteRepositoryProvider;

    public WebRadioListFragment_MembersInjector(Provider<WebRadiosRemoteRepository> provider) {
        this.webRadiosRemoteRepositoryProvider = provider;
    }

    public static ak0.b<WebRadioListFragment> create(Provider<WebRadiosRemoteRepository> provider) {
        return new WebRadioListFragment_MembersInjector(provider);
    }

    public static void injectWebRadiosRemoteRepository(WebRadioListFragment webRadioListFragment, WebRadiosRemoteRepository webRadiosRemoteRepository) {
        webRadioListFragment.webRadiosRemoteRepository = webRadiosRemoteRepository;
    }

    public void injectMembers(WebRadioListFragment webRadioListFragment) {
        injectWebRadiosRemoteRepository(webRadioListFragment, this.webRadiosRemoteRepositoryProvider.get());
    }
}
