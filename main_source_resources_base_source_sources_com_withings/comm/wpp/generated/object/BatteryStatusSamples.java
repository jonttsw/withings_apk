package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class BatteryStatusSamples extends h {
    public static final short BATTERY_STATUS_SAMPLES_NB_MAX_VAL = 32;
    public int nbSamples;
    public int[] values;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 67;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2434;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.nbSamples = readUnsignedShort(byteBuffer);
        this.values = readUnsignedShortArray(byteBuffer);
    }

    public BatteryStatusSamples setNbSamples(int i11) {
        this.nbSamples = i11;
        return this;
    }

    public BatteryStatusSamples setValues(int[] iArr) {
        this.values = iArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.nbSamples);
        writeUnsignedShortArray(e11, this.values);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BatteryStatusSamples(");
        StringBuilder d11 = q.d(new StringBuilder("nbSamples = "), this.nbSamples, sb2, ", ", "values = ");
        d11.append(Arrays.toString(this.values));
        sb2.append(d11.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
