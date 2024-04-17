package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import com.withings.authentication.mfa.resolve.b;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31967a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<b> f31968b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f31969c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(c5 c5Var, r0 r0Var, CoroutineScope coroutineScope) {
        super(0);
        this.f31967a = coroutineScope;
        this.f31968b = r0Var;
        this.f31969c = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f31968b.setValue(b.a.f31959a);
        BuildersKt__Builders_commonKt.launch$default(this.f31967a, null, null, new b0(this.f31969c, null), 3, null);
        return nm0.y.f85009a;
    }
}
