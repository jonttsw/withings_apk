package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsdWsmUser extends h {
    public int birth;
    public String firstName;
    public short gender;
    public long height;

    /* renamed from: id  reason: collision with root package name */
    public long f33291id;
    public String mac;
    public long weight;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.firstName;
        int i12 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i13 = i11 + 18;
        String str2 = this.mac;
        if (str2 != null) {
            i12 = str2.getBytes().length;
        }
        return (short) (i12 + 1 + i13);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2307;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33291id = readUnsignedInt(byteBuffer);
        this.weight = readUnsignedInt(byteBuffer);
        this.height = readUnsignedInt(byteBuffer);
        this.gender = readUnsignedByte(byteBuffer);
        this.birth = readInt(byteBuffer);
        this.firstName = readString(byteBuffer);
        this.mac = readString(byteBuffer);
    }

    public WsdWsmUser setBirth(int i11) {
        this.birth = i11;
        return this;
    }

    public WsdWsmUser setFirstName(String str) {
        this.firstName = str;
        return this;
    }

    public WsdWsmUser setGender(short s11) {
        this.gender = s11;
        return this;
    }

    public WsdWsmUser setHeight(long j5) {
        this.height = j5;
        return this;
    }

    public WsdWsmUser setId(long j5) {
        this.f33291id = j5;
        return this;
    }

    public WsdWsmUser setMac(String str) {
        this.mac = str;
        return this;
    }

    public WsdWsmUser setWeight(long j5) {
        this.weight = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.f33291id);
        writeUnsignedInt(e11, this.weight);
        writeUnsignedInt(e11, this.height);
        writeUnsignedByte(e11, this.gender);
        writeInt(e11, this.birth);
        writeString(e11, this.firstName);
        writeString(e11, this.mac);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsdWsmUser(");
        sb2.append("id = " + this.f33291id);
        sb2.append(", ");
        sb2.append("weight = " + this.weight);
        sb2.append(", ");
        sb2.append("height = " + this.height);
        sb2.append(", ");
        return c.c(a0.c(q.d(q.d(new StringBuilder("gender = "), this.gender, sb2, ", ", "birth = "), this.birth, sb2, ", ", "firstName = "), this.firstName, sb2, ", ", "mac = "), this.mac, sb2, ")");
    }
}
