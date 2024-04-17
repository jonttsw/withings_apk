package com.withings.device.ws;

import android.util.ArrayMap;
import androidx.camera.core.impl.utils.k;
import com.withings.device.Device;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.Once;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kn.e;
import u70.i;
import x70.b;
/* loaded from: classes3.dex */
public class DeviceSessionProvider {
    private static DeviceSessionProvider instance = new DeviceSessionProvider();
    private Map<i, DeviceSession> mDeviceSessions = new ArrayMap();

    private DeviceSessionProvider() {
    }

    private void cleanOldSession() {
        ArrayList arrayList = new ArrayList(1);
        for (i iVar : this.mDeviceSessions.keySet()) {
            if (!this.mDeviceSessions.get(iVar).isStillValid()) {
                arrayList.add(iVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar2 = (i) it.next();
            this.mDeviceSessions.remove(iVar2);
            b.s(this, iVar2, "Removing device session for : " + iVar2, new Object[0]);
        }
    }

    public static DeviceSessionProvider get() {
        return instance;
    }

    public synchronized DeviceSession getNewSession(DeviceCredentials deviceCredentials) throws WsAuthFailedException {
        return getNewSession(deviceCredentials, null);
    }

    public synchronized DeviceSession getSession(DeviceCredentials deviceCredentials) throws WsAuthFailedException {
        cleanOldSession();
        DeviceSession deviceSession = this.mDeviceSessions.get(deviceCredentials.getMacAddress());
        if (deviceSession != null && deviceSession.isStillValid()) {
            return deviceSession.m37clone();
        }
        return getNewSession(deviceCredentials);
    }

    public synchronized void remove(i iVar) {
        this.mDeviceSessions.remove(iVar);
    }

    public synchronized DeviceSession getNewSession(DeviceCredentials deviceCredentials, Integer num) throws WsAuthFailedException {
        DeviceSession deviceSession;
        try {
            SessionApi sessionApi = (SessionApi) Webservices.get().getApiBuilder().build(SessionApi.class);
            Once once = sessionApi.getOnce();
            String d11 = k.d(deviceCredentials.getMacAddress().toString() + ":" + deviceCredentials.getSecret() + ":" + once.once);
            String valueOf = String.valueOf(600L);
            Device f11 = e.c().f(deviceCredentials.getMacAddress());
            deviceSession = sessionApi.getDeviceSession(deviceCredentials.getMacAddress().toString(), d11, valueOf, deviceCredentials.getFirmware(), deviceCredentials.getMfgId(), f11 != null ? Integer.valueOf(f11.getBatteryLevel()) : null, num, "t", 2);
            deviceSession.mac = deviceCredentials.getMacAddress().toString();
            deviceSession.mCreationTime = System.currentTimeMillis();
            this.mDeviceSessions.put(deviceCredentials.getMacAddress(), deviceSession);
        } catch (Throwable th2) {
            throw th2;
        }
        return deviceSession.m37clone();
    }
}
