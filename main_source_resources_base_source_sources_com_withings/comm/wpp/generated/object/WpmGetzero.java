package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WpmGetzero extends h {
    public short pressureAdc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1917;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.pressureAdc = readUnsignedByte(byteBuffer);
    }

    public WpmGetzero setPressureAdc(short s11) {
        this.pressureAdc = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.pressureAdc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("pressureAdc = "), this.pressureAdc, new StringBuilder("WpmGetzero("), ")");
    }
}
