package com.withings.wiscale2.track.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.appcompat.view.menu.d;
import androidx.camera.camera2.internal.r2;
import androidx.compose.material.g6;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreDurationActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreInterruptionsActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRecoveryActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRegularityActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringDisabledActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToGetUpActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToSleepActivity;
import dg.a;
import fl.p;
import gl.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jm.a;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.joda.time.Duration;
import pm.e;
import wr.b;
/* compiled from: SleepScoreHelper.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002CDB\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bA\u0010BJ%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ#\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J)\u0010'\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0013H\u0002¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-J5\u00101\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010\f2\u0006\u0010/\u001a\u00020%2\b\b\u0002\u00100\u001a\u00020%H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b3\u00104R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006E"}, d2 = {"Lcom/withings/wiscale2/track/data/SleepStatsFactory;", "", "Lcom/withings/wiscale2/track/data/Track;", "sleepTrack", "Lgl/r0;", "deviceFeatures", "", "Lcom/withings/wiscale2/track/data/SleepStat;", "getSleepStats", "(Lcom/withings/wiscale2/track/data/Track;Lgl/r0;)Ljava/util/List;", "getSnoringInfo", "(Lcom/withings/wiscale2/track/data/Track;)Lcom/withings/wiscale2/track/data/SleepStat;", "Landroid/content/Intent;", "getSnoringIntent", "(Lcom/withings/wiscale2/track/data/Track;)Landroid/content/Intent;", "getNightHrInfo", "Lcom/withings/user/core/models/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, MessageType.TRACK, "", "retrieveLearnMoreUrl", "(Lcom/withings/user/core/models/User;Lcom/withings/wiscale2/track/data/Track;)Ljava/lang/String;", "getTimeToSleepInfo", "getTimeToGetUpInfo", "getDurationInfo", "getRegularityInfo", "getRecoveryInfo", "getInterruptionsInfo", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "", "durationMillis", "formatDuration", "(Landroid/content/Context;Ljava/lang/Long;)Ljava/lang/String;", "", "status", "text", "", "allowDisplayIfUnknown", "getValueToDisplayIfStatusOK", "(ILjava/lang/String;Z)Ljava/lang/String;", "capitalizeError", "()Ljava/lang/String;", "value", "getValueIfStatusOK", "(ILjava/lang/Integer;Z)I", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "allowClickIfUnknown", "isRegularity", "getIntentIfStatusOK", "(ILandroid/content/Intent;ZZ)Landroid/content/Intent;", "generateSleepStats", "(Lcom/withings/wiscale2/track/data/Track;)Ljava/util/List;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/withings/user/core/models/User;", "getUser", "()Lcom/withings/user/core/models/User;", "Ldg/a;", "activeSessionProvider$delegate", "Lnm0/g;", "getActiveSessionProvider", "()Ldg/a;", "activeSessionProvider", "<init>", "(Landroid/content/Context;Lcom/withings/user/core/models/User;)V", "Companion", "SleepStatsFactoryEntryPoint", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepStatsFactory {
    public static final int ID_DURATION = 1;
    public static final int ID_HEART_RATE = 7;
    public static final int ID_INTERRUPTIONS = 4;
    public static final int ID_RECOVERY = 2;
    public static final int ID_REGULARITY = 3;
    public static final int ID_SNORING = 8;
    public static final int ID_TIME_TO_GET_UP = 6;
    public static final int ID_TIME_TO_SLEEP = 5;
    private final g activeSessionProvider$delegate;
    private final Context context;
    private final User user;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SleepScoreHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/withings/wiscale2/track/data/SleepStatsFactory$Companion;", "", "()V", "ID_DURATION", "", "ID_HEART_RATE", "ID_INTERRUPTIONS", "ID_RECOVERY", "ID_REGULARITY", "ID_SNORING", "ID_TIME_TO_GET_UP", "ID_TIME_TO_SLEEP", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: SleepScoreHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/track/data/SleepStatsFactory$SleepStatsFactoryEntryPoint;", "", "Ldg/a;", "getActiveSessionProvider", "()Ldg/a;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface SleepStatsFactoryEntryPoint {
        a getActiveSessionProvider();
    }

    public SleepStatsFactory(Context context, User user) {
        u.j(context, "context");
        u.j(user, "user");
        this.context = context;
        this.user = user;
        this.activeSessionProvider$delegate = h.b(new SleepStatsFactory$activeSessionProvider$2(this));
    }

    private final String capitalizeError() {
        String valueOf;
        String string = this.context.getString(C1987R.string._ERROR_);
        u.i(string, "getString(...)");
        if (string.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = string.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = r2.a("getDefault(...)", charAt);
            } else {
                valueOf = String.valueOf(charAt);
            }
            return d.e(sb2, valueOf, string, 1, "substring(...)");
        }
        return string;
    }

    private final String formatDuration(Context context, Long l5) {
        if (l5 != null) {
            long longValue = l5.longValue();
            e.a aVar = new e.a(context, 0);
            aVar.a(true);
            aVar.w(true);
            aVar.t(true);
            aVar.v();
            return new e(aVar).a(longValue);
        }
        return null;
    }

    private final a getActiveSessionProvider() {
        return (a) this.activeSessionProvider$delegate.getValue();
    }

    private final SleepStat getDurationInfo(Track track) {
        Long l5;
        SleepScore sleepScore = track.getSleepScore();
        Integer num = null;
        if (sleepScore == null || sleepScore.getSleepDuration() == null) {
            return null;
        }
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        Duration totalSleep = ((SleepTrackData) data).getTotalSleep();
        if (totalSleep != null) {
            l5 = Long.valueOf(totalSleep.getMillis());
        } else {
            l5 = null;
        }
        int status = sleepScore.getSleepDuration().getStatus();
        String valueToDisplayIfStatusOK = getValueToDisplayIfStatusOK(status, formatDuration(this.context, l5), false);
        if (l5 != null) {
            num = Integer.valueOf((int) l5.longValue());
        }
        int valueIfStatusOK = getValueIfStatusOK(status, num, false);
        int sleepInfoColorRes = SleepScoreColorHelper.INSTANCE.getSleepInfoColorRes(sleepScore.getSleepDuration());
        SleepScoreDurationActivity.a aVar = SleepScoreDurationActivity.f60645l;
        Context context = this.context;
        Long id2 = track.getId();
        u.g(id2);
        long longValue = id2.longValue();
        aVar.getClass();
        u.j(context, "context");
        Intent putExtra = new Intent(context, SleepScoreDurationActivity.class).putExtra("EXTRA_SLEEP_TRACK", longValue);
        u.i(putExtra, "putExtra(...)");
        return new SleepStat(1, C1987R.string.sleepScore_duration, valueToDisplayIfStatusOK, valueIfStatusOK, sleepInfoColorRes, getIntentIfStatusOK$default(this, status, putExtra, false, false, 8, null));
    }

    private final Intent getIntentIfStatusOK(int i11, Intent intent, boolean z5, boolean z11) {
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown()) {
            if (z5) {
                return intent;
            }
        } else if (i11 != SleepScoreHelperKt.getSleepScoreConstants().getStatusError() || z11) {
            return intent;
        }
        return null;
    }

    static /* synthetic */ Intent getIntentIfStatusOK$default(SleepStatsFactory sleepStatsFactory, int i11, Intent intent, boolean z5, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        return sleepStatsFactory.getIntentIfStatusOK(i11, intent, z5, z11);
    }

    private final SleepStat getInterruptionsInfo(Track track) {
        String string;
        SleepScore sleepScore = track.getSleepScore();
        if (sleepScore != null && sleepScore.getSleepInterruptions() != null) {
            Parcelable data = track.getData();
            u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            Integer wakeUpCount = ((SleepTrackData) data).getWakeUpCount();
            u.g(wakeUpCount);
            if (wakeUpCount.intValue() < 1) {
                string = this.context.getString(C1987R.string.sleepScore_interruptionsNone_Female);
            } else if (wakeUpCount.intValue() == 1) {
                string = this.context.getString(C1987R.string.D_TIME, wakeUpCount);
            } else {
                string = this.context.getString(C1987R.string.D_TIMES, wakeUpCount);
            }
            u.g(string);
            int status = sleepScore.getSleepInterruptions().getStatus();
            String valueToDisplayIfStatusOK = getValueToDisplayIfStatusOK(status, string, false);
            int valueIfStatusOK = getValueIfStatusOK(status, wakeUpCount, false);
            int sleepInfoColorRes = SleepScoreColorHelper.INSTANCE.getSleepInfoColorRes(sleepScore.getSleepInterruptions());
            SleepScoreInterruptionsActivity.a aVar = SleepScoreInterruptionsActivity.f60661t;
            Context context = this.context;
            com.withings.user.User e11 = o70.a.e(this.user);
            Long id2 = track.getId();
            u.g(id2);
            long longValue = id2.longValue();
            aVar.getClass();
            u.j(context, "context");
            Intent putExtra = new Intent(context, SleepScoreInterruptionsActivity.class).putExtra("EXTRA_USER", e11).putExtra("EXTRA_SLEEP_TRACK", longValue);
            u.i(putExtra, "putExtra(...)");
            return new SleepStat(4, C1987R.string.sleepScore_interruptions, valueToDisplayIfStatusOK, valueIfStatusOK, sleepInfoColorRes, getIntentIfStatusOK$default(this, status, putExtra, false, false, 8, null));
        }
        return null;
    }

    private final SleepStat getNightHrInfo(Track track) {
        String obj;
        double d11;
        SleepScore sleepScore = track.getSleepScore();
        Intent intent = null;
        if (sleepScore == null || sleepScore.getNightHeartRate() == null) {
            return null;
        }
        jm.a a11 = a.d.a(this.context);
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        double hrAverage = ((SleepTrackData) data).getHrAverage();
        if (hrAverage == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            obj = null;
        } else {
            obj = jm.a.c(a11, 11, hrAverage, 0, 0, 60).toString();
        }
        int status = sleepScore.getNightHeartRate().getStatus();
        if (obj != null) {
            d11 = hrAverage;
            intent = getIntentIfStatusOK$default(this, status, HMWebActivity.f35395c.c(this.context, null, retrieveLearnMoreUrl(this.user, track)), true, false, 8, null);
        } else {
            d11 = hrAverage;
        }
        return new SleepStat(7, C1987R.string.sleepScore_nightHR, getValueToDisplayIfStatusOK(status, obj, true), getValueIfStatusOK(status, Integer.valueOf((int) d11), true), SleepScoreColorHelper.INSTANCE.getSleepInfoColorRes(sleepScore.getNightHeartRate()), intent);
    }

    private final SleepStat getRecoveryInfo(Track track) {
        String string;
        SleepScore sleepScore = track.getSleepScore();
        if (sleepScore != null && sleepScore.getRecovery() != null) {
            int status = sleepScore.getRecovery().getStatus();
            if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
                string = this.context.getString(C1987R.string.sleepScore_recoveryGood);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
                string = this.context.getString(C1987R.string.sleepScore_recoveryAverage);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
                string = this.context.getString(C1987R.string.sleepScore_recoveryBad);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown()) {
                string = this.context.getString(C1987R.string.sleepScore_recoveryUnknown);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
                string = capitalizeError();
            } else {
                Fail.j("Illegal recovery status " + status);
                string = this.context.getString(C1987R.string.sleepScore_recoveryUnknown);
            }
            String str = string;
            u.g(str);
            int valueIfStatusOK = getValueIfStatusOK(status, Integer.valueOf(sleepScore.getRecovery().getScore()), true);
            int sleepInfoColorRes = SleepScoreColorHelper.INSTANCE.getSleepInfoColorRes(sleepScore.getRecovery());
            SleepScoreRecoveryActivity.a aVar = SleepScoreRecoveryActivity.f60695u;
            Context context = this.context;
            Long id2 = track.getId();
            u.g(id2);
            long longValue = id2.longValue();
            aVar.getClass();
            u.j(context, "context");
            Intent putExtra = new Intent(context, SleepScoreRecoveryActivity.class).putExtra("EXTRA_SLEEP_TRACK", longValue);
            u.i(putExtra, "putExtra(...)");
            return new SleepStat(2, C1987R.string.sleepScore_recovery, str, valueIfStatusOK, sleepInfoColorRes, getIntentIfStatusOK$default(this, status, putExtra, false, false, 8, null));
        }
        return null;
    }

    private final SleepStat getRegularityInfo(Track track) {
        String string;
        SleepScore sleepScore = track.getSleepScore();
        if (sleepScore != null && sleepScore.getRegularity() != null) {
            int status = sleepScore.getRegularity().getStatus();
            if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
                string = this.context.getString(C1987R.string.sleepScore_regularityRegular);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
                string = this.context.getString(C1987R.string.sleepScore_regularityAverage);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
                string = this.context.getString(C1987R.string.sleepScore_regularityIrregular);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown() || status == SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
                string = this.context.getString(C1987R.string.sleepScore_regularityUnknown);
            } else {
                int status2 = sleepScore.getRegularity().getStatus();
                Fail.j("Illegal recovery status " + status2);
                string = this.context.getString(C1987R.string.sleepScore_regularityUnknown);
            }
            String str = string;
            u.g(str);
            int valueIfStatusOK = getValueIfStatusOK(status, Integer.valueOf(sleepScore.getSleepScoreValue()), true);
            int sleepInfoColorRes = SleepScoreColorHelper.INSTANCE.getSleepInfoColorRes(sleepScore.getRegularity());
            SleepScoreRegularityActivity.a aVar = SleepScoreRegularityActivity.B;
            Context context = this.context;
            com.withings.user.User e11 = o70.a.e(this.user);
            Long id2 = track.getId();
            u.g(id2);
            long longValue = id2.longValue();
            aVar.getClass();
            u.j(context, "context");
            Intent intent = new Intent(context, SleepScoreRegularityActivity.class);
            intent.putExtra("EXTRA_SLEEP_TRACK", longValue);
            intent.putExtra("EXTRA_USER", e11);
            return new SleepStat(3, C1987R.string.sleepScore_regularity, str, valueIfStatusOK, sleepInfoColorRes, getIntentIfStatusOK(status, intent, true, true));
        }
        return null;
    }

    private final List<SleepStat> getSleepStats(Track track, r0 r0Var) {
        ArrayList arrayList = new ArrayList();
        r0Var.getClass();
        arrayList.add(getDurationInfo(track));
        arrayList.add(getRecoveryInfo(track));
        arrayList.add(getRegularityInfo(track));
        arrayList.add(getInterruptionsInfo(track));
        if (r0Var.y()) {
            arrayList.add(getTimeToSleepInfo(track));
        }
        if (r0Var.O()) {
            arrayList.add(getTimeToGetUpInfo(track));
        }
        if (r0Var.c()) {
            arrayList.add(getNightHrInfo(track));
        }
        if (r0Var.f0()) {
            arrayList.add(getSnoringInfo(track));
        }
        return x.G(arrayList);
    }

    private final SleepStat getSnoringInfo(Track track) {
        Long l5;
        String formatDuration;
        SleepScore sleepScore = track.getSleepScore();
        Integer num = null;
        if (sleepScore == null || sleepScore.getSnoring() == null) {
            return null;
        }
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        Duration snoringDuration = ((SleepTrackData) data).getSnoringDuration();
        if (snoringDuration != null) {
            l5 = Long.valueOf(snoringDuration.getMillis());
        } else {
            l5 = null;
        }
        int status = sleepScore.getSnoring().getStatus();
        if (!track.getSnoringEnabled()) {
            formatDuration = this.context.getString(C1987R.string.status_off);
        } else if (l5 != null && l5.longValue() == 0) {
            formatDuration = "-";
        } else {
            formatDuration = formatDuration(this.context, l5);
        }
        String valueToDisplayIfStatusOK = getValueToDisplayIfStatusOK(status, formatDuration, true);
        if (l5 != null) {
            num = Integer.valueOf((int) l5.longValue());
        }
        return new SleepStat(8, C1987R.string.sleepScore_snoring, valueToDisplayIfStatusOK, getValueIfStatusOK(status, num, true), SleepScoreColorHelper.INSTANCE.getSleepInfoColorRes(sleepScore.getSnoring()), getIntentIfStatusOK$default(this, status, getSnoringIntent(track), true, false, 8, null));
    }

    private final Intent getSnoringIntent(Track track) {
        if (track.getSnoringEnabled()) {
            SleepScoreSnoringActivity.a aVar = SleepScoreSnoringActivity.A;
            Context context = this.context;
            Long id2 = track.getId();
            u.g(id2);
            long longValue = id2.longValue();
            com.withings.user.User e11 = o70.a.e(this.user);
            aVar.getClass();
            u.j(context, "context");
            Intent putExtra = new Intent(context, SleepScoreSnoringActivity.class).putExtra("EXTRA_SLEEP_TRACK", longValue).putExtra("EXTRA_USER", e11);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
        SleepScoreSnoringDisabledActivity.a aVar2 = SleepScoreSnoringDisabledActivity.f60808c;
        Context context2 = this.context;
        com.withings.user.User e12 = o70.a.e(this.user);
        aVar2.getClass();
        u.j(context2, "context");
        Intent putExtra2 = new Intent(context2, SleepScoreSnoringDisabledActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, e12);
        u.i(putExtra2, "putExtra(...)");
        return putExtra2;
    }

    private final SleepStat getTimeToGetUpInfo(Track track) {
        Long l5;
        Intent intent;
        SleepScore sleepScore = track.getSleepScore();
        Integer num = null;
        if (sleepScore == null || sleepScore.getTimeToGetUp() == null) {
            return null;
        }
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        Duration durationToGetUp = ((SleepTrackData) data).getDurationToGetUp();
        if (durationToGetUp != null) {
            l5 = Long.valueOf(durationToGetUp.getMillis());
        } else {
            l5 = null;
        }
        int status = sleepScore.getTimeToGetUp().getStatus();
        if (l5 != null) {
            SleepScoreTimeToGetUpActivity.a aVar = SleepScoreTimeToGetUpActivity.f60817s;
            Context context = this.context;
            Long id2 = track.getId();
            u.g(id2);
            long longValue = id2.longValue();
            aVar.getClass();
            u.j(context, "context");
            Intent putExtra = new Intent(context, SleepScoreTimeToGetUpActivity.class).putExtra("EXTRA_SLEEP_TRACK", longValue);
            u.i(putExtra, "putExtra(...)");
            intent = putExtra;
        } else {
            intent = null;
        }
        String valueToDisplayIfStatusOK = getValueToDisplayIfStatusOK(status, formatDuration(this.context, l5), true);
        if (l5 != null) {
            num = Integer.valueOf((int) l5.longValue());
        }
        return new SleepStat(6, C1987R.string.sleepScore_timeToGetUp, valueToDisplayIfStatusOK, getValueIfStatusOK(status, num, true), SleepScoreColorHelper.INSTANCE.getInfoColorResSpecialUnknown(sleepScore.getTimeToGetUp()), getIntentIfStatusOK$default(this, status, intent, true, false, 8, null));
    }

    private final SleepStat getTimeToSleepInfo(Track track) {
        Long l5;
        SleepScore sleepScore = track.getSleepScore();
        Integer num = null;
        if (sleepScore == null || sleepScore.getTimeToFallAsleep() == null) {
            return null;
        }
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        Duration durationToSleep = ((SleepTrackData) data).getDurationToSleep();
        if (durationToSleep != null) {
            l5 = Long.valueOf(durationToSleep.getMillis());
        } else {
            l5 = null;
        }
        int status = sleepScore.getTimeToFallAsleep().getStatus();
        String valueToDisplayIfStatusOK = getValueToDisplayIfStatusOK(status, formatDuration(this.context, l5), true);
        if (l5 != null) {
            num = Integer.valueOf((int) l5.longValue());
        }
        int valueIfStatusOK = getValueIfStatusOK(status, num, true);
        int infoColorResSpecialUnknown = SleepScoreColorHelper.INSTANCE.getInfoColorResSpecialUnknown(sleepScore.getTimeToFallAsleep());
        SleepScoreTimeToSleepActivity.a aVar = SleepScoreTimeToSleepActivity.f60845s;
        Context context = this.context;
        Long id2 = track.getId();
        u.g(id2);
        long longValue = id2.longValue();
        aVar.getClass();
        u.j(context, "context");
        Intent putExtra = new Intent(context, SleepScoreTimeToSleepActivity.class).putExtra("EXTRA_SLEEP_TRACK", longValue);
        u.i(putExtra, "putExtra(...)");
        return new SleepStat(5, C1987R.string.sleepScore_timeToSleep, valueToDisplayIfStatusOK, valueIfStatusOK, infoColorResSpecialUnknown, getIntentIfStatusOK$default(this, status, putExtra, true, false, 8, null));
    }

    private final int getValueIfStatusOK(int i11, Integer num, boolean z5) {
        if (num == null) {
            return 0;
        }
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown()) {
            if (!z5) {
                return 0;
            }
            return num.intValue();
        } else if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
            return 0;
        } else {
            return num.intValue();
        }
    }

    private final String getValueToDisplayIfStatusOK(int i11, String str, boolean z5) {
        if (str == null) {
            str = " - ";
        }
        if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown()) {
            if (!z5) {
                return " - ";
            }
        } else if (i11 == SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
            return capitalizeError();
        }
        return str;
    }

    private final String retrieveLearnMoreUrl(User user, Track track) {
        sf.d a11;
        String string;
        if (!b.c(FeatureFlag.f39120n0)) {
            a11 = null;
        } else {
            a11 = dg.b.a(getActiveSessionProvider(), false);
        }
        if (a11 != null) {
            string = g6.i(a11.h(), "/sleephr/night?userid=%1$s&amp;activityid=%2$s");
        } else {
            string = this.context.getString(C1987R.string.sleepHR_explanationLearnMoreURL_night);
            u.g(string);
        }
        return String.format(string, Arrays.copyOf(new Object[]{String.valueOf(user.getId()), String.valueOf(track.getWsId())}, 2));
    }

    public final List<SleepStat> generateSleepStats(Track sleepTrack) {
        r0 r0Var;
        List<SleepStat> sleepStats;
        u.j(sleepTrack, "sleepTrack");
        Object k11 = p.f67672b.a().k(sleepTrack.getDeviceModel());
        if (k11 instanceof r0) {
            r0Var = (r0) k11;
        } else {
            r0Var = null;
        }
        if (r0Var == null || (sleepStats = getSleepStats(sleepTrack, r0Var)) == null) {
            return l.z(new SleepStat[]{getDurationInfo(sleepTrack), getRecoveryInfo(sleepTrack)});
        }
        return sleepStats;
    }

    public final Context getContext() {
        return this.context;
    }

    public final User getUser() {
        return this.user;
    }
}
