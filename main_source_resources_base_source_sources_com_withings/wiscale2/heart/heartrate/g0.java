package com.withings.wiscale2.heart.heartrate;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$bodyVasistas$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGTOKEN}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<Vasistas>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57648a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57649b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f57650c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Track> f57651d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e0 e0Var, List<Track> list, qm0.d<? super g0> dVar) {
        super(2, dVar);
        this.f57650c = e0Var;
        this.f57651d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        g0 g0Var = new g0(this.f57650c, this.f57651d, dVar);
        g0Var.f57649b = obj;
        return g0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<Vasistas>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((g0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57648a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f57649b;
            List<Vasistas> A0 = e0.A0(this.f57650c, Vasistas.Category.BODY);
            for (Vasistas vasistas : A0) {
                for (Track track : this.f57651d) {
                    if (hn.a.c(vasistas.getStartDate(), track.getStartDate(), track.getEndDate())) {
                        vasistas.setType(Vasistas.VasistasType.SLEEP);
                    }
                }
            }
            this.f57648a = 1;
            if (h0Var.emit(A0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
