package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
import com.withings.util.database2.c;
/* compiled from: FloatColumn.java */
/* loaded from: classes4.dex */
final class g implements c.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f46361a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(h hVar) {
        this.f46361a = hVar;
    }

    @Override // com.withings.util.database2.c.b
    public final void a(c cVar, Object obj, ContentValues contentValues) {
        contentValues.put(cVar.getName(), this.f46361a.a(obj));
    }

    @Override // com.withings.util.database2.c.b
    public final void b(c cVar, Object obj, Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(cVar.getName());
        boolean isNull = cursor.isNull(columnIndex);
        h hVar = this.f46361a;
        if (isNull) {
            if (cVar.isPrimitive()) {
                hVar.b(obj, Float.valueOf(0.0f));
                return;
            } else {
                hVar.b(obj, null);
                return;
            }
        }
        hVar.b(obj, Float.valueOf(cursor.getFloat(columnIndex)));
    }
}
