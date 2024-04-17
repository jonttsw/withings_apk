package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Weighttest extends h {
    public static final short CLOSELOOP = 0;
    public static final short ERR_FAIL = -1;
    public static final short ERR_OK = 0;
    public static final short SETADCMAX = 1;
    public static final short STABLETIME = 2;
    public static final short WCAL = 3;
    public long adc;
    public byte cmd;
    public long dac;
    public long deltaMax;
    public long noiseMean;
    public long noisePeak;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33282rc;
    public long time;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 26;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 521;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.adc = readUnsignedInt(byteBuffer);
        this.dac = readUnsignedInt(byteBuffer);
        this.time = readUnsignedInt(byteBuffer);
        this.noiseMean = readUnsignedInt(byteBuffer);
        this.noisePeak = readUnsignedInt(byteBuffer);
        this.deltaMax = readUnsignedInt(byteBuffer);
        this.f33282rc = readByte(byteBuffer);
    }

    public Weighttest setAdc(long j5) {
        this.adc = j5;
        return this;
    }

    public Weighttest setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Weighttest setDac(long j5) {
        this.dac = j5;
        return this;
    }

    public Weighttest setDeltaMax(long j5) {
        this.deltaMax = j5;
        return this;
    }

    public Weighttest setNoiseMean(long j5) {
        this.noiseMean = j5;
        return this;
    }

    public Weighttest setNoisePeak(long j5) {
        this.noisePeak = j5;
        return this;
    }

    public Weighttest setRc(byte b10) {
        this.f33282rc = b10;
        return this;
    }

    public Weighttest setTime(long j5) {
        this.time = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeUnsignedInt(e11, this.adc);
        writeUnsignedInt(e11, this.dac);
        writeUnsignedInt(e11, this.time);
        writeUnsignedInt(e11, this.noiseMean);
        writeUnsignedInt(e11, this.noisePeak);
        writeUnsignedInt(e11, this.deltaMax);
        writeByte(e11, this.f33282rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Weighttest(");
        StringBuilder d11 = q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "adc = ");
        d11.append(this.adc);
        sb2.append(d11.toString());
        sb2.append(", ");
        sb2.append("dac = " + this.dac);
        sb2.append(", ");
        sb2.append("time = " + this.time);
        sb2.append(", ");
        sb2.append("noiseMean = " + this.noiseMean);
        sb2.append(", ");
        sb2.append("noisePeak = " + this.noisePeak);
        sb2.append(", ");
        sb2.append("deltaMax = " + this.deltaMax);
        sb2.append(", ");
        return e.a(new StringBuilder("rc = "), this.f33282rc, sb2, ")");
    }
}
