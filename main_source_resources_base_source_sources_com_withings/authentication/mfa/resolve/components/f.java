package com.withings.authentication.mfa.resolve.components;

import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MfaInputCode.kt */
/* loaded from: classes3.dex */
final class f extends w implements ym0.l<String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f32027a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<String> f32028b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r0 r0Var, ym0.a aVar) {
        super(1);
        this.f32027a = aVar;
        this.f32028b = r0Var;
    }

    @Override // ym0.l
    public final y invoke(String str) {
        String it = str;
        u.j(it, "it");
        this.f32028b.setValue(it);
        this.f32027a.invoke();
        return y.f85009a;
    }
}
