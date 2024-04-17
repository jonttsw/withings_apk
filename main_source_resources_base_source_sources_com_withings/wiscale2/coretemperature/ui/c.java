package com.withings.wiscale2.coretemperature.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class c extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreCoreTemperatureActivity.b f50425a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ExploreCoreTemperatureActivity.b bVar) {
        super(0);
        this.f50425a = bVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f50425a.f50417b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
