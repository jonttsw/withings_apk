package com.withings.common.compose.component;
/* compiled from: HorizontalPager.kt */
/* loaded from: classes3.dex */
final class e2 extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.layout.s, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k3.d f33734a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<k3.h> f33735b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(k3.d dVar, k1.r0<k3.h> r0Var) {
        super(1);
        this.f33734a = dVar;
        this.f33735b = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.compose.ui.layout.s sVar) {
        androidx.compose.ui.layout.s it = sVar;
        kotlin.jvm.internal.u.j(it, "it");
        k1.r0<k3.h> r0Var = this.f33735b;
        float e11 = r0Var.getValue().e();
        k3.d dVar = this.f33734a;
        if (Float.compare(e11, dVar.u((int) (it.a() & 4294967295L))) < 0) {
            r0Var.setValue(k3.h.a(dVar.u((int) (it.a() & 4294967295L))));
        }
        return nm0.y.f85009a;
    }
}
