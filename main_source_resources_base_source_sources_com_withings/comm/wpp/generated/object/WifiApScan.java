package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WifiApScan extends h {
    public int authFlags;
    public byte rssi;
    public String ssid;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.ssid;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 4);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 259;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.ssid = readString(byteBuffer);
        this.rssi = readByte(byteBuffer);
        this.authFlags = readUnsignedShort(byteBuffer);
    }

    public WifiApScan setAuthFlags(int i11) {
        this.authFlags = i11;
        return this;
    }

    public WifiApScan setRssi(byte b10) {
        this.rssi = b10;
        return this;
    }

    public WifiApScan setSsid(String str) {
        this.ssid = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.ssid);
        writeByte(e11, this.rssi);
        writeUnsignedShort(e11, this.authFlags);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WifiApScan(");
        return e.a(q.d(a0.c(new StringBuilder("ssid = "), this.ssid, sb2, ", ", "rssi = "), this.rssi, sb2, ", ", "authFlags = "), this.authFlags, sb2, ")");
    }
}
