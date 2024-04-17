package com.withings.tutorials.ui.screens;

import com.withings.user.core.models.User;
import k1.r0;
import nm0.y;
/* compiled from: SegmentalBodyComposition.kt */
/* loaded from: classes4.dex */
final class i extends kotlin.jvm.internal.w implements ym0.l<User.BodyModel, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<User.BodyModel> f45513a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r0<User.BodyModel> r0Var) {
        super(1);
        this.f45513a = r0Var;
    }

    @Override // ym0.l
    public final y invoke(User.BodyModel bodyModel) {
        User.BodyModel it = bodyModel;
        kotlin.jvm.internal.u.j(it, "it");
        this.f45513a.setValue(it);
        return y.f85009a;
    }
}
