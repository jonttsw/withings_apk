package com.withings.common.compose.component;
/* compiled from: ExpandableText.kt */
/* loaded from: classes3.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.text.b0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f34980a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(k1.r0<Boolean> r0Var) {
        super(1);
        this.f34980a = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.compose.ui.text.b0 b0Var) {
        androidx.compose.ui.text.b0 textLayoutResult = b0Var;
        kotlin.jvm.internal.u.j(textLayoutResult, "textLayoutResult");
        this.f34980a.setValue(Boolean.valueOf(textLayoutResult.h()));
        return nm0.y.f85009a;
    }
}
