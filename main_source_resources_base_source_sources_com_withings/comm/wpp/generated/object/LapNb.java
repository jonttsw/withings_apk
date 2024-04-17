package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class LapNb extends h {
    public int hour;
    public int minute;
    public int tracker;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 12;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2387;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.hour = readInt(byteBuffer);
        this.minute = readInt(byteBuffer);
        this.tracker = readInt(byteBuffer);
    }

    public LapNb setHour(int i11) {
        this.hour = i11;
        return this;
    }

    public LapNb setMinute(int i11) {
        this.minute = i11;
        return this;
    }

    public LapNb setTracker(int i11) {
        this.tracker = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.hour);
        writeInt(e11, this.minute);
        writeInt(e11, this.tracker);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LapNb(");
        return e.a(q.d(q.d(new StringBuilder("hour = "), this.hour, sb2, ", ", "minute = "), this.minute, sb2, ", ", "tracker = "), this.tracker, sb2, ")");
    }
}
