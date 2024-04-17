package com.withings.wiscale2.measure.list;

import android.content.Context;
/* compiled from: Hilt_MeasureListActivity.java */
/* loaded from: classes5.dex */
final class c implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_MeasureListActivity f58531a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Hilt_MeasureListActivity hilt_MeasureListActivity) {
        this.f58531a = hilt_MeasureListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f58531a.inject();
    }
}
