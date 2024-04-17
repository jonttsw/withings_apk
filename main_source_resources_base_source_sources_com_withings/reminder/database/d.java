package com.withings.reminder.database;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import com.withings.util.database2.c;
import fn0.j;
import kotlin.jvm.internal.b0;
import org.joda.time.DateTime;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43877a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f43878b;

    public /* synthetic */ d(b0 b0Var, int i11) {
        this.f43877a = i11;
        this.f43878b = b0Var;
    }

    @Override // com.withings.util.database2.c.a
    public final Object f(Object obj) {
        DateTime REMINDER_COLUMN_CREATED_DATE$lambda$4;
        Integer REMINDER_TYPE_COLUMN_CATEGORY_ID$lambda$4;
        int i11 = this.f43877a;
        j jVar = this.f43878b;
        switch (i11) {
            case 0:
                REMINDER_COLUMN_CREATED_DATE$lambda$4 = SQLiteReminderDAO.REMINDER_COLUMN_CREATED_DATE$lambda$4(jVar, (Reminder) obj);
                return REMINDER_COLUMN_CREATED_DATE$lambda$4;
            default:
                REMINDER_TYPE_COLUMN_CATEGORY_ID$lambda$4 = SQLiteReminderTypeDAO.REMINDER_TYPE_COLUMN_CATEGORY_ID$lambda$4(jVar, (ReminderType) obj);
                return REMINDER_TYPE_COLUMN_CATEGORY_ID$lambda$4;
        }
    }
}
