package com.withings.weight.legacy;

import android.content.Context;
/* compiled from: Hilt_WeightDetailActivity.java */
/* loaded from: classes4.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WeightDetailActivity f47023a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_WeightDetailActivity hilt_WeightDetailActivity) {
        this.f47023a = hilt_WeightDetailActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f47023a.inject();
    }
}
