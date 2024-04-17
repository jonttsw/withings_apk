package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class FwInfo extends h {
    public static final short FW_INFO_SHA1_LEN = 20;
    public long crc;
    public short[] sha1;
    public long size;
    public long version;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 33;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2414;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.version = readUnsignedInt(byteBuffer);
        this.size = readUnsignedInt(byteBuffer);
        this.crc = readUnsignedInt(byteBuffer);
        this.sha1 = readUnsignedByteArray(byteBuffer);
    }

    public FwInfo setCrc(long j5) {
        this.crc = j5;
        return this;
    }

    public FwInfo setSha1(short[] sArr) {
        this.sha1 = sArr;
        return this;
    }

    public FwInfo setSize(long j5) {
        this.size = j5;
        return this;
    }

    public FwInfo setVersion(long j5) {
        this.version = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.version);
        writeUnsignedInt(e11, this.size);
        writeUnsignedInt(e11, this.crc);
        writeUnsignedByteArray(e11, this.sha1);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FwInfo(");
        sb2.append("version = " + this.version);
        sb2.append(", ");
        sb2.append("size = " + this.size);
        sb2.append(", ");
        sb2.append("crc = " + this.crc);
        sb2.append(", ");
        sb2.append("sha1 = " + Arrays.toString(this.sha1));
        sb2.append(")");
        return sb2.toString();
    }
}
