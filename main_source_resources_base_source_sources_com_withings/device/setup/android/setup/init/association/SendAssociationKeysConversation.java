package com.withings.device.setup.android.setup.init.association;

import cj.b;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.CommandErrorException;
import com.withings.comm.wpp.generated.object.AccountKey;
import com.withings.comm.wpp.generated.object.AdvKey;
import com.withings.device.Device;
import java.io.IOException;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
import vf.c;
/* compiled from: SendAssociationKeysConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/association/SendAssociationKeysConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendAssociationKeysConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37443f;

    /* renamed from: g  reason: collision with root package name */
    private final c f37444g;

    public SendAssociationKeysConversation(e deviceManager, c accountManager) {
        u.j(deviceManager, "deviceManager");
        u.j(accountManager, "accountManager");
        this.f37443f = deviceManager;
        this.f37444g = accountManager;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Device f11 = this.f37443f.f(x().g());
        AccountKey accountKey = new AccountKey();
        accountKey.secret = f11.getKlSecret();
        accountKey.f33234id = this.f37444g.h().i().b();
        AdvKey advKey = new AdvKey();
        advKey.secret = f11.getAdvertiseKey();
        try {
            a aVar = new a(x());
            aVar.c((short) 308, accountKey, advKey);
            aVar.j();
            x().u();
            x().w(f11.getKlSecret());
        } catch (CommandErrorException unused) {
            b x11 = x();
            x70.b.r(this, "The device " + x11 + " could not handle the command 'CMD_ASSOCIATION_KEYS_SET'", new Object[0]);
        }
    }
}
