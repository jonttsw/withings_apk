package com.withings.authentication.verifyauthentication;
/* compiled from: AuthBottomSheetDialog.kt */
/* loaded from: classes3.dex */
final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f32666a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar) {
        super(0);
        this.f32666a = iVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        i iVar = this.f32666a;
        o.c(iVar.t1(), iVar.u1(), true, iVar.s1().b());
        iVar.dismiss();
        return nm0.y.f85009a;
    }
}
