package com.withings.wiscale2.vascularage;

import com.withings.graph.GraphPeriod;
import com.withings.user.core.models.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$configurationGraph$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.i implements ym0.s<Interval, List<? extends GraphPeriod>, Boolean, User, qm0.d<? super d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Interval f62483a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f62484b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ boolean f62485c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ User f62486d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r0 f62487e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r0 r0Var, qm0.d<? super u0> dVar) {
        super(5, dVar);
        this.f62487e = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Interval interval = this.f62483a;
        List list = this.f62484b;
        boolean z11 = this.f62485c;
        User user = this.f62486d;
        at.a aVar = this.f62487e.f62454o;
        User.Names names = user.getNames();
        DateTime end = interval.getEnd();
        kotlin.jvm.internal.u.i(end, "getEnd(...)");
        if (s70.a.b(user, end) >= 25) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new d(interval, aVar, list, z11, names, z5);
    }

    @Override // ym0.s
    public final Object k(Interval interval, List<? extends GraphPeriod> list, Boolean bool, User user, qm0.d<? super d> dVar) {
        boolean booleanValue = bool.booleanValue();
        u0 u0Var = new u0(this.f62487e, dVar);
        u0Var.f62483a = interval;
        u0Var.f62484b = list;
        u0Var.f62485c = booleanValue;
        u0Var.f62486d = user;
        return u0Var.invokeSuspend(nm0.y.f85009a);
    }
}
