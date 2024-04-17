package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: ListGpsPointActivity.kt */
/* loaded from: classes4.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity f49550a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ListGpsPointActivity listGpsPointActivity) {
        super(2);
        this.f49550a = listGpsPointActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.c5.a(0L, 0L, "Gps List Point", false, null, null, null, null, false, new p0(this.f49550a), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 507);
        }
        return nm0.y.f85009a;
    }
}
