package com.withings.wiscale2.device.common.feature.activitygoal;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.device.common.feature.activitygoal.SetFitnessAndStepsGoalActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetFitnessAndStepsGoalActivity.b f50970a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(SetFitnessAndStepsGoalActivity.b bVar) {
        super(0);
        this.f50970a = bVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f50970a.f50907b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
