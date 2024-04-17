package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WifiApConnect extends h {
    public String password;
    public String ssid;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.ssid;
        int i12 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i13 = i11 + 1;
        String str2 = this.password;
        if (str2 != null) {
            i12 = str2.getBytes().length;
        }
        return (short) (i12 + 1 + i13);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 260;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.ssid = readString(byteBuffer);
        this.password = readString(byteBuffer);
    }

    public WifiApConnect setPassword(String str) {
        this.password = str;
        return this;
    }

    public WifiApConnect setSsid(String str) {
        this.ssid = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.ssid);
        writeString(e11, this.password);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WifiApConnect(");
        return c.c(a0.c(new StringBuilder("ssid = "), this.ssid, sb2, ", ", "password = "), this.password, sb2, ")");
    }
}
