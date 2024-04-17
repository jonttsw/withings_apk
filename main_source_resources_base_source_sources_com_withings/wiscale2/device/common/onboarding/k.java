package com.withings.wiscale2.device.common.onboarding;

import android.content.Context;
import android.content.SharedPreferences;
import com.withings.device.Device;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: SleepApneaOnboardingPrefs.kt */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f53118a;

    /* compiled from: SleepApneaOnboardingPrefs.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<SharedPreferences> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f53119a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f53119a = context;
        }

        @Override // ym0.a
        public final SharedPreferences invoke() {
            return this.f53119a.getSharedPreferences("SleepApneaOnboardingPrefs", 0);
        }
    }

    public k(Context context) {
        u.j(context, "context");
        this.f53118a = nm0.h.b(new a(context));
    }

    public final boolean a(Device device) {
        Object value = this.f53118a.getValue();
        u.i(value, "getValue(...)");
        long id2 = device.getId();
        return ((SharedPreferences) value).getBoolean("hasSeenSleepApneaOnboarding_" + id2, false);
    }

    public final void b(Device device) {
        u.j(device, "device");
        Object value = this.f53118a.getValue();
        u.i(value, "getValue(...)");
        SharedPreferences.Editor edit = ((SharedPreferences) value).edit();
        long id2 = device.getId();
        edit.putBoolean("hasSeenSleepApneaOnboarding_" + id2, true).apply();
    }
}
