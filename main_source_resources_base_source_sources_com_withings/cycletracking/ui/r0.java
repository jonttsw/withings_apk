package com.withings.cycletracking.ui;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingActivity", f = "CycleTrackingActivity.kt", l = {ConstantsWs.WS_STATUS_IPUSHERROR}, m = "onShareHealthReport")
/* loaded from: classes3.dex */
public final class r0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    CycleTrackingActivity f35738a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f35739b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35740c;

    /* renamed from: d  reason: collision with root package name */
    int f35741d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(CycleTrackingActivity cycleTrackingActivity, qm0.d<? super r0> dVar) {
        super(dVar);
        this.f35740c = cycleTrackingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f35739b = obj;
        this.f35741d |= Integer.MIN_VALUE;
        return CycleTrackingActivity.E3(this.f35740c, this);
    }
}
