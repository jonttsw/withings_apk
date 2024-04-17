package com.withings.fever.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.fever.ui.BodyTemperatureActivity;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyTemperatureActivity.b f39289a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BodyTemperatureActivity.b bVar) {
        super(0);
        this.f39289a = bVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f39289a.f39209b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
