package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class VibratorPattern extends h {
    public static final short VIBRATOR_PATTERN_ID_ALARMCLOCK = 0;

    /* renamed from: id  reason: collision with root package name */
    public short f33279id;
    public short value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2374;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33279id = readUnsignedByte(byteBuffer);
        this.value = readUnsignedByte(byteBuffer);
    }

    public VibratorPattern setId(short s11) {
        this.f33279id = s11;
        return this;
    }

    public VibratorPattern setValue(short s11) {
        this.value = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.f33279id);
        writeUnsignedByte(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VibratorPattern(");
        return e.a(q.d(new StringBuilder("id = "), this.f33279id, sb2, ", ", "value = "), this.value, sb2, ")");
    }
}
