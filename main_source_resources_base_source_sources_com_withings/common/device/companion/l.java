package com.withings.common.device.companion;

import com.withings.common.device.companion.DeviceCompanionLinkProvider;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import vi.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CompanionLinkActivity.kt */
/* loaded from: classes3.dex */
public final class l extends w implements ym0.l<xi.b, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f35120a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar) {
        super(1);
        this.f35120a = gVar;
    }

    @Override // ym0.l
    public final y invoke(xi.b bVar) {
        ej.w wVar;
        gj.i iVar;
        DeviceCompanionLinkProvider deviceCompanionLinkProvider;
        DeviceCompanionLinkProvider deviceCompanionLinkProvider2;
        xi.b remoteDevice = bVar;
        u.j(remoteDevice, "remoteDevice");
        g gVar = this.f35120a;
        wVar = gVar.f35097a;
        iVar = gVar.f35108l;
        wVar.K(iVar);
        gVar.f35108l = null;
        if (remoteDevice instanceof o) {
            deviceCompanionLinkProvider2 = gVar.f35099c;
            String b10 = ((o) remoteDevice).b();
            u.i(b10, "getAddress(...)");
            int i11 = DeviceCompanionLinkProvider.ConnectionType.f35088b;
            deviceCompanionLinkProvider2.d(b10, new h(gVar, remoteDevice), new i(gVar));
        } else if (remoteDevice instanceof wi.c) {
            deviceCompanionLinkProvider = gVar.f35099c;
            String c11 = ((wi.c) remoteDevice).c();
            u.i(c11, "getAddress(...)");
            int i12 = DeviceCompanionLinkProvider.ConnectionType.f35088b;
            deviceCompanionLinkProvider.d(c11, new j(gVar, remoteDevice), new k(gVar));
        }
        return y.f85009a;
    }
}
