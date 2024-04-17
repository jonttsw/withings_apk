package com.withings.wiscale2;

import com.withings.wiscale2.push.AppHMSMessagingService;
import com.withings.wiscale2.push.HMFirebaseMessagingService;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class q extends q1 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f59568a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(b0 b0Var) {
        this.f59568a = b0Var;
    }

    @Override // com.withings.wiscale2.push.a
    public final void a(AppHMSMessagingService appHMSMessagingService) {
        dagger.internal.d dVar;
        dVar = this.f59568a.A3;
        appHMSMessagingService.f59547e = (th0.k) dVar.get();
    }

    @Override // com.withings.wiscale2.push.c
    public final void b(HMFirebaseMessagingService hMFirebaseMessagingService) {
        dagger.internal.d dVar;
        dVar = this.f59568a.A3;
        hMFirebaseMessagingService.f59548d = (th0.k) dVar.get();
    }
}
