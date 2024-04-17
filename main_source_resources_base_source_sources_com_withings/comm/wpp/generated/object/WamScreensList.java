package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class WamScreensList extends h {
    public short[] screenNumbers;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 25;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1289;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.screenNumbers = readUnsignedByteArray(byteBuffer);
    }

    public WamScreensList setScreenNumbers(short[] sArr) {
        this.screenNumbers = sArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByteArray(e11, this.screenNumbers);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WamScreensList(");
        sb2.append("screenNumbers = " + Arrays.toString(this.screenNumbers));
        sb2.append(")");
        return sb2.toString();
    }
}
