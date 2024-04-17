package com.withings.common.compose.component;
/* compiled from: GridSelector.kt */
/* loaded from: classes3.dex */
final class r1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q1 f34636a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<q1, nm0.y> f34637b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Integer> f34638c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(q1 q1Var, ym0.l<? super q1, nm0.y> lVar, k1.r0<Integer> r0Var) {
        super(0);
        this.f34636a = q1Var;
        this.f34637b = lVar;
        this.f34638c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        q1 q1Var = this.f34636a;
        this.f34638c.setValue(Integer.valueOf(q1Var.getId()));
        this.f34637b.invoke(q1Var);
        return nm0.y.f85009a;
    }
}
