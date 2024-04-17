package com.withings.authentication.tryToLogin.mail;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryToLoginViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel", f = "TryToLoginViewModel.kt", l = {ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT, ConstantsWs.WS_STATUS_UNKNOWN_ASSOCIATION}, m = "loginWithOldFlow")
/* loaded from: classes3.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    TryToLoginViewModel f32441a;

    /* renamed from: b  reason: collision with root package name */
    String f32442b;

    /* renamed from: c  reason: collision with root package name */
    Object f32443c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f32444d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ TryToLoginViewModel f32445e;

    /* renamed from: f  reason: collision with root package name */
    int f32446f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TryToLoginViewModel tryToLoginViewModel, qm0.d<? super c> dVar) {
        super(dVar);
        this.f32445e = tryToLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32444d = obj;
        this.f32446f |= Integer.MIN_VALUE;
        return TryToLoginViewModel.z0(this.f32445e, null, null, this);
    }
}
