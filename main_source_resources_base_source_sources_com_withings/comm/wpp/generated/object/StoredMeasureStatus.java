package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class StoredMeasureStatus extends h {
    public short cnt;
    public int oldestMeasTime;
    public byte wifiConfigured;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 7;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 277;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cnt = readShort(byteBuffer);
        this.oldestMeasTime = readInt(byteBuffer);
        this.wifiConfigured = readByte(byteBuffer);
    }

    public StoredMeasureStatus setCnt(short s11) {
        this.cnt = s11;
        return this;
    }

    public StoredMeasureStatus setOldestMeasTime(int i11) {
        this.oldestMeasTime = i11;
        return this;
    }

    public StoredMeasureStatus setWifiConfigured(byte b10) {
        this.wifiConfigured = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeShort(e11, this.cnt);
        writeInt(e11, this.oldestMeasTime);
        writeByte(e11, this.wifiConfigured);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StoredMeasureStatus(");
        return e.a(q.d(q.d(new StringBuilder("cnt = "), this.cnt, sb2, ", ", "oldestMeasTime = "), this.oldestMeasTime, sb2, ", ", "wifiConfigured = "), this.wifiConfigured, sb2, ")");
    }
}
