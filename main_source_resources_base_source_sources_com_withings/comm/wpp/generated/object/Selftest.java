package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Selftest extends h {
    public static final short DEV_AC20B = 1;
    public static final short ERR_FAIL = -1;
    public static final short ERR_OK = 0;
    public int dev;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33268rc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 3;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_SELFTEST;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.dev = readUnsignedShort(byteBuffer);
        this.f33268rc = readByte(byteBuffer);
    }

    public Selftest setDev(int i11) {
        this.dev = i11;
        return this;
    }

    public Selftest setRc(byte b10) {
        this.f33268rc = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.dev);
        writeByte(e11, this.f33268rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Selftest(");
        return e.a(q.d(new StringBuilder("dev = "), this.dev, sb2, ", ", "rc = "), this.f33268rc, sb2, ")");
    }
}
