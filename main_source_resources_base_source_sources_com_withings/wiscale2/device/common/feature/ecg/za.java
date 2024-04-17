package com.withings.wiscale2.device.common.feature.ecg;

import java.util.List;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class za extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<t5>> f52165a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52166b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f52167c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(k1.r0 r0Var, WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar) {
        super(1);
        this.f52165a = r0Var;
        this.f52166b = wBS08EcgActivationActivity;
        this.f52167c = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        k1.o1<List<t5>> o1Var = this.f52165a;
        List<t5> value = o1Var.getValue();
        LazyColumn.c(value.size(), null, new xa(value), new s1.a(true, -1091073711, new ya(value, this.f52166b, this.f52167c, o1Var)));
        return nm0.y.f85009a;
    }
}
