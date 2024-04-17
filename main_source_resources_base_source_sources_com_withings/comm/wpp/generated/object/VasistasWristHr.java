package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class VasistasWristHr extends h {
    public short heartrate;
    public short quality;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2353;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.heartrate = readUnsignedByte(byteBuffer);
        this.quality = readUnsignedByte(byteBuffer);
    }

    public VasistasWristHr setHeartrate(short s11) {
        this.heartrate = s11;
        return this;
    }

    public VasistasWristHr setQuality(short s11) {
        this.quality = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.heartrate);
        writeUnsignedByte(e11, this.quality);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VasistasWristHr(");
        return e.a(q.d(new StringBuilder("heartrate = "), this.heartrate, sb2, ", ", "quality = "), this.quality, sb2, ")");
    }
}
