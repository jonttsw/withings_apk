package com.withings.wiscale2.account.email;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.q;
/* compiled from: EmailModificationActivity.kt */
/* loaded from: classes4.dex */
final class h extends w implements q<r0.w, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EmailModificationActivity f48080a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EmailModificationActivity emailModificationActivity) {
        super(3);
        this.f48080a = emailModificationActivity;
    }

    @Override // ym0.q
    public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            this.f48080a.A3(aVar2, 8);
        }
        return y.f85009a;
    }
}
