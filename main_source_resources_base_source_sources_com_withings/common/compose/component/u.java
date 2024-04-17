package com.withings.common.compose.component;
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.text.b0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Integer> f34763a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k1.r0<Integer> r0Var) {
        super(1);
        this.f34763a = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.compose.ui.text.b0 b0Var) {
        androidx.compose.ui.text.b0 it = b0Var;
        kotlin.jvm.internal.u.j(it, "it");
        Integer valueOf = Integer.valueOf(it.m());
        int i11 = o.f34222b;
        this.f34763a.setValue(valueOf);
        return nm0.y.f85009a;
    }
}
