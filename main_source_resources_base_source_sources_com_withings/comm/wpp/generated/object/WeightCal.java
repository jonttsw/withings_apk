package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class WeightCal extends h {
    public int[] cell100;
    public int[] cell150;
    public int[] cell50;
    public int[] dac;
    public long factoryG;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 72;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 524;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.factoryG = readUnsignedInt(byteBuffer);
        this.dac = readIntArray(byteBuffer);
        this.cell50 = readIntArray(byteBuffer);
        this.cell100 = readIntArray(byteBuffer);
        this.cell150 = readIntArray(byteBuffer);
    }

    public WeightCal setCell100(int[] iArr) {
        this.cell100 = iArr;
        return this;
    }

    public WeightCal setCell150(int[] iArr) {
        this.cell150 = iArr;
        return this;
    }

    public WeightCal setCell50(int[] iArr) {
        this.cell50 = iArr;
        return this;
    }

    public WeightCal setDac(int[] iArr) {
        this.dac = iArr;
        return this;
    }

    public WeightCal setFactoryG(long j5) {
        this.factoryG = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.factoryG);
        writeIntArray(e11, this.dac);
        writeIntArray(e11, this.cell50);
        writeIntArray(e11, this.cell100);
        writeIntArray(e11, this.cell150);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WeightCal(");
        sb2.append("factoryG = " + this.factoryG);
        sb2.append(", ");
        sb2.append("dac = " + Arrays.toString(this.dac));
        sb2.append(", ");
        sb2.append("cell50 = " + Arrays.toString(this.cell50));
        sb2.append(", ");
        sb2.append("cell100 = " + Arrays.toString(this.cell100));
        sb2.append(", ");
        sb2.append("cell150 = " + Arrays.toString(this.cell150));
        sb2.append(")");
        return sb2.toString();
    }
}
