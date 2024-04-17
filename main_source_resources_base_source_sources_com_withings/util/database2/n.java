package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
import com.withings.util.database2.c;
/* compiled from: StringColumn.java */
/* loaded from: classes4.dex */
final class n implements c.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f46369a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar) {
        this.f46369a = oVar;
    }

    @Override // com.withings.util.database2.c.b
    public final void a(c cVar, Object obj, ContentValues contentValues) {
        contentValues.put(cVar.getName(), this.f46369a.a(obj));
    }

    @Override // com.withings.util.database2.c.b
    public final void b(c cVar, Object obj, Cursor cursor) {
        this.f46369a.b(obj, cursor.getString(cursor.getColumnIndex(cVar.getName())));
    }
}
