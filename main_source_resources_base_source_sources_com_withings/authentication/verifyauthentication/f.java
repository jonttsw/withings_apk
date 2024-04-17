package com.withings.authentication.verifyauthentication;

import android.app.Activity;
import android.content.Intent;
/* compiled from: AuthBottomSheetDialog.kt */
/* loaded from: classes3.dex */
final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f32671a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar) {
        super(0);
        this.f32671a = iVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = VerifyAuthenticationActivity.f32633o;
        i iVar = this.f32671a;
        Activity context = iVar.t1();
        kotlin.jvm.internal.u.j(context, "context");
        iVar.t1().startActivityForResult(new Intent(context, VerifyAuthenticationActivity.class), iVar.u1());
        iVar.dismiss();
        return nm0.y.f85009a;
    }
}
