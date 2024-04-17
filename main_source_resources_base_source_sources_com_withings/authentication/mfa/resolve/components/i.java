package com.withings.authentication.mfa.resolve.components;

import d2.g0;
import d2.t;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import n0.z;
import nm0.y;
import r0.a0;
import ym0.q;
/* compiled from: SelectFactorBottomSheet.kt */
/* loaded from: classes3.dex */
final class i extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthFactorContent f32030a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AuthFactorContent authFactorContent) {
        super(3);
        this.f32030a = authFactorContent;
    }

    @Override // ym0.q
    public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        t a11;
        a0 LabelValueCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(LabelValueCell, "$this$LabelValueCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            AuthFactorContent authFactorContent = this.f32030a;
            g2.c a12 = s2.d.a(authFactorContent.d(), aVar2);
            Integer a13 = authFactorContent.a();
            aVar2.s(-693052549);
            if (a13 == null) {
                a11 = null;
            } else {
                a11 = g0.a.a(5, s2.b.a(a13.intValue(), aVar2));
            }
            t tVar = a11;
            aVar2.J();
            z.a(a12, null, null, null, null, 0.0f, tVar, aVar2, 56, 60);
        }
        return y.f85009a;
    }
}
