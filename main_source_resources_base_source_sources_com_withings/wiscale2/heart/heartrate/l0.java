package com.withings.wiscale2.heart.heartrate;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.vasistas.body.HRZonesAggregate;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$hrZonesAggregate$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_WRONG_GEOIPFORCE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class l0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<HRZonesAggregate>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57687a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57688b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f57689c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f57690d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ActivityAggregate f57691e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e0 e0Var, List<Vasistas> list, ActivityAggregate activityAggregate, qm0.d<? super l0> dVar) {
        super(2, dVar);
        this.f57689c = e0Var;
        this.f57690d = list;
        this.f57691e = activityAggregate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        l0 l0Var = new l0(this.f57689c, this.f57690d, this.f57691e, dVar);
        l0Var.f57688b = obj;
        return l0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<HRZonesAggregate> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((l0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kj0.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57687a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f57688b;
            e0 e0Var = this.f57689c;
            bVar = e0Var.f57598o;
            List<Vasistas> vasistas = this.f57690d;
            kotlin.jvm.internal.u.i(vasistas, "$vasistas");
            HRZonesAggregate b10 = bVar.b(vasistas, true);
            if (b10 == null) {
                b10 = new HRZonesAggregate(0, 0, 127);
            }
            e0.g0(e0Var, b10, this.f57691e);
            this.f57687a = 1;
            if (h0Var.emit(b10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
