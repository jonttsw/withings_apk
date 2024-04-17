package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.manualLogging.core.entity.MoodLevel;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* compiled from: SleepDayViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayViewModel$saveSleepFeeling$1", f = "SleepDayViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class o1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j1 f61181a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ vx.e f61182b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(j1 j1Var, vx.e eVar, qm0.d<? super o1> dVar) {
        super(2, dVar);
        this.f61181a = j1Var;
        this.f61182b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new o1(this.f61181a, this.f61182b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((o1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        Long l5;
        hx.n nVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        j1 j1Var = this.f61181a;
        j0Var = j1Var.f61039o;
        Track track = (Track) j0Var.getValue();
        if (track != null) {
            j0Var2 = j1Var.f61040p;
            fx.g gVar = (fx.g) j0Var2.getValue();
            if (gVar != null) {
                l5 = gVar.b();
            } else {
                l5 = null;
            }
            Long l6 = l5;
            Long id2 = track.getId();
            long userId = track.getUserId();
            MoodLevel b10 = this.f61182b.b();
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.g(now);
            fx.g gVar2 = new fx.g(l6, id2, b10, userId, now, false, false, 32);
            nVar = j1Var.f61034j;
            nVar.a(gVar2);
        }
        return nm0.y.f85009a;
    }
}
