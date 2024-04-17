package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import com.withings.authentication.mfa.resolve.b;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class h0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32078a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<b> f32079b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f32080c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(c5 c5Var, r0 r0Var, CoroutineScope coroutineScope) {
        super(0);
        this.f32078a = coroutineScope;
        this.f32079b = r0Var;
        this.f32080c = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f32079b.setValue(b.a.f31959a);
        BuildersKt__Builders_commonKt.launch$default(this.f32078a, null, null, new g0(this.f32080c, null), 3, null);
        return nm0.y.f85009a;
    }
}
