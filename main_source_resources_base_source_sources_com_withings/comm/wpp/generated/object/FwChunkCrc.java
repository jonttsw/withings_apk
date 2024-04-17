package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class FwChunkCrc extends h {
    public long crc;
    public long offset;
    public long size;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 12;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2417;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.offset = readUnsignedInt(byteBuffer);
        this.size = readUnsignedInt(byteBuffer);
        this.crc = readUnsignedInt(byteBuffer);
    }

    public FwChunkCrc setCrc(long j5) {
        this.crc = j5;
        return this;
    }

    public FwChunkCrc setOffset(long j5) {
        this.offset = j5;
        return this;
    }

    public FwChunkCrc setSize(long j5) {
        this.size = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.offset);
        writeUnsignedInt(e11, this.size);
        writeUnsignedInt(e11, this.crc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FwChunkCrc(");
        sb2.append("offset = " + this.offset);
        sb2.append(", ");
        sb2.append("size = " + this.size);
        sb2.append(", ");
        return j.b(new StringBuilder("crc = "), this.crc, sb2, ")");
    }
}
