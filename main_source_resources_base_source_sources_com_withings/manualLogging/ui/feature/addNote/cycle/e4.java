package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.manualLogging.ui.feature.addNote.cycle.CycleTrackingSymptomsAndPeriodManualLoggingActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class e4 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingSymptomsAndPeriodManualLoggingActivity.c f40991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(CycleTrackingSymptomsAndPeriodManualLoggingActivity.c cVar) {
        super(0);
        this.f40991a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f40991a.f40820b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
