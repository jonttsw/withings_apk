package com.withings.wiscale2.device.wpm.wpm06;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.wiscale2.device.wpm.wpm06.conversation.Wpm06SyncConversation;
import fl.o;
import fl.p;
import gl.t;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: Wpm06BleConnector.kt */
/* loaded from: classes5.dex */
final class a extends w implements l<Device, WppDeviceConversation> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ej.w f55950a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ej.w wVar) {
        super(1);
        this.f55950a = wVar;
    }

    @Override // ym0.l
    public final WppDeviceConversation invoke(Device device) {
        Device deviceToSync = device;
        u.j(deviceToSync, "deviceToSync");
        Wpm06SyncConversation wpm06SyncConversation = new Wpm06SyncConversation(0);
        o g11 = p.f67672b.a().g(deviceToSync);
        u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithBonding");
        u70.a b10 = u70.a.b();
        u.i(b10, "get(...)");
        return new BondAndSyncConversation((t) g11, this.f55950a, b10, wpm06SyncConversation);
    }
}
