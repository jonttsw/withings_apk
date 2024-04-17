package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Max86173ChannelStats extends h {
    public short adcRange;
    public short agcChanges;
    public int avgAdc;
    public int avgPaperma;
    public String channelName;
    public short ledRange;
    public int ledValue;
    public long stdAdc;
    public int tag;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.channelName;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 20);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_MAX86173_CHANNEL_STATS;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.tag = readUnsignedShort(byteBuffer);
        this.channelName = readString(byteBuffer);
        this.avgPaperma = readInt(byteBuffer);
        this.avgAdc = readInt(byteBuffer);
        this.stdAdc = readUnsignedInt(byteBuffer);
        this.ledValue = readUnsignedShort(byteBuffer);
        this.adcRange = readUnsignedByte(byteBuffer);
        this.ledRange = readUnsignedByte(byteBuffer);
        this.agcChanges = readUnsignedByte(byteBuffer);
    }

    public Max86173ChannelStats setAdcRange(short s11) {
        this.adcRange = s11;
        return this;
    }

    public Max86173ChannelStats setAgcChanges(short s11) {
        this.agcChanges = s11;
        return this;
    }

    public Max86173ChannelStats setAvgAdc(int i11) {
        this.avgAdc = i11;
        return this;
    }

    public Max86173ChannelStats setAvgPaperma(int i11) {
        this.avgPaperma = i11;
        return this;
    }

    public Max86173ChannelStats setChannelName(String str) {
        this.channelName = str;
        return this;
    }

    public Max86173ChannelStats setLedRange(short s11) {
        this.ledRange = s11;
        return this;
    }

    public Max86173ChannelStats setLedValue(int i11) {
        this.ledValue = i11;
        return this;
    }

    public Max86173ChannelStats setStdAdc(long j5) {
        this.stdAdc = j5;
        return this;
    }

    public Max86173ChannelStats setTag(int i11) {
        this.tag = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.tag);
        writeString(e11, this.channelName);
        writeInt(e11, this.avgPaperma);
        writeInt(e11, this.avgAdc);
        writeUnsignedInt(e11, this.stdAdc);
        writeUnsignedShort(e11, this.ledValue);
        writeUnsignedByte(e11, this.adcRange);
        writeUnsignedByte(e11, this.ledRange);
        writeUnsignedByte(e11, this.agcChanges);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Max86173ChannelStats(");
        StringBuilder d11 = q.d(q.d(a0.c(q.d(new StringBuilder("tag = "), this.tag, sb2, ", ", "channelName = "), this.channelName, sb2, ", ", "avgPaperma = "), this.avgPaperma, sb2, ", ", "avgAdc = "), this.avgAdc, sb2, ", ", "stdAdc = ");
        d11.append(this.stdAdc);
        sb2.append(d11.toString());
        sb2.append(", ");
        return e.a(q.d(q.d(q.d(new StringBuilder("ledValue = "), this.ledValue, sb2, ", ", "adcRange = "), this.adcRange, sb2, ", ", "ledRange = "), this.ledRange, sb2, ", ", "agcChanges = "), this.agcChanges, sb2, ")");
    }
}
