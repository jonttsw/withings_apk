package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class LuminosityLevel extends h {
    public static final short MODE_AUTO = 0;
    public static final short MODE_MANUAL = 1;
    public short level;
    public short mode;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_LUMINOSITY_LEVEL;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.mode = readUnsignedByte(byteBuffer);
        this.level = readUnsignedByte(byteBuffer);
    }

    public LuminosityLevel setLevel(short s11) {
        this.level = s11;
        return this;
    }

    public LuminosityLevel setMode(short s11) {
        this.mode = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.mode);
        writeUnsignedByte(e11, this.level);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LuminosityLevel(");
        return e.a(q.d(new StringBuilder("mode = "), this.mode, sb2, ", ", "level = "), this.level, sb2, ")");
    }
}
