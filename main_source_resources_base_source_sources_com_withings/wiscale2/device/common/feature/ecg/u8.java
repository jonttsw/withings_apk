package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class u8 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51769a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f51770b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(WBS08EcgActivationActivity wBS08EcgActivationActivity, k1.r0<Boolean> r0Var) {
        super(0);
        this.f51769a = wBS08EcgActivationActivity;
        this.f51770b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        WBS08EcgActivationViewModel R3;
        EditProfileActivity.a aVar = EditProfileActivity.f61841i;
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51769a;
        R3 = wBS08EcgActivationActivity.R3();
        long g12 = R3.g1();
        aVar.getClass();
        wBS08EcgActivationActivity.startActivity(EditProfileActivity.a.a(wBS08EcgActivationActivity, g12, false));
        this.f51770b.setValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}
