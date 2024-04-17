package com.withings.authentication;

import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31548a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31549b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f31550c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f31551d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f31552e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31553f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f31554g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AuthenticationActivity authenticationActivity, androidx.compose.material.m0 m0Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, androidx.navigation.e eVar, CoroutineScope coroutineScope, int i11) {
        super(2);
        this.f31548a = authenticationActivity;
        this.f31549b = m0Var;
        this.f31550c = aVar;
        this.f31551d = aVar2;
        this.f31552e = eVar;
        this.f31553f = coroutineScope;
        this.f31554g = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f31554g | 1);
        androidx.navigation.e eVar = this.f31552e;
        CoroutineScope coroutineScope = this.f31553f;
        AuthenticationActivity.C3(this.f31548a, this.f31549b, this.f31550c, this.f31551d, eVar, coroutineScope, aVar, g11);
        return nm0.y.f85009a;
    }
}
