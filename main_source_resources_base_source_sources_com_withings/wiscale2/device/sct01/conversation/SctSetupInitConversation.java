package com.withings.wiscale2.device.sct01.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.device.setup.android.setup.init.association.SendAssociationKeysConversation;
import com.withings.device.ws.DeviceApi;
import com.withings.webservices.legacy.Webservices;
import com.withings.wiscale2.device.common.conversation.SetWifiCountryConversation;
import java.io.IOException;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vf.c;
/* compiled from: SctSetupInitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/sct01/conversation/SctSetupInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SctSetupInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f54784f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54785g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54786h;

    /* renamed from: i  reason: collision with root package name */
    private final c f54787i;

    /* renamed from: j  reason: collision with root package name */
    private final Webservices f54788j;

    public SctSetupInitConversation() {
        c cVar;
        e c11 = e.c();
        u.i(c11, "get(...)");
        cVar = c.f103617d;
        if (cVar != null) {
            Webservices webservices = Webservices.get();
            u.i(webservices, "get(...)");
            this.f54784f = true;
            this.f54785g = true;
            this.f54786h = c11;
            this.f54787i = cVar;
            this.f54788j = webservices;
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new SctInitConversation());
        boolean z5 = this.f54784f;
        e eVar = this.f54786h;
        if (z5) {
            E(new SendAssociationKeysConversation(eVar, this.f54787i));
        }
        if (this.f54785g) {
            try {
                Device f11 = eVar.f(v());
                if (f11 != null) {
                    if (f11.getNetwork() <= 0) {
                        f11 = null;
                    }
                    if (f11 != null) {
                        ((DeviceApi) this.f54788j.getApiForAccount(DeviceApi.class)).updateNetwork(f11.getId(), f11.getNetwork());
                    }
                }
            } catch (Exception unused) {
            }
        }
        E(new SetWifiCountryConversation());
    }
}
