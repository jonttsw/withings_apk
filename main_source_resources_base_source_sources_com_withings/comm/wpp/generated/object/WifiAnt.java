package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WifiAnt extends h {
    public static final short RX = 8;
    public static final short RX_SET = 16;
    public static final short RX_SUCCESS = 32;
    public static final short TX = 1;
    public static final short TX_SET = 2;
    public static final short TX_SUCCESS = 4;
    public short flags;
    public byte rxant;
    public byte txant;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 3;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 513;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.flags = readUnsignedByte(byteBuffer);
        this.txant = readByte(byteBuffer);
        this.rxant = readByte(byteBuffer);
    }

    public WifiAnt setFlags(short s11) {
        this.flags = s11;
        return this;
    }

    public WifiAnt setRxant(byte b10) {
        this.rxant = b10;
        return this;
    }

    public WifiAnt setTxant(byte b10) {
        this.txant = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.flags);
        writeByte(e11, this.txant);
        writeByte(e11, this.rxant);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WifiAnt(");
        return e.a(q.d(q.d(new StringBuilder("flags = "), this.flags, sb2, ", ", "txant = "), this.txant, sb2, ", ", "rxant = "), this.rxant, sb2, ")");
    }
}
