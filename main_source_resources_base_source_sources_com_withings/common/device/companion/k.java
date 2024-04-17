package com.withings.common.device.companion;

import kotlin.jvm.internal.s;
import nm0.y;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements;
/* compiled from: CompanionLinkActivity.kt */
/* loaded from: classes3.dex */
final /* synthetic */ class k extends s implements ym0.l<String, y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(g gVar) {
        super(1, gVar, g.class, SaslStreamElements.SASLFailure.ELEMENT, "failure(Ljava/lang/String;)V", 0);
    }

    @Override // ym0.l
    public final y invoke(String str) {
        g.f0((g) this.receiver, str);
        return y.f85009a;
    }
}
