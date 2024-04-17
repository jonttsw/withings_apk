package com.withings.wiscale2.device.common.feature.highlowhr;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRActivationActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRActivationActivity.d f52305a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(HighLowHRActivationActivity.d dVar) {
        super(0);
        this.f52305a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f52305a.f52193b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
