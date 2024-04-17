package com.withings.wiscale2.user.ui.profile;

import com.withings.common.compose.component.input.AdvancedGender;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.w implements ym0.l<AdvancedGender, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m70.l f61946a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m70.l lVar) {
        super(1);
        this.f61946a = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(AdvancedGender advancedGender) {
        AdvancedGender it = advancedGender;
        kotlin.jvm.internal.u.j(it, "it");
        this.f61946a.b().r(it);
        return nm0.y.f85009a;
    }
}
