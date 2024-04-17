package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.util.database2.c;
/* compiled from: DoubleColumn.java */
/* loaded from: classes4.dex */
final class e implements c.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f46360a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar) {
        this.f46360a = fVar;
    }

    @Override // com.withings.util.database2.c.b
    public final void a(c cVar, Object obj, ContentValues contentValues) {
        contentValues.put(cVar.getName(), this.f46360a.a(obj));
    }

    @Override // com.withings.util.database2.c.b
    public final void b(c cVar, Object obj, Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(cVar.getName());
        boolean isNull = cursor.isNull(columnIndex);
        f fVar = this.f46360a;
        if (isNull) {
            if (cVar.isPrimitive()) {
                fVar.b(obj, Double.valueOf((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                return;
            } else {
                fVar.b(obj, null);
                return;
            }
        }
        fVar.b(obj, Double.valueOf(cursor.getDouble(columnIndex)));
    }
}
