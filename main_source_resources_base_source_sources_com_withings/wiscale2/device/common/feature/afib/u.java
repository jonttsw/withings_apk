package com.withings.wiscale2.device.common.feature.afib;

import android.content.Context;
/* compiled from: Hilt_AfibActivationActivity.java */
/* loaded from: classes5.dex */
final class u implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AfibActivationActivity f51046a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Hilt_AfibActivationActivity hilt_AfibActivationActivity) {
        this.f51046a = hilt_AfibActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f51046a.inject();
    }
}
