package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class DebugDumpType extends h {
    public long size;
    public long type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 287;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedInt(byteBuffer);
        this.size = readUnsignedInt(byteBuffer);
    }

    public DebugDumpType setSize(long j5) {
        this.size = j5;
        return this;
    }

    public DebugDumpType setType(long j5) {
        this.type = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.type);
        writeUnsignedInt(e11, this.size);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DebugDumpType(");
        sb2.append("type = " + this.type);
        sb2.append(", ");
        return j.b(new StringBuilder("size = "), this.size, sb2, ")");
    }
}
