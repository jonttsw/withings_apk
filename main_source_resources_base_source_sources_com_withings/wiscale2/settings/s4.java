package com.withings.wiscale2.settings;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class s4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60294a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60295b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ nm0.g<SettingsViewModel> f60296c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60297d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60298e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(SettingsActivity settingsActivity, k1.r0 r0Var, androidx.lifecycle.i1 i1Var, k1.r0 r0Var2, k1.r0 r0Var3) {
        super(2);
        this.f60294a = settingsActivity;
        this.f60295b = r0Var;
        this.f60296c = i1Var;
        this.f60297d = r0Var2;
        this.f60298e = r0Var3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        nm0.g<SettingsViewModel> gVar;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(1210942037);
            k1.r0<Boolean> r0Var = this.f60295b;
            boolean booleanValue = r0Var.getValue().booleanValue();
            nm0.g<SettingsViewModel> gVar2 = this.f60296c;
            if (booleanValue) {
                String u11 = ay.b.u(C1987R.string._CANCEL_, aVar2);
                String u12 = ay.b.u(C1987R.string._SEND_, aVar2);
                String u13 = ay.b.u(C1987R.string._NO_VALID_MAIL_ADDRESS_ERROR_MESSAGE_, aVar2);
                String u14 = ay.b.u(C1987R.string._CHANGE_PASSWORD_, aVar2);
                aVar2.s(1210942903);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = new z3(r0Var);
                    aVar2.n(t11);
                }
                ym0.a aVar3 = (ym0.a) t11;
                aVar2.J();
                a4 a4Var = new a4(r0Var, gVar2);
                aVar2.s(1210942596);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = new b4(r0Var);
                    aVar2.n(t12);
                }
                aVar2.J();
                gVar = gVar2;
                wk.p.a(aVar3, u14, u13, u12, 0L, a4Var, u11, 0L, (ym0.a) t12, aVar2, 100663302, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
            } else {
                gVar = gVar2;
            }
            aVar2.J();
            xb.b v11 = androidx.activity.b0.v(aVar2);
            k1.r0 a11 = h6.b.a(gVar.getValue().B0(), Boolean.FALSE, aVar2, 56);
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            com.withings.common.compose.component.z4 b10 = com.withings.common.compose.component.x4.b(aVar2);
            c11.D().b(v11);
            xb.a.a(v11, androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), wk.h.d(), 0.0f, 0L, 0L, 0L, s1.b.b(aVar2, -1229914282, new q4(this.f60297d, this.f60298e, a11, c11, b10, this.f60294a, this.f60296c)), aVar2, 12582968, 120);
            if (SettingsActivity.G3(this.f60294a)) {
                k1.y.f("Navigate-Two-Factor-See", new r4(c11, null), aVar2);
            }
        }
        return nm0.y.f85009a;
    }
}
