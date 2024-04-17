package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class HrAs7000 extends h {
    public short adxlTmp;
    public int gsr;
    public short heartrate;
    public int ledCurrent;
    public int nrfTmp;
    public int ntcRaw;
    public int ofeAvg;
    public short quality;
    public int tiaAvg;
    public short tid;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 17;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2343;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.tid = readUnsignedByte(byteBuffer);
        this.heartrate = readUnsignedByte(byteBuffer);
        this.quality = readUnsignedByte(byteBuffer);
        this.ledCurrent = readUnsignedShort(byteBuffer);
        this.ntcRaw = readUnsignedShort(byteBuffer);
        this.gsr = readUnsignedShort(byteBuffer);
        this.nrfTmp = readUnsignedShort(byteBuffer);
        this.adxlTmp = readShort(byteBuffer);
        this.tiaAvg = readUnsignedShort(byteBuffer);
        this.ofeAvg = readUnsignedShort(byteBuffer);
    }

    public HrAs7000 setAdxlTmp(short s11) {
        this.adxlTmp = s11;
        return this;
    }

    public HrAs7000 setGsr(int i11) {
        this.gsr = i11;
        return this;
    }

    public HrAs7000 setHeartrate(short s11) {
        this.heartrate = s11;
        return this;
    }

    public HrAs7000 setLedCurrent(int i11) {
        this.ledCurrent = i11;
        return this;
    }

    public HrAs7000 setNrfTmp(int i11) {
        this.nrfTmp = i11;
        return this;
    }

    public HrAs7000 setNtcRaw(int i11) {
        this.ntcRaw = i11;
        return this;
    }

    public HrAs7000 setOfeAvg(int i11) {
        this.ofeAvg = i11;
        return this;
    }

    public HrAs7000 setQuality(short s11) {
        this.quality = s11;
        return this;
    }

    public HrAs7000 setTiaAvg(int i11) {
        this.tiaAvg = i11;
        return this;
    }

    public HrAs7000 setTid(short s11) {
        this.tid = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.tid);
        writeUnsignedByte(e11, this.heartrate);
        writeUnsignedByte(e11, this.quality);
        writeUnsignedShort(e11, this.ledCurrent);
        writeUnsignedShort(e11, this.ntcRaw);
        writeUnsignedShort(e11, this.gsr);
        writeUnsignedShort(e11, this.nrfTmp);
        writeShort(e11, this.adxlTmp);
        writeUnsignedShort(e11, this.tiaAvg);
        writeUnsignedShort(e11, this.ofeAvg);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HrAs7000(");
        return e.a(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(new StringBuilder("tid = "), this.tid, sb2, ", ", "heartrate = "), this.heartrate, sb2, ", ", "quality = "), this.quality, sb2, ", ", "ledCurrent = "), this.ledCurrent, sb2, ", ", "ntcRaw = "), this.ntcRaw, sb2, ", ", "gsr = "), this.gsr, sb2, ", ", "nrfTmp = "), this.nrfTmp, sb2, ", ", "adxlTmp = "), this.adxlTmp, sb2, ", ", "tiaAvg = "), this.tiaAvg, sb2, ", ", "ofeAvg = "), this.ofeAvg, sb2, ")");
    }
}
