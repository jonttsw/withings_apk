package com.withings.reminder.database;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import com.withings.util.database2.c;
import fn0.j;
import kotlin.jvm.internal.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43875a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f43876b;

    public /* synthetic */ c(b0 b0Var, int i11) {
        this.f43875a = i11;
        this.f43876b = b0Var;
    }

    @Override // com.withings.util.database2.c.a
    public final Object f(Object obj) {
        Long REMINDER_COLUMN_WSID$lambda$2;
        Long REMINDER_TYPE_COLUMN_WSID$lambda$2;
        int i11 = this.f43875a;
        j jVar = this.f43876b;
        switch (i11) {
            case 0:
                REMINDER_COLUMN_WSID$lambda$2 = SQLiteReminderDAO.REMINDER_COLUMN_WSID$lambda$2(jVar, (Reminder) obj);
                return REMINDER_COLUMN_WSID$lambda$2;
            default:
                REMINDER_TYPE_COLUMN_WSID$lambda$2 = SQLiteReminderTypeDAO.REMINDER_TYPE_COLUMN_WSID$lambda$2(jVar, (ReminderType) obj);
                return REMINDER_TYPE_COLUMN_WSID$lambda$2;
        }
    }
}
