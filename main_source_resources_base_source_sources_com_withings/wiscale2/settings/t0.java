package com.withings.wiscale2.settings;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class t0 extends kotlin.jvm.internal.w implements ym0.p<String, String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60300a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60301b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.withings.wiscale2.account.password.r f60302c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(k1.r0<String> r0Var, k1.r0<Boolean> r0Var2, com.withings.wiscale2.account.password.r rVar) {
        super(2);
        this.f60300a = r0Var;
        this.f60301b = r0Var2;
        this.f60302c = rVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(String str, String str2) {
        boolean z5;
        String password = str;
        String confirmedPassword = str2;
        kotlin.jvm.internal.u.j(password, "password");
        kotlin.jvm.internal.u.j(confirmedPassword, "confirmedPassword");
        this.f60300a.setValue(password);
        com.withings.wiscale2.account.password.r rVar = this.f60302c;
        rVar.getClass();
        if (kotlin.jvm.internal.u.e(password, confirmedPassword) && rVar.b(password)) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f60301b.setValue(Boolean.valueOf(z5));
        return nm0.y.f85009a;
    }
}
