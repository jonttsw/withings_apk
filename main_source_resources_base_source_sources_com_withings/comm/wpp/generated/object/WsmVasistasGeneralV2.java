package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsmVasistasGeneralV2 extends h {
    public int hrMedian;
    public short presence;
    public int rrMedian;
    public short sleepStage;
    public long utc;
    public long value1;
    public long value10;
    public int value11;
    public int value12;
    public int value13;
    public int value14;
    public int value15;
    public int value16;
    public long value2;
    public long value3;
    public long value4;
    public long value5;
    public long value6;
    public long value7;
    public long value8;
    public long value9;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 62;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_WSM_VASISTAS_GENERAL_V2;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.utc = readUnsignedInt(byteBuffer);
        this.presence = readUnsignedByte(byteBuffer);
        this.sleepStage = readUnsignedByte(byteBuffer);
        this.hrMedian = readUnsignedShort(byteBuffer);
        this.rrMedian = readUnsignedShort(byteBuffer);
        this.value1 = readUnsignedInt(byteBuffer);
        this.value2 = readUnsignedInt(byteBuffer);
        this.value3 = readUnsignedInt(byteBuffer);
        this.value4 = readUnsignedInt(byteBuffer);
        this.value5 = readUnsignedInt(byteBuffer);
        this.value6 = readUnsignedInt(byteBuffer);
        this.value7 = readUnsignedInt(byteBuffer);
        this.value8 = readUnsignedInt(byteBuffer);
        this.value9 = readUnsignedInt(byteBuffer);
        this.value10 = readUnsignedInt(byteBuffer);
        this.value11 = readUnsignedShort(byteBuffer);
        this.value12 = readUnsignedShort(byteBuffer);
        this.value13 = readUnsignedShort(byteBuffer);
        this.value14 = readUnsignedShort(byteBuffer);
        this.value15 = readUnsignedShort(byteBuffer);
        this.value16 = readUnsignedShort(byteBuffer);
    }

    public WsmVasistasGeneralV2 setHrMedian(int i11) {
        this.hrMedian = i11;
        return this;
    }

    public WsmVasistasGeneralV2 setPresence(short s11) {
        this.presence = s11;
        return this;
    }

    public WsmVasistasGeneralV2 setRrMedian(int i11) {
        this.rrMedian = i11;
        return this;
    }

    public WsmVasistasGeneralV2 setSleepStage(short s11) {
        this.sleepStage = s11;
        return this;
    }

    public WsmVasistasGeneralV2 setUtc(long j5) {
        this.utc = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue1(long j5) {
        this.value1 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue10(long j5) {
        this.value10 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue11(int i11) {
        this.value11 = i11;
        return this;
    }

    public WsmVasistasGeneralV2 setValue12(int i11) {
        this.value12 = i11;
        return this;
    }

    public WsmVasistasGeneralV2 setValue13(int i11) {
        this.value13 = i11;
        return this;
    }

    public WsmVasistasGeneralV2 setValue14(int i11) {
        this.value14 = i11;
        return this;
    }

    public WsmVasistasGeneralV2 setValue15(int i11) {
        this.value15 = i11;
        return this;
    }

    public WsmVasistasGeneralV2 setValue16(int i11) {
        this.value16 = i11;
        return this;
    }

    public WsmVasistasGeneralV2 setValue2(long j5) {
        this.value2 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue3(long j5) {
        this.value3 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue4(long j5) {
        this.value4 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue5(long j5) {
        this.value5 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue6(long j5) {
        this.value6 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue7(long j5) {
        this.value7 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue8(long j5) {
        this.value8 = j5;
        return this;
    }

    public WsmVasistasGeneralV2 setValue9(long j5) {
        this.value9 = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.utc);
        writeUnsignedByte(e11, this.presence);
        writeUnsignedByte(e11, this.sleepStage);
        writeUnsignedShort(e11, this.hrMedian);
        writeUnsignedShort(e11, this.rrMedian);
        writeUnsignedInt(e11, this.value1);
        writeUnsignedInt(e11, this.value2);
        writeUnsignedInt(e11, this.value3);
        writeUnsignedInt(e11, this.value4);
        writeUnsignedInt(e11, this.value5);
        writeUnsignedInt(e11, this.value6);
        writeUnsignedInt(e11, this.value7);
        writeUnsignedInt(e11, this.value8);
        writeUnsignedInt(e11, this.value9);
        writeUnsignedInt(e11, this.value10);
        writeUnsignedShort(e11, this.value11);
        writeUnsignedShort(e11, this.value12);
        writeUnsignedShort(e11, this.value13);
        writeUnsignedShort(e11, this.value14);
        writeUnsignedShort(e11, this.value15);
        writeUnsignedShort(e11, this.value16);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsmVasistasGeneralV2(");
        sb2.append("utc = " + this.utc);
        sb2.append(", ");
        StringBuilder d11 = q.d(q.d(q.d(q.d(new StringBuilder("presence = "), this.presence, sb2, ", ", "sleepStage = "), this.sleepStage, sb2, ", ", "hrMedian = "), this.hrMedian, sb2, ", ", "rrMedian = "), this.rrMedian, sb2, ", ", "value1 = ");
        d11.append(this.value1);
        sb2.append(d11.toString());
        sb2.append(", ");
        sb2.append("value2 = " + this.value2);
        sb2.append(", ");
        sb2.append("value3 = " + this.value3);
        sb2.append(", ");
        sb2.append("value4 = " + this.value4);
        sb2.append(", ");
        sb2.append("value5 = " + this.value5);
        sb2.append(", ");
        sb2.append("value6 = " + this.value6);
        sb2.append(", ");
        sb2.append("value7 = " + this.value7);
        sb2.append(", ");
        sb2.append("value8 = " + this.value8);
        sb2.append(", ");
        sb2.append("value9 = " + this.value9);
        sb2.append(", ");
        sb2.append("value10 = " + this.value10);
        sb2.append(", ");
        return e.a(q.d(q.d(q.d(q.d(q.d(new StringBuilder("value11 = "), this.value11, sb2, ", ", "value12 = "), this.value12, sb2, ", ", "value13 = "), this.value13, sb2, ", ", "value14 = "), this.value14, sb2, ", ", "value15 = "), this.value15, sb2, ", ", "value16 = "), this.value16, sb2, ")");
    }
}
