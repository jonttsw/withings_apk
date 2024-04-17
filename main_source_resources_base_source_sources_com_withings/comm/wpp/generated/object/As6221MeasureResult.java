package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class As6221MeasureResult extends h {
    public short fraction;
    public short integer;
    public short tempQ7;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2488;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.tempQ7 = readShort(byteBuffer);
        this.integer = readShort(byteBuffer);
        this.fraction = readShort(byteBuffer);
    }

    public As6221MeasureResult setFraction(short s11) {
        this.fraction = s11;
        return this;
    }

    public As6221MeasureResult setInteger(short s11) {
        this.integer = s11;
        return this;
    }

    public As6221MeasureResult setTempQ7(short s11) {
        this.tempQ7 = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeShort(e11, this.tempQ7);
        writeShort(e11, this.integer);
        writeShort(e11, this.fraction);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("As6221MeasureResult(");
        return e.a(q.d(q.d(new StringBuilder("tempQ7 = "), this.tempQ7, sb2, ", ", "integer = "), this.integer, sb2, ", ", "fraction = "), this.fraction, sb2, ")");
    }
}
