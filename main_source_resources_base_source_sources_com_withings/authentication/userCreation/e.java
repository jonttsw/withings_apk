package com.withings.authentication.userCreation;

import com.withings.common.compose.component.input.AdvancedGender;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class e extends kotlin.jvm.internal.w implements ym0.l<AdvancedGender, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m70.f f32505a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m70.f fVar) {
        super(1);
        this.f32505a = fVar;
    }

    @Override // ym0.l
    public final y invoke(AdvancedGender advancedGender) {
        AdvancedGender it = advancedGender;
        kotlin.jvm.internal.u.j(it, "it");
        this.f32505a.r(it);
        return y.f85009a;
    }
}
