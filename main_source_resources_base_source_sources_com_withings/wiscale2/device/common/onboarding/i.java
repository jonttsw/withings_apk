package com.withings.wiscale2.device.common.onboarding;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class i implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepApneaOnboardingActivity f53117a;

    public i(SleepApneaOnboardingActivity sleepApneaOnboardingActivity) {
        this.f53117a = sleepApneaOnboardingActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        boolean K3;
        u.j(modelClass, "modelClass");
        SleepApneaOnboardingActivity sleepApneaOnboardingActivity = this.f53117a;
        e eVar = sleepApneaOnboardingActivity.f53062e;
        if (eVar != null) {
            Device C3 = SleepApneaOnboardingActivity.C3(sleepApneaOnboardingActivity);
            K3 = sleepApneaOnboardingActivity.K3();
            return eVar.a(C3, K3);
        }
        u.s("viewModelFactory");
        throw null;
    }
}
