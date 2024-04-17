package com.withings.ecg.details;

import com.withings.ecg.model.HeartSignalMeasurement;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: EcgDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgDetailsViewModel$hasInReviewEcgLiveData$1$1", f = "EcgDetailsFragment.kt", l = {501}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38277a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38278b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f38279c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b0 f38280d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(HeartSignalMeasurement heartSignalMeasurement, b0 b0Var, qm0.d<? super o0> dVar) {
        super(2, dVar);
        this.f38279c = heartSignalMeasurement;
        this.f38280d = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        o0 o0Var = new o0(this.f38279c, this.f38280d, dVar);
        o0Var.f38278b = obj;
        return o0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((o0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38277a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f38278b;
            boolean z5 = false;
            HeartSignalMeasurement heartSignalMeasurement = this.f38279c;
            if (heartSignalMeasurement != null) {
                if (this.f38280d.f38098b.hasInReviewEcg(heartSignalMeasurement.getUserID(), heartSignalMeasurement.getDeviceId())) {
                    z5 = true;
                }
            }
            Boolean valueOf = Boolean.valueOf(z5);
            this.f38277a = 1;
            if (h0Var.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
