package com.withings.features.platform;

import android.content.Context;
import com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qr.a;
import vr.b;
import vr.c;
/* compiled from: PlatformFeatureModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withings/features/platform/PlatformFeatureModule;", "", "Ls00/b;", "compatWebServicesFactory", "Lqr/a;", "providePlatformFeatureApi", "(Ls00/b;)Lqr/a;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/withings/features/platform/model/PlatformFeatureRepository;", "platformFeatureRepository", "Lvr/c;", "provideFeatureTagsLastUpdateRepository", "(Landroid/content/Context;Lcom/withings/features/platform/model/PlatformFeatureRepository;)Lvr/c;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PlatformFeatureModule {
    public static final PlatformFeatureModule INSTANCE = new PlatformFeatureModule();

    private PlatformFeatureModule() {
    }

    @Singleton
    public final c provideFeatureTagsLastUpdateRepository(Context context, PlatformFeatureRepository platformFeatureRepository) {
        u.j(context, "context");
        u.j(platformFeatureRepository, "platformFeatureRepository");
        return new b(context, platformFeatureRepository);
    }

    public final a providePlatformFeatureApi(s00.b compatWebServicesFactory) {
        u.j(compatWebServicesFactory, "compatWebServicesFactory");
        return new RetrofitPlatformFeatureRemoteRepository(compatWebServicesFactory, null, 2, null);
    }
}
