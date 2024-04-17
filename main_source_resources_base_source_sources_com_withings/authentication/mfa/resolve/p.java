package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32186a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f32187b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<b> f32188c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c5 c5Var, r0 r0Var, CoroutineScope coroutineScope) {
        super(0);
        this.f32186a = coroutineScope;
        this.f32187b = c5Var;
        this.f32188c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f32186a, null, null, new o(this.f32187b, this.f32188c, null), 3, null);
        return nm0.y.f85009a;
    }
}
