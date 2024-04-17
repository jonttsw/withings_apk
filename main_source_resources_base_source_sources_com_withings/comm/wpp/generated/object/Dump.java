package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Dump extends h {
    public static final short DEV_BANK1 = 3;
    public static final short DEV_BANK2 = 4;
    public static final short DEV_FLASH1 = 5;
    public static final short DEV_FLASH2 = 6;
    public static final short DEV_RAM = 1;
    public static final short DEV_ROM = 2;
    public short dev;
    public long len;
    public long offset;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 9;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_DUMP;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.dev = readUnsignedByte(byteBuffer);
        this.offset = readUnsignedInt(byteBuffer);
        this.len = readUnsignedInt(byteBuffer);
    }

    public Dump setDev(short s11) {
        this.dev = s11;
        return this;
    }

    public Dump setLen(long j5) {
        this.len = j5;
        return this;
    }

    public Dump setOffset(long j5) {
        this.offset = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.dev);
        writeUnsignedInt(e11, this.offset);
        writeUnsignedInt(e11, this.len);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dump(");
        StringBuilder d11 = q.d(new StringBuilder("dev = "), this.dev, sb2, ", ", "offset = ");
        d11.append(this.offset);
        sb2.append(d11.toString());
        sb2.append(", ");
        return j.b(new StringBuilder("len = "), this.len, sb2, ")");
    }
}
