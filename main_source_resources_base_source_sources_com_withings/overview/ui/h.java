package com.withings.overview.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.w;
import nm0.y;
import r10.a0;
import r10.d0;
import ym0.p;
/* compiled from: StartTrackingActivity.kt */
/* loaded from: classes4.dex */
final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StartTrackingActivity f43359a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(StartTrackingActivity startTrackingActivity) {
        super(2);
        this.f43359a = startTrackingActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            StartTrackingActivity startTrackingActivity = this.f43359a;
            d dVar = new d(startTrackingActivity);
            a0.a((d0) h6.b.c(StartTrackingActivity.A3(startTrackingActivity).f0(), aVar2).getValue(), new e(startTrackingActivity), f.f43357a, new g(startTrackingActivity), dVar, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0);
        }
        return y.f85009a;
    }
}
