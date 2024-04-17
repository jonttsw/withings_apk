package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Slot extends h {
    public static final short CMD_INSERT = 2;
    public static final short CMD_INSERT_NODUP = 3;
    public static final short CMD_NONE = 0;
    public static final short CMD_REPLACE = 1;
    public byte cmd;
    public int reserved;
    public short slot;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 7;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_SLOT;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.slot = readShort(byteBuffer);
        this.reserved = readInt(byteBuffer);
    }

    public Slot setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Slot setReserved(int i11) {
        this.reserved = i11;
        return this;
    }

    public Slot setSlot(short s11) {
        this.slot = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeShort(e11, this.slot);
        writeInt(e11, this.reserved);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Slot(");
        return e.a(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "slot = "), this.slot, sb2, ", ", "reserved = "), this.reserved, sb2, ")");
    }
}
