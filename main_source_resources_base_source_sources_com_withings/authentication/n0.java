package com.withings.authentication;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32233a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f32234b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(CoroutineScope coroutineScope, androidx.compose.material.m0 m0Var) {
        super(0);
        this.f32233a = coroutineScope;
        this.f32234b = m0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f32233a, null, null, new m0(this.f32234b, null), 3, null);
        return nm0.y.f85009a;
    }
}
