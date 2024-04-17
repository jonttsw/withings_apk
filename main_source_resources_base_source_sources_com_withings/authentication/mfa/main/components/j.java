package com.withings.authentication.mfa.main.components;

import androidx.compose.foundation.layout.e1;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import n0.z;
import nm0.y;
import r0.a0;
import ym0.q;
/* compiled from: PhoneComponent.kt */
/* loaded from: classes3.dex */
final class j extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f31706a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar) {
        super(3);
        this.f31706a = fVar;
    }

    @Override // ym0.q
    public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        a0 LabelSwitchCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(LabelSwitchCell, "$this$LabelSwitchCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            z.a(s2.d.a(this.f31706a.b(), aVar2), null, e1.n(androidx.compose.ui.e.f8927a, yk.h.z()), null, null, 0.0f, null, aVar2, 56, 120);
        }
        return y.f85009a;
    }
}
