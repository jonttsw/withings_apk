package com.withings.nervehealth.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.nervehealth.ui.NerveHealthActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity.f f42814a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(NerveHealthActivity.f fVar) {
        super(0);
        this.f42814a = fVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f42814a.f42378b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
