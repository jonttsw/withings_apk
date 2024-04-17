package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutAndDisconnectDevicesImpl.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.LogoutAndDisconnectDevicesImpl", f = "LogoutAndDisconnectDevicesImpl.kt", l = {53, 55, 59, 60}, m = "run")
/* loaded from: classes5.dex */
public final class j0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    Object f60063a;

    /* renamed from: b  reason: collision with root package name */
    Object f60064b;

    /* renamed from: c  reason: collision with root package name */
    ym0.l f60065c;

    /* renamed from: d  reason: collision with root package name */
    long f60066d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f60067e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k0 f60068f;

    /* renamed from: g  reason: collision with root package name */
    int f60069g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, qm0.d<? super j0> dVar) {
        super(dVar);
        this.f60068f = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f60067e = obj;
        this.f60069g |= Integer.MIN_VALUE;
        return this.f60068f.a(null, this, null);
    }
}
