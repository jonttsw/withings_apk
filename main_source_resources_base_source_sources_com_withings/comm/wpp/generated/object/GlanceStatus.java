package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class GlanceStatus extends h {
    public static final short GLANCE_STATUS_DISABLED = 0;
    public static final short GLANCE_STATUS_ENABLED = 1;
    public static final short GLANCE_STATUS_WORKOUT_ONLY = 2;
    public short status;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2426;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.status = readUnsignedByte(byteBuffer);
    }

    public GlanceStatus setStatus(short s11) {
        this.status = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.status);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("status = "), this.status, new StringBuilder("GlanceStatus("), ")");
    }
}
