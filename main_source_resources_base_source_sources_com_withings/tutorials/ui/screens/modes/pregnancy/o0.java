package com.withings.tutorials.ui.screens.modes.pregnancy;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PregnancyModeActivity.kt */
/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f46003a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String str) {
        super(1);
        this.f46003a = str;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.navigation.b0 b0Var) {
        androidx.navigation.b0 b0Var2 = b0Var;
        kotlin.jvm.internal.u.j(b0Var2, "$this$null");
        if (kotlin.jvm.internal.u.e(this.f46003a, "enabledFeature")) {
            b0Var2.d("disabledFeatures", androidx.navigation.a0.f17137a);
        }
        return nm0.y.f85009a;
    }
}
