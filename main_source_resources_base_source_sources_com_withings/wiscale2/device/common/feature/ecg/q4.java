package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.user.User;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$ecgFeatureInfoLiveData$1$1", f = "EcgActivationViewModel.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class q4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<h5>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51662a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f51663b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<PlatformFeature> f51664c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o4 f51665d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ User f51666e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(List<PlatformFeature> list, o4 o4Var, User user, qm0.d<? super q4> dVar) {
        super(2, dVar);
        this.f51664c = list;
        this.f51665d = o4Var;
        this.f51666e = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        q4 q4Var = new q4(this.f51664c, this.f51665d, this.f51666e, dVar);
        q4Var.f51663b = obj;
        return q4Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<h5> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((q4) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Object obj2;
        boolean z5;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f51662a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f51663b;
            List<PlatformFeature> features = this.f51664c;
            kotlin.jvm.internal.u.i(features, "$features");
            Iterator<T> it = features.iterator();
            while (true) {
                bool = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((PlatformFeature) obj2).getFeatureId() == 4) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            PlatformFeature platformFeature = (PlatformFeature) obj2;
            boolean z11 = false;
            o4 o4Var = this.f51665d;
            if (platformFeature != null) {
                z5 = PlatformFeatureKt.isActivatedForDevice(platformFeature, o4Var.f51554a.getId());
            } else {
                z5 = false;
            }
            kotlin.jvm.internal.u.i(features, "$features");
            Iterator<T> it2 = features.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj3 = it2.next();
                    if (((PlatformFeature) obj3).getFeatureId() == 12) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            PlatformFeature platformFeature2 = (PlatformFeature) obj3;
            if (platformFeature2 != null) {
                Long userId = o4Var.f51554a.getUserId();
                if (userId != null) {
                    bool = Boolean.valueOf(PlatformFeatureKt.isUserEligible(platformFeature2, userId.longValue()));
                }
                if (bool != null) {
                    z11 = bool.booleanValue();
                }
            }
            User user = this.f51666e;
            kotlin.jvm.internal.u.g(user);
            h5 h5Var = new h5(user, z5, z11);
            this.f51662a = 1;
            if (h0Var.emit(h5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
