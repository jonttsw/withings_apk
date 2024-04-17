package com.withings.devicesetup.ui;

import android.view.View;
import com.withings.devicesetup.ui.d;
/* compiled from: SetupBatteryLowFragment.java */
/* loaded from: classes3.dex */
final class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f37897a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(d dVar) {
        this.f37897a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d.a aVar;
        d.a aVar2;
        d dVar = this.f37897a;
        aVar = dVar.f37905i;
        if (aVar != null) {
            aVar2 = dVar.f37905i;
            aVar2.Q();
        }
    }
}
