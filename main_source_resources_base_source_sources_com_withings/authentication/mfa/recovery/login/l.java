package com.withings.authentication.mfa.recovery.login;

import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: RecoveryCodeInput.kt */
/* loaded from: classes3.dex */
final class l extends w implements ym0.l<String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<String> f31875a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<Integer> f31876b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<Integer> f31877c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r0<String> r0Var, r0<Integer> r0Var2, r0<Integer> r0Var3) {
        super(1);
        this.f31875a = r0Var;
        this.f31876b = r0Var2;
        this.f31877c = r0Var3;
    }

    @Override // ym0.l
    public final y invoke(String str) {
        String it = str;
        u.j(it, "it");
        this.f31875a.setValue(it);
        this.f31876b.setValue(null);
        this.f31877c.setValue(null);
        return y.f85009a;
    }
}
