package com.withings.util.database2;
/* compiled from: Predicate.java */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private String f46367a;

    /* renamed from: b  reason: collision with root package name */
    private String[] f46368b;

    public l(String str) {
        this(str, new String[0]);
    }

    public static l d(c cVar, int i11) {
        return new l(cVar.getNameWithTable() + " = ?", new String[]{String.valueOf(i11)});
    }

    public static l e(c cVar, long j5) {
        return new l(cVar.getNameWithTable() + " = ?", new String[]{String.valueOf(j5)});
    }

    public static l f(c cVar, boolean z5) {
        String str;
        String str2 = cVar.getNameWithTable() + " = ?";
        String[] strArr = new String[1];
        if (z5) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[0] = str;
        return new l(str2, strArr);
    }

    public static l g(c cVar, long j5) {
        return new l(cVar.getNameWithTable() + " >= ?", new String[]{String.valueOf(j5)});
    }

    public static l h(c cVar, int[] iArr) {
        String[] strArr = new String[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            strArr[i11] = String.valueOf(iArr[i11]);
        }
        return i(cVar, strArr);
    }

    public static l i(c cVar, String[] strArr) {
        StringBuilder sb2 = new StringBuilder(cVar.getNameWithTable());
        sb2.append(" IN (");
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append("?");
        }
        sb2.append(")");
        return new l(sb2.toString(), strArr);
    }

    public static l j(c cVar, long j5) {
        return new l(cVar.getNameWithTable() + " < ?", new String[]{String.valueOf(j5)});
    }

    public static l k(c cVar, long j5) {
        return new l(cVar.getNameWithTable() + " <= ?", new String[]{String.valueOf(j5)});
    }

    public static l l(c cVar, int i11) {
        return new l(cVar.getNameWithTable() + " != ?", new String[]{String.valueOf(i11)});
    }

    public static l m(c cVar, int[] iArr) {
        l h11 = h(cVar, iArr);
        return new l("NOT " + h11.f46367a, h11.f46368b);
    }

    public static l n(c cVar, long[] jArr) {
        String[] strArr = new String[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            strArr[i11] = String.valueOf(jArr[i11]);
        }
        l i12 = i(cVar, strArr);
        return new l("NOT " + i12.f46367a, i12.f46368b);
    }

    public static l o(c cVar, String[] strArr) {
        l i11 = i(cVar, strArr);
        return new l("NOT " + i11.f46367a, i11.f46368b);
    }

    public final l a(l lVar) {
        return new l(this.f46367a + " AND " + lVar.f46367a, (String[]) androidx.health.connect.client.units.d.d(this.f46368b, lVar.f46368b));
    }

    public final String b() {
        return this.f46367a;
    }

    public final String[] c() {
        return this.f46368b;
    }

    public l(String str, String[] strArr) {
        this.f46367a = str;
        this.f46368b = strArr;
    }
}
