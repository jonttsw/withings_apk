package com.withings.authentication.userCreation;

import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UserCreationViewModel f32603a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f32604b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(UserCreationViewModel userCreationViewModel, ym0.a<y> aVar) {
        super(0);
        this.f32603a = userCreationViewModel;
        this.f32604b = aVar;
    }

    @Override // ym0.a
    public final y invoke() {
        UserCreationViewModel userCreationViewModel = this.f32603a;
        cr.a.a(new nm0.j(userCreationViewModel.F0().i(), userCreationViewModel.F0().n()), new q(userCreationViewModel, this.f32604b));
        return y.f85009a;
    }
}
