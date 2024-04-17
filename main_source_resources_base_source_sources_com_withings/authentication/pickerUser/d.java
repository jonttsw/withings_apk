package com.withings.authentication.pickerUser;

import com.withings.common.compose.component.AvatarSize;
import com.withings.user.User;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.a0;
import ym0.q;
/* compiled from: PickerUser.kt */
/* loaded from: classes3.dex */
final class d extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ User f32320a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(User user) {
        super(3);
        this.f32320a = user;
    }

    @Override // ym0.q
    public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        a0 LabelCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(LabelCell, "$this$LabelCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            User user = this.f32320a;
            String l5 = user.l();
            u.i(l5, "getFirstName(...)");
            String s11 = user.s();
            u.i(s11, "getLastName(...)");
            com.withings.common.compose.component.c.b(null, l5, s11, user.a(), AvatarSize.f33299d, 0L, 0L, false, null, aVar2, 24576, 481);
        }
        return y.f85009a;
    }
}
