package com.withings.wiscale2.vo2max.view;

import com.withings.user.User;
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
final class m extends kotlin.jvm.internal.w implements ym0.l<User, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62786a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(1);
        this.f62786a = vo2MaxComparisonView;
    }

    @Override // ym0.l
    public final nm0.y invoke(User user) {
        User user2 = user;
        kotlin.jvm.internal.u.j(user2, "user");
        Vo2MaxComparisonView.i(this.f62786a, user2);
        return nm0.y.f85009a;
    }
}
