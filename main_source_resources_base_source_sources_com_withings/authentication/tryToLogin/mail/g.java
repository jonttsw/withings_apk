package com.withings.authentication.tryToLogin.mail;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryToLoginViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel", f = "TryToLoginViewModel.kt", l = {ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN, ConstantsWs.WS_STATUS_DEVASSOCERROR}, m = "sendShortCodeLegacy")
/* loaded from: classes3.dex */
public final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    TryToLoginViewModel f32459a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f32460b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TryToLoginViewModel f32461c;

    /* renamed from: d  reason: collision with root package name */
    int f32462d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TryToLoginViewModel tryToLoginViewModel, qm0.d<? super g> dVar) {
        super(dVar);
        this.f32461c = tryToLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32460b = obj;
        this.f32462d |= Integer.MIN_VALUE;
        return TryToLoginViewModel.A0(this.f32461c, null, this);
    }
}
