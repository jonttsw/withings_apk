package com.withings.wiscale2.device.common.feature.ecg;

import java.util.List;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class e4 extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<t5>> f51297a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51298b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f51299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(k1.r0 r0Var, EcgActivationActivity ecgActivationActivity, r8.n nVar) {
        super(1);
        this.f51297a = r0Var;
        this.f51298b = ecgActivationActivity;
        this.f51299c = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        k1.o1<List<t5>> o1Var = this.f51297a;
        List<t5> value = o1Var.getValue();
        LazyColumn.c(value.size(), null, new c4(value), new s1.a(true, -1091073711, new d4(value, this.f51298b, this.f51299c, o1Var)));
        return nm0.y.f85009a;
    }
}
