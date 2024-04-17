package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CovidEbidEcc extends h {
    public long ebid;
    public short ecc;
    public long epoch;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 13;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2456;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.epoch = readUnsignedInt(byteBuffer);
        this.ebid = readUnsignedLong(byteBuffer);
        this.ecc = readUnsignedByte(byteBuffer);
    }

    public CovidEbidEcc setEbid(long j5) {
        this.ebid = j5;
        return this;
    }

    public CovidEbidEcc setEcc(short s11) {
        this.ecc = s11;
        return this;
    }

    public CovidEbidEcc setEpoch(long j5) {
        this.epoch = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.epoch);
        writeUnsignedLong(e11, this.ebid);
        writeUnsignedByte(e11, this.ecc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CovidEbidEcc(");
        sb2.append("epoch = " + this.epoch);
        sb2.append(", ");
        sb2.append("ebid = " + this.ebid);
        sb2.append(", ");
        return e.a(new StringBuilder("ecc = "), this.ecc, sb2, ")");
    }
}
