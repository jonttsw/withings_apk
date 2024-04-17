package com.withings.wiscale2.settings;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60256a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(k1.r0<String> r0Var) {
        super(1);
        this.f60256a = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        this.f60256a.setValue(it);
        return nm0.y.f85009a;
    }
}
