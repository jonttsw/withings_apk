package com.withings.wiscale2.vascularage;

import com.withings.user.core.models.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$pwvGraphRangeDatum$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class z0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<User, Interval, qm0.d<? super nm0.j<? extends b90.a, ? extends b90.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ User f62569a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Interval f62570b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0 f62571c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(r0 r0Var, qm0.d<? super z0> dVar) {
        super(3, dVar);
        this.f62571c = r0Var;
    }

    @Override // ym0.q
    public final Object invoke(User user, Interval interval, qm0.d<? super nm0.j<? extends b90.a, ? extends b90.a>> dVar) {
        z0 z0Var = new z0(this.f62571c, dVar);
        z0Var.f62569a = user;
        z0Var.f62570b = interval;
        return z0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        e40.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        User user = this.f62569a;
        Interval interval = this.f62570b;
        bVar = this.f62571c.f62449j;
        DateTime start = interval.getStart();
        kotlin.jvm.internal.u.i(start, "getStart(...)");
        DateTime end = interval.getEnd();
        kotlin.jvm.internal.u.i(end, "getEnd(...)");
        return bVar.b(start, end, s70.a.a(user));
    }
}
