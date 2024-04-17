package com.withings.weight.ui.limbExplore;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.weight.ui.limbExplore.SegmentalLimbExploreActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalLimbExploreActivity.c f47689a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SegmentalLimbExploreActivity.c cVar) {
        super(0);
        this.f47689a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f47689a.f47654b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
