package com.withings.common.device.companion;

import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: CompanionLinkActivity.kt */
/* loaded from: classes3.dex */
final class j extends w implements ym0.l<BluetoothDevice, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f35118a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ xi.b f35119b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, xi.b bVar) {
        super(1);
        this.f35118a = gVar;
        this.f35119b = bVar;
    }

    @Override // ym0.l
    public final y invoke(BluetoothDevice bluetoothDevice) {
        BluetoothDevice it = bluetoothDevice;
        u.j(it, "it");
        String c11 = ((wi.c) this.f35119b).c();
        u.i(c11, "getAddress(...)");
        g.q0(this.f35118a, c11);
        return y.f85009a;
    }
}
