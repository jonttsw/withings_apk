package com.withings.devicesetup.bonding;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import ej.w;
import gj.i;
import java.io.IOException;
import vi.h;
import vi.o;
import wi.c;
import yi.d;
@SuppressLint({"MissingPermission"})
@TargetApi(19)
/* loaded from: classes3.dex */
public class SetupBleBondConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private a f37706f = new a();

    /* renamed from: g  reason: collision with root package name */
    private i f37707g = new Object();

    /* loaded from: classes3.dex */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction()) && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
                String address = bluetoothDevice.getAddress();
                SetupBleBondConversation setupBleBondConversation = SetupBleBondConversation.this;
                if (address.equals(((o) setupBleBondConversation.x().j()).c().getAddress())) {
                    int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                    if (intExtra == 12) {
                        setupBleBondConversation.G(Boolean.TRUE);
                    } else if (intExtra == 10) {
                        setupBleBondConversation.G(Boolean.FALSE);
                    }
                }
            }
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, InterruptedException {
        w w11 = w.w();
        i iVar = this.f37707g;
        w11.o(iVar);
        Context r7 = r();
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        a aVar = this.f37706f;
        androidx.core.content.a.registerReceiver(r7, aVar, intentFilter, 2);
        Thread.sleep(1000L);
        B(30000L, true, false);
        try {
            ((o) x().j()).c().createBond();
            try {
                if (((Boolean) K()).booleanValue()) {
                    w.w().K(iVar);
                    ay.b.w(r(), aVar);
                    x70.b.s(this, v(), "Waiting some seconds to support FairPhone2...", new Object[0]);
                    Thread.sleep(2000L);
                    ((h) x().k().g()).C(new vi.w());
                    return;
                }
                throw new Exception("Bonding failed");
            } catch (ConversationException e11) {
                e = e11;
                throw new Exception("Bonding timed out or cancelled", e);
            } catch (WaitForInput.CancelException e12) {
                e = e12;
                throw new Exception("Bonding timed out or cancelled", e);
            } catch (InterruptedException e13) {
                e = e13;
                throw new Exception("Bonding timed out or cancelled", e);
            }
        } catch (Throwable th2) {
            w.w().K(iVar);
            ay.b.w(r(), aVar);
            throw th2;
        }
    }

    /* loaded from: classes3.dex */
    private static class b implements i<c> {
        @Override // gj.i
        public final Class<c> b() {
            return c.class;
        }

        @Override // gj.i
        public final /* bridge */ /* synthetic */ void e(xi.b bVar) {
            c cVar = (c) bVar;
        }

        @Override // gj.i
        public final boolean g() {
            return false;
        }

        @Override // gj.i
        public final void a(d dVar, int i11) {
        }
    }
}
