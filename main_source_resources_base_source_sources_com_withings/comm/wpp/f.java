package com.withings.comm.wpp;

import com.withings.comm.wpp.generated.Wpp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: WppMessage.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final byte f33231a;

    /* renamed from: b  reason: collision with root package name */
    private short f33232b;

    /* renamed from: c  reason: collision with root package name */
    private List<h> f33233c;

    public f(byte b10, short s11, h... hVarArr) {
        this(b10, s11, Arrays.asList(hVarArr));
    }

    public final int a() {
        return (short) (this.f33232b & Wpp.CMD_CHANNEL_MASK);
    }

    public final short b() {
        return (short) (this.f33232b & 16383);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int c() {
        int i11 = 0;
        for (h hVar : this.f33233c) {
            i11 += hVar.getSize();
        }
        return i11;
    }

    public final List<h> d() {
        return this.f33233c;
    }

    public final short e() {
        return this.f33232b;
    }

    public final byte f() {
        return this.f33231a;
    }

    public final void g() {
        this.f33232b = (short) (b() | Wpp.CMD_CHANNEL_SLAVE_REQUEST);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Wpp.prettyByte(this.f33231a));
        sb2.append(" ");
        sb2.append(Wpp.prettyCommand(this.f33232b));
        sb2.append(" ");
        sb2.append(Wpp.prettyCommand((short) c()));
        for (h hVar : this.f33233c) {
            sb2.append("  ");
            sb2.append(hVar.toString());
        }
        return sb2.toString();
    }

    public f(byte b10, short s11, List<h> list) {
        this.f33231a = b10;
        this.f33232b = s11;
        this.f33233c = Collections.unmodifiableList(list);
    }
}
