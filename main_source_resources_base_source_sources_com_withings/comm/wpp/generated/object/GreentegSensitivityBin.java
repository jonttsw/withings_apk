package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class GreentegSensitivityBin extends h {
    public String reelChar;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.reelChar;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 1);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_GREENTEG_SENSITIVITY_BIN;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.reelChar = readString(byteBuffer);
    }

    public GreentegSensitivityBin setReelChar(String str) {
        this.reelChar = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.reelChar);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return c.c(new StringBuilder("reelChar = "), this.reelChar, new StringBuilder("GreentegSensitivityBin("), ")");
    }
}
