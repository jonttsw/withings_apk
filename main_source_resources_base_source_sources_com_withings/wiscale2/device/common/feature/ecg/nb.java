package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.user.User;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WBS08EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$ecgFeatureInfoLiveData$1$1", f = "WBS08EcgActivationViewModel.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class nb extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<h5>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51543a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f51544b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f51545c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<PlatformFeature> f51546d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationViewModel f51547e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(User user, List<PlatformFeature> list, WBS08EcgActivationViewModel wBS08EcgActivationViewModel, qm0.d<? super nb> dVar) {
        super(2, dVar);
        this.f51545c = user;
        this.f51546d = list;
        this.f51547e = wBS08EcgActivationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        nb nbVar = new nb(this.f51545c, this.f51546d, this.f51547e, dVar);
        nbVar.f51544b = obj;
        return nbVar;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<h5> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((nb) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Object obj2;
        Boolean bool2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f51543a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f51544b;
            User user = this.f51545c;
            if (user == null) {
                return nm0.y.f85009a;
            }
            List<PlatformFeature> features = this.f51546d;
            kotlin.jvm.internal.u.i(features, "$features");
            List<PlatformFeature> list = features;
            Iterator<T> it = list.iterator();
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
            WBS08EcgActivationViewModel wBS08EcgActivationViewModel = this.f51547e;
            if (platformFeature != null) {
                bool2 = Boolean.valueOf(PlatformFeatureKt.isActivatedForUser(platformFeature, wBS08EcgActivationViewModel.g1()));
            } else {
                bool2 = null;
            }
            Iterator<T> it2 = list.iterator();
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
                bool = Boolean.valueOf(PlatformFeatureKt.isUserEligible(platformFeature2, wBS08EcgActivationViewModel.g1()));
            }
            ParcelableSnapshotMutableState R0 = wBS08EcgActivationViewModel.R0();
            Boolean bool3 = Boolean.TRUE;
            R0.setValue(Boolean.valueOf(kotlin.jvm.internal.u.e(bool2, bool3)));
            wBS08EcgActivationViewModel.A0().setValue(Boolean.valueOf(kotlin.jvm.internal.u.e(bool2, bool3)));
            h5 h5Var = new h5(user, kotlin.jvm.internal.u.e(bool2, bool3), kotlin.jvm.internal.u.e(bool, bool3));
            this.f51543a = 1;
            if (h0Var.emit(h5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
