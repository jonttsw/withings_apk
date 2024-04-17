package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class SoftdeviceVersion extends h {
    public long companyId;
    public long subversion;
    public long version;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 12;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 313;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.version = readUnsignedInt(byteBuffer);
        this.subversion = readUnsignedInt(byteBuffer);
        this.companyId = readUnsignedInt(byteBuffer);
    }

    public SoftdeviceVersion setCompanyId(long j5) {
        this.companyId = j5;
        return this;
    }

    public SoftdeviceVersion setSubversion(long j5) {
        this.subversion = j5;
        return this;
    }

    public SoftdeviceVersion setVersion(long j5) {
        this.version = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.version);
        writeUnsignedInt(e11, this.subversion);
        writeUnsignedInt(e11, this.companyId);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SoftdeviceVersion(");
        sb2.append("version = " + this.version);
        sb2.append(", ");
        sb2.append("subversion = " + this.subversion);
        sb2.append(", ");
        return j.b(new StringBuilder("companyId = "), this.companyId, sb2, ")");
    }
}
