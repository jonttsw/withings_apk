package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: ListGpsPointActivity.kt */
/* loaded from: classes4.dex */
final class s0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity f49601a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ListGpsPointActivity listGpsPointActivity) {
        super(2);
        this.f49601a = listGpsPointActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ListGpsPointActivity listGpsPointActivity = this.f49601a;
            androidx.compose.material.t5.b(null, null, s1.b.b(aVar2, -1370646786, new q0(listGpsPointActivity)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, 1889955301, new r0(listGpsPointActivity)), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131067);
        }
        return nm0.y.f85009a;
    }
}
