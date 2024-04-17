package com.withings.reminder.database;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import com.withings.util.database2.c;
import fn0.j;
import kotlin.jvm.internal.b0;
import org.joda.time.DateTime;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43871a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f43872b;

    public /* synthetic */ a(b0 b0Var, int i11) {
        this.f43871a = i11;
        this.f43872b = b0Var;
    }

    @Override // com.withings.util.database2.c.a
    public final Object f(Object obj) {
        DateTime REMINDER_COLUMN_TIME$lambda$10;
        String REMINDER_TYPE_COLUMN_TIMELINE_NAME$lambda$16;
        int i11 = this.f43871a;
        j jVar = this.f43872b;
        switch (i11) {
            case 0:
                REMINDER_COLUMN_TIME$lambda$10 = SQLiteReminderDAO.REMINDER_COLUMN_TIME$lambda$10(jVar, (Reminder) obj);
                return REMINDER_COLUMN_TIME$lambda$10;
            default:
                REMINDER_TYPE_COLUMN_TIMELINE_NAME$lambda$16 = SQLiteReminderTypeDAO.REMINDER_TYPE_COLUMN_TIMELINE_NAME$lambda$16(jVar, (ReminderType) obj);
                return REMINDER_TYPE_COLUMN_TIMELINE_NAME$lambda$16;
        }
    }
}
