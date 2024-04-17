package com.withings.wiscale2.device.common.conversation;

import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SportVasistasSyncConversation.kt */
/* loaded from: classes5.dex */
public final class h extends w implements ym0.a<g> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SportVasistasSyncConversation f50821a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SportVasistasSyncConversation sportVasistasSyncConversation) {
        super(0);
        this.f50821a = sportVasistasSyncConversation;
    }

    @Override // ym0.a
    public final g invoke() {
        ua0.a aVar;
        SportVasistasSyncConversation sportVasistasSyncConversation = this.f50821a;
        long q11 = sportVasistasSyncConversation.N().q();
        int a11 = SportVasistasSyncConversation.M(sportVasistasSyncConversation).a();
        aVar = sportVasistasSyncConversation.f50767n;
        return new g(q11, a11, aVar);
    }
}
