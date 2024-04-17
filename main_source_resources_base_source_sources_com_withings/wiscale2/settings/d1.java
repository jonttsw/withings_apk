package com.withings.wiscale2.settings;

import com.withings.wiscale2.C1987R;
import qk.ub;
import qk.x9;
import qk.yc;
/* compiled from: PrivacyAndLegals.kt */
/* loaded from: classes5.dex */
final class d1 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.p<String, String, nm0.y> f59959a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59960b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(ym0.p<? super String, ? super String, nm0.y> pVar, ym0.a<nm0.y> aVar) {
        super(3);
        this.f59959a = pVar;
        this.f59960b = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            c1.f(ay.b.u(C1987R.string._Settings_PrivacyLegal_PrivacyPolicy, aVar2), qk.j5.f92985a, ay.b.u(C1987R.string._PRIVACY_POLICY_URL_, aVar2), this.f59959a, aVar2, 0);
            c1.f(ay.b.u(C1987R.string._Settings_PrivacyLegal_Disclaimers, aVar2), x9.f93200a, ay.b.u(C1987R.string._DISCLAIMER_URL_, aVar2), this.f59959a, aVar2, 0);
            c1.f(ay.b.u(C1987R.string._Settings_PrivacyLegal_TermsAndConditions, aVar2), yc.f93218a, ay.b.u(C1987R.string._TERMS_AND_CONDITIONS_URL_, aVar2), this.f59959a, aVar2, 0);
            c1.a(ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising, aVar2), ub.f93157a, this.f59960b, aVar2, 0);
        }
        return nm0.y.f85009a;
    }
}
