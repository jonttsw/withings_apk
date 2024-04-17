package com.withings.common.compose.component;
/* compiled from: UserDropDownMenuWithings.kt */
/* loaded from: classes3.dex */
final class o5 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<Long, nm0.y> f34501a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p5 f34502b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f34503c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o5(ym0.l<? super Long, nm0.y> lVar, p5 p5Var, k1.r0<Boolean> r0Var) {
        super(0);
        this.f34501a = lVar;
        this.f34502b = p5Var;
        this.f34503c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f34501a.invoke(Long.valueOf(this.f34502b.c()));
        this.f34503c.setValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}
