package com.withings.wiscale2.device.wpm.wpm04.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.GetAndStoreBatteryStateConversation;
import com.withings.common.device.conversation.SendSessionConversation;
import com.withings.device.setup.android.setup.init.association.SendAssociationKeysConversation;
import com.withings.device.setup.android.setup.init.classification.SendClassificationConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.features.FeatureFlag;
import com.withings.wiscale2.device.common.conversation.SendUserUnitsConversation;
import com.withings.wiscale2.device.common.conversation.SetWifiCountryConversation;
import java.io.IOException;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vf.c;
import wr.b;
/* compiled from: Wpm04SetupInitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/conversation/Wpm04SetupInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm04SetupInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f55810f;

    /* renamed from: g  reason: collision with root package name */
    private final c f55811g;

    public Wpm04SetupInitConversation(e eVar, c cVar) {
        this.f55810f = eVar;
        this.f55811g = cVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new SetWifiCountryConversation());
        e eVar = this.f55810f;
        E(new GetAndStoreBatteryStateConversation(eVar));
        if (!b.c(FeatureFlag.f39135v)) {
            E(new SendClassificationConversation(eVar));
        }
        E(new SendSessionConversation(false));
        E(new SendUserUnitsConversation(0));
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        E(new SendAssociationKeysConversation(eVar, this.f55811g));
    }
}
