package com.withings.common.device;

import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: BleOrBluetoothSetupDiscoverer.kt */
/* loaded from: classes3.dex */
public final class e implements gj.i<vi.o> {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.l<vi.o, y> f35187a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(ym0.l<? super vi.o, y> lVar) {
        this.f35187a = lVar;
    }

    @Override // gj.i
    public final Class<vi.o> b() {
        return vi.o.class;
    }

    @Override // gj.i
    public final void e(xi.b bVar) {
        vi.o remoteDevice = (vi.o) bVar;
        u.j(remoteDevice, "remoteDevice");
        this.f35187a.invoke(remoteDevice);
    }

    @Override // gj.i
    public final boolean g() {
        return false;
    }

    @Override // gj.i
    public final void a(yi.d dVar, int i11) {
    }
}
