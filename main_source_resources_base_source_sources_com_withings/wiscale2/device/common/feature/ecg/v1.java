package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class v1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52058a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f52059b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(EcgActivationActivity ecgActivationActivity, k1.r0<Boolean> r0Var) {
        super(0);
        this.f52058a = ecgActivationActivity;
        this.f52059b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        EditProfileActivity.a aVar = EditProfileActivity.f61841i;
        EcgActivationActivity ecgActivationActivity = this.f52058a;
        Long userId = EcgActivationActivity.O3(ecgActivationActivity).getUserId();
        kotlin.jvm.internal.u.g(userId);
        long longValue = userId.longValue();
        aVar.getClass();
        ecgActivationActivity.startActivity(EditProfileActivity.a.a(ecgActivationActivity, longValue, false));
        this.f52059b.setValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}
