package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class NotificationAppInfo extends h {
    public short category;
    public String name;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.name;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 2);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2403;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.name = readString(byteBuffer);
        this.category = readUnsignedByte(byteBuffer);
    }

    public NotificationAppInfo setCategory(short s11) {
        this.category = s11;
        return this;
    }

    public NotificationAppInfo setName(String str) {
        this.name = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.name);
        writeUnsignedByte(e11, this.category);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationAppInfo(");
        return e.a(a0.c(new StringBuilder("name = "), this.name, sb2, ", ", "category = "), this.category, sb2, ")");
    }
}
