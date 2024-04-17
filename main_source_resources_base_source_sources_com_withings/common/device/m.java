package com.withings.common.device;

import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.device.ws.DeviceCredentials;
import com.withings.device.ws.DeviceSessionFactory;
import com.withings.webservices.legacy.common.SessionIdProvider;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
/* compiled from: DeviceSessionProvider.java */
/* loaded from: classes3.dex */
public final class m implements SessionIdProvider {

    /* renamed from: a  reason: collision with root package name */
    private DeviceCredentials f35226a;

    public m(ProbeReply probeReply) {
        this.f35226a = new DeviceCredentials(u70.i.c(probeReply.mac), probeReply.secret, probeReply.softVersion, Integer.parseInt(probeReply.mfgId, 16));
    }

    public final DeviceSession c() throws WsAuthFailedException {
        return DeviceSessionFactory.get().getSession(this.f35226a);
    }

    @Override // com.withings.webservices.legacy.common.SessionIdProvider
    public final String getSessionId() throws WsAuthFailedException {
        return DeviceSessionFactory.get().getSession(this.f35226a).mSessionId;
    }

    @Override // com.withings.webservices.legacy.common.SessionIdProvider
    public final void invalidateSession() {
        DeviceSessionFactory.get().remove(this.f35226a.getMacAddress());
    }
}
