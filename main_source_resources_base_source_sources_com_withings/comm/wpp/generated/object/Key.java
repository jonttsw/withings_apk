package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Key extends h {
    public static final short KEY_SETTING_BRIGHTNESS = 2;
    public static final short KEY_SETTING_DURATION = 5;
    public static final short KEY_SETTING_ID = 3;
    public static final short KEY_SETTING_SPOTIFY_PRESET_NAME = 7;
    public static final short KEY_SETTING_SPOTIFY_PRESET_TAG = 6;
    public static final short KEY_SETTING_VOLUME = 1;
    public static final short KEY_SETTING_WEB_RADIO = 4;
    public static final short KEY_SETTING_WEB_RADIO_NAME = 8;
    public byte[] val;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        byte[] bArr = this.val;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 1);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2455;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.val = readByteArray(byteBuffer);
    }

    public Key setVal(byte[] bArr) {
        this.val = bArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByteArray(e11, this.val);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Key(");
        sb2.append("val = " + Wpp.prettyBytes(this.val));
        sb2.append(")");
        return sb2.toString();
    }
}
