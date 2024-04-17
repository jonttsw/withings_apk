package com.withings.wiscale2.user.ui.profile;

import com.withings.common.compose.component.input.Gender;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.w implements ym0.l<Gender, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m70.l f61944a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m70.l lVar) {
        super(1);
        this.f61944a = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Gender gender) {
        Gender it = gender;
        kotlin.jvm.internal.u.j(it, "it");
        this.f61944a.b().y(it);
        return nm0.y.f85009a;
    }
}
