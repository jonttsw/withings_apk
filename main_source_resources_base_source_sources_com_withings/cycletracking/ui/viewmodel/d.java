package com.withings.cycletracking.ui.viewmodel;

import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingFactorEditionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorEditionViewModel$setAndCheckDateValidity$1", f = "CycleTrackingFactorEditionViewModel.kt", l = {113, 114, 124}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35888a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f35889b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ fr.a f35890c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, fr.a aVar, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f35889b = cVar;
        this.f35890c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f35889b, this.f35890c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0155, code lost:
        if (r7 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.viewmodel.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
