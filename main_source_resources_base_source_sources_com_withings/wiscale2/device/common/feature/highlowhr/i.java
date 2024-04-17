package com.withings.wiscale2.device.common.feature.highlowhr;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HighLowHRSettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HREventsNotificationSettingsViewModel$updateHRThresholdsAutoFeature$2", f = "HighLowHRSettingsActivity.kt", l = {ConstantsWs.WS_STATUS_WRONG_COUNTRY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52274a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f52275b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f52276c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, boolean z5, qm0.d<? super i> dVar) {
        super(2, dVar);
        this.f52275b = aVar;
        this.f52276c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i(this.f52275b, this.f52276c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PlatformFeatureRepository platformFeatureRepository;
        com.withings.wiscale2.device.common.feature.u uVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52274a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            a aVar = this.f52275b;
            platformFeatureRepository = aVar.f52235h;
            List<PlatformFeature> X = kotlin.collections.x.X(platformFeatureRepository.getFeature(26));
            uVar = aVar.f52234g;
            com.withings.wiscale2.device.common.feature.t a11 = uVar.a(aVar.A0(), X, null);
            this.f52274a = 1;
            if (a11.e(26, this.f52276c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
