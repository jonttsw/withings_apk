package com.withings.wiscale2.sleep.ui.edition;

import android.content.Context;
/* compiled from: Hilt_NightEditionActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_NightEditionActivity f60465a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_NightEditionActivity hilt_NightEditionActivity) {
        this.f60465a = hilt_NightEditionActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f60465a.inject();
    }
}
