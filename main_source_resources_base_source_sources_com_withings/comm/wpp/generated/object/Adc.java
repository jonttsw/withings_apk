package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Adc extends h {
    public static final short GET = 0;
    public byte adc;
    public byte bank;
    public byte cmd;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33235rc;
    public long sample;
    public long val;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 12;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 522;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.bank = readByte(byteBuffer);
        this.adc = readByte(byteBuffer);
        this.val = readUnsignedInt(byteBuffer);
        this.sample = readUnsignedInt(byteBuffer);
        this.f33235rc = readByte(byteBuffer);
    }

    public Adc setAdc(byte b10) {
        this.adc = b10;
        return this;
    }

    public Adc setBank(byte b10) {
        this.bank = b10;
        return this;
    }

    public Adc setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Adc setRc(byte b10) {
        this.f33235rc = b10;
        return this;
    }

    public Adc setSample(long j5) {
        this.sample = j5;
        return this;
    }

    public Adc setVal(long j5) {
        this.val = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.bank);
        writeByte(e11, this.adc);
        writeUnsignedInt(e11, this.val);
        writeUnsignedInt(e11, this.sample);
        writeByte(e11, this.f33235rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Adc(");
        StringBuilder d11 = q.d(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "bank = "), this.bank, sb2, ", ", "adc = "), this.adc, sb2, ", ", "val = ");
        d11.append(this.val);
        sb2.append(d11.toString());
        sb2.append(", ");
        sb2.append("sample = " + this.sample);
        sb2.append(", ");
        return e.a(new StringBuilder("rc = "), this.f33235rc, sb2, ")");
    }
}
