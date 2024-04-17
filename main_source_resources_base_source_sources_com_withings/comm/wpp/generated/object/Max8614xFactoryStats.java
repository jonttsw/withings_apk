package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Max8614xFactoryStats extends h {
    public long acGreen;
    public long acGreenPa;
    public long acIr;
    public long acIrPa;
    public long acRed;
    public long acRedPa;
    public short adcRangeGreen;
    public short adcRangeIr;
    public short adcRangeRed;
    public long dcGreen;
    public long dcGreenPa;
    public long dcIr;
    public long dcIrPa;
    public long dcRed;
    public long dcRedPa;
    public short ledRangeGreen;
    public short ledRangeIr;
    public short ledRangeRed;
    public short ledValueGreen;
    public short ledValueIr;
    public short ledValueRed;

    /* renamed from: r  reason: collision with root package name */
    public long f33259r;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 61;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2444;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.acRed = readUnsignedInt(byteBuffer);
        this.acRedPa = readUnsignedInt(byteBuffer);
        this.dcRed = readUnsignedInt(byteBuffer);
        this.dcRedPa = readUnsignedInt(byteBuffer);
        this.acIr = readUnsignedInt(byteBuffer);
        this.acIrPa = readUnsignedInt(byteBuffer);
        this.dcIr = readUnsignedInt(byteBuffer);
        this.dcIrPa = readUnsignedInt(byteBuffer);
        this.acGreen = readUnsignedInt(byteBuffer);
        this.acGreenPa = readUnsignedInt(byteBuffer);
        this.dcGreen = readUnsignedInt(byteBuffer);
        this.dcGreenPa = readUnsignedInt(byteBuffer);
        this.f33259r = readUnsignedInt(byteBuffer);
        this.ledValueRed = readUnsignedByte(byteBuffer);
        this.ledRangeRed = readUnsignedByte(byteBuffer);
        this.adcRangeRed = readUnsignedByte(byteBuffer);
        this.ledValueIr = readUnsignedByte(byteBuffer);
        this.ledRangeIr = readUnsignedByte(byteBuffer);
        this.adcRangeIr = readUnsignedByte(byteBuffer);
        this.ledValueGreen = readUnsignedByte(byteBuffer);
        this.ledRangeGreen = readUnsignedByte(byteBuffer);
        this.adcRangeGreen = readUnsignedByte(byteBuffer);
    }

    public Max8614xFactoryStats setAcGreen(long j5) {
        this.acGreen = j5;
        return this;
    }

    public Max8614xFactoryStats setAcGreenPa(long j5) {
        this.acGreenPa = j5;
        return this;
    }

    public Max8614xFactoryStats setAcIr(long j5) {
        this.acIr = j5;
        return this;
    }

    public Max8614xFactoryStats setAcIrPa(long j5) {
        this.acIrPa = j5;
        return this;
    }

    public Max8614xFactoryStats setAcRed(long j5) {
        this.acRed = j5;
        return this;
    }

    public Max8614xFactoryStats setAcRedPa(long j5) {
        this.acRedPa = j5;
        return this;
    }

    public Max8614xFactoryStats setAdcRangeGreen(short s11) {
        this.adcRangeGreen = s11;
        return this;
    }

    public Max8614xFactoryStats setAdcRangeIr(short s11) {
        this.adcRangeIr = s11;
        return this;
    }

    public Max8614xFactoryStats setAdcRangeRed(short s11) {
        this.adcRangeRed = s11;
        return this;
    }

    public Max8614xFactoryStats setDcGreen(long j5) {
        this.dcGreen = j5;
        return this;
    }

    public Max8614xFactoryStats setDcGreenPa(long j5) {
        this.dcGreenPa = j5;
        return this;
    }

    public Max8614xFactoryStats setDcIr(long j5) {
        this.dcIr = j5;
        return this;
    }

    public Max8614xFactoryStats setDcIrPa(long j5) {
        this.dcIrPa = j5;
        return this;
    }

    public Max8614xFactoryStats setDcRed(long j5) {
        this.dcRed = j5;
        return this;
    }

    public Max8614xFactoryStats setDcRedPa(long j5) {
        this.dcRedPa = j5;
        return this;
    }

    public Max8614xFactoryStats setLedRangeGreen(short s11) {
        this.ledRangeGreen = s11;
        return this;
    }

    public Max8614xFactoryStats setLedRangeIr(short s11) {
        this.ledRangeIr = s11;
        return this;
    }

    public Max8614xFactoryStats setLedRangeRed(short s11) {
        this.ledRangeRed = s11;
        return this;
    }

    public Max8614xFactoryStats setLedValueGreen(short s11) {
        this.ledValueGreen = s11;
        return this;
    }

    public Max8614xFactoryStats setLedValueIr(short s11) {
        this.ledValueIr = s11;
        return this;
    }

    public Max8614xFactoryStats setLedValueRed(short s11) {
        this.ledValueRed = s11;
        return this;
    }

    public Max8614xFactoryStats setR(long j5) {
        this.f33259r = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.acRed);
        writeUnsignedInt(e11, this.acRedPa);
        writeUnsignedInt(e11, this.dcRed);
        writeUnsignedInt(e11, this.dcRedPa);
        writeUnsignedInt(e11, this.acIr);
        writeUnsignedInt(e11, this.acIrPa);
        writeUnsignedInt(e11, this.dcIr);
        writeUnsignedInt(e11, this.dcIrPa);
        writeUnsignedInt(e11, this.acGreen);
        writeUnsignedInt(e11, this.acGreenPa);
        writeUnsignedInt(e11, this.dcGreen);
        writeUnsignedInt(e11, this.dcGreenPa);
        writeUnsignedInt(e11, this.f33259r);
        writeUnsignedByte(e11, this.ledValueRed);
        writeUnsignedByte(e11, this.ledRangeRed);
        writeUnsignedByte(e11, this.adcRangeRed);
        writeUnsignedByte(e11, this.ledValueIr);
        writeUnsignedByte(e11, this.ledRangeIr);
        writeUnsignedByte(e11, this.adcRangeIr);
        writeUnsignedByte(e11, this.ledValueGreen);
        writeUnsignedByte(e11, this.ledRangeGreen);
        writeUnsignedByte(e11, this.adcRangeGreen);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Max8614xFactoryStats(");
        sb2.append("acRed = " + this.acRed);
        sb2.append(", ");
        sb2.append("acRedPa = " + this.acRedPa);
        sb2.append(", ");
        sb2.append("dcRed = " + this.dcRed);
        sb2.append(", ");
        sb2.append("dcRedPa = " + this.dcRedPa);
        sb2.append(", ");
        sb2.append("acIr = " + this.acIr);
        sb2.append(", ");
        sb2.append("acIrPa = " + this.acIrPa);
        sb2.append(", ");
        sb2.append("dcIr = " + this.dcIr);
        sb2.append(", ");
        sb2.append("dcIrPa = " + this.dcIrPa);
        sb2.append(", ");
        sb2.append("acGreen = " + this.acGreen);
        sb2.append(", ");
        sb2.append("acGreenPa = " + this.acGreenPa);
        sb2.append(", ");
        sb2.append("dcGreen = " + this.dcGreen);
        sb2.append(", ");
        sb2.append("dcGreenPa = " + this.dcGreenPa);
        sb2.append(", ");
        sb2.append("r = " + this.f33259r);
        sb2.append(", ");
        return e.a(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(new StringBuilder("ledValueRed = "), this.ledValueRed, sb2, ", ", "ledRangeRed = "), this.ledRangeRed, sb2, ", ", "adcRangeRed = "), this.adcRangeRed, sb2, ", ", "ledValueIr = "), this.ledValueIr, sb2, ", ", "ledRangeIr = "), this.ledRangeIr, sb2, ", ", "adcRangeIr = "), this.adcRangeIr, sb2, ", ", "ledValueGreen = "), this.ledValueGreen, sb2, ", ", "ledRangeGreen = "), this.ledRangeGreen, sb2, ", ", "adcRangeGreen = "), this.adcRangeGreen, sb2, ")");
    }
}
