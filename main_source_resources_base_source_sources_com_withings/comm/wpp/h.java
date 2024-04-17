package com.withings.comm.wpp;

import com.withings.comm.wpp.generated.Wpp;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import u70.m;
/* compiled from: WppObject.java */
/* loaded from: classes3.dex */
public abstract class h implements Serializable {
    public static final int BYTE_SIZE = 1;
    public static final int INT_SIZE = 4;
    public static final int LONG_SIZE = 8;
    public static final int SHORT_SIZE = 2;
    public static final int SIZE_SIZE = 2;
    public static final int TYPE_SIZE = 2;
    private static final short UNSIGNED_BYTE_MASK = 255;
    private static final long UNSIGNED_INT_MASK = 4294967295L;
    private static final long UNSIGNED_LONG_MASK = -1;
    private static final int UNSIGNED_SHORT_MASK = 65535;

    public abstract short getDataSize();

    public short getSize() {
        return (short) (getDataSize() + 4);
    }

    public abstract short getType();

    public abstract void initWithBytes(ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: protected */
    public byte readByte(ByteBuffer byteBuffer) {
        return byteBuffer.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] readByteArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[readUnsignedByte(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int readInt(ByteBuffer byteBuffer) {
        return byteBuffer.getInt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] readIntArray(ByteBuffer byteBuffer) {
        int readUnsignedByte = readUnsignedByte(byteBuffer);
        int[] iArr = new int[readUnsignedByte];
        for (int i11 = 0; i11 < readUnsignedByte; i11++) {
            iArr[i11] = readInt(byteBuffer);
        }
        return iArr;
    }

    protected long readLong(ByteBuffer byteBuffer) {
        return byteBuffer.getLong();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public short readShort(ByteBuffer byteBuffer) {
        return byteBuffer.getShort();
    }

    protected short[] readShortArray(ByteBuffer byteBuffer) {
        int readUnsignedByte = readUnsignedByte(byteBuffer);
        short[] sArr = new short[readUnsignedByte];
        for (int i11 = 0; i11 < readUnsignedByte; i11++) {
            sArr[i11] = readShort(byteBuffer);
        }
        return sArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String readString(ByteBuffer byteBuffer) {
        return new String(readByteArray(byteBuffer), StandardCharsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public short readUnsignedByte(ByteBuffer byteBuffer) {
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public short[] readUnsignedByteArray(ByteBuffer byteBuffer) {
        int readUnsignedByte = readUnsignedByte(byteBuffer);
        short[] sArr = new short[readUnsignedByte];
        for (int i11 = 0; i11 < readUnsignedByte; i11++) {
            sArr[i11] = readUnsignedByte(byteBuffer);
        }
        return sArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long readUnsignedInt(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & UNSIGNED_INT_MASK;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long[] readUnsignedIntArray(ByteBuffer byteBuffer) {
        int readUnsignedByte = readUnsignedByte(byteBuffer);
        long[] jArr = new long[readUnsignedByte];
        for (int i11 = 0; i11 < readUnsignedByte; i11++) {
            jArr[i11] = readUnsignedInt(byteBuffer);
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long readUnsignedLong(ByteBuffer byteBuffer) {
        return byteBuffer.getLong();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int readUnsignedShort(ByteBuffer byteBuffer) {
        return byteBuffer.getShort() & 65535;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] readUnsignedShortArray(ByteBuffer byteBuffer) {
        int readUnsignedByte = readUnsignedByte(byteBuffer);
        int[] iArr = new int[readUnsignedByte];
        for (int i11 = 0; i11 < readUnsignedByte; i11++) {
            iArr[i11] = readUnsignedShort(byteBuffer);
        }
        return iArr;
    }

    public abstract byte[] toByteArray();

    public String toString() {
        String str;
        try {
            byte[] byteArray = toByteArray();
            str = m.b(Arrays.copyOfRange(byteArray, 2, byteArray.length));
        } catch (Exception unused) {
            str = "Some data";
        }
        String prettyCommand = Wpp.prettyCommand(getType());
        String prettyCommand2 = Wpp.prettyCommand(getDataSize());
        return prettyCommand + " " + prettyCommand2 + " " + str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeByte(ByteBuffer byteBuffer, byte b10) {
        byteBuffer.put(b10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeByteArray(ByteBuffer byteBuffer, byte[] bArr) {
        byteBuffer.put((byte) bArr.length);
        if (bArr.length != 0) {
            byteBuffer.put(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeInt(ByteBuffer byteBuffer, int i11) {
        byteBuffer.putInt(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeIntArray(ByteBuffer byteBuffer, int[] iArr) {
        byteBuffer.put((byte) iArr.length);
        for (int i11 : iArr) {
            writeInt(byteBuffer, i11);
        }
    }

    protected void writeLong(ByteBuffer byteBuffer, long j5) {
        byteBuffer.putLong(j5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeShort(ByteBuffer byteBuffer, short s11) {
        byteBuffer.putShort(s11);
    }

    protected void writeShortArray(ByteBuffer byteBuffer, short[] sArr) {
        byteBuffer.put((byte) sArr.length);
        for (short s11 : sArr) {
            writeShort(byteBuffer, s11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeString(ByteBuffer byteBuffer, String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(StandardCharsets.UTF_8);
        } else {
            bArr = new byte[0];
        }
        writeByteArray(byteBuffer, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeUnsignedByte(ByteBuffer byteBuffer, int i11) {
        byteBuffer.put((byte) (i11 & 255));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeUnsignedByteArray(ByteBuffer byteBuffer, short[] sArr) {
        byteBuffer.put((byte) sArr.length);
        for (short s11 : sArr) {
            writeUnsignedByte(byteBuffer, s11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeUnsignedInt(ByteBuffer byteBuffer, long j5) {
        byteBuffer.putInt((int) (j5 & UNSIGNED_INT_MASK));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeUnsignedIntArray(ByteBuffer byteBuffer, long[] jArr) {
        byteBuffer.put((byte) jArr.length);
        for (long j5 : jArr) {
            writeUnsignedInt(byteBuffer, j5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeUnsignedLong(ByteBuffer byteBuffer, long j5) {
        byteBuffer.putLong(j5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeUnsignedShort(ByteBuffer byteBuffer, int i11) {
        byteBuffer.putShort((short) (i11 & 65535));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeUnsignedShortArray(ByteBuffer byteBuffer, int[] iArr) {
        byteBuffer.put((byte) iArr.length);
        for (int i11 : iArr) {
            writeUnsignedShort(byteBuffer, i11);
        }
    }
}
