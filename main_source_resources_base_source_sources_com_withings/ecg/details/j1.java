package com.withings.ecg.details;

import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: EcgInReviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgInReviewViewModel$hasInReviewEcgLiveData$1$1", f = "EcgInReviewViewModel.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38243a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38244b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f38245c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ EcgInReviewViewModel f38246d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(HeartSignalMeasurement heartSignalMeasurement, EcgInReviewViewModel ecgInReviewViewModel, qm0.d<? super j1> dVar) {
        super(2, dVar);
        this.f38245c = heartSignalMeasurement;
        this.f38246d = ecgInReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        j1 j1Var = new j1(this.f38245c, this.f38246d, dVar);
        j1Var.f38244b = obj;
        return j1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((j1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HeartSignalRepository heartSignalRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38243a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f38244b;
            boolean z5 = false;
            HeartSignalMeasurement heartSignalMeasurement = this.f38245c;
            if (heartSignalMeasurement != null) {
                long userID = heartSignalMeasurement.getUserID();
                heartSignalRepository = this.f38246d.f38002e;
                if (heartSignalRepository.hasInReviewEcg(userID, heartSignalMeasurement.getDeviceId())) {
                    z5 = true;
                }
            }
            Boolean valueOf = Boolean.valueOf(z5);
            this.f38243a = 1;
            if (h0Var.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
