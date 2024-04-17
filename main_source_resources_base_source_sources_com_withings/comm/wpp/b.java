package com.withings.comm.wpp;

import com.withings.comm.wpp.d;
import com.withings.comm.wpp.generated.Wpp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: SetupWppLogger.java */
/* loaded from: classes3.dex */
public final class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private cj.b f33220a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f33221b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c  reason: collision with root package name */
    private long f33222c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33223d;

    public b(cj.b bVar) {
        this.f33220a = bVar;
    }

    private void b(boolean z5, String str, Object... objArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33220a.toString());
        sb2.append(" ");
        if (z5) {
            str2 = "--send-->";
        } else {
            str2 = "<--read--";
        }
        sb2.append(str2);
        StringBuilder b10 = com.google.android.filament.utils.b.b(sb2.toString(), " ");
        b10.append(String.format(str, objArr));
        String sb3 = b10.toString();
        long currentTimeMillis = System.currentTimeMillis();
        this.f33221b.add(new a(currentTimeMillis, currentTimeMillis - this.f33222c, false, sb3));
    }

    private void c(boolean z5, f fVar) {
        String str;
        if (!this.f33223d) {
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
    }

    public final ArrayList a() {
        List<a> list = this.f33221b;
        ArrayList arrayList = new ArrayList(list);
        list.removeAll(arrayList);
        return arrayList;
    }

    public final void d() {
        this.f33220a.k().b(this);
        this.f33222c = System.currentTimeMillis();
    }

    @Override // com.withings.comm.wpp.d.a
    public final void e(f fVar) {
        c(true, fVar);
    }

    public final void g() {
        d k11 = this.f33220a.k();
        if (k11 != null) {
            k11.i(this);
        }
    }

    @Override // com.withings.comm.wpp.d.a
    public final void k(boolean z5, String str) {
        this.f33223d = z5;
    }

    @Override // com.withings.comm.wpp.d.b
    public final void o(d dVar, f fVar) {
        c(false, fVar);
    }

    @Override // com.withings.comm.wpp.d.a
    public final void f(byte[] bArr) {
    }

    @Override // com.withings.comm.wpp.d.a
    public final void h(byte[] bArr) {
    }

    @Override // com.withings.comm.wpp.d.b
    public final void i(d dVar) {
    }
}
