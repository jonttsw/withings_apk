package com.withings.authentication;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31512a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31513b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f31514c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31515d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.compose.material.m0 m0Var, k1.r0 r0Var, AuthenticationActivity authenticationActivity, CoroutineScope coroutineScope) {
        super(0);
        this.f31512a = coroutineScope;
        this.f31513b = m0Var;
        this.f31514c = r0Var;
        this.f31515d = authenticationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f31512a, null, null, new e0(this.f31513b, this.f31514c, this.f31515d, null), 3, null);
        return nm0.y.f85009a;
    }
}
