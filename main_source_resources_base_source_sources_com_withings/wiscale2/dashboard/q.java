package com.withings.wiscale2.dashboard;

import com.withings.device.Device;
import com.withings.user.User;
import fl.e;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DashboardViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.dashboard.DashboardViewModel$submitTrackerSync$1", f = "DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class q extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DashboardViewModel f50600a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f50601b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DashboardViewModel dashboardViewModel, User user, qm0.d<? super q> dVar) {
        super(2, dVar);
        this.f50600a = dashboardViewModel;
        this.f50601b = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new q(this.f50600a, this.f50601b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((q) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kn.e eVar;
        fl.e eVar2;
        e.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        DashboardViewModel dashboardViewModel = this.f50600a;
        eVar = dashboardViewModel.f50499c;
        Iterator it = eVar.k(16, this.f50601b.q()).iterator();
        while (it.hasNext()) {
            eVar2 = dashboardViewModel.f50500d;
            e.c f11 = eVar2.f((Device) it.next());
            if (f11 instanceof e.d) {
                dVar = (e.d) f11;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                dVar.d();
            }
        }
        return y.f85009a;
    }
}
