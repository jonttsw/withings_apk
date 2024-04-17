package com.withings.fever.ui.temperatureList;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.fever.ui.temperatureList.TemperatureListActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class l extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TemperatureListActivity.b f39439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TemperatureListActivity.b bVar) {
        super(0);
        this.f39439a = bVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f39439a.f39423b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
