package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Max8614xFactoryStatsParams extends h {
    public short led1;
    public short led2;
    public short led3;
    public short mode;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2447;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.mode = readUnsignedByte(byteBuffer);
        this.led1 = readUnsignedByte(byteBuffer);
        this.led2 = readUnsignedByte(byteBuffer);
        this.led3 = readUnsignedByte(byteBuffer);
    }

    public Max8614xFactoryStatsParams setLed1(short s11) {
        this.led1 = s11;
        return this;
    }

    public Max8614xFactoryStatsParams setLed2(short s11) {
        this.led2 = s11;
        return this;
    }

    public Max8614xFactoryStatsParams setLed3(short s11) {
        this.led3 = s11;
        return this;
    }

    public Max8614xFactoryStatsParams setMode(short s11) {
        this.mode = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.mode);
        writeUnsignedByte(e11, this.led1);
        writeUnsignedByte(e11, this.led2);
        writeUnsignedByte(e11, this.led3);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Max8614xFactoryStatsParams(");
        return e.a(q.d(q.d(q.d(new StringBuilder("mode = "), this.mode, sb2, ", ", "led1 = "), this.led1, sb2, ", ", "led2 = "), this.led2, sb2, ", ", "led3 = "), this.led3, sb2, ")");
    }
}
