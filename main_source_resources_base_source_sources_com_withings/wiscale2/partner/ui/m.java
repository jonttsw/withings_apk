package com.withings.wiscale2.partner.ui;

import android.content.Context;
/* compiled from: Hilt_PartnerActivity.java */
/* loaded from: classes5.dex */
final class m implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_PartnerActivity f59158a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Hilt_PartnerActivity hilt_PartnerActivity) {
        this.f59158a = hilt_PartnerActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f59158a.inject();
    }
}
