package com.withings.wiscale2.device.common.conversation;

import com.withings.vasistas.model.Vasistas;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VasistasSyncConversation.kt */
/* loaded from: classes5.dex */
public final class s extends w implements ym0.a<o> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasSyncConversation f50850a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(VasistasSyncConversation vasistasSyncConversation) {
        super(0);
        this.f50850a = vasistasSyncConversation;
    }

    @Override // ym0.a
    public final o invoke() {
        boolean Y;
        long U;
        VasistasSyncConversation vasistasSyncConversation = this.f50850a;
        long q11 = vasistasSyncConversation.W().q();
        Vasistas.Category S = vasistasSyncConversation.S();
        Y = vasistasSyncConversation.Y();
        int a11 = VasistasSyncConversation.O(vasistasSyncConversation).a();
        U = vasistasSyncConversation.U();
        return new o(q11, S, Y, a11, U);
    }
}
