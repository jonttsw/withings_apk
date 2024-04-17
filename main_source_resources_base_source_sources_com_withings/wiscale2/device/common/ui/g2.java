package com.withings.wiscale2.device.common.ui;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: RespiratoryScanSettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.RespiratoryScanViewModel$featuresLiveData$1$1", f = "RespiratoryScanSettingsActivity.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends PlatformFeature>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53815a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f53816b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h2 f53817c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, qm0.d<? super g2> dVar) {
        super(2, dVar);
        this.f53817c = h2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        g2 g2Var = new g2(this.f53817c, dVar);
        g2Var.f53816b = obj;
        return g2Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends PlatformFeature>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((g2) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PlatformFeatureRepository platformFeatureRepository;
        PlatformFeatureRepository platformFeatureRepository2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53815a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f53816b;
            h2 h2Var = this.f53817c;
            platformFeatureRepository = h2Var.f53957c;
            boolean isFeatureEligibleForOwnerIdAndType = platformFeatureRepository.isFeatureEligibleForOwnerIdAndType(10, h2Var.f53955a.getId(), "device");
            Boolean valueOf = Boolean.valueOf(isFeatureEligibleForOwnerIdAndType);
            List<PlatformFeature> list = null;
            if (!isFeatureEligibleForOwnerIdAndType) {
                valueOf = null;
            }
            if (valueOf != null) {
                platformFeatureRepository2 = h2Var.f53957c;
                list = platformFeatureRepository2.getPlatformFeatures(10, 9, 11);
            }
            this.f53815a = 1;
            if (h0Var.emit(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
