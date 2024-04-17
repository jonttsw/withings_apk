package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.activity.a0;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class UserInfo extends h {
    public String firstname;
    public long pictoId;
    public long userId;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.firstname;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 9);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 282;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.firstname = readString(byteBuffer);
        this.userId = readUnsignedInt(byteBuffer);
        this.pictoId = readUnsignedInt(byteBuffer);
    }

    public UserInfo setFirstname(String str) {
        this.firstname = str;
        return this;
    }

    public UserInfo setPictoId(long j5) {
        this.pictoId = j5;
        return this;
    }

    public UserInfo setUserId(long j5) {
        this.userId = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.firstname);
        writeUnsignedInt(e11, this.userId);
        writeUnsignedInt(e11, this.pictoId);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserInfo(");
        StringBuilder c11 = a0.c(new StringBuilder("firstname = "), this.firstname, sb2, ", ", "userId = ");
        c11.append(this.userId);
        sb2.append(c11.toString());
        sb2.append(", ");
        return j.b(new StringBuilder("pictoId = "), this.pictoId, sb2, ")");
    }
}
