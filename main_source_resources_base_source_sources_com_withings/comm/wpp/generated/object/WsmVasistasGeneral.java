package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsmVasistasGeneral extends h {
    public short hrMedian;
    public short hrVariability;
    public short presence;
    public int rrAmplitudeMax;
    public int rrAmplitudeMin;
    public short rrFrequencyMax;
    public short rrFrequencyMin;
    public short rrMedian;
    public short sleepStage;
    public long utc;
    public int value1;
    public int value10;
    public int value11;
    public int value2;
    public int value3;
    public int value4;
    public int value5;
    public int value6;
    public int value7;
    public int value8;
    public int value9;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 37;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_WSM_VASISTAS_GENERAL;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.utc = readUnsignedInt(byteBuffer);
        this.presence = readUnsignedByte(byteBuffer);
        this.sleepStage = readUnsignedByte(byteBuffer);
        this.hrMedian = readUnsignedByte(byteBuffer);
        this.hrVariability = readUnsignedByte(byteBuffer);
        this.rrMedian = readUnsignedByte(byteBuffer);
        this.rrAmplitudeMax = readUnsignedShort(byteBuffer);
        this.rrAmplitudeMin = readUnsignedShort(byteBuffer);
        this.rrFrequencyMax = readUnsignedByte(byteBuffer);
        this.rrFrequencyMin = readUnsignedByte(byteBuffer);
        this.value1 = readUnsignedShort(byteBuffer);
        this.value2 = readUnsignedShort(byteBuffer);
        this.value3 = readUnsignedShort(byteBuffer);
        this.value4 = readUnsignedShort(byteBuffer);
        this.value5 = readUnsignedShort(byteBuffer);
        this.value6 = readUnsignedShort(byteBuffer);
        this.value7 = readUnsignedShort(byteBuffer);
        this.value8 = readUnsignedShort(byteBuffer);
        this.value9 = readUnsignedShort(byteBuffer);
        this.value10 = readUnsignedShort(byteBuffer);
        this.value11 = readUnsignedShort(byteBuffer);
    }

    public WsmVasistasGeneral setHrMedian(short s11) {
        this.hrMedian = s11;
        return this;
    }

    public WsmVasistasGeneral setHrVariability(short s11) {
        this.hrVariability = s11;
        return this;
    }

    public WsmVasistasGeneral setPresence(short s11) {
        this.presence = s11;
        return this;
    }

    public WsmVasistasGeneral setRrAmplitudeMax(int i11) {
        this.rrAmplitudeMax = i11;
        return this;
    }

    public WsmVasistasGeneral setRrAmplitudeMin(int i11) {
        this.rrAmplitudeMin = i11;
        return this;
    }

    public WsmVasistasGeneral setRrFrequencyMax(short s11) {
        this.rrFrequencyMax = s11;
        return this;
    }

    public WsmVasistasGeneral setRrFrequencyMin(short s11) {
        this.rrFrequencyMin = s11;
        return this;
    }

    public WsmVasistasGeneral setRrMedian(short s11) {
        this.rrMedian = s11;
        return this;
    }

    public WsmVasistasGeneral setSleepStage(short s11) {
        this.sleepStage = s11;
        return this;
    }

    public WsmVasistasGeneral setUtc(long j5) {
        this.utc = j5;
        return this;
    }

    public WsmVasistasGeneral setValue1(int i11) {
        this.value1 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue10(int i11) {
        this.value10 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue11(int i11) {
        this.value11 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue2(int i11) {
        this.value2 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue3(int i11) {
        this.value3 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue4(int i11) {
        this.value4 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue5(int i11) {
        this.value5 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue6(int i11) {
        this.value6 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue7(int i11) {
        this.value7 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue8(int i11) {
        this.value8 = i11;
        return this;
    }

    public WsmVasistasGeneral setValue9(int i11) {
        this.value9 = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.utc);
        writeUnsignedByte(e11, this.presence);
        writeUnsignedByte(e11, this.sleepStage);
        writeUnsignedByte(e11, this.hrMedian);
        writeUnsignedByte(e11, this.hrVariability);
        writeUnsignedByte(e11, this.rrMedian);
        writeUnsignedShort(e11, this.rrAmplitudeMax);
        writeUnsignedShort(e11, this.rrAmplitudeMin);
        writeUnsignedByte(e11, this.rrFrequencyMax);
        writeUnsignedByte(e11, this.rrFrequencyMin);
        writeUnsignedShort(e11, this.value1);
        writeUnsignedShort(e11, this.value2);
        writeUnsignedShort(e11, this.value3);
        writeUnsignedShort(e11, this.value4);
        writeUnsignedShort(e11, this.value5);
        writeUnsignedShort(e11, this.value6);
        writeUnsignedShort(e11, this.value7);
        writeUnsignedShort(e11, this.value8);
        writeUnsignedShort(e11, this.value9);
        writeUnsignedShort(e11, this.value10);
        writeUnsignedShort(e11, this.value11);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsmVasistasGeneral(");
        sb2.append("utc = " + this.utc);
        sb2.append(", ");
        return e.a(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(new StringBuilder("presence = "), this.presence, sb2, ", ", "sleepStage = "), this.sleepStage, sb2, ", ", "hrMedian = "), this.hrMedian, sb2, ", ", "hrVariability = "), this.hrVariability, sb2, ", ", "rrMedian = "), this.rrMedian, sb2, ", ", "rrAmplitudeMax = "), this.rrAmplitudeMax, sb2, ", ", "rrAmplitudeMin = "), this.rrAmplitudeMin, sb2, ", ", "rrFrequencyMax = "), this.rrFrequencyMax, sb2, ", ", "rrFrequencyMin = "), this.rrFrequencyMin, sb2, ", ", "value1 = "), this.value1, sb2, ", ", "value2 = "), this.value2, sb2, ", ", "value3 = "), this.value3, sb2, ", ", "value4 = "), this.value4, sb2, ", ", "value5 = "), this.value5, sb2, ", ", "value6 = "), this.value6, sb2, ", ", "value7 = "), this.value7, sb2, ", ", "value8 = "), this.value8, sb2, ", ", "value9 = "), this.value9, sb2, ", ", "value10 = "), this.value10, sb2, ", ", "value11 = "), this.value11, sb2, ")");
    }
}
