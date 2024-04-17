package com.withings.reminder.database;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import com.withings.util.database2.c;
import fn0.j;
import kotlin.jvm.internal.b0;
import org.joda.time.DateTime;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43881a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f43882b;

    public /* synthetic */ f(b0 b0Var, int i11) {
        this.f43881a = i11;
        this.f43882b = b0Var;
    }

    @Override // com.withings.util.database2.c.a
    public final Object f(Object obj) {
        DateTime REMINDER_COLUMN_MUTE_DATE$lambda$8;
        String REMINDER_TYPE_COLUMN_NAME$lambda$8;
        int i11 = this.f43881a;
        j jVar = this.f43882b;
        switch (i11) {
            case 0:
                REMINDER_COLUMN_MUTE_DATE$lambda$8 = SQLiteReminderDAO.REMINDER_COLUMN_MUTE_DATE$lambda$8(jVar, (Reminder) obj);
                return REMINDER_COLUMN_MUTE_DATE$lambda$8;
            default:
                REMINDER_TYPE_COLUMN_NAME$lambda$8 = SQLiteReminderTypeDAO.REMINDER_TYPE_COLUMN_NAME$lambda$8(jVar, (ReminderType) obj);
                return REMINDER_TYPE_COLUMN_NAME$lambda$8;
        }
    }
}
