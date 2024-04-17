package com.withings.wiscale2.user.ui.profile;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f61962a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(EditProfileActivity editProfileActivity) {
        super(0);
        this.f61962a = editProfileActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        s0 L3 = this.f61962a.L3();
        L3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(L3), Dispatchers.getIO(), null, new h0(L3, null), 2, null);
        return nm0.y.f85009a;
    }
}
