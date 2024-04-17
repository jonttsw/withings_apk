package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class FwChunkRequest extends h {
    public long offset;
    public short packetMaxSize;
    public short percent;
    public long size;
    public long version;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 14;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2415;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.version = readUnsignedInt(byteBuffer);
        this.offset = readUnsignedInt(byteBuffer);
        this.size = readUnsignedInt(byteBuffer);
        this.percent = readUnsignedByte(byteBuffer);
        this.packetMaxSize = readUnsignedByte(byteBuffer);
    }

    public FwChunkRequest setOffset(long j5) {
        this.offset = j5;
        return this;
    }

    public FwChunkRequest setPacketMaxSize(short s11) {
        this.packetMaxSize = s11;
        return this;
    }

    public FwChunkRequest setPercent(short s11) {
        this.percent = s11;
        return this;
    }

    public FwChunkRequest setSize(long j5) {
        this.size = j5;
        return this;
    }

    public FwChunkRequest setVersion(long j5) {
        this.version = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.version);
        writeUnsignedInt(e11, this.offset);
        writeUnsignedInt(e11, this.size);
        writeUnsignedByte(e11, this.percent);
        writeUnsignedByte(e11, this.packetMaxSize);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FwChunkRequest(");
        sb2.append("version = " + this.version);
        sb2.append(", ");
        sb2.append("offset = " + this.offset);
        sb2.append(", ");
        sb2.append("size = " + this.size);
        sb2.append(", ");
        return e.a(q.d(new StringBuilder("percent = "), this.percent, sb2, ", ", "packetMaxSize = "), this.packetMaxSize, sb2, ")");
    }
}
