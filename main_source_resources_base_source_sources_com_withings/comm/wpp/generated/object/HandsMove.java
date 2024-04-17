package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class HandsMove extends h {
    public short hand;
    public short nbSteps;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 3;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1292;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.hand = readUnsignedByte(byteBuffer);
        this.nbSteps = readShort(byteBuffer);
    }

    public HandsMove setHand(short s11) {
        this.hand = s11;
        return this;
    }

    public HandsMove setNbSteps(short s11) {
        this.nbSteps = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.hand);
        writeShort(e11, this.nbSteps);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HandsMove(");
        return e.a(q.d(new StringBuilder("hand = "), this.hand, sb2, ", ", "nbSteps = "), this.nbSteps, sb2, ")");
    }
}
