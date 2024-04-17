package com.withings.wiscale2.settings;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class w1 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60357a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f60358b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60359c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60360d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60361e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f60362f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f60363g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(SettingsActivity settingsActivity, boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, CoroutineScope coroutineScope, e.n<Intent, ActivityResult> nVar) {
        super(3);
        this.f60357a = settingsActivity;
        this.f60358b = z5;
        this.f60359c = aVar;
        this.f60360d = aVar2;
        this.f60361e = aVar3;
        this.f60362f = coroutineScope;
        this.f60363g = nVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e eVar;
        androidx.compose.ui.e eVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.ui.e eVar3;
        androidx.compose.ui.e eVar4;
        androidx.compose.ui.e eVar5;
        androidx.compose.ui.e eVar6;
        androidx.compose.ui.e eVar7;
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar3 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar3.h()) {
            aVar3.C();
        } else {
            SettingsActivity settingsActivity = this.f60357a;
            eVar = settingsActivity.f59746g;
            com.withings.common.compose.component.o.g(eVar, s1.b.b(aVar3, 1888152477, new m1(settingsActivity)), null, ay.b.u(C1987R.string._PROFILE_, aVar3), null, false, false, true, null, null, new o1(this.f60362f, settingsActivity), aVar3, 12582960, 0, 884);
            String u11 = ay.b.u(C1987R.string._MENU_UNITS_, aVar3);
            eVar2 = settingsActivity.f59746g;
            com.withings.common.compose.component.o.g(eVar2, s1.b.b(aVar3, 1463800788, new p1(settingsActivity)), null, u11, null, true, false, true, null, null, new q1(this.f60363g, settingsActivity), aVar3, 12779568, 0, 852);
            aVar3.s(-1252040669);
            if (this.f60358b) {
                String u12 = ay.b.u(C1987R.string.settings_account_security, aVar3);
                eVar7 = settingsActivity.f59746g;
                aVar2 = aVar3;
                com.withings.common.compose.component.o.g(eVar7, s1.b.b(aVar3, 1302497272, new r1(settingsActivity)), null, u12, null, true, false, true, null, null, this.f60359c, aVar3, 12779568, 0, 852);
            } else {
                aVar2 = aVar3;
            }
            aVar2.J();
            androidx.compose.runtime.a aVar4 = aVar2;
            String u13 = ay.b.u(C1987R.string.settings_rgpdEmailAndNotification, aVar4);
            eVar3 = settingsActivity.f59746g;
            com.withings.common.compose.component.o.g(eVar3, s1.b.b(aVar4, -1612886891, new s1(settingsActivity)), null, u13, null, true, false, true, null, null, this.f60360d, aVar4, 12779568, 0, 852);
            String u14 = ay.b.u(C1987R.string.settings_privacy_legal, aVar4);
            eVar4 = settingsActivity.f59746g;
            com.withings.common.compose.component.o.g(eVar4, s1.b.b(aVar4, -394607274, new t1(settingsActivity)), null, u14, null, true, false, true, null, null, this.f60361e, aVar4, 12779568, 0, 852);
            String u15 = ay.b.u(C1987R.string._HELP_, aVar4);
            eVar5 = settingsActivity.f59746g;
            com.withings.common.compose.component.o.g(eVar5, s1.b.b(aVar4, 823672343, new u1(settingsActivity)), null, u15, null, true, false, true, null, null, new v1(settingsActivity), aVar4, 12779568, 0, 852);
            String u16 = ay.b.u(C1987R.string.settings_rgpdDownloadYourData, aVar4);
            eVar6 = settingsActivity.f59746g;
            com.withings.common.compose.component.o.g(eVar6, s1.b.b(aVar4, 2041951960, new k1(settingsActivity)), null, u16, null, true, false, true, null, null, new l1(settingsActivity), aVar4, 12779568, 0, 852);
        }
        return nm0.y.f85009a;
    }
}
