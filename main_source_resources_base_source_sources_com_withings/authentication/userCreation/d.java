package com.withings.authentication.userCreation;

import com.withings.common.compose.component.input.Gender;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class d extends kotlin.jvm.internal.w implements ym0.l<Gender, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m70.f f32504a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m70.f fVar) {
        super(1);
        this.f32504a = fVar;
    }

    @Override // ym0.l
    public final y invoke(Gender gender) {
        Gender it = gender;
        kotlin.jvm.internal.u.j(it, "it");
        this.f32504a.y(it);
        return y.f85009a;
    }
}
