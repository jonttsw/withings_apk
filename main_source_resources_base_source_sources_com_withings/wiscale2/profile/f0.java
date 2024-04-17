package com.withings.wiscale2.profile;

import com.withings.user.User;
import java.util.List;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.l<List<? extends User>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59323a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(q qVar) {
        super(1);
        this.f59323a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends User> list) {
        ProfileUsersView profileUsersView;
        List<? extends User> it = list;
        kotlin.jvm.internal.u.j(it, "it");
        profileUsersView = this.f59323a.f59439w;
        if (profileUsersView != null) {
            profileUsersView.setUsers(it);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("profileUsersView");
        throw null;
    }
}
