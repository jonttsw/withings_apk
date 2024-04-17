package com.withings.ecg.live;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.live.EcgViewModel$requireUSReview$1", f = "LiveEcgActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGPRO}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38699a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38700b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ kn.e f38701c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c f38702d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PlatformFeatureRepository f38703e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kn.e eVar, c cVar, PlatformFeatureRepository platformFeatureRepository, qm0.d<? super p> dVar) {
        super(2, dVar);
        this.f38701c = eVar;
        this.f38702d = cVar;
        this.f38703e = platformFeatureRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        p pVar = new p(this.f38701c, this.f38702d, this.f38703e, dVar);
        pVar.f38700b = obj;
        return pVar;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((p) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        u70.i iVar;
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38699a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f38700b;
            iVar = this.f38702d.f38628a;
            Device f11 = this.f38701c.f(iVar);
            long id2 = f11.getId();
            Long userId = f11.getUserId();
            if (userId == null) {
                userId = new Long(0L);
            }
            long longValue = userId.longValue();
            PlatformFeatureRepository platformFeatureRepository = this.f38703e;
            boolean isFeatureEnabledForOwnerIdAndType = platformFeatureRepository.isFeatureEnabledForOwnerIdAndType(12, id2, "device");
            boolean isFeatureEnabledForOwnerIdAndType2 = platformFeatureRepository.isFeatureEnabledForOwnerIdAndType(12, longValue, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
            if (isFeatureEnabledForOwnerIdAndType && isFeatureEnabledForOwnerIdAndType2) {
                z5 = true;
            } else {
                z5 = false;
            }
            Boolean valueOf = Boolean.valueOf(z5);
            this.f38699a = 1;
            if (h0Var.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
