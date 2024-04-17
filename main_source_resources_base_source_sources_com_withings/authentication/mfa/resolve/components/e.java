package com.withings.authentication.mfa.resolve.components;

import androidx.compose.ui.platform.k4;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MfaInputCode.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f32024a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, y> f32025b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<String> f32026c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(k4 k4Var, ym0.l<? super String, y> lVar, r0<String> r0Var) {
        super(0);
        this.f32024a = k4Var;
        this.f32025b = lVar;
        this.f32026c = r0Var;
    }

    @Override // ym0.a
    public final y invoke() {
        k4 k4Var = this.f32024a;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f32025b.invoke(this.f32026c.getValue());
        return y.f85009a;
    }
}
