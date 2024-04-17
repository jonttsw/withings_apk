package com.withings.wiscale2.device.wpm.wpm07.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.setup.android.setup.init.association.SendAssociationKeysConversation;
import com.withings.device.setup.android.setup.init.classification.SendClassificationConversation;
import com.withings.features.FeatureFlag;
import com.withings.wiscale2.device.common.conversation.SetWifiCountryConversation;
import java.io.IOException;
import kn.e;
import kotlin.Metadata;
import vf.c;
import wr.b;
/* compiled from: Wpm07SetupInitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm07/conversation/Wpm07SetupInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm07SetupInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f55966f;

    /* renamed from: g  reason: collision with root package name */
    private final c f55967g;

    public Wpm07SetupInitConversation(e eVar, c cVar) {
        this.f55966f = eVar;
        this.f55967g = cVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new SetWifiCountryConversation());
        boolean c11 = b.c(FeatureFlag.f39135v);
        e eVar = this.f55966f;
        if (!c11) {
            E(new SendClassificationConversation(eVar));
        }
        E(new Wpm07InitConversation(0));
        E(new SendAssociationKeysConversation(eVar, this.f55967g));
    }
}
