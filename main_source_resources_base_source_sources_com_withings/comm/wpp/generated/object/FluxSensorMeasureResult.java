package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class FluxSensorMeasureResult extends h {
    public int valueAdc;
    public int valueUv;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_FLUX_SENSOR_MEASURE_RESULT;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.valueUv = readInt(byteBuffer);
        this.valueAdc = readInt(byteBuffer);
    }

    public FluxSensorMeasureResult setValueAdc(int i11) {
        this.valueAdc = i11;
        return this;
    }

    public FluxSensorMeasureResult setValueUv(int i11) {
        this.valueUv = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.valueUv);
        writeInt(e11, this.valueAdc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FluxSensorMeasureResult(");
        return e.a(q.d(new StringBuilder("valueUv = "), this.valueUv, sb2, ", ", "valueAdc = "), this.valueAdc, sb2, ")");
    }
}
