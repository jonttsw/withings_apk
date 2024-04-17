package com.withings.wiscale2.vascularage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$vascularAgeRangeDatum$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class l1 extends kotlin.coroutines.jvm.internal.i implements ym0.q<Interval, User, qm0.d<? super nm0.j<? extends b90.a, ? extends b90.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Interval f62424a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ User f62425b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.vascularage.l1, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.q
    public final Object invoke(Interval interval, User user, qm0.d<? super nm0.j<? extends b90.a, ? extends b90.a>> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f62424a = interval;
        iVar.f62425b = user;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Interval interval = this.f62424a;
        User user = this.f62425b;
        DateTime start = interval.getStart();
        DateTime end = interval.getEnd();
        return new nm0.j(new b90.a(ConstantsWs.MEASURE_TYPE_VASCULAR_AGE, start.minusYears(1), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, s70.a.b(user, start) + 6), new b90.a(ConstantsWs.MEASURE_TYPE_VASCULAR_AGE, end.plusYears(1), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, s70.a.b(user, end) + 6));
    }
}
