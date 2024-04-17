package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CovidHelloReport extends h {
    public long ebid;
    public short ecc;
    public byte[] hmac;
    public byte rssi;
    public long timeCollectedOnDevice;
    public long timeFromHelloMessage;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        byte[] bArr = this.hmac;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 19);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2458;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.ebid = readUnsignedLong(byteBuffer);
        this.timeCollectedOnDevice = readUnsignedInt(byteBuffer);
        this.timeFromHelloMessage = readUnsignedInt(byteBuffer);
        this.hmac = readByteArray(byteBuffer);
        this.rssi = readByte(byteBuffer);
        this.ecc = readUnsignedByte(byteBuffer);
    }

    public CovidHelloReport setEbid(long j5) {
        this.ebid = j5;
        return this;
    }

    public CovidHelloReport setEcc(short s11) {
        this.ecc = s11;
        return this;
    }

    public CovidHelloReport setHmac(byte[] bArr) {
        this.hmac = bArr;
        return this;
    }

    public CovidHelloReport setRssi(byte b10) {
        this.rssi = b10;
        return this;
    }

    public CovidHelloReport setTimeCollectedOnDevice(long j5) {
        this.timeCollectedOnDevice = j5;
        return this;
    }

    public CovidHelloReport setTimeFromHelloMessage(long j5) {
        this.timeFromHelloMessage = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedLong(e11, this.ebid);
        writeUnsignedInt(e11, this.timeCollectedOnDevice);
        writeUnsignedInt(e11, this.timeFromHelloMessage);
        writeByteArray(e11, this.hmac);
        writeByte(e11, this.rssi);
        writeUnsignedByte(e11, this.ecc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CovidHelloReport(");
        sb2.append("ebid = " + this.ebid);
        sb2.append(", ");
        sb2.append("timeCollectedOnDevice = " + this.timeCollectedOnDevice);
        sb2.append(", ");
        sb2.append("timeFromHelloMessage = " + this.timeFromHelloMessage);
        sb2.append(", ");
        sb2.append("hmac = " + Wpp.prettyBytes(this.hmac));
        sb2.append(", ");
        return e.a(q.d(new StringBuilder("rssi = "), this.rssi, sb2, ", ", "ecc = "), this.ecc, sb2, ")");
    }
}
