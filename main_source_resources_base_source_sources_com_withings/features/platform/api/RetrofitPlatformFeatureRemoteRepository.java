package com.withings.features.platform.api;

import com.withings.feature.platform.model.FeatureDeserializer;
import com.withings.feature.platform.model.PlatformFeatureListWS;
import com.withings.feature.platform.model.PlatformFeatureWS;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import q00.f;
import qm0.d;
import qr.a;
import s00.b;
/* compiled from: RetrofitPlatformFeatureRemoteRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJT\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/withings/features/platform/api/RetrofitPlatformFeatureRemoteRepository;", "Lqr/a;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lqr/a;", "Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "getPlatformFeatures", "(Lqm0/d;)Ljava/lang/Object;", "", "featureId", "", "deviceId", "accountId", NavigationArguments.USER_ID, "startDate", "endDate", "", "isTutorialSeen", "Lnm0/y;", "setPlatformFeature", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lqm0/d;)Ljava/lang/Object;", "unsetPlatformFeature", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservices", "Ls00/b;", "Ls00/a;", "Lcom/withings/features/platform/api/PlatformFeatureRetrofit1Api;", "Lcom/withings/features/platform/api/PlatformFeatureRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitPlatformFeatureRemoteRepository implements a {
    private final s00.a<PlatformFeatureRetrofit1Api, PlatformFeatureRetrofit2Api> compatWS;
    private final b compatWebservices;

    public RetrofitPlatformFeatureRemoteRepository(b compatWebservices, String str) {
        u.j(compatWebservices, "compatWebservices");
        this.compatWebservices = compatWebservices;
        f a11 = compatWebservices.a(str, PlatformFeatureRetrofit1Api.class, PlatformFeatureRetrofit2Api.class);
        this.compatWS = a11;
        a11.j(PlatformFeatureWS.class, new FeatureDeserializer());
    }

    @Override // qr.a
    public Object getPlatformFeatures(d<? super PlatformFeatureListWS> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2(this, null), dVar);
    }

    @Override // qr.a
    public Object setPlatformFeature(int i11, Long l5, Long l6, Long l11, Long l12, Long l13, Boolean bool, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2(this, i11, l5, l6, l11, l12, l13, bool, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // qr.a
    public Object unsetPlatformFeature(int i11, Long l5, Long l6, Long l11, Boolean bool, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RetrofitPlatformFeatureRemoteRepository$unsetPlatformFeature$2(this, i11, l5, l6, l11, bool, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // qr.a
    public a withSyncContext(String str) {
        return new RetrofitPlatformFeatureRemoteRepository(this.compatWebservices, str);
    }

    public /* synthetic */ RetrofitPlatformFeatureRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
