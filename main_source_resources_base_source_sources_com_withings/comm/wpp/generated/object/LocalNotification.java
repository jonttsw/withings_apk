package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class LocalNotification extends h {
    public static final short ID_HR_HIGH = 3;
    public static final short ID_HR_LOW = 2;
    public static final short ID_INACTIVITY = 4;
    public static final short ID_PPG_AFIB = 1;
    public static final short STATUS_DISABLED = 0;
    public static final short STATUS_ENABLED = 1;

    /* renamed from: id  reason: collision with root package name */
    public long f33258id;
    public short status;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2472;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33258id = readUnsignedInt(byteBuffer);
        this.status = readUnsignedByte(byteBuffer);
    }

    public LocalNotification setId(long j5) {
        this.f33258id = j5;
        return this;
    }

    public LocalNotification setStatus(short s11) {
        this.status = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.f33258id);
        writeUnsignedByte(e11, this.status);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocalNotification(");
        sb2.append("id = " + this.f33258id);
        sb2.append(", ");
        return e.a(new StringBuilder("status = "), this.status, sb2, ")");
    }
}
