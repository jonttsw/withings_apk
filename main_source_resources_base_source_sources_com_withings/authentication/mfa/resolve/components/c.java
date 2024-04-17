package com.withings.authentication.mfa.resolve.components;

import androidx.compose.ui.platform.k4;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MfaInputCode.kt */
/* loaded from: classes3.dex */
final class c extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f32020a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f32021b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<String> f32022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k4 k4Var, ym0.a<y> aVar, r0<String> r0Var) {
        super(0);
        this.f32020a = k4Var;
        this.f32021b = aVar;
        this.f32022c = r0Var;
    }

    @Override // ym0.a
    public final y invoke() {
        k4 k4Var = this.f32020a;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f32022c.setValue("");
        this.f32021b.invoke();
        return y.f85009a;
    }
}
