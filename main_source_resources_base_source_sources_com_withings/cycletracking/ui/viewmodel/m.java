package com.withings.cycletracking.ui.viewmodel;

import com.withings.cycletracking.ui.e2;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.LocalDate;
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$header$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.r<fr.a, List<? extends wm.b>, at.a, qm0.d<? super e2.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ fr.a f35922a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f35923b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ at.a f35924c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.cycletracking.ui.viewmodel.m, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.r
    public final Object invoke(fr.a aVar, List<? extends wm.b> list, at.a aVar2, qm0.d<? super e2.a> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(4, dVar);
        iVar.f35922a = aVar;
        iVar.f35923b = list;
        iVar.f35924c = aVar2;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<LocalDate> c11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        fr.a aVar = this.f35922a;
        LocalDate localDate = this.f35924c.c().toLocalDate();
        kotlin.jvm.internal.u.g(localDate);
        wm.b m11 = ah.u.m(this.f35923b, localDate);
        boolean z5 = false;
        if (m11 != null && (c11 = m11.c()) != null && c11.contains(localDate)) {
            z5 = true;
        }
        if (aVar == null) {
            return e2.a.C0469a.f35532a;
        }
        if (mo.a.g(aVar.f())) {
            return new e2.a.b(z5);
        }
        return e2.a.c.f35534a;
    }
}
