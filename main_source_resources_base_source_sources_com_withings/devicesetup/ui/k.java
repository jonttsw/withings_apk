package com.withings.devicesetup.ui;

import android.view.View;
/* compiled from: SetupScanResultFragment.java */
/* loaded from: classes3.dex */
final class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f37948a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(i iVar) {
        this.f37948a = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f37948a;
        if (iVar.f37931c != null) {
            iVar.f37931c.J2();
        }
    }
}
