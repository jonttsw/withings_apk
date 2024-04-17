package com.withings.wiscale2.user.ui;

import com.withings.user.User;
/* compiled from: EditUserMeasureActivity.kt */
/* loaded from: classes5.dex */
final class n extends kotlin.jvm.internal.w implements ym0.l<User, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditUserMeasureActivity f61838a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(EditUserMeasureActivity editUserMeasureActivity) {
        super(1);
        this.f61838a = editUserMeasureActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(User user) {
        User user2 = user;
        if (user2 != null) {
            EditUserMeasureActivity.H3(this.f61838a, user2);
        }
        return nm0.y.f85009a;
    }
}
