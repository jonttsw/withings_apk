package com.withings.fever.ui;

import com.withings.user.core.models.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyTemperatureViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.BodyTemperatureViewModel$symptoms$1", f = "BodyTemperatureViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<User, Interval, qm0.d<? super Flow<? extends List<? extends fx.f>>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ User f39319a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Interval f39320b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o0 f39321c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var, qm0.d<? super l0> dVar) {
        super(3, dVar);
        this.f39321c = o0Var;
    }

    @Override // ym0.q
    public final Object invoke(User user, Interval interval, qm0.d<? super Flow<? extends List<? extends fx.f>>> dVar) {
        l0 l0Var = new l0(this.f39321c, dVar);
        l0Var.f39319a = user;
        l0Var.f39320b = interval;
        return l0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ox.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        User user = this.f39319a;
        Interval interval = this.f39320b;
        cVar = this.f39321c.f39387g;
        long id2 = user.getId();
        DateTime start = interval.getStart();
        kotlin.jvm.internal.u.i(start, "getStart(...)");
        DateTime end = interval.getEnd();
        kotlin.jvm.internal.u.i(end, "getEnd(...)");
        return cVar.a(id2, start, end);
    }
}
