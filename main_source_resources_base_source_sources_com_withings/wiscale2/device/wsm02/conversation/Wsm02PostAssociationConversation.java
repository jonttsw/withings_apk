package com.withings.wiscale2.device.wsm02.conversation;

import ah.t;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.comm.wpp.generated.object.UserSecret;
import com.withings.device.Device;
import com.withings.device.setup.android.setup.init.association.SendAssociationKeysConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.wiscale2.device.common.conversation.SetWifiCountryConversation;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import oi0.b;
import oi0.f;
import vf.c;
import ym0.l;
/* compiled from: Wsm02PostAssociationConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wsm02/conversation/Wsm02PostAssociationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wsm02PostAssociationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f55995f;

    /* renamed from: g  reason: collision with root package name */
    private final e f55996g;

    /* renamed from: h  reason: collision with root package name */
    private final c f55997h;

    /* compiled from: Wsm02PostAssociationConversation.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements l<b, SyncJob> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55998a = new w(1);

        @Override // ym0.l
        public final SyncJob invoke(b bVar) {
            b blockingPostSyncJob = bVar;
            u.j(blockingPostSyncJob, "$this$blockingPostSyncJob");
            return blockingPostSyncJob.e();
        }
    }

    public Wsm02PostAssociationConversation(User user) {
        c cVar;
        e c11 = e.c();
        u.i(c11, "get(...)");
        cVar = c.f103617d;
        if (cVar != null) {
            this.f55995f = user;
            this.f55996g = c11;
            this.f55997h = cVar;
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        b h11 = b.h();
        u.i(h11, "get(...)");
        f.a(h11, a.f55998a, "wsm02InstallSetup");
        Device f11 = e.c().f(x().g());
        E(new SetWifiCountryConversation());
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        u.g(f11);
        TrackerUser g11 = a50.a.g(this.f55995f);
        UserSecret w11 = t.w(f11);
        nj.a aVar = new nj.a(x());
        aVar.c((short) 1282, g11, w11);
        aVar.j();
        E(new SendAssociationKeysConversation(this.f55996g, this.f55997h));
    }
}
