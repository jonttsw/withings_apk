package com.withings.tutorials.ui.screens;

import com.withings.user.core.models.User;
import k1.r0;
import nm0.y;
/* compiled from: SegmentalBodyComposition.kt */
/* loaded from: classes4.dex */
final class h extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<User.BodyModel> f45344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<User.BodyModel, y> f45345b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(r0<User.BodyModel> r0Var, ym0.l<? super User.BodyModel, y> lVar) {
        super(0);
        this.f45344a = r0Var;
        this.f45345b = lVar;
    }

    @Override // ym0.a
    public final y invoke() {
        User.BodyModel value = this.f45344a.getValue();
        if (value != null) {
            this.f45345b.invoke(value);
        }
        return y.f85009a;
    }
}
