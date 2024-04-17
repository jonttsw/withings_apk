package com.withings.common.device;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.o0;
import androidx.camera.camera2.internal.p2;
import com.withings.device.Device;
import ej.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.u;
import wi.a;
/* compiled from: BleGattServer.kt */
/* loaded from: classes3.dex */
public abstract class a<D> implements a.InterfaceC1810a {

    /* renamed from: h  reason: collision with root package name */
    private static final UUID f35032h = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: a  reason: collision with root package name */
    private final Context f35033a;

    /* renamed from: b  reason: collision with root package name */
    private final wi.a f35034b;

    /* renamed from: c  reason: collision with root package name */
    private final BluetoothManager f35035c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35036d;

    /* renamed from: e  reason: collision with root package name */
    private BluetoothGattServer f35037e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashMap f35038f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f35039g;

    /* compiled from: BleGattServer.kt */
    /* renamed from: com.withings.common.device.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0455a<D> {

        /* renamed from: a  reason: collision with root package name */
        private final BluetoothDevice f35040a;

        /* renamed from: b  reason: collision with root package name */
        private final D f35041b;

        /* renamed from: c  reason: collision with root package name */
        private u70.i f35042c;

        /* renamed from: d  reason: collision with root package name */
        private int f35043d;

        public C0455a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0455a(BluetoothDevice device, fb0.d dVar) {
            u.j(device, "device");
            this.f35040a = device;
            this.f35041b = dVar;
            this.f35042c = null;
            this.f35043d = 23;
        }

        public final D a() {
            return this.f35041b;
        }

        public final BluetoothDevice b() {
            return this.f35040a;
        }

        public final u70.i c() {
            return this.f35042c;
        }

        public final int d() {
            return this.f35043d;
        }

        public final void e(u70.i iVar) {
            this.f35042c = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0455a)) {
                return false;
            }
            C0455a c0455a = (C0455a) obj;
            if (u.e(this.f35040a, c0455a.f35040a) && u.e(this.f35041b, c0455a.f35041b) && u.e(this.f35042c, c0455a.f35042c) && this.f35043d == c0455a.f35043d) {
                return true;
            }
            return false;
        }

        public final void f(int i11) {
            this.f35043d = i11;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.f35040a.hashCode() * 31;
            int i11 = 0;
            D d11 = this.f35041b;
            if (d11 == null) {
                hashCode = 0;
            } else {
                hashCode = d11.hashCode();
            }
            int i12 = (hashCode2 + hashCode) * 31;
            u70.i iVar = this.f35042c;
            if (iVar != null) {
                i11 = iVar.hashCode();
            }
            return Integer.hashCode(this.f35043d) + ((i12 + i11) * 31);
        }

        public final String toString() {
            BluetoothDevice bluetoothDevice = this.f35040a;
            return p2.c(bluetoothDevice.getName(), " (BLE mac: ", bluetoothDevice.getAddress(), ")");
        }
    }

    /* compiled from: BleGattServer.kt */
    /* loaded from: classes3.dex */
    public final class b extends BluetoothGattServerCallback {
        public b() {
        }

        private final void a(C0455a<?> c0455a, int i11, int i12, byte[] bArr) {
            int i13;
            a<D> aVar = a.this;
            aVar.getClass();
            if (a.m(c0455a)) {
                i13 = 0;
            } else {
                i13 = 257;
            }
            if (!a.m(c0455a)) {
                bArr = new byte[0];
            }
            byte[] bArr2 = bArr;
            BluetoothGattServer bluetoothGattServer = ((a) aVar).f35037e;
            u.g(bluetoothGattServer);
            bluetoothGattServer.sendResponse(c0455a.b(), i11, i13, i12, bArr2);
            if (!a.m(c0455a)) {
                x70.b.t(aVar, "The device is not authenticated, we sent a fake response to it and will close the connection !", new Object[0]);
                BluetoothGattServer bluetoothGattServer2 = ((a) aVar).f35037e;
                u.g(bluetoothGattServer2);
                bluetoothGattServer2.cancelConnection(c0455a.b());
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onCharacteristicReadRequest(BluetoothDevice device, int i11, int i12, BluetoothGattCharacteristic characteristic) {
            u.j(device, "device");
            u.j(characteristic, "characteristic");
            super.onCharacteristicReadRequest(device, i11, i12, characteristic);
            a<D> aVar = a.this;
            C0455a<?> d11 = a.d(aVar, device);
            if (d11 != null) {
                String h11 = a.h(aVar, characteristic);
                x70.b.r(aVar, "Characteristic read request from " + d11 + " on " + h11, new Object[0]);
                a(d11, i11, i12, characteristic.getValue());
                return;
            }
            throw new IllegalStateException("onCharacteristicReadRequest while client for device(" + device + ") is not found");
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onCharacteristicWriteRequest(BluetoothDevice device, int i11, BluetoothGattCharacteristic characteristic, boolean z5, boolean z11, int i12, byte[] value) {
            u.j(device, "device");
            u.j(characteristic, "characteristic");
            u.j(value, "value");
            super.onCharacteristicWriteRequest(device, i11, characteristic, z5, z11, i12, value);
            a<D> aVar = a.this;
            C0455a<?> d11 = a.d(aVar, device);
            if (d11 != null) {
                String h11 = a.h(aVar, characteristic);
                x70.b.r(aVar, "Characteristic write request from " + d11 + " on " + h11, new Object[0]);
                if (z11) {
                    a(d11, i11, i12, characteristic.getValue());
                }
                aVar.o(d11, characteristic, value);
                return;
            }
            throw new IllegalStateException("onCharacteristicWriteRequest while client for device(" + device + ") is not found");
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onConnectionStateChange(BluetoothDevice device, int i11, int i12) {
            u.j(device, "device");
            super.onConnectionStateChange(device, i11, i12);
            a<D> aVar = a.this;
            if (i12 == 2) {
                ((fb0.a) aVar).getClass();
                C0455a c0455a = new C0455a(device, new fb0.d());
                ((a) aVar).f35038f.put(device, c0455a);
                x70.b.r(aVar, c0455a + " connected to the gatt server", new Object[0]);
                return;
            }
            x70.b.r(aVar, ((C0455a) ((a) aVar).f35038f.remove(device)) + " disconnected to the gatt server", new Object[0]);
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onDescriptorReadRequest(BluetoothDevice device, int i11, int i12, BluetoothGattDescriptor descriptor) {
            u.j(device, "device");
            u.j(descriptor, "descriptor");
            super.onDescriptorReadRequest(device, i11, i12, descriptor);
            a<D> aVar = a.this;
            C0455a<?> d11 = a.d(aVar, device);
            if (d11 != null) {
                String i13 = a.i(aVar, descriptor);
                x70.b.r(aVar, "Descriptor read request from " + d11 + " on " + i13, new Object[0]);
                a(d11, i11, i12, descriptor.getValue());
                return;
            }
            throw new IllegalStateException("onDescriptorReadRequest while client for device(" + device + ") is not found");
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onDescriptorWriteRequest(BluetoothDevice device, int i11, BluetoothGattDescriptor descriptor, boolean z5, boolean z11, int i12, byte[] value) {
            u.j(device, "device");
            u.j(descriptor, "descriptor");
            u.j(value, "value");
            super.onDescriptorWriteRequest(device, i11, descriptor, z5, z11, i12, value);
            a<D> aVar = a.this;
            C0455a<?> d11 = a.d(aVar, device);
            if (d11 != null) {
                String i13 = a.i(aVar, descriptor);
                x70.b.r(aVar, "Descriptor write request from " + d11 + " on " + i13, new Object[0]);
                if (z11) {
                    a(d11, i11, i12, descriptor.getValue());
                }
                aVar.p(d11, descriptor, value);
                return;
            }
            throw new IllegalStateException("onDescriptorReadRequest while client for device(" + device + ") is not found");
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onExecuteWrite(BluetoothDevice device, int i11, boolean z5) {
            u.j(device, "device");
            super.onExecuteWrite(device, i11, z5);
            a<D> aVar = a.this;
            C0455a d11 = a.d(aVar, device);
            if (d11 != null) {
                x70.b.r(aVar, "Write executed from " + d11, new Object[0]);
                return;
            }
            throw new IllegalStateException("onExecuteWrite while client for device(" + device + ") is not found");
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onMtuChanged(BluetoothDevice device, int i11) {
            u.j(device, "device");
            super.onMtuChanged(device, i11);
            a<D> aVar = a.this;
            C0455a d11 = a.d(aVar, device);
            if (d11 != null) {
                d11.f(i11);
                x70.b.r(aVar, "Mtu changed for %s to %d", d11, Integer.valueOf(i11));
                return;
            }
            throw new IllegalStateException("onMtuChanged while client for device(" + device + ") is not found");
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onNotificationSent(BluetoothDevice device, int i11) {
            String a11;
            u.j(device, "device");
            super.onNotificationSent(device, i11);
            a<D> aVar = a.this;
            C0455a d11 = a.d(aVar, device);
            if (d11 != null) {
                if (i11 == 0) {
                    a11 = "successfully";
                } else {
                    a11 = o0.a("with error (", i11, ")");
                }
                x70.b.r(aVar, "Notification sent to " + d11 + " " + a11, new Object[0]);
                aVar.q(d11);
                return;
            }
            throw new IllegalStateException("onNotificationSent while client for device(" + device + ") is not found");
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onServiceAdded(int i11, BluetoothGattService service) {
            String a11;
            u.j(service, "service");
            super.onServiceAdded(i11, service);
            a<D> aVar = a.this;
            aVar.getClass();
            if (i11 == 0) {
                a11 = "successfully";
            } else {
                a11 = o0.a("with error (", i11, ")");
            }
            UUID uuid = service.getUuid();
            x70.b.r(aVar, "The following gatt service has been added " + a11 + " : " + uuid, new Object[0]);
        }
    }

    public a(Context context) {
        wi.a aVar;
        u.j(context, "context");
        this.f35033a = context;
        aVar = wi.a.f105219d;
        if (aVar == null) {
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            aVar = new wi.a(applicationContext);
            wi.a.f105219d = aVar;
        }
        this.f35034b = aVar;
        this.f35035c = (BluetoothManager) androidx.core.content.a.getSystemService(context, BluetoothManager.class);
        this.f35038f = new LinkedHashMap();
        this.f35039g = new Handler(Looper.getMainLooper());
    }

    public static void b(a this$0) {
        u.j(this$0, "this$0");
        if (this$0.f35034b.f()) {
            this$0.r();
        }
    }

    public static final C0455a d(a aVar, BluetoothDevice bluetoothDevice) {
        C0455a c0455a = (C0455a) aVar.f35038f.get(bluetoothDevice);
        if (c0455a != null && !m(c0455a)) {
            j(c0455a);
        }
        return c0455a;
    }

    public static final /* synthetic */ String h(a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        aVar.getClass();
        return t(bluetoothGattCharacteristic);
    }

    public static final String i(a aVar, BluetoothGattDescriptor bluetoothGattDescriptor) {
        aVar.getClass();
        UUID uuid = bluetoothGattDescriptor.getUuid();
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        u.i(characteristic, "getCharacteristic(...)");
        String t11 = t(characteristic);
        return "descriptor " + uuid + " of " + t11;
    }

    private static boolean j(C0455a c0455a) {
        for (Device device : kn.e.c().m()) {
            cj.b D = w.w().D(device.getMacAddress());
            if (D != null) {
                xi.b j5 = D.j();
                if ((j5 instanceof vi.o) && u.e(((vi.o) j5).c(), c0455a.b())) {
                    c0455a.e(device.getMacAddress());
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(C0455a c0455a) {
        u.j(c0455a, "<this>");
        if (c0455a.c() != null) {
            return true;
        }
        return false;
    }

    private final void r() {
        Object a11;
        if (this.f35037e == null) {
            this.f35038f.clear();
            BluetoothManager bluetoothManager = this.f35035c;
            u.g(bluetoothManager);
            BluetoothGattServer openGattServer = bluetoothManager.openGattServer(this.f35033a, new b());
            this.f35037e = openGattServer;
            if (openGattServer != null) {
                try {
                    a11 = Boolean.valueOf(openGattServer.addService(l()));
                } catch (Throwable th2) {
                    a11 = nm0.l.a(th2);
                }
                Throwable b10 = nm0.k.b(a11);
                if (b10 != null) {
                    x70.b.f(this, b10, "Unable to add service to gatt server", new Object[0]);
                }
                if (nm0.k.b(a11) != null) {
                    a11 = Boolean.FALSE;
                }
                if (((Boolean) a11).booleanValue()) {
                    return;
                }
            }
            Handler handler = this.f35039g;
            handler.removeCallbacksAndMessages(null);
            BluetoothGattServer bluetoothGattServer = this.f35037e;
            if (bluetoothGattServer != null) {
                bluetoothGattServer.close();
            }
            this.f35037e = null;
            handler.postDelayed(new e0.f(this, 5), 5000L);
        }
    }

    private static String t(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        UUID uuid2 = bluetoothGattCharacteristic.getService().getUuid();
        return "characteristic " + uuid + " of service " + uuid2;
    }

    @Override // wi.a.InterfaceC1810a
    public final void c(boolean z5) {
        if (this.f35034b.f()) {
            r();
            return;
        }
        this.f35039g.removeCallbacksAndMessages(null);
        BluetoothGattServer bluetoothGattServer = this.f35037e;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
        }
        this.f35037e = null;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f35038f.values()) {
            C0455a c0455a = (C0455a) obj;
            if (m(c0455a) || j(c0455a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    protected abstract BluetoothGattService l();

    public final void n(C0455a c0455a, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattServer bluetoothGattServer = this.f35037e;
        if (bluetoothGattServer != null) {
            if (!m(c0455a)) {
                bluetoothGattServer = null;
            }
            if (bluetoothGattServer != null) {
                boolean notifyCharacteristicChanged = bluetoothGattServer.notifyCharacteristicChanged(c0455a.b(), bluetoothGattCharacteristic, false);
                x70.b.r(this, "Notify characteristic changed success : " + notifyCharacteristicChanged, new Object[0]);
            }
        }
    }

    protected abstract void o(C0455a c0455a, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    protected abstract void p(C0455a c0455a, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr);

    protected abstract void q(C0455a c0455a);

    public final void s() {
        if (!this.f35036d) {
            this.f35036d = true;
            wi.a aVar = this.f35034b;
            aVar.g(this);
            if (aVar.f()) {
                r();
            }
        }
    }
}
