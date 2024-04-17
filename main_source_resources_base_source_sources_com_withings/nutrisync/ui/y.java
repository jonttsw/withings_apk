package com.withings.nutrisync.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.nutrisync.ui.VitaminCDatavizActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VitaminCDatavizActivity.b f43337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(VitaminCDatavizActivity.b bVar) {
        super(0);
        this.f43337a = bVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f43337a.f43211b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
