package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class StoredSignalMetaExtend extends h {
    public long duration;
    public long filterBank;
    public long totalSize;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 12;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 326;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.duration = readUnsignedInt(byteBuffer);
        this.totalSize = readUnsignedInt(byteBuffer);
        this.filterBank = readUnsignedInt(byteBuffer);
    }

    public StoredSignalMetaExtend setDuration(long j5) {
        this.duration = j5;
        return this;
    }

    public StoredSignalMetaExtend setFilterBank(long j5) {
        this.filterBank = j5;
        return this;
    }

    public StoredSignalMetaExtend setTotalSize(long j5) {
        this.totalSize = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.duration);
        writeUnsignedInt(e11, this.totalSize);
        writeUnsignedInt(e11, this.filterBank);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StoredSignalMetaExtend(");
        sb2.append("duration = " + this.duration);
        sb2.append(", ");
        sb2.append("totalSize = " + this.totalSize);
        sb2.append(", ");
        return j.b(new StringBuilder("filterBank = "), this.filterBank, sb2, ")");
    }
}
