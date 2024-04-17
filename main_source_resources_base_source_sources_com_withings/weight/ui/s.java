package com.withings.weight.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.weight.ui.SegmentalBodyCompositionActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionActivity.d f47770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SegmentalBodyCompositionActivity.d dVar) {
        super(0);
        this.f47770a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f47770a.f47602b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
