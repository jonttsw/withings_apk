package com.withings.wiscale2.settings;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.settings.DatabaseInfoActivity;
/* compiled from: DatabaseInfoActivity.kt */
/* loaded from: classes5.dex */
final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity f60338a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity.b f60339b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(DatabaseInfoActivity.b bVar, DatabaseInfoActivity databaseInfoActivity) {
        super(2);
        this.f60338a = databaseInfoActivity;
        this.f60339b = bVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            DatabaseInfoActivity databaseInfoActivity = this.f60338a;
            androidx.compose.material.t5.b(null, null, s1.b.b(aVar2, -737407178, new t(databaseInfoActivity)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, -2025872931, new u(this.f60339b, databaseInfoActivity)), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131067);
        }
        return nm0.y.f85009a;
    }
}
