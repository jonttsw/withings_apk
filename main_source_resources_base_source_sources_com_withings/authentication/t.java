package com.withings.authentication;

import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32338a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f32339b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32340c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32341d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f32342e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32343f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f32344g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AuthenticationActivity authenticationActivity, androidx.compose.material.m0 m0Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, androidx.navigation.e eVar, CoroutineScope coroutineScope, int i11) {
        super(2);
        this.f32338a = authenticationActivity;
        this.f32339b = m0Var;
        this.f32340c = aVar;
        this.f32341d = aVar2;
        this.f32342e = eVar;
        this.f32343f = coroutineScope;
        this.f32344g = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f32344g | 1);
        androidx.navigation.e eVar = this.f32342e;
        CoroutineScope coroutineScope = this.f32343f;
        AuthenticationActivity.D3(this.f32338a, this.f32339b, this.f32340c, this.f32341d, eVar, coroutineScope, aVar, g11);
        return nm0.y.f85009a;
    }
}
