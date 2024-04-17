package com.withings.reminder.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.camera.camera2.internal.n0;
import androidx.camera.core.m0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import com.withings.util.database2.j;
import com.withings.util.database2.k;
import com.withings.util.database2.m;
import com.withings.util.database2.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import m6.q;
import m6.r;
import m6.u;
import org.jivesoftware.smack.sm.packet.StreamManagement;
import org.joda.time.DateTime;
import t5.i;
/* compiled from: SQLiteReminderDAO.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/withings/reminder/database/SQLiteReminderDAO;", "Lcom/withings/util/database2/m;", "Lcom/withings/reminder/model/Reminder;", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "oldVersion", "newVersion", "Lnm0/y;", "upgradeTable", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "newEntity", "()Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "", "id", "setId", "(Lcom/withings/reminder/model/Reminder;J)V", "getId", "(Lcom/withings/reminder/model/Reminder;)Ljava/lang/Long;", "", "getAll", "()Ljava/util/List;", "getById", "(J)Lcom/withings/reminder/model/Reminder;", "Landroid/database/sqlite/SQLiteOpenHelper;", "dbHelper", "<init>", "(Landroid/database/sqlite/SQLiteOpenHelper;)V", "Companion", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SQLiteReminderDAO extends m<Reminder> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final com.withings.util.database2.d<Reminder> REMINDER_COLUMN_CREATED_DATE;
    private static final SQLiteReminderDAO$Companion$REMINDER_COLUMN_DAYS$1 REMINDER_COLUMN_DAYS;
    private static final com.withings.util.database2.b<Reminder> REMINDER_COLUMN_ENABLED;
    private static final k<Reminder> REMINDER_COLUMN_ID;
    private static final com.withings.util.database2.d<Reminder> REMINDER_COLUMN_MUTE_DATE;
    private static final k<Reminder> REMINDER_COLUMN_REMINDER_TYPE_WSID;
    private static final com.withings.util.database2.d<Reminder> REMINDER_COLUMN_TIME;
    private static final com.withings.util.database2.d<Reminder> REMINDER_COLUMN_UPDATED_DATE;
    private static final k<Reminder> REMINDER_COLUMN_WSID;
    private static final p<Reminder> REMINDER_TABLE;

    /* compiled from: SQLiteReminderDAO.kt */
    @Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR8\u0010\u0016\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/withings/reminder/database/SQLiteReminderDAO$Companion;", "", "Lcom/withings/util/database2/d;", "Lcom/withings/reminder/model/Reminder;", "kotlin.jvm.PlatformType", "REMINDER_COLUMN_CREATED_DATE", "Lcom/withings/util/database2/d;", "com/withings/reminder/database/SQLiteReminderDAO$Companion$REMINDER_COLUMN_DAYS$1", "REMINDER_COLUMN_DAYS", "Lcom/withings/reminder/database/SQLiteReminderDAO$Companion$REMINDER_COLUMN_DAYS$1;", "Lcom/withings/util/database2/b;", "REMINDER_COLUMN_ENABLED", "Lcom/withings/util/database2/b;", "Lcom/withings/util/database2/k;", "REMINDER_COLUMN_ID", "Lcom/withings/util/database2/k;", "REMINDER_COLUMN_MUTE_DATE", "REMINDER_COLUMN_REMINDER_TYPE_WSID", "REMINDER_COLUMN_TIME", "REMINDER_COLUMN_UPDATED_DATE", "REMINDER_COLUMN_WSID", "Lcom/withings/util/database2/p;", "REMINDER_TABLE", "Lcom/withings/util/database2/p;", "<init>", "()V", "reminder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.withings.util.database2.c, com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_DAYS$1] */
    static {
        k<Reminder> kVar = new k<>("id", "INTEGER PRIMARY KEY AUTOINCREMENT", new n0(new b0() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_ID$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((Reminder) obj).getId();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((Reminder) obj).setId((Long) obj2);
            }
        }), new r(4));
        REMINDER_COLUMN_ID = kVar;
        k<Reminder> kVar2 = new k<>("wsId", new c(new b0() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_WSID$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((Reminder) obj).getWsId();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((Reminder) obj).setWsId((Long) obj2);
            }
        }, 0), new u(7));
        REMINDER_COLUMN_WSID = kVar2;
        com.withings.util.database2.d<Reminder> dVar = new com.withings.util.database2.d<>(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, new d(new b0() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_CREATED_DATE$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((Reminder) obj).getCreatedDate();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((Reminder) obj).setCreatedDate((DateTime) obj2);
            }
        }, 0), new m0(7));
        REMINDER_COLUMN_CREATED_DATE = dVar;
        com.withings.util.database2.d<Reminder> dVar2 = new com.withings.util.database2.d<>("updated", new e(new b0() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_UPDATED_DATE$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((Reminder) obj).getUpdatedDate();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((Reminder) obj).setUpdatedDate((DateTime) obj2);
            }
        }, 0), new m6.a(5));
        REMINDER_COLUMN_UPDATED_DATE = dVar2;
        com.withings.util.database2.d<Reminder> dVar3 = new com.withings.util.database2.d<>("muteDate", new f(new b0() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_MUTE_DATE$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((Reminder) obj).getMuteDate();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((Reminder) obj).setMuteDate((DateTime) obj2);
            }
        }, 0), new i(8));
        REMINDER_COLUMN_MUTE_DATE = dVar3;
        ?? r62 = new j<Reminder>() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_DAYS$1
            @Override // com.withings.util.database2.j
            public /* bridge */ /* synthetic */ void setValue(Reminder reminder, Integer num) {
                setValue(reminder, num.intValue());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.withings.util.database2.j
            public Integer getValue(Reminder reminder) {
                kotlin.jvm.internal.u.j(reminder, "reminder");
                int i11 = 0;
                for (Integer num : reminder.getDays()) {
                    i11 |= 1 << num.intValue();
                }
                return Integer.valueOf(i11);
            }

            protected void setValue(Reminder reminder, int i11) {
                kotlin.jvm.internal.u.j(reminder, "reminder");
                en0.k w11 = en0.r.w(0, 7);
                List<Integer> arrayList = new ArrayList<>();
                for (Integer num : w11) {
                    if (((1 << num.intValue()) & i11) != 0) {
                        arrayList.add(num);
                    }
                }
                reminder.setDays(arrayList);
            }
        };
        REMINDER_COLUMN_DAYS = r62;
        com.withings.util.database2.d<Reminder> dVar4 = new com.withings.util.database2.d<>("time", new a(new b0() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_TIME$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((Reminder) obj).getTime();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((Reminder) obj).setTime((DateTime) obj2);
            }
        }, 0), new m6.p(3));
        REMINDER_COLUMN_TIME = dVar4;
        com.withings.util.database2.b<Reminder> bVar = new com.withings.util.database2.b<>(StreamManagement.Enabled.ELEMENT, new b(new b0() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_ENABLED$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return Boolean.valueOf(((Reminder) obj).getEnabled());
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((Reminder) obj).setEnabled(((Boolean) obj2).booleanValue());
            }
        }, 0), new u0.m0(6));
        REMINDER_COLUMN_ENABLED = bVar;
        k<Reminder> kVar3 = new k<>("reminderTypeWsId", new w6.m(new b0() { // from class: com.withings.reminder.database.SQLiteReminderDAO$Companion$REMINDER_COLUMN_REMINDER_TYPE_WSID$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((Reminder) obj).getTypeWsId();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((Reminder) obj).setTypeWsId((Long) obj2);
            }
        }), new q(5));
        REMINDER_COLUMN_REMINDER_TYPE_WSID = kVar3;
        p.a aVar = new p.a(ReminderNotificationBuilder.NOTIFICATION_TAG);
        aVar.b(kVar);
        aVar.a(kVar2);
        aVar.a(dVar);
        aVar.a(dVar2);
        aVar.a(dVar3);
        aVar.a(r62);
        aVar.a(dVar4);
        aVar.a(bVar);
        aVar.a(kVar3);
        REMINDER_TABLE = aVar.d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQLiteReminderDAO(SQLiteOpenHelper dbHelper) {
        super(dbHelper, REMINDER_TABLE);
        kotlin.jvm.internal.u.j(dbHelper, "dbHelper");
    }

    public static final DateTime REMINDER_COLUMN_CREATED_DATE$lambda$4(fn0.j tmp0, Reminder reminder) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (DateTime) tmp0.invoke(reminder);
    }

    public static final void REMINDER_COLUMN_CREATED_DATE$lambda$5(Reminder reminder, DateTime dateTime) {
        kotlin.jvm.internal.u.g(dateTime);
        reminder.setCreatedDate(dateTime);
    }

    public static final Boolean REMINDER_COLUMN_ENABLED$lambda$12(fn0.j tmp0, Reminder reminder) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(reminder);
    }

    public static final void REMINDER_COLUMN_ENABLED$lambda$13(Reminder reminder, Boolean bool) {
        kotlin.jvm.internal.u.g(bool);
        reminder.setEnabled(bool.booleanValue());
    }

    public static final Long REMINDER_COLUMN_ID$lambda$0(fn0.j tmp0, Reminder reminder) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (Long) tmp0.invoke(reminder);
    }

    public static final DateTime REMINDER_COLUMN_MUTE_DATE$lambda$8(fn0.j tmp0, Reminder reminder) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (DateTime) tmp0.invoke(reminder);
    }

    public static final Long REMINDER_COLUMN_REMINDER_TYPE_WSID$lambda$14(fn0.j tmp0, Reminder reminder) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (Long) tmp0.invoke(reminder);
    }

    public static final DateTime REMINDER_COLUMN_TIME$lambda$10(fn0.j tmp0, Reminder reminder) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (DateTime) tmp0.invoke(reminder);
    }

    public static final void REMINDER_COLUMN_TIME$lambda$11(Reminder reminder, DateTime dateTime) {
        kotlin.jvm.internal.u.g(dateTime);
        reminder.setTime(dateTime);
    }

    public static final DateTime REMINDER_COLUMN_UPDATED_DATE$lambda$6(fn0.j tmp0, Reminder reminder) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (DateTime) tmp0.invoke(reminder);
    }

    public static final void REMINDER_COLUMN_UPDATED_DATE$lambda$7(Reminder reminder, DateTime dateTime) {
        kotlin.jvm.internal.u.g(dateTime);
        reminder.setUpdatedDate(dateTime);
    }

    public static final Long REMINDER_COLUMN_WSID$lambda$2(fn0.j tmp0, Reminder reminder) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (Long) tmp0.invoke(reminder);
    }

    @Override // com.withings.util.database2.m
    public final List<Reminder> getAll() {
        List<Reminder> queryAll = queryAll();
        kotlin.jvm.internal.u.i(queryAll, "queryAll(...)");
        return queryAll;
    }

    public final Reminder getById(long j5) {
        return queryOne(whereEq(REMINDER_COLUMN_ID, j5));
    }

    @Override // com.withings.util.database2.m
    public void upgradeTable(SQLiteDatabase db2, int i11, int i12) {
        kotlin.jvm.internal.u.j(db2, "db");
        if (i11 < 2 && i12 >= 2) {
            db2.execSQL("ALTER TABLE reminder ADD COLUMN muteDate INTEGER");
        }
    }

    @Override // com.withings.util.database2.m
    public Long getId(Reminder reminder) {
        kotlin.jvm.internal.u.j(reminder, "reminder");
        return reminder.getId();
    }

    @Override // com.withings.util.database2.m
    public Reminder newEntity() {
        return new Reminder(null, null, null, null, null, null, null, null, false, 511, null);
    }

    @Override // com.withings.util.database2.m
    public void setId(Reminder reminder, long j5) {
        kotlin.jvm.internal.u.j(reminder, "reminder");
        reminder.setId(Long.valueOf(j5));
    }
}
