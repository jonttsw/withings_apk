package com.withings.nervehealth.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.nervehealth.ui.NerveHealthMeasureListActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class n0 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity.e f42755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(NerveHealthMeasureListActivity.e eVar) {
        super(0);
        this.f42755a = eVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f42755a.f42400b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
