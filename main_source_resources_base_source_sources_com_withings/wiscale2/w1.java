package com.withings.wiscale2;

import android.content.Context;
/* compiled from: Hilt_ShareWithMyDoctorActivity.java */
/* loaded from: classes4.dex */
final class w1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ShareWithMyDoctorActivity f62891a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1(Hilt_ShareWithMyDoctorActivity hilt_ShareWithMyDoctorActivity) {
        this.f62891a = hilt_ShareWithMyDoctorActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62891a.inject();
    }
}
