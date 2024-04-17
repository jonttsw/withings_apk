package com.withings.screen.di;

import com.withings.screen.domain.uc.GetMissingFeatureTagUseCase;
import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.ws.RetrofitDeviceScreensRemoteRepository;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import s00.b;
/* compiled from: DeviceScreenModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/withings/screen/di/DeviceScreenModule;", "", "Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase;", "provideGetMissingFeatureTagUseCase", "()Lcom/withings/screen/domain/uc/GetMissingFeatureTagUseCase;", "Ls00/b;", "compatWebservicesFactory", "Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "provideRemoteRepository", "(Ls00/b;)Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeviceScreenModule {
    public static final DeviceScreenModule INSTANCE = new DeviceScreenModule();

    private DeviceScreenModule() {
    }

    public final GetMissingFeatureTagUseCase provideGetMissingFeatureTagUseCase() {
        return new GetMissingFeatureTagUseCase();
    }

    @Singleton
    public final DeviceScreensRemoteRepository provideRemoteRepository(b compatWebservicesFactory) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        return new RetrofitDeviceScreensRemoteRepository(compatWebservicesFactory, null, 2, null);
    }
}
