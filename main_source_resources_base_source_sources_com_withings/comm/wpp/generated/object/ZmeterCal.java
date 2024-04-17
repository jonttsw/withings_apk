package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class ZmeterCal extends h {
    public int freq;
    public int[] iCr;
    public short index;
    public int[] phCr;
    public int[] uCr;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 44;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 527;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.index = readUnsignedByte(byteBuffer);
        this.freq = readInt(byteBuffer);
        this.iCr = readIntArray(byteBuffer);
        this.uCr = readIntArray(byteBuffer);
        this.phCr = readIntArray(byteBuffer);
    }

    public ZmeterCal setFreq(int i11) {
        this.freq = i11;
        return this;
    }

    public ZmeterCal setICr(int[] iArr) {
        this.iCr = iArr;
        return this;
    }

    public ZmeterCal setIndex(short s11) {
        this.index = s11;
        return this;
    }

    public ZmeterCal setPhCr(int[] iArr) {
        this.phCr = iArr;
        return this;
    }

    public ZmeterCal setUCr(int[] iArr) {
        this.uCr = iArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.index);
        writeInt(e11, this.freq);
        writeIntArray(e11, this.iCr);
        writeIntArray(e11, this.uCr);
        writeIntArray(e11, this.phCr);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ZmeterCal(");
        StringBuilder d11 = q.d(q.d(new StringBuilder("index = "), this.index, sb2, ", ", "freq = "), this.freq, sb2, ", ", "iCr = ");
        d11.append(Arrays.toString(this.iCr));
        sb2.append(d11.toString());
        sb2.append(", ");
        sb2.append("uCr = " + Arrays.toString(this.uCr));
        sb2.append(", ");
        sb2.append("phCr = " + Arrays.toString(this.phCr));
        sb2.append(")");
        return sb2.toString();
    }
}
