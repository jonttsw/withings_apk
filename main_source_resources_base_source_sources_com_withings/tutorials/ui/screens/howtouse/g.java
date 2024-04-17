package com.withings.tutorials.ui.screens.howtouse;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.tutorials.ui.screens.howtouse.HowToTakeAMeasurementActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HowToTakeAMeasurementActivity.c f45415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HowToTakeAMeasurementActivity.c cVar) {
        super(0);
        this.f45415a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f45415a.f45357b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
