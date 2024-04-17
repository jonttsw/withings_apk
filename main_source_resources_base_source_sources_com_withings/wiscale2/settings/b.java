package com.withings.wiscale2.settings;

import com.withings.common.compose.component.AvatarSize;
import com.withings.user.User;
/* compiled from: AccountAndSecurity.kt */
/* loaded from: classes5.dex */
final class b extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ User f59871a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(User user) {
        super(3);
        this.f59871a = user;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        r0.a0 LabelCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            User user = this.f59871a;
            String l5 = user.l();
            kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
            String s11 = user.s();
            kotlin.jvm.internal.u.i(s11, "getLastName(...)");
            com.withings.common.compose.component.c.b(null, l5, s11, user.a(), AvatarSize.f33299d, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).J(), ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).z(), false, null, aVar2, 24576, 385);
        }
        return nm0.y.f85009a;
    }
}
