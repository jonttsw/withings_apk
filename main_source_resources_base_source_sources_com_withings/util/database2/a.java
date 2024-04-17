package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
import com.withings.util.database2.c;
/* compiled from: BooleanColumn.java */
/* loaded from: classes4.dex */
final class a implements c.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f46354a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        this.f46354a = bVar;
    }

    @Override // com.withings.util.database2.c.b
    public final void a(c cVar, Object obj, ContentValues contentValues) {
        Integer valueOf;
        Boolean a11 = this.f46354a.a(obj);
        String name = cVar.getName();
        if (a11 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(a11.booleanValue() ? 1 : 0);
        }
        contentValues.put(name, valueOf);
    }

    @Override // com.withings.util.database2.c.b
    public final void b(c cVar, Object obj, Cursor cursor) {
        boolean z5;
        int columnIndex = cursor.getColumnIndex(cVar.getName());
        boolean isNull = cursor.isNull(columnIndex);
        b bVar = this.f46354a;
        if (isNull) {
            if (cVar.isPrimitive()) {
                bVar.b(obj, Boolean.FALSE);
                return;
            } else {
                bVar.b(obj, null);
                return;
            }
        }
        if (cursor.getInt(columnIndex) > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        bVar.b(obj, Boolean.valueOf(z5));
    }
}
