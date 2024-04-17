package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class UserUnit extends h {
    public static final short CMD_GET = 1;
    public static final short CMD_SET = 0;
    public static final short ERR_FAIL = -1;
    public static final short ERR_OK = 0;
    public static final short ERR_UNSUPPORTED_CMD = -3;
    public static final short ERR_UNSUPPORTED_TYPE = -4;
    public static final short ERR_UNSUPPORTED_UNIT = -5;
    public static final short TYPE_CLOCK = 4;
    public static final short TYPE_DISTANCE = 2;
    public static final short TYPE_ELEVATION = 3;
    public static final short TYPE_TEMP = 1;
    public static final short TYPE_WEIGHT = 0;
    public static final short UNIT_24H = 26;
    public static final short UNIT_AM_PM = 27;
    public static final short UNIT_CELSIUS = 19;
    public static final short UNIT_FAHRENHEIT = 20;
    public static final short UNIT_FEET = 23;
    public static final short UNIT_KG = 16;
    public static final short UNIT_KILOMETERS = 24;
    public static final short UNIT_LB = 17;
    public static final short UNIT_LBOZ = 21;
    public static final short UNIT_METERS = 22;
    public static final short UNIT_MILES = 25;
    public static final short UNIT_NOTSET = 0;
    public static final short UNIT_ST = 18;
    public static final short UNIT_UNKNOWN = 1;
    public short cmd;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33278rc;
    public int type;
    public int unit;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 281;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readUnsignedByte(byteBuffer);
        this.f33278rc = readByte(byteBuffer);
        this.type = readUnsignedShort(byteBuffer);
        this.unit = readUnsignedShort(byteBuffer);
    }

    public UserUnit setCmd(short s11) {
        this.cmd = s11;
        return this;
    }

    public UserUnit setRc(byte b10) {
        this.f33278rc = b10;
        return this;
    }

    public UserUnit setType(int i11) {
        this.type = i11;
        return this;
    }

    public UserUnit setUnit(int i11) {
        this.unit = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.cmd);
        writeByte(e11, this.f33278rc);
        writeUnsignedShort(e11, this.type);
        writeUnsignedShort(e11, this.unit);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserUnit(");
        return e.a(q.d(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "rc = "), this.f33278rc, sb2, ", ", "type = "), this.type, sb2, ", ", "unit = "), this.unit, sb2, ")");
    }
}
