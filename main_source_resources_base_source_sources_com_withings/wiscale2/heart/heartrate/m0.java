package com.withings.wiscale2.heart.heartrate;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$loadingState$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_WRONG_SHARINGSERVERID, ConstantsWs.WS_STATUS_WRONG_SHARINGAPPROVAL, ConstantsWs.WS_STATUS_PROASSOCIATIONMISMATCH, ConstantsWs.WS_STATUS_WRONGTYPE, ConstantsWs.WS_STATUS_WRONGAPPPFM, ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class m0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<LoadingState>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f57696a;

    /* renamed from: b  reason: collision with root package name */
    int f57697b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f57698c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ActivityAggregate f57699d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e0 f57700e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ActivityAggregate activityAggregate, e0 e0Var, qm0.d<? super m0> dVar) {
        super(2, dVar);
        this.f57699d = activityAggregate;
        this.f57700e = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        m0 m0Var = new m0(this.f57699d, this.f57700e, dVar);
        m0Var.f57698c = obj;
        return m0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<LoadingState> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((m0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.heartrate.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
