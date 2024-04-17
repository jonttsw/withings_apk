package com.withings.survey.ui;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class j extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.l1 f44353a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f44354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.compose.ui.platform.l1 l1Var, k1.r0<String> r0Var) {
        super(0);
        this.f44353a = l1Var;
        this.f44354b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f44354b.setValue(String.valueOf(this.f44353a.a()));
        return nm0.y.f85009a;
    }
}
