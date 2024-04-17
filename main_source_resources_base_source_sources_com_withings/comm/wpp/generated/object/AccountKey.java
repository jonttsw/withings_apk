package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AccountKey extends h {

    /* renamed from: id  reason: collision with root package name */
    public long f33234id;
    public String secret;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.secret;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 5);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 309;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33234id = readUnsignedInt(byteBuffer);
        this.secret = readString(byteBuffer);
    }

    public AccountKey setId(long j5) {
        this.f33234id = j5;
        return this;
    }

    public AccountKey setSecret(String str) {
        this.secret = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.f33234id);
        writeString(e11, this.secret);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AccountKey(");
        sb2.append("id = " + this.f33234id);
        sb2.append(", ");
        return c.c(new StringBuilder("secret = "), this.secret, sb2, ")");
    }
}
