package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AlarmSetSimple extends h {
    public short hour;
    public short minute;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1291;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.hour = readUnsignedByte(byteBuffer);
        this.minute = readUnsignedByte(byteBuffer);
    }

    public AlarmSetSimple setHour(short s11) {
        this.hour = s11;
        return this;
    }

    public AlarmSetSimple setMinute(short s11) {
        this.minute = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.hour);
        writeUnsignedByte(e11, this.minute);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlarmSetSimple(");
        return e.a(q.d(new StringBuilder("hour = "), this.hour, sb2, ", ", "minute = "), this.minute, sb2, ")");
    }
}
