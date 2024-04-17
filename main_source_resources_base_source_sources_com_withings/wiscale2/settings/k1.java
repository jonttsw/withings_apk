package com.withings.wiscale2.settings;

import com.withings.wiscale2.C1987R;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class k1 extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60100a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(SettingsActivity settingsActivity) {
        super(3);
        this.f60100a = settingsActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        r0.a0 LabelCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            this.f60100a.z3(C1987R.drawable.ic_utilitary_import, aVar2, 64);
        }
        return nm0.y.f85009a;
    }
}
