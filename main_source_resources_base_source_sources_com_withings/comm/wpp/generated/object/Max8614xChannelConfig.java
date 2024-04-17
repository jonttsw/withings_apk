package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Max8614xChannelConfig extends h {
    public short adcRange;
    public short channelId;
    public short ledRange;
    public short ledValue;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2481;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.channelId = readUnsignedByte(byteBuffer);
        this.ledValue = readUnsignedByte(byteBuffer);
        this.ledRange = readUnsignedByte(byteBuffer);
        this.adcRange = readUnsignedByte(byteBuffer);
    }

    public Max8614xChannelConfig setAdcRange(short s11) {
        this.adcRange = s11;
        return this;
    }

    public Max8614xChannelConfig setChannelId(short s11) {
        this.channelId = s11;
        return this;
    }

    public Max8614xChannelConfig setLedRange(short s11) {
        this.ledRange = s11;
        return this;
    }

    public Max8614xChannelConfig setLedValue(short s11) {
        this.ledValue = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.channelId);
        writeUnsignedByte(e11, this.ledValue);
        writeUnsignedByte(e11, this.ledRange);
        writeUnsignedByte(e11, this.adcRange);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Max8614xChannelConfig(");
        return e.a(q.d(q.d(q.d(new StringBuilder("channelId = "), this.channelId, sb2, ", ", "ledValue = "), this.ledValue, sb2, ", ", "ledRange = "), this.ledRange, sb2, ", ", "adcRange = "), this.adcRange, sb2, ")");
    }
}
