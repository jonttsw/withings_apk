package com.withings.util.database2;

import android.database.sqlite.SQLiteDatabase;
import androidx.camera.camera2.internal.l0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Table.java */
/* loaded from: classes4.dex */
public final class p<T> {

    /* renamed from: a  reason: collision with root package name */
    private String f46372a;

    /* renamed from: b  reason: collision with root package name */
    private c<T> f46373b;

    /* renamed from: c  reason: collision with root package name */
    private List<c<T>> f46374c;

    /* renamed from: d  reason: collision with root package name */
    private List<i> f46375d;

    /* compiled from: Table.java */
    /* loaded from: classes4.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f46376a;

        /* renamed from: b  reason: collision with root package name */
        private c<T> f46377b;

        /* renamed from: c  reason: collision with root package name */
        private ArrayList f46378c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private ArrayList f46379d = new ArrayList();

        public a(String str) {
            this.f46376a = str;
        }

        public final void a(c cVar) {
            this.f46378c.add(cVar);
        }

        public final void b(k kVar) {
            this.f46377b = kVar;
            a(kVar);
        }

        public final void c(c... cVarArr) {
            this.f46379d.add(new i(cVarArr));
        }

        public final p<T> d() {
            return new p<>(this.f46376a, this.f46377b, this.f46378c, this.f46379d);
        }
    }

    public p(String str, c<T> cVar, List<c<T>> list, List<i> list2) {
        this.f46372a = str;
        this.f46373b = cVar;
        this.f46374c = list;
        this.f46375d = list2;
        for (c<T> cVar2 : list) {
            cVar2.setTableName(str);
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase, i iVar) {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f46372a;
        sb2.append(str);
        sb2.append("_");
        sb2.append(iVar.f46362a[0].getName());
        String sb3 = sb2.toString();
        c[] cVarArr = iVar.f46362a;
        String name = cVarArr[0].getName();
        for (int i11 = 1; i11 < cVarArr.length; i11++) {
            StringBuilder b10 = com.google.android.filament.utils.b.b(name, ", ");
            b10.append(cVarArr[i11].getName());
            name = b10.toString();
            StringBuilder b11 = com.google.android.filament.utils.b.b(sb3, "_");
            b11.append(cVarArr[i11].getName());
            sb3 = b11.toString();
        }
        StringBuilder b12 = l0.b("CREATE INDEX IF NOT EXISTS ", sb3, " ON ", str, "(");
        b12.append(name);
        b12.append(");");
        sQLiteDatabase.execSQL(b12.toString());
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            List<c<T>> list = this.f46374c;
            if (i11 >= list.size()) {
                break;
            }
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(list.get(i11).getName());
            sb2.append(" ");
            sb2.append(list.get(i11).getDefinition());
            i11++;
        }
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f46372a + " (" + ((Object) sb2) + ")");
        for (i iVar : this.f46375d) {
            a(sQLiteDatabase, iVar);
        }
    }

    public final String[] c() {
        ArrayList arrayList = new ArrayList();
        for (c<T> cVar : this.f46374c) {
            arrayList.add(cVar.getName());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final List<c<T>> d() {
        return this.f46374c;
    }

    public final c<T> e() {
        return this.f46373b;
    }

    public final String f() {
        return this.f46372a;
    }
}
