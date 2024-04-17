package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayFragment$loadAndShowSecondarySleepTracks$1", f = "SleepDayFragment.kt", l = {495}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class m0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61146a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0 f61147b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Track f61148c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepDayFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayFragment$loadAndShowSecondarySleepTracks$1$napsAndSecondarySleepTrack$1", f = "SleepDayFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super o>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k0 f61149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Track f61150b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0 k0Var, Track track, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61149a = k0Var;
            this.f61150b = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61149a, this.f61150b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            ei0.q qVar = ei0.q.f65441d;
            if (qVar != null) {
                if (qVar != null) {
                    k0 k0Var = this.f61149a;
                    List<Track> E = qVar.E(k0Var.S1().getId(), k0.A1(k0Var));
                    new ei0.v();
                    Track track = this.f61150b;
                    Track d11 = ei0.v.d(track, E);
                    new ei0.v();
                    ArrayList c11 = ei0.v.c(E, track, d11);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c11.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!((Track) next).isInProgress()) {
                            arrayList.add(next);
                        }
                    }
                    return new o(d11, arrayList);
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(k0 k0Var, Track track, qm0.d<? super m0> dVar) {
        super(2, dVar);
        this.f61147b = k0Var;
        this.f61148c = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m0(this.f61147b, this.f61148c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61146a;
        k0 k0Var = this.f61147b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(k0Var, this.f61148c, null);
            this.f61146a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        o oVar = (o) obj;
        k0.I1(k0Var, oVar.a());
        k0.N1(k0Var, oVar.b());
        k0Var.Y1();
        return nm0.y.f85009a;
    }
}
