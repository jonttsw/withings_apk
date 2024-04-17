package com.withings.reminder.database;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import com.withings.util.database2.c;
import fn0.j;
import kotlin.jvm.internal.b0;
import org.joda.time.DateTime;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f43880b;

    public /* synthetic */ e(b0 b0Var, int i11) {
        this.f43879a = i11;
        this.f43880b = b0Var;
    }

    @Override // com.withings.util.database2.c.a
    public final Object f(Object obj) {
        DateTime REMINDER_COLUMN_UPDATED_DATE$lambda$6;
        String REMINDER_TYPE_COLUMN_CATEGORY_NAME$lambda$6;
        int i11 = this.f43879a;
        j jVar = this.f43880b;
        switch (i11) {
            case 0:
                REMINDER_COLUMN_UPDATED_DATE$lambda$6 = SQLiteReminderDAO.REMINDER_COLUMN_UPDATED_DATE$lambda$6(jVar, (Reminder) obj);
                return REMINDER_COLUMN_UPDATED_DATE$lambda$6;
            default:
                REMINDER_TYPE_COLUMN_CATEGORY_NAME$lambda$6 = SQLiteReminderTypeDAO.REMINDER_TYPE_COLUMN_CATEGORY_NAME$lambda$6(jVar, (ReminderType) obj);
                return REMINDER_TYPE_COLUMN_CATEGORY_NAME$lambda$6;
        }
    }
}
