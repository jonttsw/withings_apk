package com.withings.reminder.database;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import com.withings.util.database2.c;
import fn0.j;
import kotlin.jvm.internal.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43873a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f43874b;

    public /* synthetic */ b(b0 b0Var, int i11) {
        this.f43873a = i11;
        this.f43874b = b0Var;
    }

    @Override // com.withings.util.database2.c.a
    public final Object f(Object obj) {
        int i11 = this.f43873a;
        j jVar = this.f43874b;
        switch (i11) {
            case 0:
                return SQLiteReminderDAO.y(jVar, (Reminder) obj);
            default:
                return SQLiteReminderTypeDAO.K(jVar, (ReminderType) obj);
        }
    }
}
