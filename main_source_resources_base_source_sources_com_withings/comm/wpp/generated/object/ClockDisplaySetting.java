package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ClockDisplaySetting extends h {
    public short level;
    public short state;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2317;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.state = readUnsignedByte(byteBuffer);
        this.level = readUnsignedByte(byteBuffer);
    }

    public ClockDisplaySetting setLevel(short s11) {
        this.level = s11;
        return this;
    }

    public ClockDisplaySetting setState(short s11) {
        this.state = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.state);
        writeUnsignedByte(e11, this.level);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClockDisplaySetting(");
        return e.a(q.d(new StringBuilder("state = "), this.state, sb2, ", ", "level = "), this.level, sb2, ")");
    }
}
