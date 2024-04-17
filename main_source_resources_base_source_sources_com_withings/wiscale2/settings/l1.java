package com.withings.wiscale2.settings;

import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class l1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60179a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(SettingsActivity settingsActivity) {
        super(0);
        this.f60179a = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Integer valueOf = Integer.valueOf((int) C1987R.string.settings_rgpdDownloadYourData);
        SettingsActivity settingsActivity = this.f60179a;
        settingsActivity.startActivity(aVar.b(settingsActivity, valueOf, C1987R.string.settings_rgpdDownloadYourDataLink));
        return nm0.y.f85009a;
    }
}
