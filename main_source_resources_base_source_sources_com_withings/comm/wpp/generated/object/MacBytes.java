package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class MacBytes extends h {
    public short[] mac;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 7;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2483;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.mac = readUnsignedByteArray(byteBuffer);
    }

    public MacBytes setMac(short[] sArr) {
        this.mac = sArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByteArray(e11, this.mac);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MacBytes(");
        sb2.append("mac = " + Arrays.toString(this.mac));
        sb2.append(")");
        return sb2.toString();
    }
}
