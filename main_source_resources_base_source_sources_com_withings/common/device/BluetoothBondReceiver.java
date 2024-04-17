package com.withings.common.device;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: BluetoothBondReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/device/BluetoothBondReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BluetoothBondReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        u.j(context, "context");
        u.j(intent, "intent");
        if (u.e("android.bluetooth.device.action.BOND_STATE_CHANGED", intent.getAction())) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
            if (intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10) != 12 && intExtra == 12) {
                wi.c cVar = new wi.c(context, bluetoothDevice);
                fl.o oVar = (fl.o) x.K(fl.p.f67672b.a().l(cVar));
                if (oVar instanceof gl.a) {
                    BuildersKt.runBlocking(Dispatchers.getIO(), new f((gl.a) oVar, context, cVar, null));
                }
            }
        }
    }
}
