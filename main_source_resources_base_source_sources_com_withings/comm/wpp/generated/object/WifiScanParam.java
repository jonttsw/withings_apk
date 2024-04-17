package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WifiScanParam extends h {
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
        return (short) (i11 + 1);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 258;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.ssid = readString(byteBuffer);
    }

    public WifiScanParam setSsid(String str) {
        this.ssid = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.ssid);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return c.c(new StringBuilder("ssid = "), this.ssid, new StringBuilder("WifiScanParam("), ")");
    }
}
