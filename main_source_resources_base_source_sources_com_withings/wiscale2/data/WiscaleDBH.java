package com.withings.wiscale2.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.core.data.aggregate.ActivityAggregateDAO;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.database.SQLiteReminderDAO;
import com.withings.reminder.database.SQLiteReminderTypeDAO;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import com.withings.util.database.SqliteDatabaseWrapper;
import com.withings.util.log.Fail;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.workout.category.model.WorkoutCategoryMigrationHelper;
/* loaded from: classes4.dex */
public final class WiscaleDBH extends com.withings.util.database.c {

    /* renamed from: g  reason: collision with root package name */
    private static WiscaleDBH f50646g;

    /* renamed from: e  reason: collision with root package name */
    private final Context f50647e;

    /* renamed from: f  reason: collision with root package name */
    private SqliteDatabaseWrapper f50648f;

    /* loaded from: classes4.dex */
    public static class CorruptedDB extends RuntimeException {
    }

    public WiscaleDBH(Context context) {
        super(context, tw.c.d(), sw.a.z(), uw.c.l(), new ActivityAggregateDAO(), ww.c.n(), new com.withings.util.database.b());
        this.f50647e = context;
    }

    @Deprecated
    public static WiscaleDBH f() {
        return f50646g;
    }

    public static SqliteDatabaseWrapper h() {
        WiscaleDBH wiscaleDBH = f50646g;
        if (wiscaleDBH == null) {
            return null;
        }
        SqliteDatabaseWrapper sqliteDatabaseWrapper = wiscaleDBH.f50648f;
        if (sqliteDatabaseWrapper != null) {
            return sqliteDatabaseWrapper;
        }
        return wiscaleDBH.c();
    }

    public static SqliteDatabaseWrapper i() {
        WiscaleDBH wiscaleDBH = f50646g;
        if (wiscaleDBH == null) {
            return null;
        }
        SqliteDatabaseWrapper sqliteDatabaseWrapper = wiscaleDBH.f50648f;
        if (sqliteDatabaseWrapper != null) {
            return sqliteDatabaseWrapper;
        }
        return wiscaleDBH.e();
    }

    public static WiscaleDBH m(Context context) {
        Fail.g(f50646g, "Trying to create a second instance of WiscaleDBH");
        WiscaleDBH wiscaleDBH = new WiscaleDBH(context);
        f50646g = wiscaleDBH;
        return wiscaleDBH;
    }

    @Override // com.withings.util.database.c, android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        x70.b.r(this, "onCreate(SQLiteDatabase db)", new Object[0]);
        super.onCreate(sQLiteDatabase);
        new t70.d(this).createTable(sQLiteDatabase);
        new z10.b(this).createTable(sQLiteDatabase);
        new mn.c(this).createTable(sQLiteDatabase);
        new rg.c(this).createTable(sQLiteDatabase);
        new sj0.a(this).createTable(sQLiteDatabase);
        new lj0.m(this).createTable(sQLiteDatabase);
        new tm.b(this).createTable(sQLiteDatabase);
        new SQLiteReminderTypeDAO(this).createTable(sQLiteDatabase);
        new SQLiteReminderDAO(this).createTable(sQLiteDatabase);
        new wh.a(this).createTable(sQLiteDatabase);
        new ah0.d(this).createTable(sQLiteDatabase);
    }

    @Override // com.withings.util.database.c, android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.onUpgrade(sQLiteDatabase, i11, i12);
        this.f50648f = d(sQLiteDatabase, true);
        try {
            try {
                x70.b.r(this, "onUpgrade " + i11 + " to " + i12, new Object[0]);
                if (i11 < 92) {
                    this.f50648f.p("devices", "network", "TEXT");
                }
                if (i11 < 93) {
                    this.f50648f.p("users", "wam01WakeUp", "INTEGER");
                }
                if (i11 < 94) {
                    SqliteDatabaseWrapper sqliteDatabaseWrapper = this.f50648f;
                    try {
                        sqliteDatabaseWrapper.a();
                        sqliteDatabaseWrapper.f("ALTER TABLE devices RENAME TO oldDevices");
                        sqliteDatabaseWrapper.f("CREATE TABLE IF NOT EXISTS devices(id INTEGER PRIMARY KEY,userId INTEGER REFERENCES users (id) ON DELETE CASCADE,associationDate INTEGER,lastUseDate INTEGER,modifiedDate INTEGER,macAddress TEXT NOT NULL,firmware INTEGER NOT NULL,preferredLanguage TEXT NOT NULL,latitude REAL,longitude REAL,manualGeoloc TEXT,battery INTEGER NOT NULL,type INTEGER NOT NULL,model INTEGER NOT NULL,impedanceEnabled INTEGER NOT NULL,debugEnabled INTEGER NOT NULL,upgradeUrl TEXT,linkId INTEGER,klSecret TEXT,name TEXT,network INTEGER,alarmsEnabled INTEGER)");
                        sqliteDatabaseWrapper.f("INSERT INTO devices (id, userId, associationDate, macAddress,firmware, preferredLanguage, latitude, longitude, manualGeoloc, battery, type, model,impedanceEnabled, debugEnabled, upgradeUrl, linkId, klSecret, name, network) SELECT id, user, startdate, macaddress, firmware, preflang, latitude, longitude, manual_geoloc,battery, type, model, impedancemeter, debug, upgradeUrl, linkId, klSecret, name, network FROM oldDevices");
                        sqliteDatabaseWrapper.f("DROP TABLE oldDevices");
                        sqliteDatabaseWrapper.q();
                        sqliteDatabaseWrapper.e();
                    } catch (Throwable th2) {
                        sqliteDatabaseWrapper.e();
                        throw th2;
                    }
                }
                if (i11 < 95) {
                    this.f50648f.p("devices", RemoteMessageConst.Notification.COLOR, "TEXT");
                }
                if (i11 < 96) {
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "earnedCalories", "REAL");
                    this.f50648f.p(WsVasistasSerie.KEY_VASISTAS, "earnedCalories", "REAL");
                }
                if (i11 < 97) {
                    str = "appVersion";
                    this.f50648f.p(ConstantsWs.SYNC_PROCESS_TIMELINE, "expirationDate", "INTEGER DEFAULT 0");
                } else {
                    str = "appVersion";
                }
                if (i11 < 98) {
                    str2 = "algoVersion";
                    this.f50648f.p("measuregroup", WsVasistasSerie.KEY_ALGO, "INTEGER");
                } else {
                    str2 = "algoVersion";
                }
                if (i11 < 99) {
                    this.f50648f.p("users", "wbs04screens", "TEXT");
                }
                if (i11 < 100) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 1, 2);
                }
                if (i11 < 101) {
                    this.f50648f.f("UPDATE devices SET userId = null, linkId = null WHERE userId = -1 OR linkId = 0");
                }
                if (i11 < 102) {
                    new sj0.a(this).createTable(sQLiteDatabase);
                }
                if (i11 < 103) {
                    go0.i.d(this.f50648f);
                }
                if (i11 < 104) {
                    this.f50648f.f("UPDATE devices SET userId = null, linkId = null WHERE userId = -1 OR linkId = 0");
                }
                if (i11 < 105) {
                    str3 = "INTEGER DEFAULT 0";
                    this.f50648f.p(MessageType.TRACK, "attrib", "INTEGER NOT NULL DEFAULT 0");
                } else {
                    str3 = "INTEGER DEFAULT 0";
                }
                if (i11 < 106) {
                    this.f50648f.f("UPDATE vasistas SET duration = duration * 1000");
                }
                if (i11 < 109) {
                    this.f50648f.p(WsVasistasSerie.KEY_VASISTAS, "heartrateQuality", "INTEGER");
                    this.f50648f.p(WsVasistasSerie.KEY_VASISTAS, "skinTemperature", "INTEGER");
                    this.f50648f.p(WsVasistasSerie.KEY_VASISTAS, "activityStatus", "INTEGER");
                    this.f50648f.p(WsVasistasSerie.KEY_VASISTAS, "category", "INTEGER");
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 1, 2);
                }
                if (i11 < 110) {
                    this.f50648f.p(MessageType.TRACK, "activityRecognitionVersion", "INTEGER");
                }
                if (i11 < 114) {
                    this.f50648f.p("halfhourvasistas", "vasistasCalories", "REAL");
                    this.f50648f.p("halfhourvasistas", "vasistasDistance", "REAL");
                    this.f50648f.p("halfhourvasistas", "additionalCalories", "REAL");
                    this.f50648f.p("halfhourvasistas", "additionalDistance", "REAL");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "manualAdditionCalories", "REAL");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "manualAdditionDistance", "REAL");
                }
                if (i11 < 115) {
                    new t70.d(this).upgradeTable(sQLiteDatabase, 2, 3);
                }
                if (i11 < 117) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 2, 3);
                }
                if (i11 < 118) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 3, 4);
                }
                if (i11 < 119) {
                    new sj0.a(this).upgradeTable(sQLiteDatabase, 1, 2);
                    WorkoutCategoryMigrationHelper.get(this.f50647e).setShouldRedownloadCategories(Boolean.TRUE);
                }
                if (i11 < 120) {
                    new t70.d(this).upgradeTable(sQLiteDatabase, 3, 4);
                }
                if (i11 < 121) {
                    new tm.b(this).createTable(sQLiteDatabase);
                }
                if (i11 < 122) {
                    this.f50648f.f("DROP TABLE IF EXISTS dashboard;");
                }
                if (i11 < 123) {
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "hrAverage", "REAL");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "hrMin", "INTEGER");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "hrMax", "INTEGER");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "hrZoneLight", "INTEGER");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "hrZoneModerate", "INTEGER");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "hrZoneIntense", "INTEGER");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "hrZonePeak", "INTEGER");
                }
                if (i11 < 124) {
                    this.f50648f.p("halfhourvasistas", "vasistasHeartRate", "INTEGER");
                }
                if (i11 < 125) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 2, 3);
                }
                if (i11 < 126 && !this.f50648f.c("devices", "advertiseKey")) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 4, 5);
                }
                if (i11 < 127) {
                    new SQLiteReminderTypeDAO(this).createTable(sQLiteDatabase);
                    new SQLiteReminderDAO(this).createTable(sQLiteDatabase);
                    new wh.a(this).createTable(sQLiteDatabase);
                }
                if (i11 < 128 && !this.f50648f.c(ReminderNotificationBuilder.NOTIFICATION_TAG, "muteDate")) {
                    new SQLiteReminderDAO(this).upgradeTable(sQLiteDatabase, 1, 2);
                }
                if (i11 < 129 && !this.f50648f.c("devices", "debugMask")) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 5, 6);
                }
                if (i11 < 134) {
                    new ah0.d(this).createTable(sQLiteDatabase);
                }
                if (i11 < 135) {
                    new z10.b(this).createTable(sQLiteDatabase);
                }
                if (i11 < 136) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 6, 7);
                }
                if (i11 < 138) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 3, 4);
                }
                if (i11 < 139) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 7, 8);
                }
                if (i11 < 140) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 4, 5);
                }
                if (i11 < 142) {
                    new sj0.a(this).upgradeTable(sQLiteDatabase, 2, 3);
                }
                if (i11 < 143) {
                    new sj0.a(this).upgradeTable(sQLiteDatabase, 3, 4);
                }
                if (i11 < 144) {
                    new sj0.a(this).upgradeTable(sQLiteDatabase, 4, 5);
                }
                if (i11 < 150) {
                    new t70.d(this).upgradeTable(sQLiteDatabase, 4, 5);
                }
                if (i11 < 154) {
                    new t70.d(this).upgradeTable(sQLiteDatabase, 5, 6);
                }
                if (i11 < 155) {
                    this.f50648f.p(ActivityAggregateDAO.TABLE, NavigationArguments.IS_COMPLETED, "INTEGER");
                }
                if (i11 < 156) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 5, 6);
                }
                if (i11 < 157) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 6, 7);
                }
                if (i11 < 158) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 8, 9);
                }
                if (i11 < 159) {
                    new z10.b(this).upgradeTable(sQLiteDatabase, 1, 2);
                }
                if (i11 < 166) {
                    new rg.c(this).upgradeTable(sQLiteDatabase, 1, 2);
                    new mn.c(this).upgradeTable(sQLiteDatabase, 9, 10);
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 7, 8);
                    new mn.c(this).upgradeTable(sQLiteDatabase, 10, 11);
                    new mn.c(this).upgradeTable(sQLiteDatabase, 11, 12);
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 8, 9);
                }
                if (i11 < 167) {
                    this.f50648f.p(ConstantsWs.SYNC_PROCESS_TIMELINE, "sectionTags", "TEXT");
                }
                if (i11 < 168) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 12, 13);
                }
                if (i11 < 169) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 13, 14);
                }
                if (i11 < 170) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 14, 15);
                }
                if (i11 < 171) {
                    this.f50648f.p("measuregroup", "deviceid", "INTEGER NOT NULL DEFAULT 0");
                }
                if (i11 < 172) {
                    this.f50648f.f("CREATE INDEX IF NOT EXISTS timeline_user_deleted_sectionTag_timestamp_ ON timeline(user, deleted, sectionTags, timestamp);");
                }
                if (i11 < 173) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 15, 16);
                }
                if (i11 < 174) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 9, 10);
                }
                if (i11 < 175) {
                    str4 = str3;
                    this.f50648f.p(ConstantsWs.SYNC_PROCESS_TIMELINE, "hasBeenSeen", str4);
                } else {
                    str4 = str3;
                }
                if (i11 < 176) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 16, 17);
                }
                if (i11 < 177) {
                    new sj0.a(this).upgradeTable(sQLiteDatabase, 4, 5);
                }
                if (i11 < 178) {
                    this.f50648f.p("measuregroup", "brand", "INTEGER NOT NULL DEFAULT -1");
                }
                if (i11 >= 179) {
                    str5 = "REAL";
                } else {
                    String str6 = str2;
                    this.f50648f.p("measure", str6, "INTEGER DEFAULT NULL");
                    String str7 = str;
                    this.f50648f.p("measure", str7, "INTEGER DEFAULT NULL");
                    str5 = "REAL";
                    this.f50648f.p("measure", "platform", "INTEGER DEFAULT NULL");
                    this.f50648f.p("hfmeasure", str6, "INTEGER DEFAULT NULL");
                    this.f50648f.p("hfmeasure", str7, "INTEGER DEFAULT NULL");
                    this.f50648f.p("hfmeasure", "platform", "INTEGER DEFAULT NULL");
                }
                if (i11 < 180) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 10, 11);
                }
                if (i11 < 181) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 11, 12);
                }
                if (i11 < 182) {
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "averageSpo2", "INTEGER");
                }
                if (i11 < 183) {
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "nbMeasureAuto", "INTEGER");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "nbMeasureManual", "INTEGER");
                }
                if (i11 < 184) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 17, 18);
                }
                if (i11 < 185) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 12, 13);
                }
                if (i11 < 186) {
                    this.f50648f.p(ConstantsWs.SYNC_PROCESS_TIMELINE, RemoteMessageConst.TTL, str4);
                }
                if (i11 < 187) {
                    sQLiteDatabase.execSQL("ALTER TABLE measuregroup RENAME TO measuregroup_tmp;");
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS measuregroup(id INTEGER PRIMARY KEY AUTOINCREMENT,wsid INTEGER NOT NULL,probereply TEXT REFERENCES probe(mac) ON DELETE CASCADE,attrib INTEGER NOT NULL,date INTEGER NOT NULL DEFAULT CURRENT_TIMESTAMP,category INTEGER NOT NULL,maintype INTEGER NOT NULL,origin TEXT,devtype INTEGER,modified INTEGER NOT NULL DEFAULT 0,deleted INTEGER NOT NULL DEFAULT 0,synctows INTEGER NOT NULL,algo INTEGER,deviceid INTEGER,brand INTEGER NOT NULL DEFAULT 0,user INTEGER,comment TEXT);");
                    sQLiteDatabase.execSQL("INSERT INTO measuregroup(id,wsid,probereply,attrib,date,category,maintype,origin,devtype,modified,deleted,synctows,algo,deviceid,brand,user,comment) SELECT id,wsid,probereply,attrib,date,category,maintype,origin,devtype,modified,deleted,synctows,algo,deviceid,brand,user,comment FROM measuregroup_tmp;");
                    sQLiteDatabase.execSQL("DROP TABLE measuregroup_tmp;");
                }
                if (i11 < 188) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 18, 19);
                }
                if (i11 < 189) {
                    this.f50648f.p("measure", "limbPosition", "INTEGER DEFAULT NULL");
                    this.f50648f.p("hfmeasure", "limbPosition", "INTEGER DEFAULT NULL");
                }
                if (i11 < 190) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 19, 20);
                }
                if (i11 < 191) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 20, 21);
                }
                if (i11 < 192) {
                    ActivityAggregateDAO.upgradeTable(sQLiteDatabase, 1, 2);
                }
                if (i11 < 193) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 13, 14);
                }
                if (i11 < 194) {
                    new wh.a(this).upgradeTable(sQLiteDatabase, 1, 2);
                }
                if (i11 < 195) {
                    new t70.d(this).upgradeTable(sQLiteDatabase, 6, 7);
                }
                if (i11 < 196) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 21, 22);
                }
                if (i11 < 197) {
                    this.f50648f.p("measure", "algoParams", "TEXT DEFAULT NULL");
                }
                if (i11 < 198) {
                    this.f50648f.p("hfmeasure", "algoParams", "TEXT DEFAULT NULL");
                }
                if (i11 < 199) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 22, 23);
                }
                if (i11 < 200) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 14, 15);
                }
                if (i11 < 201) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 15, 16);
                }
                if (i11 < 203) {
                    new mn.c(this).upgradeTable(sQLiteDatabase, 23, 24);
                }
                if (i11 < 204) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 16, 17);
                }
                if (i11 < 205) {
                    new t70.d(this).upgradeTable(sQLiteDatabase, 7, 8);
                }
                if (i11 < 206) {
                    this.f50648f.p(ConstantsWs.SYNC_PROCESS_TIMELINE, "isLocal", str4);
                    this.f50648f.p(ConstantsWs.SYNC_PROCESS_TIMELINE, "wsId", "INTEGER DEFAULT NULL");
                }
                if (i11 < 207) {
                    new z10.b(this).upgradeTable(sQLiteDatabase, 2, 3);
                }
                if (i11 < 208) {
                    this.f50648f.f("CREATE INDEX IF NOT EXISTS measure_measuregroup ON measure (measuregroup);");
                    this.f50648f.f("CREATE INDEX IF NOT EXISTS measure_type ON measure (type);");
                }
                if (i11 < 209) {
                    this.f50648f.f("CREATE INDEX IF NOT EXISTS measuregroup_date ON measuregroup (date);");
                    this.f50648f.f("CREATE INDEX IF NOT EXISTS measure_type_user ON MEASURE (type, user);");
                    this.f50648f.f("CREATE INDEX IF NOT EXISTS measuregroup_classic ON measuregroup (user, attrib, deleted, date);");
                }
                if (i11 < 210) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 17, 18);
                }
                if (i11 < 211) {
                    this.f50648f.p("measuregroup", "devicemodelid", "INTEGER DEFAULT NULL");
                }
                if (i11 < 212) {
                    new lj0.m(this).upgradeTable(sQLiteDatabase, 18, 19);
                }
                if (i11 < 213) {
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "temperatureAverage", "REAL DEFAULT NULL");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "temperatureMin", "REAL DEFAULT NULL");
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "temperatureMax", "REAL DEFAULT NULL");
                }
                if (i11 < 214) {
                    this.f50648f.p(ActivityAggregateDAO.TABLE, "averageSpo2US", str5);
                }
                if (i11 < 215) {
                    sQLiteDatabase.execSQL("DROP TABLE trace");
                }
                this.f50648f = null;
            } catch (Exception e11) {
                x70.b.p(e11);
                throw new CorruptedDB();
            }
        } catch (Throwable th3) {
            this.f50648f = null;
            throw th3;
        }
    }
}
