package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.Hwa10EcgActivationActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class m extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity.c f51814a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Hwa10EcgActivationActivity.c cVar) {
        super(0);
        this.f51814a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f51814a.f51799b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
