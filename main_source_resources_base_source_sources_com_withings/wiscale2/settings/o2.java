package com.withings.wiscale2.settings;

import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class o2 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60223a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(SettingsActivity settingsActivity) {
        super(3);
        this.f60223a = settingsActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e eVar;
        androidx.compose.ui.e eVar2;
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string.settings_rate_withings, aVar2);
            SettingsActivity settingsActivity = this.f60223a;
            eVar = settingsActivity.f59746g;
            com.withings.common.compose.component.o.g(eVar, s1.b.b(aVar2, -1168549459, new k2(settingsActivity)), null, u11, null, false, false, true, null, null, new l2(settingsActivity), aVar2, 12582960, 0, 884);
            String u12 = ay.b.u(C1987R.string.settings_share_app, aVar2);
            eVar2 = settingsActivity.f59746g;
            com.withings.common.compose.component.o.g(eVar2, s1.b.b(aVar2, 1149194980, new m2(settingsActivity)), null, u12, null, true, false, true, null, null, new n2(settingsActivity), aVar2, 12779568, 0, 852);
        }
        return nm0.y.f85009a;
    }
}
