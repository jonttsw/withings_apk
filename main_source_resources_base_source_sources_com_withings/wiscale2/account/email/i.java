package com.withings.wiscale2.account.email;

import androidx.compose.material.t5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: EmailModificationActivity.kt */
/* loaded from: classes4.dex */
final class i extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EmailModificationActivity f48081a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(EmailModificationActivity emailModificationActivity) {
        super(2);
        this.f48081a = emailModificationActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            EmailModificationActivity emailModificationActivity = this.f48081a;
            t5.b(null, null, s1.b.b(aVar2, 551676284, new g(emailModificationActivity)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, -1744841739, new h(emailModificationActivity)), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131067);
        }
        return y.f85009a;
    }
}
