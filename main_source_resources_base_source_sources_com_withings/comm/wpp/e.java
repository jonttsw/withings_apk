package com.withings.comm.wpp;

import com.withings.comm.wpp.d;
import com.withings.comm.wpp.generated.Wpp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: WppLogger.java */
/* loaded from: classes3.dex */
public final class e implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private cj.b f33227a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f33228b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c  reason: collision with root package name */
    private long f33229c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33230d;

    public e(cj.b bVar) {
        this.f33227a = bVar;
    }

    private void b(boolean z5, String str, Object... objArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33227a.toString());
        sb2.append(" ");
        if (z5) {
            str2 = "--send-->";
        } else {
            str2 = "<--read--";
        }
        sb2.append(str2);
        StringBuilder b10 = com.google.android.filament.utils.b.b(sb2.toString(), " ");
        b10.append(String.format(str, objArr));
        x70.b.r("WPP", b10.toString(), new Object[0]);
    }

    private void c(boolean z5, f fVar) {
        String str;
        Object[] objArr = new Object[2];
        int i11 = 0;
        objArr[0] = Wpp.prettyCommand(fVar.e());
        short b10 = fVar.b();
        Field[] fields = Wpp.class.getFields();
        int length = fields.length;
        while (true) {
            if (i11 < length) {
                Field field = fields[i11];
                try {
                    if (field.getName().startsWith("CMD_") && field.getType() == Short.TYPE && field.getShort(null) == b10) {
                        str = field.getName();
                        break;
                    }
                } catch (IllegalAccessException unused) {
                }
                i11++;
            } else {
                str = "Unknown command";
                break;
            }
        }
        objArr[1] = str;
        b(z5, "%s ~ %s", objArr);
        for (h hVar : fVar.d()) {
            b(z5, " + %s ~ %s", Wpp.prettyCommand(hVar.getType()), hVar);
        }
    }

    public final ArrayList a() {
        List<a> list = this.f33228b;
        ArrayList arrayList = new ArrayList(list);
        list.removeAll(arrayList);
        return arrayList;
    }

    public final void d() {
        this.f33227a.k().b(this);
        this.f33229c = System.currentTimeMillis();
    }

    @Override // com.withings.comm.wpp.d.a
    public final void e(f fVar) {
        c(true, fVar);
    }

    @Override // com.withings.comm.wpp.d.a
    public final void f(byte[] bArr) {
        if (!this.f33230d) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f33228b.add(new a(currentTimeMillis, currentTimeMillis - this.f33229c, true, Wpp.prettyBytes(bArr)));
        }
        b(true, Wpp.prettyBytes(bArr), new Object[0]);
    }

    @Override // com.withings.comm.wpp.d.a
    public final void h(byte[] bArr) {
        if (!this.f33230d) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f33228b.add(new a(currentTimeMillis, currentTimeMillis - this.f33229c, false, Wpp.prettyBytes(bArr)));
        }
        b(false, Wpp.prettyBytes(bArr), new Object[0]);
    }

    @Override // com.withings.comm.wpp.d.a
    public final void k(boolean z5, String str) {
        this.f33230d = z5;
        if (str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f33228b.add(new a(currentTimeMillis, currentTimeMillis - this.f33229c, false, str));
        }
    }

    @Override // com.withings.comm.wpp.d.b
    public final void o(d dVar, f fVar) {
        c(false, fVar);
    }

    @Override // com.withings.comm.wpp.d.b
    public final void i(d dVar) {
    }
}
