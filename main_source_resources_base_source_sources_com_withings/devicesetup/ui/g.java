package com.withings.devicesetup.ui;

import android.view.View;
import com.withings.devicesetup.ui.h;
/* compiled from: SetupErrorFragment.java */
/* loaded from: classes3.dex */
final class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f37915a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(h hVar) {
        this.f37915a = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.b bVar;
        h.b bVar2;
        h hVar = this.f37915a;
        bVar = hVar.f37920g;
        if (bVar != null) {
            bVar2 = hVar.f37920g;
            bVar2.g0();
        }
    }
}
