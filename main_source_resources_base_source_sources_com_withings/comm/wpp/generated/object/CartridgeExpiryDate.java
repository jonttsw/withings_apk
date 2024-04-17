package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CartridgeExpiryDate extends h {
    public long effectiveExpiryDate;
    public long printedExpiryDate;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 16;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2492;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.effectiveExpiryDate = readUnsignedLong(byteBuffer);
        this.printedExpiryDate = readUnsignedLong(byteBuffer);
    }

    public CartridgeExpiryDate setEffectiveExpiryDate(long j5) {
        this.effectiveExpiryDate = j5;
        return this;
    }

    public CartridgeExpiryDate setPrintedExpiryDate(long j5) {
        this.printedExpiryDate = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedLong(e11, this.effectiveExpiryDate);
        writeUnsignedLong(e11, this.printedExpiryDate);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CartridgeExpiryDate(");
        sb2.append("effectiveExpiryDate = " + this.effectiveExpiryDate);
        sb2.append(", ");
        return j.b(new StringBuilder("printedExpiryDate = "), this.printedExpiryDate, sb2, ")");
    }
}
