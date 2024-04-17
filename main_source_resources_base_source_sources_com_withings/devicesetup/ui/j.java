package com.withings.devicesetup.ui;

import android.view.View;
/* compiled from: SetupScanResultFragment.java */
/* loaded from: classes3.dex */
final class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f37947a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(i iVar) {
        this.f37947a = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f37947a;
        if (iVar.f37931c != null) {
            iVar.f37931c.q1();
        }
    }
}
