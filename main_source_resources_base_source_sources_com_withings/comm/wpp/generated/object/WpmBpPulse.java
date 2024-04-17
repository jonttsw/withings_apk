package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WpmBpPulse extends h {
    public int amp;
    public long energy;
    public long pressure;
    public int qwave;
    public long time;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 16;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1893;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.pressure = readUnsignedInt(byteBuffer);
        this.energy = readUnsignedInt(byteBuffer);
        this.qwave = readUnsignedShort(byteBuffer);
        this.time = readUnsignedInt(byteBuffer);
        this.amp = readUnsignedShort(byteBuffer);
    }

    public WpmBpPulse setAmp(int i11) {
        this.amp = i11;
        return this;
    }

    public WpmBpPulse setEnergy(long j5) {
        this.energy = j5;
        return this;
    }

    public WpmBpPulse setPressure(long j5) {
        this.pressure = j5;
        return this;
    }

    public WpmBpPulse setQwave(int i11) {
        this.qwave = i11;
        return this;
    }

    public WpmBpPulse setTime(long j5) {
        this.time = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.pressure);
        writeUnsignedInt(e11, this.energy);
        writeUnsignedShort(e11, this.qwave);
        writeUnsignedInt(e11, this.time);
        writeUnsignedShort(e11, this.amp);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WpmBpPulse(");
        sb2.append("pressure = " + this.pressure);
        sb2.append(", ");
        sb2.append("energy = " + this.energy);
        sb2.append(", ");
        StringBuilder d11 = q.d(new StringBuilder("qwave = "), this.qwave, sb2, ", ", "time = ");
        d11.append(this.time);
        sb2.append(d11.toString());
        sb2.append(", ");
        return e.a(new StringBuilder("amp = "), this.amp, sb2, ")");
    }
}
