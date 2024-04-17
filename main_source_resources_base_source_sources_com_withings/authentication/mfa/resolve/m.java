package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class m extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32171a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32172b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f32173c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<b> f32174d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CoroutineScope coroutineScope, ym0.a<nm0.y> aVar, c5 c5Var, r0<b> r0Var) {
        super(0);
        this.f32171a = coroutineScope;
        this.f32172b = aVar;
        this.f32173c = c5Var;
        this.f32174d = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f32171a, null, null, new l(this.f32173c, this.f32174d, null), 3, null);
        this.f32172b.invoke();
        return nm0.y.f85009a;
    }
}
