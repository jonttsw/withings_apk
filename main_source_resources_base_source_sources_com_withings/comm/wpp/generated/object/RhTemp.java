package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class RhTemp extends h {
    public long humidity;
    public long temperature;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 315;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.temperature = readUnsignedInt(byteBuffer);
        this.humidity = readUnsignedInt(byteBuffer);
    }

    public RhTemp setHumidity(long j5) {
        this.humidity = j5;
        return this;
    }

    public RhTemp setTemperature(long j5) {
        this.temperature = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.temperature);
        writeUnsignedInt(e11, this.humidity);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RhTemp(");
        sb2.append("temperature = " + this.temperature);
        sb2.append(", ");
        return j.b(new StringBuilder("humidity = "), this.humidity, sb2, ")");
    }
}
