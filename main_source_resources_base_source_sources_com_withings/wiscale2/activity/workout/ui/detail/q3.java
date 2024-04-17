package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.device.Device;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WorkoutDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$createHasDeviceWithAssistedGpsLiveData$2", f = "WorkoutDetailViewModel.kt", l = {615}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class q3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49559a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49560b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ kn.e f49561c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j3 f49562d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Track f49563e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ gl.e0 f49564f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(kn.e eVar, j3 j3Var, Track track, gl.e0 e0Var, qm0.d<? super q3> dVar) {
        super(2, dVar);
        this.f49561c = eVar;
        this.f49562d = j3Var;
        this.f49563e = track;
        this.f49564f = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        q3 q3Var = new q3(this.f49561c, this.f49562d, this.f49563e, this.f49564f, dVar);
        q3Var.f49560b = obj;
        return q3Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((q3) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49559a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f49560b;
            ArrayList j5 = this.f49561c.j(this.f49562d.f49250a.q(), this.f49563e.getDeviceModel());
            boolean z5 = false;
            if (!j5.isEmpty()) {
                Iterator it = j5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (this.f49564f.N(((Device) it.next()).getFirmware())) {
                        z5 = true;
                        break;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z5);
            this.f49559a = 1;
            if (h0Var.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
