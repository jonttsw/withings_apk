package com.withings.wiscale2.accountV2.ui;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: LoggedOutActivity.kt */
/* loaded from: classes4.dex */
final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LoggedOutActivity f48217a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LoggedOutActivity loggedOutActivity) {
        super(2);
        this.f48217a = loggedOutActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            LoggedOutActivity loggedOutActivity = this.f48217a;
            Boolean bool = (Boolean) t1.d.b(LoggedOutActivity.A3(loggedOutActivity).k0(), Boolean.FALSE, aVar2).getValue();
            u.i(bool, "invoke$lambda$0(...)");
            LoggedOutActivity.z3(loggedOutActivity, bool.booleanValue(), new g(loggedOutActivity), aVar2, 512);
        }
        return y.f85009a;
    }
}
