package com.withings.wiscale2.device.common.screen.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.device.common.screen.ui.ScreenSelectionActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity.p f53409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ScreenSelectionActivity.p pVar) {
        super(0);
        this.f53409a = pVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f53409a.f53158b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
