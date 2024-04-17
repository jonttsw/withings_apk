package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class Wpakey extends h {
    public short[] octet;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 33;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 267;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.octet = readUnsignedByteArray(byteBuffer);
    }

    public Wpakey setOctet(short[] sArr) {
        this.octet = sArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByteArray(e11, this.octet);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Wpakey(");
        sb2.append("octet = " + Arrays.toString(this.octet));
        sb2.append(")");
        return sb2.toString();
    }
}
