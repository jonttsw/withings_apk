package com.withings.wiscale2.settings;

import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: DatabaseInfoActivity.kt */
/* loaded from: classes5.dex */
final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity f60299a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(DatabaseInfoActivity databaseInfoActivity) {
        super(2);
        this.f60299a = databaseInfoActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.c5.a(0L, 0L, "Database Info", false, null, null, null, null, false, new s(this.f60299a), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 507);
        }
        return nm0.y.f85009a;
    }
}
