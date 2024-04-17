package com.withings.authentication.verifyauthentication;
/* compiled from: AuthBottomSheetDialog.kt */
/* loaded from: classes3.dex */
final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f32662a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar) {
        super(0);
        this.f32662a = iVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        i iVar = this.f32662a;
        o.c(iVar.t1(), iVar.u1(), false, iVar.s1().b());
        iVar.dismiss();
        return nm0.y.f85009a;
    }
}
