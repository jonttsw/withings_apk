package com.withings.ecg.heartsound;

import android.content.Context;
/* compiled from: Hilt_HeartSoundListActivity.java */
/* loaded from: classes3.dex */
final class w0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HeartSoundListActivity f38555a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(Hilt_HeartSoundListActivity hilt_HeartSoundListActivity) {
        this.f38555a = hilt_HeartSoundListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f38555a.inject();
    }
}
