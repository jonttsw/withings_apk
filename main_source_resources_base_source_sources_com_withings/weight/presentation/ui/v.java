package com.withings.weight.presentation.ui;

import android.content.Context;
/* compiled from: Hilt_BodyCompositionActivity.java */
/* loaded from: classes4.dex */
final class v implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_BodyCompositionActivity f47304a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Hilt_BodyCompositionActivity hilt_BodyCompositionActivity) {
        this.f47304a = hilt_BodyCompositionActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f47304a.inject();
    }
}
