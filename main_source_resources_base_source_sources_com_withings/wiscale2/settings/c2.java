package com.withings.wiscale2.settings;

import androidx.compose.runtime.a;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class c2 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f59940a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(SettingsActivity settingsActivity) {
        super(3);
        this.f59940a = settingsActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e eVar;
        SettingsActivity settingsActivity;
        androidx.compose.ui.e eVar2;
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string._ANDROID_NOTIFS_DISABLE_PERSISTENT_NOTIF_TITLE_, aVar2);
            SettingsActivity settingsActivity2 = this.f59940a;
            eVar = settingsActivity2.f59746g;
            com.withings.common.compose.component.o.g(eVar, null, null, u11, null, false, false, true, null, null, new z1(settingsActivity2), aVar2, 12582912, 0, 886);
            aVar2.s(-1871497844);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                settingsActivity = settingsActivity2;
                t11 = androidx.compose.runtime.l0.f(settingsActivity.getString(com.withings.wiscale2.d3.a()), androidx.compose.runtime.v0.f8878a);
                aVar2.n(t11);
            } else {
                settingsActivity = settingsActivity2;
            }
            k1.r0 r0Var = (k1.r0) t11;
            aVar2.J();
            String u12 = ay.b.u(C1987R.string.settings_theme, aVar2);
            eVar2 = settingsActivity.f59746g;
            com.withings.common.compose.component.o.o(eVar2, null, u12, null, (String) r0Var.getValue(), true, false, false, null, null, null, new b2(settingsActivity, r0Var), null, aVar2, 196608, 0, 6090);
        }
        return nm0.y.f85009a;
    }
}
