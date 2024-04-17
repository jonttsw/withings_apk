package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class LightSensorReply extends h {
    public int type;
    public long value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_LIGHT_SENSOR_REPLY;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.value = readUnsignedInt(byteBuffer);
        this.type = readInt(byteBuffer);
    }

    public LightSensorReply setType(int i11) {
        this.type = i11;
        return this;
    }

    public LightSensorReply setValue(long j5) {
        this.value = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.value);
        writeInt(e11, this.type);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LightSensorReply(");
        sb2.append("value = " + this.value);
        sb2.append(", ");
        return e.a(new StringBuilder("type = "), this.type, sb2, ")");
    }
}
