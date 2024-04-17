package com.withings.ecg.details;

import com.withings.ecg.model.HeartSignalMeasurement;
/* compiled from: EcgDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgMediatorLiveData$reload$1$1", f = "EcgDetailsFragment.kt", l = {776, 776}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class z1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<HeartSignalMeasurement>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38367a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38368b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f38369c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a2 f38370d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(HeartSignalMeasurement heartSignalMeasurement, a2 a2Var, qm0.d<? super z1> dVar) {
        super(2, dVar);
        this.f38369c = heartSignalMeasurement;
        this.f38370d = a2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        z1 z1Var = new z1(this.f38369c, this.f38370d, dVar);
        z1Var.f38368b = obj;
        return z1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<HeartSignalMeasurement> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((z1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f38367a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            nm0.l.b(r7)
            goto L4d
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            java.lang.Object r1 = r6.f38368b
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            nm0.l.b(r7)
            goto L3e
        L21:
            nm0.l.b(r7)
            java.lang.Object r7 = r6.f38368b
            r1 = r7
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            com.withings.ecg.model.HeartSignalMeasurement r7 = r6.f38369c
            if (r7 == 0) goto L41
            com.withings.ecg.details.a2 r5 = r6.f38370d
            com.withings.ecg.model.HeartSignalMeasurementFixer r5 = com.withings.ecg.details.a2.t(r5)
            r6.f38368b = r1
            r6.f38367a = r4
            java.lang.Object r7 = r5.fix(r7, r6)
            if (r7 != r0) goto L3e
            return r0
        L3e:
            com.withings.ecg.model.HeartSignalMeasurement r7 = (com.withings.ecg.model.HeartSignalMeasurement) r7
            goto L42
        L41:
            r7 = r2
        L42:
            r6.f38368b = r2
            r6.f38367a = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L4d
            return r0
        L4d:
            nm0.y r7 = nm0.y.f85009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.details.z1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
