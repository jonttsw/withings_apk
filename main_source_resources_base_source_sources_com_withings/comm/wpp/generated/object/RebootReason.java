package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class RebootReason extends h {
    public static final short REBOOT_REASON_NONE = 0;
    public static final short REBOOT_REASON_TRAINING_MODE = 1;
    public static final short REBOOT_REASON_UPDATE_INSTALL = 2;
    public int value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_REBOOT_REASON;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.value = readInt(byteBuffer);
    }

    public RebootReason setValue(int i11) {
        this.value = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("value = "), this.value, new StringBuilder("RebootReason("), ")");
    }
}
