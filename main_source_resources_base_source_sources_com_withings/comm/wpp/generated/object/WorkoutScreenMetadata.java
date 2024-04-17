package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WorkoutScreenMetadata extends h {
    public short faceMode;
    public int flag;

    /* renamed from: id  reason: collision with root package name */
    public long f33286id;
    public String name;
    public short version;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.name;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 9);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 317;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33286id = readUnsignedInt(byteBuffer);
        this.version = readUnsignedByte(byteBuffer);
        this.name = readString(byteBuffer);
        this.faceMode = readUnsignedByte(byteBuffer);
        this.flag = readUnsignedShort(byteBuffer);
    }

    public WorkoutScreenMetadata setFaceMode(short s11) {
        this.faceMode = s11;
        return this;
    }

    public WorkoutScreenMetadata setFlag(int i11) {
        this.flag = i11;
        return this;
    }

    public WorkoutScreenMetadata setId(long j5) {
        this.f33286id = j5;
        return this;
    }

    public WorkoutScreenMetadata setName(String str) {
        this.name = str;
        return this;
    }

    public WorkoutScreenMetadata setVersion(short s11) {
        this.version = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.f33286id);
        writeUnsignedByte(e11, this.version);
        writeString(e11, this.name);
        writeUnsignedByte(e11, this.faceMode);
        writeUnsignedShort(e11, this.flag);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WorkoutScreenMetadata(");
        sb2.append("id = " + this.f33286id);
        sb2.append(", ");
        return e.a(q.d(a0.c(q.d(new StringBuilder("version = "), this.version, sb2, ", ", "name = "), this.name, sb2, ", ", "faceMode = "), this.faceMode, sb2, ", ", "flag = "), this.flag, sb2, ")");
    }
}
