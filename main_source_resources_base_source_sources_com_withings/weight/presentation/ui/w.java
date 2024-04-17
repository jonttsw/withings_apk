package com.withings.weight.presentation.ui;

import android.content.Context;
/* compiled from: Hilt_WeightActivity.java */
/* loaded from: classes4.dex */
final class w implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WeightActivity f47306a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Hilt_WeightActivity hilt_WeightActivity) {
        this.f47306a = hilt_WeightActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f47306a.inject();
    }
}
