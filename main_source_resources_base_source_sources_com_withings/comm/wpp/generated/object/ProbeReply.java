package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.activity.a0;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ProbeReply extends h {
    public long blVersion;
    public long hardVersion;
    public String mac;
    public String mfgId;
    public String name;
    public int pid;
    public long rescueVersion;
    public String secret;
    public long softVersion;
    public int vid;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        int i12;
        int i13;
        String str = this.name;
        int i14 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i15 = i11 + 5;
        String str2 = this.mac;
        if (str2 != null) {
            i12 = str2.getBytes().length;
        } else {
            i12 = 0;
        }
        int i16 = i12 + 1 + i15;
        String str3 = this.secret;
        if (str3 != null) {
            i13 = str3.getBytes().length;
        } else {
            i13 = 0;
        }
        int i17 = i13 + 1 + i16 + 4;
        String str4 = this.mfgId;
        if (str4 != null) {
            i14 = str4.getBytes().length;
        }
        return (short) (i14 + 1 + i17 + 12);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 257;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.vid = readUnsignedShort(byteBuffer);
        this.pid = readUnsignedShort(byteBuffer);
        this.name = readString(byteBuffer);
        this.mac = readString(byteBuffer);
        this.secret = readString(byteBuffer);
        this.hardVersion = readUnsignedInt(byteBuffer);
        this.mfgId = readString(byteBuffer);
        this.blVersion = readUnsignedInt(byteBuffer);
        this.softVersion = readUnsignedInt(byteBuffer);
        this.rescueVersion = readUnsignedInt(byteBuffer);
    }

    public ProbeReply setBlVersion(long j5) {
        this.blVersion = j5;
        return this;
    }

    public ProbeReply setHardVersion(long j5) {
        this.hardVersion = j5;
        return this;
    }

    public ProbeReply setMac(String str) {
        this.mac = str;
        return this;
    }

    public ProbeReply setMfgId(String str) {
        this.mfgId = str;
        return this;
    }

    public ProbeReply setName(String str) {
        this.name = str;
        return this;
    }

    public ProbeReply setPid(int i11) {
        this.pid = i11;
        return this;
    }

    public ProbeReply setRescueVersion(long j5) {
        this.rescueVersion = j5;
        return this;
    }

    public ProbeReply setSecret(String str) {
        this.secret = str;
        return this;
    }

    public ProbeReply setSoftVersion(long j5) {
        this.softVersion = j5;
        return this;
    }

    public ProbeReply setVid(int i11) {
        this.vid = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.vid);
        writeUnsignedShort(e11, this.pid);
        writeString(e11, this.name);
        writeString(e11, this.mac);
        writeString(e11, this.secret);
        writeUnsignedInt(e11, this.hardVersion);
        writeString(e11, this.mfgId);
        writeUnsignedInt(e11, this.blVersion);
        writeUnsignedInt(e11, this.softVersion);
        writeUnsignedInt(e11, this.rescueVersion);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProbeReply(");
        StringBuilder c11 = a0.c(a0.c(a0.c(q.d(q.d(new StringBuilder("vid = "), this.vid, sb2, ", ", "pid = "), this.pid, sb2, ", ", "name = "), this.name, sb2, ", ", "mac = "), this.mac, sb2, ", ", "secret = "), this.secret, sb2, ", ", "hardVersion = ");
        c11.append(this.hardVersion);
        sb2.append(c11.toString());
        sb2.append(", ");
        StringBuilder c12 = a0.c(new StringBuilder("mfgId = "), this.mfgId, sb2, ", ", "blVersion = ");
        c12.append(this.blVersion);
        sb2.append(c12.toString());
        sb2.append(", ");
        sb2.append("softVersion = " + this.softVersion);
        sb2.append(", ");
        return j.b(new StringBuilder("rescueVersion = "), this.rescueVersion, sb2, ")");
    }
}
