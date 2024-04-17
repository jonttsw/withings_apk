package com.withings.authentication;

import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f32625a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f32626b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32627c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32628d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(androidx.compose.material.m0 m0Var, k1.r0<Boolean> r0Var, AuthenticationActivity authenticationActivity, CoroutineScope coroutineScope) {
        super(2);
        this.f32625a = m0Var;
        this.f32626b = r0Var;
        this.f32627c = authenticationActivity;
        this.f32628d = coroutineScope;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.material.m0 m0Var = this.f32625a;
            k1.r0<Boolean> r0Var = this.f32626b;
            AuthenticationActivity authenticationActivity = this.f32627c;
            CoroutineScope coroutineScope = this.f32628d;
            s1.a b10 = s1.b.b(aVar2, -2053784794, new l0(m0Var, r0Var, authenticationActivity, coroutineScope));
            androidx.compose.material.m0 m0Var2 = this.f32625a;
            androidx.compose.material.y.a(b10, null, m0Var2, null, null, null, 0, false, null, 8, 0L, 0L, 0, 0L, 0L, s1.b.b(aVar2, -1992222755, new u0(m0Var2, r0Var, authenticationActivity, coroutineScope)), aVar2, 805306374, 196992, 28154);
        }
        return nm0.y.f85009a;
    }
}
