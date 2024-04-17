package com.withings.core.data.aggregate;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.util.database.SqliteDatabaseWrapper;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
/* loaded from: classes3.dex */
public class ActivityAggregateDAO extends com.withings.util.database.b {
    static final String[] STATS_SELECT_FIELDS = {"id", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "synchrotime", "midnight", "timezone", FoodDayFragment.ARG_DAY, "calories", "earnedCalories", "passivecalories", "steps", "distance", "ascent", "descent", "inactiveDuration", "softMETDuration", "moderateMETDuration", "intenseMETDuration", "synctows", "brand", "devicemodel", "modified", "manualAdditionCalories", "manualAdditionDistance", "hrAverage", "hrResting", "hrMin", "hrMax", "hrZoneLight", "hrZoneModerate", "hrZoneIntense", "hrZonePeak", NavigationArguments.IS_COMPLETED, "averageSpo2", "averageSpo2US", "nbMeasureAuto", "nbMeasureManual", "temperatureAverage", "temperatureMin", "temperatureMax"};
    public static final String TABLE = "aggregatewam";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class AggregateCursorMapper implements com.withings.util.database.a<ActivityAggregate> {
        static AggregateCursorMapper sInstance = new AggregateCursorMapper();

        private AggregateCursorMapper() {
        }

        static AggregateCursorMapper get() {
            return sInstance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.util.database.a
        public ActivityAggregate map(Cursor cursor, int i11) {
            DateTimeZone dateTimeZone;
            ActivityAggregate activityAggregate = new ActivityAggregate();
            activityAggregate.setSynchroTime(new DateTime(cursor.getLong(cursor.getColumnIndex("synchrotime"))));
            try {
                dateTimeZone = DateTimeZone.forID(activityAggregate.getTimezone());
            } catch (Exception unused) {
                dateTimeZone = DateTimeZone.getDefault();
            }
            activityAggregate.setMidnight(new DateTime(cursor.getLong(cursor.getColumnIndex("midnight")), dateTimeZone));
            activityAggregate.setTimezone(cursor.getString(cursor.getColumnIndex("timezone")));
            activityAggregate.setDay(cursor.getString(cursor.getColumnIndex(FoodDayFragment.ARG_DAY)));
            activityAggregate.setCalories(cursor.getFloat(cursor.getColumnIndex("calories")));
            activityAggregate.setEarnedCalories(cursor.getFloat(cursor.getColumnIndex("earnedCalories")));
            activityAggregate.setPassiveCalories(cursor.getFloat(cursor.getColumnIndex("passivecalories")));
            activityAggregate.setSteps(cursor.getInt(cursor.getColumnIndex("steps")));
            activityAggregate.setDistance(cursor.getFloat(cursor.getColumnIndex("distance")));
            activityAggregate.setAscent(cursor.getFloat(cursor.getColumnIndex("ascent")));
            activityAggregate.setDescent(cursor.getFloat(cursor.getColumnIndex("descent")));
            activityAggregate.setInactiveDuration(cursor.getInt(cursor.getColumnIndex("inactiveDuration")));
            activityAggregate.setSoftMETDuration(cursor.getInt(cursor.getColumnIndex("softMETDuration")));
            activityAggregate.setModerateMETDuration(cursor.getInt(cursor.getColumnIndex("moderateMETDuration")));
            activityAggregate.setIntenseMETDuration(cursor.getInt(cursor.getColumnIndex("intenseMETDuration")));
            activityAggregate.setSyncedToWs(cursor.getInt(cursor.getColumnIndex("synctows")) == 1);
            activityAggregate.setBrand(cursor.getInt(cursor.getColumnIndex("brand")));
            activityAggregate.setDeviceModel(cursor.getInt(cursor.getColumnIndex("devicemodel")));
            activityAggregate.setModified(cursor.getLong(cursor.getColumnIndex("modified")));
            activityAggregate.setManualAdditionCalories(cursor.getFloat(cursor.getColumnIndex("manualAdditionCalories")));
            activityAggregate.setManualAdditionDistance(cursor.getInt(cursor.getColumnIndex("manualAdditionDistance")));
            activityAggregate.setHrAverage(cursor.getFloat(cursor.getColumnIndex("hrAverage")));
            activityAggregate.setHrResting(cursor.getInt(cursor.getColumnIndex("hrResting")));
            activityAggregate.setHrMin(cursor.getInt(cursor.getColumnIndex("hrMin")));
            activityAggregate.setHrMax(cursor.getInt(cursor.getColumnIndex("hrMax")));
            activityAggregate.setHrZoneLight(cursor.getInt(cursor.getColumnIndex("hrZoneLight")));
            activityAggregate.setHrZoneModerate(cursor.getInt(cursor.getColumnIndex("hrZoneModerate")));
            activityAggregate.setHrZoneIntense(cursor.getInt(cursor.getColumnIndex("hrZoneIntense")));
            activityAggregate.setHrZonePeak(cursor.getInt(cursor.getColumnIndex("hrZonePeak")));
            activityAggregate.setCompleted(cursor.getInt(cursor.getColumnIndex(NavigationArguments.IS_COMPLETED)) == 1);
            activityAggregate.setAverageSpO2(cursor.getFloat(cursor.getColumnIndex("averageSpo2")));
            activityAggregate.setAverageSpO2US(cursor.getFloat(cursor.getColumnIndex("averageSpo2US")));
            activityAggregate.setNbMeasureAuto(cursor.getInt(cursor.getColumnIndex("nbMeasureAuto")));
            activityAggregate.setNbMeasureManual(cursor.getInt(cursor.getColumnIndex("nbMeasureManual")));
            activityAggregate.setTemperatureAverage(Float.valueOf(cursor.getFloat(cursor.getColumnIndex("temperatureAverage"))));
            activityAggregate.setTemperatureMin(Float.valueOf(cursor.getFloat(cursor.getColumnIndex("temperatureMin"))));
            activityAggregate.setTemperatureMax(Float.valueOf(cursor.getFloat(cursor.getColumnIndex("temperatureMax"))));
            return activityAggregate;
        }
    }

    private ContentValues contentValuesFrom(User user, ActivityAggregate activityAggregate, boolean z5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, Long.valueOf(user.q()));
        contentValues.put("synchrotime", Long.valueOf(activityAggregate.getSynchroTime().getMillis()));
        contentValues.put("midnight", Long.valueOf(activityAggregate.getMidnight().getMillis()));
        contentValues.put("timezone", activityAggregate.getTimezone());
        contentValues.put(FoodDayFragment.ARG_DAY, activityAggregate.getDay());
        contentValues.put("calories", Float.valueOf(activityAggregate.getCalories()));
        contentValues.put("earnedCalories", Float.valueOf(activityAggregate.getEarnedCalories()));
        contentValues.put("passivecalories", Float.valueOf(activityAggregate.getPassiveCalories()));
        contentValues.put("steps", Integer.valueOf(activityAggregate.getSteps()));
        contentValues.put("distance", Float.valueOf(activityAggregate.getDistance()));
        contentValues.put("ascent", Float.valueOf(activityAggregate.getAscent()));
        contentValues.put("descent", Float.valueOf(activityAggregate.getDescent()));
        contentValues.put("inactiveDuration", Long.valueOf(activityAggregate.getInactiveDuration()));
        contentValues.put("softMETDuration", Long.valueOf(activityAggregate.getSoftMETDuration()));
        contentValues.put("moderateMETDuration", Long.valueOf(activityAggregate.getModerateMETDuration()));
        contentValues.put("intenseMETDuration", Long.valueOf(activityAggregate.getIntenseMETDuration()));
        contentValues.put("synctows", Boolean.valueOf(z5));
        contentValues.put("brand", Integer.valueOf(activityAggregate.getBrand()));
        contentValues.put("devicemodel", Integer.valueOf(activityAggregate.getDeviceModel()));
        contentValues.put("modified", Long.valueOf(activityAggregate.getModified()));
        contentValues.put("manualAdditionCalories", Float.valueOf(activityAggregate.getManualAdditionCalories()));
        contentValues.put("manualAdditionDistance", Float.valueOf(activityAggregate.getManualAdditionDistance()));
        contentValues.put("hrAverage", Float.valueOf(activityAggregate.getHrAverage()));
        contentValues.put("hrResting", Integer.valueOf(activityAggregate.getHrResting()));
        contentValues.put("hrMin", Integer.valueOf(activityAggregate.getHrMin()));
        contentValues.put("hrMax", Integer.valueOf(activityAggregate.getHrMax()));
        contentValues.put("hrZoneLight", Integer.valueOf(activityAggregate.getHrZoneLight()));
        contentValues.put("hrZoneModerate", Integer.valueOf(activityAggregate.getHrZoneModerate()));
        contentValues.put("hrZoneIntense", Integer.valueOf(activityAggregate.getHrZoneIntense()));
        contentValues.put("hrZonePeak", Integer.valueOf(activityAggregate.getHrZonePeak()));
        contentValues.put(NavigationArguments.IS_COMPLETED, Boolean.valueOf(activityAggregate.isCompleted()));
        contentValues.put("averageSpo2", Float.valueOf(activityAggregate.getAverageSpO2()));
        contentValues.put("averageSpo2US", Float.valueOf(activityAggregate.getAverageSpO2US()));
        contentValues.put("nbMeasureAuto", Integer.valueOf(activityAggregate.getNbMeasureAuto()));
        contentValues.put("nbMeasureManual", Integer.valueOf(activityAggregate.getNbMeasureManual()));
        contentValues.put("temperatureAverage", activityAggregate.getTemperatureAverage());
        contentValues.put("temperatureMin", activityAggregate.getTemperatureMin());
        contentValues.put("temperatureMax", activityAggregate.getTemperatureMax());
        return contentValues;
    }

    private int getSteps(User user, SqliteDatabaseWrapper.Function function) {
        Cursor h11 = getHelper().c().h(TABLE, function, "steps", "user = ?", new String[]{String.valueOf(user.q())});
        try {
            h11.moveToFirst();
            return h11.getInt(0);
        } finally {
            h11.close();
        }
    }

    private List<ActivityAggregate> queryAggregates(String str, String[] strArr, String str2) {
        return queryAggregates(str, strArr, str2, null);
    }

    private ActivityAggregate querySingleAggregate(String str, String[] strArr, String str2) {
        return (ActivityAggregate) getHelper().c().m(TABLE, STATS_SELECT_FIELDS, str, strArr, str2, AggregateCursorMapper.get());
    }

    public static void upgradeTable(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i11 < 2 && i12 >= 2) {
            sQLiteDatabase.execSQL("ALTER TABLE aggregatewam ADD COLUMN hrResting INTEGER");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ActivityAggregate> getActivityAggregatesBetweenDays(long j5, String str, String str2) {
        return queryAggregates("user = ? AND day >= ? AND day <= ?", new String[]{String.valueOf(j5), str, str2}, "day ASC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getAggregateForDay(long j5, String str) {
        return querySingleAggregate("user = ? AND day = ?", new String[]{String.valueOf(j5), str}, "day ASC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getAggregateForTime(long j5, DateTime dateTime) {
        ActivityAggregate querySingleAggregate = querySingleAggregate("user = ? AND midnight <= ?", new String[]{String.valueOf(j5), String.valueOf(dateTime.getMillis())}, "midnight DESC");
        if (querySingleAggregate != null && dateTime.getMillis() < querySingleAggregate.getMidnight().plusDays(1).withTimeAtStartOfDay().getMillis()) {
            return querySingleAggregate;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ActivityAggregate> getAggregatesWithAverageHR(long j5) {
        return queryAggregates("user = ? AND hrAverage > 0", new String[]{String.valueOf(j5)}, "day DESC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAverageSteps(User user) {
        return getSteps(user, SqliteDatabaseWrapper.Function.f46348c);
    }

    @Override // com.withings.util.database.b
    public String[] getCreateTableQuery() {
        return new String[]{"CREATE TABLE IF NOT EXISTS aggregatewam(id INTEGER PRIMARY KEY AUTOINCREMENT,user INTEGER REFERENCES users (id) ON DELETE CASCADE,synchrotime INTEGER,midnight INTEGER,timezone TEXT,day TEXT,calories REAL,earnedCalories REAL,passivecalories REAL,steps INTEGER,distance REAL,ascent REAL,descent REAL,inactiveDuration REAL,softMETDuration REAL,moderateMETDuration REAL,intenseMETDuration REAL,synctows INTEGER,brand INTEGER,devicemodel INTEGER,modified INTEGER,manualAdditionCalories REAL,manualAdditionDistance REAL,hrAverage REAL,hrResting INTEGER,hrMin INTEGER,hrMax INTEGER,hrZoneLight INTEGER,hrZoneModerate INTEGER,hrZoneIntense INTEGER,hrZonePeak INTEGER,isCompleted INTEGER,averageSpo2 REAL,averageSpo2US REAL,nbMeasureAuto INTEGER,nbMeasureManual INTEGER,temperatureAverage REAL,temperatureMin REAL,temperatureMax REAL);", "CREATE INDEX IF NOT EXISTS aggregatewam_user_day ON aggregatewam(user, day);", "CREATE INDEX IF NOT EXISTS aggregatewam_user_synctows_day ON aggregatewam(user, synctows, day);", "CREATE INDEX IF NOT EXISTS aggregatewam_user_midnight ON aggregatewam(user, midnight);"};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getFirstAggregate(Long l5) {
        return querySingleAggregate("user = ?", new String[]{String.valueOf(l5)}, "midnight ASC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getLastAggregate(long j5) {
        return querySingleAggregate("user = ?", new String[]{String.valueOf(j5)}, "day DESC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getLastAggregateBefore(long j5, DateTime dateTime) {
        return querySingleAggregate("user = ? AND midnight < ?", new String[]{String.valueOf(j5), String.valueOf(dateTime.getMillis())}, "midnight DESC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTime getLastAggregateDate(User user) {
        Cursor n11 = getHelper().c().n("SELECT MAX(midnight) from aggregatewam WHERE user = ? ", new String[]{String.valueOf(user.q())});
        try {
            DateTime dateTime = null;
            if (n11.getCount() <= 0) {
                n11.close();
                return null;
            }
            n11.moveToFirst();
            long j5 = n11.getLong(0);
            if (j5 != 0) {
                dateTime = new DateTime(j5);
            }
            n11.close();
            return dateTime;
        } catch (Throwable th2) {
            if (n11 != null) {
                try {
                    n11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getLastAggregateUpdate(User user) {
        Cursor n11 = getHelper().c().n("SELECT MAX(modified) from aggregatewam WHERE user = ?", new String[]{String.valueOf(user.q())});
        try {
            if (n11.getCount() <= 0) {
                n11.close();
                return 0L;
            }
            n11.moveToFirst();
            long j5 = n11.getLong(0);
            n11.close();
            return j5;
        } catch (Throwable th2) {
            if (n11 != null) {
                try {
                    n11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getLastAggregateWithAscentBefore(long j5, DateTime dateTime) {
        return querySingleAggregate("user = ? AND midnight < ? AND ascent > 0", new String[]{String.valueOf(j5), String.valueOf(dateTime.getMillis())}, "day DESC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getLastAggregateWithAverageHR(long j5) {
        return querySingleAggregate("user = ? AND hrAverage > 0", new String[]{String.valueOf(j5)}, "day DESC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getLastAggregateWithAverageSpo2(long j5, DateTime dateTime, DateTime dateTime2) {
        return querySingleAggregate("user = ? AND averageSpo2 > 0 AND midnight >= ? AND midnight <= ?", new String[]{String.valueOf(j5), String.valueOf(dateTime.getMillis()), String.valueOf(dateTime2.getMillis())}, "day DESC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getLastAggregateWithSteps(long j5) {
        return querySingleAggregate("user = ? AND steps > 0", new String[]{String.valueOf(j5)}, "day DESC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxSteps(User user) {
        return getSteps(user, SqliteDatabaseWrapper.Function.f46347b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityAggregate getMostRecentSyncedAggregate(User user) {
        return querySingleAggregate("user = ? AND synctows = 1", new String[]{String.valueOf(user.q())}, "midnight DESC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ActivityAggregate> getUnsynchronizedAggregate(User user) {
        return queryAggregates("user = ? AND synctows = 0", new String[]{String.valueOf(user.q())}, "midnight ASC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void insertAggregate(User user, ActivityAggregate activityAggregate, boolean z5) {
        getHelper().e().j(TABLE, contentValuesFrom(user, activityAggregate, z5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean insertOrUpdateAggregate(User user, ActivityAggregate activityAggregate, boolean z5) {
        if (getAggregateForDay(user.q(), activityAggregate.getDay()) == null) {
            insertAggregate(user, activityAggregate, z5);
            return true;
        }
        updateAggregate(user, activityAggregate, z5);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateAggregate(User user, ActivityAggregate activityAggregate, boolean z5) {
        getHelper().e().r(TABLE, contentValuesFrom(user, activityAggregate, z5), "user = ? AND day = ?", new String[]{String.valueOf(user.q()), activityAggregate.getDay()});
    }

    private List<ActivityAggregate> queryAggregates(String str, String[] strArr, String str2, String str3) {
        return getHelper().c().l(TABLE, STATS_SELECT_FIELDS, str, strArr, str2, str3, AggregateCursorMapper.get());
    }
}
