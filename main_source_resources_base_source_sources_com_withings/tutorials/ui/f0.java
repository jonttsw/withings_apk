package com.withings.tutorials.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.tutorials.ui.TutorialActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class f0 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialActivity.f f44744a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(TutorialActivity.f fVar) {
        super(0);
        this.f44744a = fVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f44744a.f44695b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
