package com.withings.ecg.details;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.ecg.details.g;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g.h f38365a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g.h hVar) {
        super(0);
        this.f38365a = hVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(yq.b.c(this.f38365a.f38221b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
