package com.withings.webservices.legacy.lastupdate;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import com.withings.vasistas.ws.WsVasistasSerie;
import dp0.j;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: UserLastUpdate.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \\2\u00020\u0001:\u0001\\B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010W\u001a\u00020\b2\u0006\u0010X\u001a\u00020YJ\u0010\u0010Z\u001a\u00020\b2\b\u0010[\u001a\u0004\u0018\u00010\u0007R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001c\u0010*\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R\u001a\u00103\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0011R\u001a\u00106\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R\u001a\u00109\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R\u001a\u0010<\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R\u001a\u0010?\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010\u0011R\u001a\u0010B\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010\u0011R\u001a\u0010E\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u000f\"\u0004\bG\u0010\u0011R\u001a\u0010H\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011R\u001a\u0010K\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u000f\"\u0004\bM\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010\u0004R&\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\n\"\u0004\bS\u0010\fR\u001a\u0010T\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u000f\"\u0004\bV\u0010\u0011¨\u0006]"}, d2 = {"Lcom/withings/webservices/legacy/lastupdate/UserLastUpdate;", "", NavigationArguments.USER_ID, "", "(J)V", "activity", "", "", "Lorg/joda/time/DateTime;", "getActivity", "()Ljava/util/Map;", "setActivity", "(Ljava/util/Map;)V", "aggregate", "getAggregate", "()Lorg/joda/time/DateTime;", "setAggregate", "(Lorg/joda/time/DateTime;)V", "badge", "getBadge", "setBadge", "classifier", "getClassifier", "setClassifier", "feature", "getFeature", "setFeature", "hairCare", "getHairCare", "setHairCare", "healthAttribute", "getHealthAttribute", "setHealthAttribute", "healthscore", "getHealthscore", "setHealthscore", "insightCoach", "getInsightCoach", "setInsightCoach", "leaderboard", "getLeaderboard", "setLeaderboard", "measure", "getMeasure", "setMeasure", "mission", "getMission", "setMission", "modified", "getModified", "setModified", "noteGroup", "getNoteGroup", "setNoteGroup", "partner", "getPartner", "setPartner", "prediction", "getPrediction", "setPrediction", ConstantsWs.SYNC_PROCESS_ROUTINE, "getRoutine", "setRoutine", "signal", "getSignal", "setSignal", WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME, "getSubcategory", "setSubcategory", "target", "getTarget", "setTarget", "thermoInsight", "getThermoInsight", "setThermoInsight", ConstantsWs.SYNC_PROCESS_TIMELINE, "getTimeline", "setTimeline", "getUserId", "()J", "setUserId", WsVasistasSerie.KEY_VASISTAS, "getVasistas", "setVasistas", "wellness", "getWellness", "setWellness", "getActivityForDeviceType", "deviceType", "", "getVasistasForCategory", "category", "Companion", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserLastUpdate {
    public static final Companion Companion = new Companion(null);
    private static final DateTime DEFAULT_DATETIME = new DateTime(0);
    private Map<String, DateTime> activity;
    private DateTime aggregate;
    private DateTime badge;
    private DateTime classifier;
    private DateTime feature;
    private DateTime hairCare;
    private DateTime healthAttribute;
    private DateTime healthscore;
    private DateTime insightCoach;
    private DateTime leaderboard;
    private DateTime measure;
    private DateTime mission;
    private DateTime modified;
    private DateTime noteGroup;
    private DateTime partner;
    private DateTime prediction;
    private DateTime routine;
    private DateTime signal;
    private DateTime subcategory;
    private DateTime target;
    private DateTime thermoInsight;
    private DateTime timeline;
    private long userId;
    private Map<String, DateTime> vasistas;
    private DateTime wellness;

    /* compiled from: UserLastUpdate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/webservices/legacy/lastupdate/UserLastUpdate$Companion;", "", "()V", "DEFAULT_DATETIME", "Lorg/joda/time/DateTime;", "getDEFAULT_DATETIME", "()Lorg/joda/time/DateTime;", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final DateTime getDEFAULT_DATETIME() {
            return UserLastUpdate.DEFAULT_DATETIME;
        }

        private Companion() {
        }
    }

    public UserLastUpdate(long j5) {
        this.userId = j5;
        DateTime dateTime = DEFAULT_DATETIME;
        this.modified = dateTime;
        this.vasistas = new HashMap();
        this.activity = new HashMap();
        this.aggregate = dateTime;
        this.measure = dateTime;
        this.classifier = dateTime;
        this.target = dateTime;
        this.noteGroup = dateTime;
        this.thermoInsight = dateTime;
        this.healthAttribute = dateTime;
        this.hairCare = dateTime;
        this.routine = dateTime;
        this.signal = dateTime;
        this.insightCoach = dateTime;
        this.subcategory = dateTime;
        this.wellness = dateTime;
        this.badge = dateTime;
        this.timeline = dateTime;
        this.leaderboard = dateTime;
        this.partner = dateTime;
        this.mission = dateTime;
        this.feature = dateTime;
        this.healthscore = dateTime;
        this.prediction = dateTime;
    }

    public final Map<String, DateTime> getActivity() {
        return this.activity;
    }

    public final DateTime getActivityForDeviceType(int i11) {
        DateTime dateTime = this.activity.get(String.valueOf(i11));
        if (dateTime == null) {
            return DEFAULT_DATETIME;
        }
        return dateTime;
    }

    public final DateTime getAggregate() {
        return this.aggregate;
    }

    public final DateTime getBadge() {
        return this.badge;
    }

    public final DateTime getClassifier() {
        return this.classifier;
    }

    public final DateTime getFeature() {
        return this.feature;
    }

    public final DateTime getHairCare() {
        return this.hairCare;
    }

    public final DateTime getHealthAttribute() {
        return this.healthAttribute;
    }

    public final DateTime getHealthscore() {
        return this.healthscore;
    }

    public final DateTime getInsightCoach() {
        return this.insightCoach;
    }

    public final DateTime getLeaderboard() {
        return this.leaderboard;
    }

    public final DateTime getMeasure() {
        return this.measure;
    }

    public final DateTime getMission() {
        return this.mission;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final DateTime getNoteGroup() {
        return this.noteGroup;
    }

    public final DateTime getPartner() {
        return this.partner;
    }

    public final DateTime getPrediction() {
        return this.prediction;
    }

    public final DateTime getRoutine() {
        return this.routine;
    }

    public final DateTime getSignal() {
        return this.signal;
    }

    public final DateTime getSubcategory() {
        return this.subcategory;
    }

    public final DateTime getTarget() {
        return this.target;
    }

    public final DateTime getThermoInsight() {
        return this.thermoInsight;
    }

    public final DateTime getTimeline() {
        return this.timeline;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Map<String, DateTime> getVasistas() {
        return this.vasistas;
    }

    public final DateTime getVasistasForCategory(String str) {
        if (j.x(ConstantsWs.VASISTAS_CATEGORY_BED, str)) {
            str = "32";
        } else if (j.x(ConstantsWs.VASISTAS_CATEGORY_TRACKER, str)) {
            str = "16";
        }
        DateTime dateTime = this.vasistas.get(str);
        if (dateTime == null) {
            return DEFAULT_DATETIME;
        }
        return dateTime;
    }

    public final DateTime getWellness() {
        return this.wellness;
    }

    public final void setActivity(Map<String, DateTime> map) {
        u.j(map, "<set-?>");
        this.activity = map;
    }

    public final void setAggregate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.aggregate = dateTime;
    }

    public final void setBadge(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.badge = dateTime;
    }

    public final void setClassifier(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.classifier = dateTime;
    }

    public final void setFeature(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.feature = dateTime;
    }

    public final void setHairCare(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.hairCare = dateTime;
    }

    public final void setHealthAttribute(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.healthAttribute = dateTime;
    }

    public final void setHealthscore(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.healthscore = dateTime;
    }

    public final void setInsightCoach(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.insightCoach = dateTime;
    }

    public final void setLeaderboard(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.leaderboard = dateTime;
    }

    public final void setMeasure(DateTime dateTime) {
        this.measure = dateTime;
    }

    public final void setMission(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.mission = dateTime;
    }

    public final void setModified(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.modified = dateTime;
    }

    public final void setNoteGroup(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.noteGroup = dateTime;
    }

    public final void setPartner(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.partner = dateTime;
    }

    public final void setPrediction(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.prediction = dateTime;
    }

    public final void setRoutine(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.routine = dateTime;
    }

    public final void setSignal(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.signal = dateTime;
    }

    public final void setSubcategory(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.subcategory = dateTime;
    }

    public final void setTarget(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.target = dateTime;
    }

    public final void setThermoInsight(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.thermoInsight = dateTime;
    }

    public final void setTimeline(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.timeline = dateTime;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    public final void setVasistas(Map<String, DateTime> map) {
        u.j(map, "<set-?>");
        this.vasistas = map;
    }

    public final void setWellness(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.wellness = dateTime;
    }
}
