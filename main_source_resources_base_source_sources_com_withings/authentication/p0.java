package com.withings.authentication;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f32252a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32253b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32254c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f32255d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.compose.material.m0 m0Var, k1.r0 r0Var, AuthenticationActivity authenticationActivity, CoroutineScope coroutineScope) {
        super(0);
        this.f32252a = m0Var;
        this.f32253b = coroutineScope;
        this.f32254c = authenticationActivity;
        this.f32255d = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.compose.material.m0 m0Var = this.f32252a;
        if (m0Var.a().g()) {
            BuildersKt__Builders_commonKt.launch$default(this.f32253b, null, null, new o0(m0Var, this.f32255d, null), 3, null);
        } else {
            this.f32254c.finish();
        }
        return nm0.y.f85009a;
    }
}
