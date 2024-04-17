package com.withings.webview;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrivateWebviewManager.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.webview.PrivateWebviewManager", f = "PrivateWebviewManager.kt", l = {94}, m = "executeAndGetResponse")
/* loaded from: classes4.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    String f46891a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f46892b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f46893c;

    /* renamed from: d  reason: collision with root package name */
    int f46894d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, qm0.d<? super c> dVar) {
        super(dVar);
        this.f46893c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f46892b = obj;
        this.f46894d |= Integer.MIN_VALUE;
        return b.a(this.f46893c, null, null, null, this);
    }
}
