package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Max8617xChannelStats extends h {
    public short adcRange;
    public int avgAdc;
    public int avgCurrentPa;
    public short channelId;
    public String channelName;
    public int ledValue;
    public long stdAdc;
    public long stdCurrentPa;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.channelName;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 21);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2486;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.channelId = readUnsignedByte(byteBuffer);
        this.channelName = readString(byteBuffer);
        this.stdAdc = readUnsignedInt(byteBuffer);
        this.stdCurrentPa = readUnsignedInt(byteBuffer);
        this.avgAdc = readInt(byteBuffer);
        this.avgCurrentPa = readInt(byteBuffer);
        this.ledValue = readUnsignedShort(byteBuffer);
        this.adcRange = readUnsignedByte(byteBuffer);
    }

    public Max8617xChannelStats setAdcRange(short s11) {
        this.adcRange = s11;
        return this;
    }

    public Max8617xChannelStats setAvgAdc(int i11) {
        this.avgAdc = i11;
        return this;
    }

    public Max8617xChannelStats setAvgCurrentPa(int i11) {
        this.avgCurrentPa = i11;
        return this;
    }

    public Max8617xChannelStats setChannelId(short s11) {
        this.channelId = s11;
        return this;
    }

    public Max8617xChannelStats setChannelName(String str) {
        this.channelName = str;
        return this;
    }

    public Max8617xChannelStats setLedValue(int i11) {
        this.ledValue = i11;
        return this;
    }

    public Max8617xChannelStats setStdAdc(long j5) {
        this.stdAdc = j5;
        return this;
    }

    public Max8617xChannelStats setStdCurrentPa(long j5) {
        this.stdCurrentPa = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.channelId);
        writeString(e11, this.channelName);
        writeUnsignedInt(e11, this.stdAdc);
        writeUnsignedInt(e11, this.stdCurrentPa);
        writeInt(e11, this.avgAdc);
        writeInt(e11, this.avgCurrentPa);
        writeUnsignedShort(e11, this.ledValue);
        writeUnsignedByte(e11, this.adcRange);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Max8617xChannelStats(");
        StringBuilder c11 = a0.c(q.d(new StringBuilder("channelId = "), this.channelId, sb2, ", ", "channelName = "), this.channelName, sb2, ", ", "stdAdc = ");
        c11.append(this.stdAdc);
        sb2.append(c11.toString());
        sb2.append(", ");
        sb2.append("stdCurrentPa = " + this.stdCurrentPa);
        sb2.append(", ");
        return e.a(q.d(q.d(q.d(new StringBuilder("avgAdc = "), this.avgAdc, sb2, ", ", "avgCurrentPa = "), this.avgCurrentPa, sb2, ", ", "ledValue = "), this.ledValue, sb2, ", ", "adcRange = "), this.adcRange, sb2, ")");
    }
}
