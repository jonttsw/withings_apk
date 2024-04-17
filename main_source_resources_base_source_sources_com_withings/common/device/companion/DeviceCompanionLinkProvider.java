package com.withings.common.device.companion;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.companion.AssociationRequest;
import android.companion.BluetoothLeDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.withings.authentication.verifyauthentication.q;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: DeviceCompanionLinkProvider.kt */
/* loaded from: classes3.dex */
public final class DeviceCompanionLinkProvider {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.activity.result.b<IntentSenderRequest> f35084a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap f35085b;

    /* renamed from: c  reason: collision with root package name */
    private final CompanionDeviceManager f35086c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceCompanionLinkProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/companion/DeviceCompanionLinkProvider$ConnectionType;", "", "common-device_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ConnectionType {

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ ConnectionType[] f35087a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f35088b = 0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.device.companion.DeviceCompanionLinkProvider$ConnectionType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.device.companion.DeviceCompanionLinkProvider$ConnectionType] */
        static {
            ConnectionType[] connectionTypeArr = {new Enum("BLE", 0), new Enum("BLUETOOTH", 1)};
            f35087a = connectionTypeArr;
            sm0.b.a(connectionTypeArr);
        }

        private ConnectionType() {
            throw null;
        }

        public static ConnectionType valueOf(String str) {
            return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
        }

        public static ConnectionType[] values() {
            return (ConnectionType[]) f35087a.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceCompanionLinkProvider.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ym0.l<BluetoothDevice, y> f35089a;

        /* renamed from: b  reason: collision with root package name */
        private final ym0.l<String, y> f35090b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ym0.l<? super BluetoothDevice, y> lVar, ym0.l<? super String, y> lVar2) {
            this.f35089a = lVar;
            this.f35090b = lVar2;
        }

        public final ym0.l<String, y> a() {
            return this.f35090b;
        }

        public final ym0.l<BluetoothDevice, y> b() {
            return this.f35089a;
        }
    }

    public DeviceCompanionLinkProvider(CompanionLinkActivity activity) {
        u.j(activity, "activity");
        this.f35085b = new LinkedHashMap();
        Object systemService = androidx.core.content.a.getSystemService(activity, CompanionDeviceManager.class);
        u.g(systemService);
        this.f35086c = (CompanionDeviceManager) systemService;
        androidx.activity.result.b<IntentSenderRequest> registerForActivityResult = activity.registerForActivityResult(new g.a(), new q(this, 1));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f35084a = registerForActivityResult;
    }

    public static void a(DeviceCompanionLinkProvider this$0, ActivityResult activityResult) {
        Object obj;
        BluetoothDevice bluetoothDevice;
        ym0.l<BluetoothDevice, y> b10;
        ScanResult scanResult;
        Bundle extras;
        u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            Intent a11 = activityResult.a();
            BluetoothDevice bluetoothDevice2 = null;
            if (a11 != null && (extras = a11.getExtras()) != null) {
                obj = extras.get("android.companion.extra.DEVICE");
            } else {
                obj = null;
            }
            if (obj instanceof BluetoothDevice) {
                bluetoothDevice = (BluetoothDevice) obj;
            } else {
                bluetoothDevice = null;
            }
            if (bluetoothDevice == null) {
                if (obj instanceof ScanResult) {
                    scanResult = (ScanResult) obj;
                } else {
                    scanResult = null;
                }
                if (scanResult != null) {
                    bluetoothDevice2 = scanResult.getDevice();
                }
            } else {
                bluetoothDevice2 = bluetoothDevice;
            }
            if (bluetoothDevice2 != null) {
                LinkedHashMap linkedHashMap = this$0.f35085b;
                a aVar = (a) linkedHashMap.get(bluetoothDevice2.getAddress());
                linkedHashMap.remove(bluetoothDevice2.getAddress());
                if (aVar != null && (b10 = aVar.b()) != null) {
                    b10.invoke(bluetoothDevice2);
                }
            }
        }
    }

    public final void d(String str, ym0.l lVar, ym0.l lVar2) {
        int i11 = ConnectionType.f35088b;
        this.f35085b.put(str, new a(lVar, lVar2));
        BluetoothLeDeviceFilter build = new BluetoothLeDeviceFilter.Builder().setScanFilter(new ScanFilter.Builder().setDeviceAddress(str).build()).build();
        u.i(build, "build(...)");
        AssociationRequest build2 = new AssociationRequest.Builder().addDeviceFilter(build).setSingleDevice(false).build();
        u.i(build2, "build(...)");
        this.f35086c.associate(build2, new n(this, str), null);
    }
}
