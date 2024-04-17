package com.withings.authentication.userCreation;

import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class q extends kotlin.jvm.internal.w implements ym0.p<String, String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UserCreationViewModel f32601a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f32602b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(UserCreationViewModel userCreationViewModel, ym0.a<y> aVar) {
        super(2);
        this.f32601a = userCreationViewModel;
        this.f32602b = aVar;
    }

    @Override // ym0.p
    public final y invoke(String str, String str2) {
        long j5;
        String first = str;
        String last = str2;
        kotlin.jvm.internal.u.j(first, "first");
        kotlin.jvm.internal.u.j(last, "last");
        UserCreationViewModel userCreationViewModel = this.f32601a;
        Long d11 = userCreationViewModel.F0().d();
        if (d11 != null) {
            j5 = d11.longValue();
        } else {
            j5 = 0;
        }
        userCreationViewModel.q0(j5, first, last, userCreationViewModel.F0().k());
        this.f32602b.invoke();
        return y.f85009a;
    }
}
