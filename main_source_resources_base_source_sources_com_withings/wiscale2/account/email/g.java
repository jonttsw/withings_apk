package com.withings.wiscale2.account.email;

import com.withings.common.compose.component.c5;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: EmailModificationActivity.kt */
/* loaded from: classes4.dex */
final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EmailModificationActivity f48079a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EmailModificationActivity emailModificationActivity) {
        super(2);
        this.f48079a = emailModificationActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            c5.a(0L, 0L, ay.b.u(C1987R.string.emailChange_title, aVar2), true, null, null, null, null, false, new f(this.f48079a), aVar2, 3072, 499);
        }
        return y.f85009a;
    }
}
