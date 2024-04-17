package com.withings.wiscale2.weight.list;

import android.content.Context;
/* compiled from: Hilt_WeightListActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WeightListActivity f62915a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_WeightListActivity hilt_WeightListActivity) {
        this.f62915a = hilt_WeightListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62915a.inject();
    }
}
