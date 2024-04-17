package com.withings.authentication.verifyauthentication;
/* compiled from: VerifyAuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.w implements ym0.l<rh.l, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationActivity f32696a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        super(1);
        this.f32696a = verifyAuthenticationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(rh.l lVar) {
        androidx.appcompat.app.c cVar;
        androidx.appcompat.app.c cVar2;
        androidx.appcompat.app.c cVar3;
        rh.l lVar2 = lVar;
        boolean z5 = lVar2 instanceof rh.d;
        VerifyAuthenticationActivity verifyAuthenticationActivity = this.f32696a;
        if (z5) {
            try {
                cVar = verifyAuthenticationActivity.f32642m;
                if (cVar != null) {
                    cVar.dismiss();
                    nm0.y yVar = nm0.y.f85009a;
                } else {
                    kotlin.jvm.internal.u.s("progressDialog");
                    throw null;
                }
            } catch (Throwable th2) {
                nm0.l.a(th2);
            }
        } else if (lVar2 instanceof rh.k) {
            verifyAuthenticationActivity.f32642m = VerifyAuthenticationActivity.F3(verifyAuthenticationActivity).s();
        } else if (lVar2 instanceof rh.m) {
            cVar3 = verifyAuthenticationActivity.f32642m;
            if (cVar3 != null) {
                cVar3.dismiss();
                VerifyAuthenticationActivity.H3(verifyAuthenticationActivity).B0(VerifyAuthenticationActivity.B3(verifyAuthenticationActivity).h());
            } else {
                kotlin.jvm.internal.u.s("progressDialog");
                throw null;
            }
        } else if (lVar2 instanceof rh.j) {
            cVar2 = verifyAuthenticationActivity.f32642m;
            if (cVar2 != null) {
                cVar2.dismiss();
                VerifyAuthenticationActivity.A3(verifyAuthenticationActivity, false);
            } else {
                kotlin.jvm.internal.u.s("progressDialog");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
