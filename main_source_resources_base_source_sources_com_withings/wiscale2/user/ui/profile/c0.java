package com.withings.wiscale2.user.ui.profile;

import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity.y f61945a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(EditProfileActivity.y yVar) {
        super(0);
        this.f61945a = yVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f61945a.f61912b, "extra_user"));
    }
}
