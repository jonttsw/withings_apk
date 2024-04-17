package com.withings.wiscale2.activity;

import android.content.Context;
/* compiled from: Hilt_ActivityActivity.java */
/* loaded from: classes4.dex */
final class i implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ActivityActivity f48279a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Hilt_ActivityActivity hilt_ActivityActivity) {
        this.f48279a = hilt_ActivityActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f48279a.inject();
    }
}
