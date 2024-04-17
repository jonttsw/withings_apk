package com.withings.wiscale2.device.wpm.wpm04;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.wiscale2.device.wpm.wpm04.conversation.Wpm04SyncConversation;
import fl.o;
import fl.p;
import fy.v;
import gl.t;
import kn.e;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import m70.i;
import vf.c;
import ym0.l;
/* compiled from: Wpm04BleConnector.kt */
/* loaded from: classes5.dex */
final class a extends w implements l<Device, WppDeviceConversation> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f55800a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f55801b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f55802c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v f55803d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ej.w f55804e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, c cVar, e eVar, v vVar, ej.w wVar) {
        super(1);
        this.f55800a = iVar;
        this.f55801b = cVar;
        this.f55802c = eVar;
        this.f55803d = vVar;
        this.f55804e = wVar;
    }

    @Override // ym0.l
    public final WppDeviceConversation invoke(Device device) {
        Device deviceToSync = device;
        u.j(deviceToSync, "deviceToSync");
        Wpm04SyncConversation wpm04SyncConversation = new Wpm04SyncConversation(this.f55800a, this.f55801b, this.f55802c, this.f55803d);
        o g11 = p.f67672b.a().g(deviceToSync);
        u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithBonding");
        u70.a b10 = u70.a.b();
        u.i(b10, "get(...)");
        return new BondAndSyncConversation((t) g11, this.f55804e, b10, wpm04SyncConversation);
    }
}
