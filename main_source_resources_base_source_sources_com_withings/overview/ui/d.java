package com.withings.overview.ui;

import android.net.Uri;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import nm0.y;
import ym0.l;
/* compiled from: StartTrackingActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class d extends s implements l<String, y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(StartTrackingActivity startTrackingActivity) {
        super(1, startTrackingActivity, StartTrackingActivity.class, "onButtonClick", "onButtonClick(Ljava/lang/String;)V", 0);
    }

    @Override // ym0.l
    public final /* bridge */ /* synthetic */ y invoke(String str) {
        m(str);
        return y.f85009a;
    }

    public final void m(String p02) {
        u.j(p02, "p0");
        StartTrackingActivity startTrackingActivity = (StartTrackingActivity) this.receiver;
        int i11 = StartTrackingActivity.f43343h;
        startTrackingActivity.getClass();
        gm.b.f69354a.e(Uri.parse(p02), new c(startTrackingActivity));
    }
}
