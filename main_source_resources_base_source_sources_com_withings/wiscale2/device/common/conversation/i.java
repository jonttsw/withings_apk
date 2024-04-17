package com.withings.wiscale2.device.common.conversation;

import kotlin.jvm.internal.w;
/* compiled from: SportVasistasSyncConversation.kt */
/* loaded from: classes5.dex */
final class i extends w implements ym0.a<fl.o> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SportVasistasSyncConversation f50822a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SportVasistasSyncConversation sportVasistasSyncConversation) {
        super(0);
        this.f50822a = sportVasistasSyncConversation;
    }

    @Override // ym0.a
    public final fl.o invoke() {
        fl.p a11 = fl.p.f67672b.a();
        cj.b x11 = this.f50822a.x();
        kotlin.jvm.internal.u.i(x11, "getWppDevice(...)");
        return a11.f(x11);
    }
}
