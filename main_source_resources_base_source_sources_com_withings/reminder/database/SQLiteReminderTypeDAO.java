package com.withings.reminder.database;

import a1.s;
import a1.w;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.camera.core.m0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.reminder.model.ReminderType;
import com.withings.util.database2.j;
import com.withings.util.database2.k;
import com.withings.util.database2.m;
import com.withings.util.database2.o;
import com.withings.util.database2.p;
import en0.r;
import java.util.ArrayList;
import java.util.List;
import k7.h;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import m6.u;
import t5.i;
/* compiled from: SQLiteReminderTypeDAO.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/withings/reminder/database/SQLiteReminderTypeDAO;", "Lcom/withings/util/database2/m;", "Lcom/withings/reminder/model/ReminderType;", "newEntity", "()Lcom/withings/reminder/model/ReminderType;", "reminderType", "", "id", "Lnm0/y;", "setId", "(Lcom/withings/reminder/model/ReminderType;J)V", "getId", "(Lcom/withings/reminder/model/ReminderType;)Ljava/lang/Long;", "", "getAll", "()Ljava/util/List;", "wsId", "getByWsId", "(J)Lcom/withings/reminder/model/ReminderType;", "Landroid/database/sqlite/SQLiteOpenHelper;", "dbHelper", "<init>", "(Landroid/database/sqlite/SQLiteOpenHelper;)V", "Companion", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SQLiteReminderTypeDAO extends m<ReminderType> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final j<ReminderType> REMINDER_TYPE_COLUMN_CATEGORY_ID;
    private static final o<ReminderType> REMINDER_TYPE_COLUMN_CATEGORY_NAME;
    private static final o<ReminderType> REMINDER_TYPE_COLUMN_COLOR;
    private static final SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_DEFAULT_DAYS$1 REMINDER_TYPE_COLUMN_DEFAULT_DAYS;
    private static final j<ReminderType> REMINDER_TYPE_COLUMN_DEFAULT_TIME;
    private static final k<ReminderType> REMINDER_TYPE_COLUMN_ID;
    private static final o<ReminderType> REMINDER_TYPE_COLUMN_IMAGE;
    private static final o<ReminderType> REMINDER_TYPE_COLUMN_INFO1;
    private static final o<ReminderType> REMINDER_TYPE_COLUMN_INFO2;
    private static final o<ReminderType> REMINDER_TYPE_COLUMN_NAME;
    private static final o<ReminderType> REMINDER_TYPE_COLUMN_TIMELINE_NAME;
    private static final k<ReminderType> REMINDER_TYPE_COLUMN_WSID;
    private static final p<ReminderType> REMINDER_TYPE_TABLE;

    /* compiled from: SQLiteReminderTypeDAO.kt */
    @Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R8\u0010\u0019\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u0003 \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withings/reminder/database/SQLiteReminderTypeDAO$Companion;", "", "Lcom/withings/util/database2/j;", "Lcom/withings/reminder/model/ReminderType;", "REMINDER_TYPE_COLUMN_CATEGORY_ID", "Lcom/withings/util/database2/j;", "Lcom/withings/util/database2/o;", "REMINDER_TYPE_COLUMN_CATEGORY_NAME", "Lcom/withings/util/database2/o;", "REMINDER_TYPE_COLUMN_COLOR", "com/withings/reminder/database/SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_DEFAULT_DAYS$1", "REMINDER_TYPE_COLUMN_DEFAULT_DAYS", "Lcom/withings/reminder/database/SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_DEFAULT_DAYS$1;", "REMINDER_TYPE_COLUMN_DEFAULT_TIME", "Lcom/withings/util/database2/k;", "kotlin.jvm.PlatformType", "REMINDER_TYPE_COLUMN_ID", "Lcom/withings/util/database2/k;", "REMINDER_TYPE_COLUMN_IMAGE", "REMINDER_TYPE_COLUMN_INFO1", "REMINDER_TYPE_COLUMN_INFO2", "REMINDER_TYPE_COLUMN_NAME", "REMINDER_TYPE_COLUMN_TIMELINE_NAME", "REMINDER_TYPE_COLUMN_WSID", "Lcom/withings/util/database2/p;", "REMINDER_TYPE_TABLE", "Lcom/withings/util/database2/p;", "<init>", "()V", "reminder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.util.database2.c, com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_DEFAULT_DAYS$1] */
    static {
        k<ReminderType> kVar = new k<>("typeId", "INTEGER PRIMARY KEY AUTOINCREMENT", new h(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_ID$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getId();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setId((Long) obj2);
            }
        }, 4), new e2.e(5));
        REMINDER_TYPE_COLUMN_ID = kVar;
        k<ReminderType> kVar2 = new k<>("typeWsId", new c(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_WSID$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getReminderTypeId();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setReminderTypeId((Long) obj2);
            }
        }, 1), new u(8));
        REMINDER_TYPE_COLUMN_WSID = kVar2;
        j<ReminderType> jVar = new j<>("categoryId", new d(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_CATEGORY_ID$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return Integer.valueOf(((ReminderType) obj).getCategory());
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setCategory(((Number) obj2).intValue());
            }
        }, 1), new m0(8));
        REMINDER_TYPE_COLUMN_CATEGORY_ID = jVar;
        o<ReminderType> oVar = new o<>("categoryName", new e(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_CATEGORY_NAME$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getCategoryName();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setCategoryName((String) obj2);
            }
        }, 1), new m6.a(6), 0);
        REMINDER_TYPE_COLUMN_CATEGORY_NAME = oVar;
        o<ReminderType> oVar2 = new o<>("name", new f(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_NAME$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getName();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setName((String) obj2);
            }
        }, 1), new i(9), 0);
        REMINDER_TYPE_COLUMN_NAME = oVar2;
        o<ReminderType> oVar3 = new o<>(RemoteMessageConst.Notification.COLOR, new t5.j(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_COLOR$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getColor();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setColor((String) obj2);
            }
        }, 4), new s(5), 0);
        REMINDER_TYPE_COLUMN_COLOR = oVar3;
        o<ReminderType> oVar4 = new o<>("info1", new y3.b(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_INFO1$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getInfo1();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setInfo1((String) obj2);
            }
        }), new a1.u(4), 0);
        REMINDER_TYPE_COLUMN_INFO1 = oVar4;
        o<ReminderType> oVar5 = new o<>("info2", new com.google.firebase.remoteconfig.e(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_INFO2$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getInfo2();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setInfo2((String) obj2);
            }
        }), new w(5), 0);
        REMINDER_TYPE_COLUMN_INFO2 = oVar5;
        o<ReminderType> oVar6 = new o<>("timelineName", new a(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_TIMELINE_NAME$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getTimelineName();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setTimelineName((String) obj2);
            }
        }, 1), new m6.p(4), 0);
        REMINDER_TYPE_COLUMN_TIMELINE_NAME = oVar6;
        ?? r32 = new j<ReminderType>() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_DEFAULT_DAYS$1
            @Override // com.withings.util.database2.j
            public /* bridge */ /* synthetic */ void setValue(ReminderType reminderType, Integer num) {
                setValue(reminderType, num.intValue());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.withings.util.database2.j
            public Integer getValue(ReminderType type) {
                kotlin.jvm.internal.u.j(type, "type");
                int i11 = 0;
                for (Integer num : type.getDefaultDays()) {
                    i11 |= 1 << num.intValue();
                }
                return Integer.valueOf(i11);
            }

            protected void setValue(ReminderType type, int i11) {
                kotlin.jvm.internal.u.j(type, "type");
                en0.k w11 = r.w(0, 7);
                List<Integer> arrayList = new ArrayList<>();
                for (Integer num : w11) {
                    if (((1 << num.intValue()) & i11) != 0) {
                        arrayList.add(num);
                    }
                }
                type.setDefaultDays(arrayList);
            }
        };
        REMINDER_TYPE_COLUMN_DEFAULT_DAYS = r32;
        j<ReminderType> jVar2 = new j<>("defaultTime", new b(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_DEFAULT_TIME$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return Integer.valueOf(((ReminderType) obj).getDefaultTime());
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setDefaultTime(((Number) obj2).intValue());
            }
        }, 1), new u0.m0(7));
        REMINDER_TYPE_COLUMN_DEFAULT_TIME = jVar2;
        o<ReminderType> oVar7 = new o<>(HealthUserProfile.USER_PROFILE_KEY_IMAGE, new e2.m(new b0() { // from class: com.withings.reminder.database.SQLiteReminderTypeDAO$Companion$REMINDER_TYPE_COLUMN_IMAGE$1
            @Override // kotlin.jvm.internal.b0, fn0.m
            public Object get(Object obj) {
                return ((ReminderType) obj).getImage();
            }

            @Override // kotlin.jvm.internal.b0
            public void set(Object obj, Object obj2) {
                ((ReminderType) obj).setImage((String) obj2);
            }
        }), new m6.r(5), 0);
        REMINDER_TYPE_COLUMN_IMAGE = oVar7;
        p.a aVar = new p.a("reminderType");
        aVar.b(kVar);
        aVar.a(kVar2);
        aVar.a(jVar);
        aVar.a(oVar);
        aVar.a(oVar2);
        aVar.a(oVar3);
        aVar.a(oVar4);
        aVar.a(oVar5);
        aVar.a(oVar6);
        aVar.a(r32);
        aVar.a(jVar2);
        aVar.a(oVar7);
        REMINDER_TYPE_TABLE = aVar.d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQLiteReminderTypeDAO(SQLiteOpenHelper dbHelper) {
        super(dbHelper, REMINDER_TYPE_TABLE);
        kotlin.jvm.internal.u.j(dbHelper, "dbHelper");
    }

    public static /* synthetic */ String D(fn0.j jVar, ReminderType reminderType) {
        return REMINDER_TYPE_COLUMN_IMAGE$lambda$20(jVar, reminderType);
    }

    public static final Integer REMINDER_TYPE_COLUMN_CATEGORY_ID$lambda$4(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_CATEGORY_ID$lambda$5(ReminderType reminderType, Integer num) {
        kotlin.jvm.internal.u.g(num);
        reminderType.setCategory(num.intValue());
    }

    public static final String REMINDER_TYPE_COLUMN_CATEGORY_NAME$lambda$6(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (String) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_CATEGORY_NAME$lambda$7(ReminderType reminderType, String str) {
        kotlin.jvm.internal.u.g(str);
        reminderType.setCategoryName(str);
    }

    public static final String REMINDER_TYPE_COLUMN_COLOR$lambda$10(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (String) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_COLOR$lambda$11(ReminderType reminderType, String str) {
        kotlin.jvm.internal.u.g(str);
        reminderType.setColor(str);
    }

    public static final Integer REMINDER_TYPE_COLUMN_DEFAULT_TIME$lambda$18(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_DEFAULT_TIME$lambda$19(ReminderType reminderType, Integer num) {
        kotlin.jvm.internal.u.g(num);
        reminderType.setDefaultTime(num.intValue());
    }

    public static final Long REMINDER_TYPE_COLUMN_ID$lambda$0(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (Long) tmp0.invoke(reminderType);
    }

    public static final String REMINDER_TYPE_COLUMN_IMAGE$lambda$20(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (String) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_IMAGE$lambda$21(ReminderType reminderType, String str) {
        kotlin.jvm.internal.u.g(str);
        reminderType.setImage(str);
    }

    public static final String REMINDER_TYPE_COLUMN_INFO1$lambda$12(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (String) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_INFO1$lambda$13(ReminderType reminderType, String str) {
        kotlin.jvm.internal.u.g(str);
        reminderType.setInfo1(str);
    }

    public static final String REMINDER_TYPE_COLUMN_INFO2$lambda$14(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (String) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_INFO2$lambda$15(ReminderType reminderType, String str) {
        kotlin.jvm.internal.u.g(str);
        reminderType.setInfo2(str);
    }

    public static final String REMINDER_TYPE_COLUMN_NAME$lambda$8(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (String) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_NAME$lambda$9(ReminderType reminderType, String str) {
        kotlin.jvm.internal.u.g(str);
        reminderType.setName(str);
    }

    public static final String REMINDER_TYPE_COLUMN_TIMELINE_NAME$lambda$16(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (String) tmp0.invoke(reminderType);
    }

    public static final void REMINDER_TYPE_COLUMN_TIMELINE_NAME$lambda$17(ReminderType reminderType, String str) {
        kotlin.jvm.internal.u.g(str);
        reminderType.setTimelineName(str);
    }

    public static final Long REMINDER_TYPE_COLUMN_WSID$lambda$2(fn0.j tmp0, ReminderType reminderType) {
        kotlin.jvm.internal.u.j(tmp0, "$tmp0");
        return (Long) tmp0.invoke(reminderType);
    }

    @Override // com.withings.util.database2.m
    public final List<ReminderType> getAll() {
        List<ReminderType> queryAll = queryAll();
        kotlin.jvm.internal.u.i(queryAll, "queryAll(...)");
        return queryAll;
    }

    public final ReminderType getByWsId(long j5) {
        return queryOne(whereEq(REMINDER_TYPE_COLUMN_WSID, j5));
    }

    @Override // com.withings.util.database2.m
    public Long getId(ReminderType reminderType) {
        kotlin.jvm.internal.u.j(reminderType, "reminderType");
        return reminderType.getId();
    }

    @Override // com.withings.util.database2.m
    public ReminderType newEntity() {
        return new ReminderType(null, null, 0, null, null, null, null, null, null, null, 0, null, 4095, null);
    }

    @Override // com.withings.util.database2.m
    public void setId(ReminderType reminderType, long j5) {
        kotlin.jvm.internal.u.j(reminderType, "reminderType");
        reminderType.setId(Long.valueOf(j5));
    }
}
