package com.withings.common.compose.component;
/* compiled from: TopAppBar.kt */
/* loaded from: classes3.dex */
final class j5 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33936a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f33937b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(k1.r0 r0Var, ym0.a aVar) {
        super(0);
        this.f33936a = aVar;
        this.f33937b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ym0.a<nm0.y> aVar = this.f33936a;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f33937b.setValue(Boolean.TRUE);
        return nm0.y.f85009a;
    }
}
