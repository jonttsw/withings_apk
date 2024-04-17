package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ProgramSetting extends h {
    public String data;
    public short setting;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.data;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 2);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2326;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.setting = readUnsignedByte(byteBuffer);
        this.data = readString(byteBuffer);
    }

    public ProgramSetting setData(String str) {
        this.data = str;
        return this;
    }

    public ProgramSetting setSetting(short s11) {
        this.setting = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.setting);
        writeString(e11, this.data);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProgramSetting(");
        return c.c(q.d(new StringBuilder("setting = "), this.setting, sb2, ", ", "data = "), this.data, sb2, ")");
    }
}
