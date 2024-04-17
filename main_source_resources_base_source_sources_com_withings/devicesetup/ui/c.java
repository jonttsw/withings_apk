package com.withings.devicesetup.ui;

import android.view.View;
import com.withings.devicesetup.Setup;
/* compiled from: SetupBatteryLowFragment.java */
/* loaded from: classes3.dex */
final class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f37898a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(d dVar) {
        this.f37898a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Setup.WithBatteryCheck withBatteryCheck;
        d dVar = this.f37898a;
        withBatteryCheck = dVar.f37899c;
        dVar.startActivity(withBatteryCheck.x2(dVar.getContext()));
    }
}
