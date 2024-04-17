package com.withings.cycletracking.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.cycletracking.ui.CycleTrackingActivity;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity.b f35747a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(CycleTrackingActivity.b bVar) {
        super(0);
        this.f35747a = bVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f35747a.f35479b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
