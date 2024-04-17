package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class PressureTemperature extends h {
    public long[] calibCoefs;
    public int pressure;
    public int temperature;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 41;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2431;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.pressure = readInt(byteBuffer);
        this.temperature = readInt(byteBuffer);
        this.calibCoefs = readUnsignedIntArray(byteBuffer);
    }

    public PressureTemperature setCalibCoefs(long[] jArr) {
        this.calibCoefs = jArr;
        return this;
    }

    public PressureTemperature setPressure(int i11) {
        this.pressure = i11;
        return this;
    }

    public PressureTemperature setTemperature(int i11) {
        this.temperature = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.pressure);
        writeInt(e11, this.temperature);
        writeUnsignedIntArray(e11, this.calibCoefs);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PressureTemperature(");
        StringBuilder d11 = q.d(q.d(new StringBuilder("pressure = "), this.pressure, sb2, ", ", "temperature = "), this.temperature, sb2, ", ", "calibCoefs = ");
        d11.append(Arrays.toString(this.calibCoefs));
        sb2.append(d11.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
