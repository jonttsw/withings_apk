package com.withings.wiscale2.device.common.conversation;

import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VasistasSyncConversation.kt */
/* loaded from: classes5.dex */
public final class p extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasSyncConversation f50845a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(VasistasSyncConversation vasistasSyncConversation) {
        super(0);
        this.f50845a = vasistasSyncConversation;
    }

    @Override // ym0.a
    public final Long invoke() {
        kn.e eVar;
        VasistasSyncConversation vasistasSyncConversation = this.f50845a;
        eVar = vasistasSyncConversation.f50773k;
        return Long.valueOf(eVar.f(vasistasSyncConversation.x().g()).getId());
    }
}
