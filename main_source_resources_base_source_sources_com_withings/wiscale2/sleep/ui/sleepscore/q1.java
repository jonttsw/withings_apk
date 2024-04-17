package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.p4;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: SleepDayViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayViewModel$sleepDataLiveData$1$1", f = "SleepDayViewModel.kt", l = {84, 85}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class q1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<p4>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61197a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f61198b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j1 f61199c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Track f61200d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(j1 j1Var, Track track, qm0.d<? super q1> dVar) {
        super(2, dVar);
        this.f61199c = j1Var;
        this.f61200d = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        q1 q1Var = new q1(this.f61199c, this.f61200d, dVar);
        q1Var.f61198b = obj;
        return q1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<p4> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((q1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        ei0.q qVar;
        lj0.h0 h0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61197a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f61198b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f61198b;
            p4.b bVar = p4.b.f61192a;
            this.f61198b = h0Var;
            this.f61197a = 1;
            if (h0Var.emit(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        j1 j1Var = this.f61199c;
        qVar = j1Var.f61031g;
        h0Var2 = j1Var.f61032h;
        qVar.getClass();
        p4.a aVar = new p4.a(ei0.q.B(this.f61200d, h0Var2));
        this.f61198b = null;
        this.f61197a = 2;
        if (h0Var.emit(aVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
