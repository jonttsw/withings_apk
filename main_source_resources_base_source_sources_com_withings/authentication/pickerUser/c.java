package com.withings.authentication.pickerUser;

import com.withings.user.User;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: PickerUser.kt */
/* loaded from: classes3.dex */
final class c extends w implements l<User, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<User, y> f32319a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super User, y> lVar) {
        super(1);
        this.f32319a = lVar;
    }

    @Override // ym0.l
    public final y invoke(User user) {
        User selectedUser = user;
        u.j(selectedUser, "selectedUser");
        this.f32319a.invoke(selectedUser);
        return y.f85009a;
    }
}
