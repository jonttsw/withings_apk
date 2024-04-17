package com.withings.wiscale2.vo2max.view;
/* compiled from: Vo2MaxImprovement.kt */
/* loaded from: classes5.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q0 f62780a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q0 q0Var) {
        super(1);
        this.f62780a = q0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            q0.e(this.f62780a).setText(str2);
        }
        return nm0.y.f85009a;
    }
}
