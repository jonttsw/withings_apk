package com.withings.common.device.companion;

import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import vi.o;
/* compiled from: CompanionLinkActivity.kt */
/* loaded from: classes3.dex */
final class h extends w implements ym0.l<BluetoothDevice, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f35116a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ xi.b f35117b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, xi.b bVar) {
        super(1);
        this.f35116a = gVar;
        this.f35117b = bVar;
    }

    @Override // ym0.l
    public final y invoke(BluetoothDevice bluetoothDevice) {
        BluetoothDevice it = bluetoothDevice;
        u.j(it, "it");
        String b10 = ((o) this.f35117b).b();
        u.i(b10, "getAddress(...)");
        g.q0(this.f35116a, b10);
        return y.f85009a;
    }
}
