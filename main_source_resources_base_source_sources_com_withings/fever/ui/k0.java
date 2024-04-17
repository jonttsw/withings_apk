package com.withings.fever.ui;

import com.withings.fever.ui.e0;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.user.core.models.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyTemperatureViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.BodyTemperatureViewModel$state$1", f = "BodyTemperatureViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class k0 extends kotlin.coroutines.jvm.internal.i implements ym0.t<User, List<? extends as.h>, Interval, List<? extends LearnMoreEntryTranslations>, bs.b, qm0.d<? super e0.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ User f39313a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f39314b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Interval f39315c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ List f39316d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ bs.b f39317e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ o0 f39318f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, qm0.d<? super k0> dVar) {
        super(6, dVar);
        this.f39318f = o0Var;
    }

    @Override // ym0.t
    public final Object c(User user, List<? extends as.h> list, Interval interval, List<? extends LearnMoreEntryTranslations> list2, bs.b bVar, qm0.d<? super e0.b> dVar) {
        k0 k0Var = new k0(this.f39318f, dVar);
        k0Var.f39313a = user;
        k0Var.f39314b = list;
        k0Var.f39315c = interval;
        k0Var.f39316d = list2;
        k0Var.f39317e = bVar;
        return k0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        at.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        User user = this.f39313a;
        List list = this.f39314b;
        Interval interval = this.f39315c;
        List list2 = this.f39316d;
        bs.b bVar = this.f39317e;
        if (list == null) {
            list = kotlin.collections.i0.f76187a;
        }
        List list3 = list;
        ArrayList z5 = kotlin.collections.l.z(new GraphPeriod[]{GraphPeriod.f39502b, GraphPeriod.f39504d});
        aVar = this.f39318f.f39393m;
        return new e0.b(list3, user.isShared(), z5, interval, aVar, list2, bVar);
    }
}
