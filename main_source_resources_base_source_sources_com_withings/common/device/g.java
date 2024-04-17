package com.withings.common.device;

import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: BleOrBluetoothSetupDiscoverer.kt */
/* loaded from: classes3.dex */
public final class g implements gj.i<wi.c> {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.l<wi.c, y> f35191a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(ym0.l<? super wi.c, y> lVar) {
        this.f35191a = lVar;
    }

    @Override // gj.i
    public final Class<wi.c> b() {
        return wi.c.class;
    }

    @Override // gj.i
    public final void e(xi.b bVar) {
        wi.c remoteDevice = (wi.c) bVar;
        u.j(remoteDevice, "remoteDevice");
        this.f35191a.invoke(remoteDevice);
    }

    @Override // gj.i
    public final boolean g() {
        return false;
    }

    @Override // gj.i
    public final void a(yi.d dVar, int i11) {
    }
}
