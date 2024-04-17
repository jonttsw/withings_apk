package com.withings.notifications.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.notifications.ui.NotificationsActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationsActivity.c f43147a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(NotificationsActivity.c cVar) {
        super(0);
        this.f43147a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f43147a.f42846b, HealthUserProfile.USER_PROFILE_KEY_USER_ID));
    }
}
