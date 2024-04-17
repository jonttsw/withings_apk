package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WifiCountry extends h {
    public static final short DEL = 2;
    public static final short GET = 1;
    public static final short SET = 0;
    public byte cmd;
    public String country;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33283rc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.country;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 3);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 264;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.f33283rc = readByte(byteBuffer);
        this.country = readString(byteBuffer);
    }

    public WifiCountry setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public WifiCountry setCountry(String str) {
        this.country = str;
        return this;
    }

    public WifiCountry setRc(byte b10) {
        this.f33283rc = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.f33283rc);
        writeString(e11, this.country);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WifiCountry(");
        return c.c(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "rc = "), this.f33283rc, sb2, ", ", "country = "), this.country, sb2, ")");
    }
}
