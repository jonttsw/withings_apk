package com.withings.wiscale2.device.common.onboarding;

import android.content.Context;
/* compiled from: Hilt_SleepApneaOnboardingActivity.java */
/* loaded from: classes5.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepApneaOnboardingActivity f53090a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_SleepApneaOnboardingActivity hilt_SleepApneaOnboardingActivity) {
        this.f53090a = hilt_SleepApneaOnboardingActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f53090a.inject();
    }
}
