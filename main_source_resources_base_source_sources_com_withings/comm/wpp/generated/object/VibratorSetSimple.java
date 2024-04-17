package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class VibratorSetSimple extends h {
    public int durationOffMs;
    public int durationOnMs;
    public short nbLoop;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_VIBRATOR_SET_SIMPLE;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.durationOnMs = readUnsignedShort(byteBuffer);
        this.durationOffMs = readUnsignedShort(byteBuffer);
        this.nbLoop = readUnsignedByte(byteBuffer);
    }

    public VibratorSetSimple setDurationOffMs(int i11) {
        this.durationOffMs = i11;
        return this;
    }

    public VibratorSetSimple setDurationOnMs(int i11) {
        this.durationOnMs = i11;
        return this;
    }

    public VibratorSetSimple setNbLoop(short s11) {
        this.nbLoop = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.durationOnMs);
        writeUnsignedShort(e11, this.durationOffMs);
        writeUnsignedByte(e11, this.nbLoop);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VibratorSetSimple(");
        return e.a(q.d(q.d(new StringBuilder("durationOnMs = "), this.durationOnMs, sb2, ", ", "durationOffMs = "), this.durationOffMs, sb2, ", ", "nbLoop = "), this.nbLoop, sb2, ")");
    }
}
