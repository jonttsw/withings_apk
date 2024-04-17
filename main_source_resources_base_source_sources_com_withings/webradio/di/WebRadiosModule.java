package com.withings.webradio.di;

import com.withings.webradio.network.RetrofitWebRadiosRemoteRepository;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import s00.b;
/* compiled from: WebRadiosModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/withings/webradio/di/WebRadiosModule;", "", "Ls00/b;", "compatWebservicesFactory", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "provideWebRadiosRemoteRepository", "(Ls00/b;)Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "<init>", "()V", "webradio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WebRadiosModule {
    public static final WebRadiosModule INSTANCE = new WebRadiosModule();

    private WebRadiosModule() {
    }

    @Singleton
    public final WebRadiosRemoteRepository provideWebRadiosRemoteRepository(b compatWebservicesFactory) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        return new RetrofitWebRadiosRemoteRepository(compatWebservicesFactory, null, 2, null);
    }
}
