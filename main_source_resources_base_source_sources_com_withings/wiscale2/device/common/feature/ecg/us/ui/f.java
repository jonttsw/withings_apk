package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.device.common.feature.ecg.us.ui.EcgReviewActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class f extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgReviewActivity.b f52005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EcgReviewActivity.b bVar) {
        super(0);
        this.f52005a = bVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f52005a.f51993b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
