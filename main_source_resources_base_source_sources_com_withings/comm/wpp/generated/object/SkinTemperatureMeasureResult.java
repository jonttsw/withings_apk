package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class SkinTemperatureMeasureResult extends h {
    public short fraction;
    public short integer;
    public short tempQ7;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_SKIN_TEMPERATURE_MEASURE_RESULT;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.tempQ7 = readShort(byteBuffer);
        this.integer = readShort(byteBuffer);
        this.fraction = readShort(byteBuffer);
    }

    public SkinTemperatureMeasureResult setFraction(short s11) {
        this.fraction = s11;
        return this;
    }

    public SkinTemperatureMeasureResult setInteger(short s11) {
        this.integer = s11;
        return this;
    }

    public SkinTemperatureMeasureResult setTempQ7(short s11) {
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
        StringBuilder sb2 = new StringBuilder("SkinTemperatureMeasureResult(");
        return e.a(q.d(q.d(new StringBuilder("tempQ7 = "), this.tempQ7, sb2, ", ", "integer = "), this.integer, sb2, ", ", "fraction = "), this.fraction, sb2, ")");
    }
}
