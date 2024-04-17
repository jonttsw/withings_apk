package com.withings.wiscale2.device.common.ui.geoloc;

import kotlinx.coroutines.CoroutineScope;
/* compiled from: WeatherAirQualityViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.geoloc.WeatherAirQualityViewModel$onSaveClicked$1", f = "WeatherAirQualityViewModel.kt", l = {73, 74}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53861a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f53862b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a0 a0Var, qm0.d<? super d0> dVar) {
        super(2, dVar);
        this.f53862b = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d0(this.f53862b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r5.f53861a
            r2 = 2
            r3 = 1
            com.withings.wiscale2.device.common.ui.geoloc.a0 r4 = r5.f53862b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            nm0.l.b(r6)
            goto L6c
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            nm0.l.b(r6)
            goto L5d
        L1e:
            nm0.l.b(r6)
            kotlinx.coroutines.flow.StateFlow r6 = r4.A0()
            java.lang.Object r6 = r6.getValue()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L6c
            kotlinx.coroutines.flow.StateFlow r6 = r4.A0()
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            kotlinx.coroutines.flow.StateFlow r1 = r4.z0()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r6 = r6.get(r1)
            com.withings.wiscale2.device.common.ui.geoloc.a0$a r6 = (com.withings.wiscale2.device.common.ui.geoloc.a0.a) r6
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.withings.wiscale2.device.common.ui.geoloc.a0.g0(r4)
            r5.f53861a = r3
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L5d
            return r0
        L5d:
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.withings.wiscale2.device.common.ui.geoloc.a0.i0(r4)
            r5.f53861a = r2
            java.lang.String r1 = ""
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L6c
            return r0
        L6c:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.ui.geoloc.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
