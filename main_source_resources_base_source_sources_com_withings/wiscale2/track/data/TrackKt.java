package com.withings.wiscale2.track.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.activity.b0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.amazon.model.AmazonPictureInfo;
import com.withings.amazon.model.Pathlist;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.SleepVasistasKt;
import com.withings.vasistas.model.SpO2Vasistas;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.C1987R;
import com.withings.workout.workoutdata.WorkoutData;
import hn.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Duration;
import vh.h;
/* compiled from: Track.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u001f\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b*\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0011\u0010\u0013\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0003\u001a\u0011\u0010\u0014\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0003\u001a\u0011\u0010\u0015\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0003\u001a\u0011\u0010\u0016\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0003\u001a\u0011\u0010\u0017\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u0011\u0010\u0018\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0003\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u0019*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0011\u0010\u001d\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u0003\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010!\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b!\u0010\u0003\u001a\u001b\u0010$\u001a\u00020#*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(*\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010.\u001a\u00020\u0001*\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0019\u00102\u001a\u00020#*\u00020\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103\"\u0014\u00104\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0015\u0010<\u001a\u000209*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0015\u0010>\u001a\u000209*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010;\"\u0015\u0010@\u001a\u000209*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b?\u0010;\"\u0015\u0010D\u001a\u00020A*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u0015\u0010F\u001a\u00020A*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010C\"\u0015\u0010J\u001a\u00020A*\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010I\"\u0017\u0010M\u001a\u0004\u0018\u00010A*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0017\u0010O\u001a\u0004\u0018\u00010A*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bN\u0010L\"\u0015\u0010Q\u001a\u000209*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bP\u0010;\"\u0015\u0010R\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bR\u0010\u0003¨\u0006S"}, d2 = {"Lcom/withings/wiscale2/track/data/Track;", "", "isManual", "(Lcom/withings/wiscale2/track/data/Track;)Z", "isEdit", "isConfirmed", "", "getCoverPicture", "(Lcom/withings/wiscale2/track/data/Track;)Ljava/lang/Object;", "endsOnSameDayItStarted", "isSleepDurationCorrect", "", "Lcom/withings/vasistas/model/Vasistas;", "aggregatedVasistas", "isWakeUpCountCorrect", "(Lcom/withings/wiscale2/track/data/Track;Ljava/util/List;)Z", "ignoreWalkAndNotRelevantDuration", "(Ljava/util/List;)Ljava/util/List;", "isSleepApneaEnabled", "hasSleepApnea", "hasSleepApneaWithError", "hasSleepApneaWithoutError", "hasRelevantSleepApnea", "hasBreathingDisturbanceWithoutError", "hasBreathingDisturbance", "", "averageSpO2", "(Lcom/withings/wiscale2/track/data/Track;)F", "usAverageSpO2", "hasValidAverageSpO2", "", "averageHr", "(Lcom/withings/wiscale2/track/data/Track;)I", "isValidForSleepDisorderDiagnosis", FirebaseAnalytics.Param.INDEX, "Lnm0/y;", "setBreathingDisorderIndex", "(Lcom/withings/wiscale2/track/data/Track;Ljava/lang/Integer;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/SparseArray;", "", "deleteReasons", "(Lcom/withings/wiscale2/track/data/Track;Landroid/content/Context;)Landroid/util/SparseArray;", "Lcom/withings/vasistas/model/SpO2Vasistas;", WsVasistasSerie.KEY_VASISTAS, "containsSpO2Vasistas", "(Lcom/withings/wiscale2/track/data/Track;Lcom/withings/vasistas/model/SpO2Vasistas;)Z", "Landroid/net/Uri;", "uri", "addPhoto", "(Lcom/withings/wiscale2/track/data/Track;Landroid/net/Uri;)V", "WALK_WORKOUT_MIN_DURATION", "I", "", "WALK_DISPLAY_ATTRIB", "[I", "Lorg/joda/time/DateTime;", "getAsleepStartDate", "(Lcom/withings/wiscale2/track/data/Track;)Lorg/joda/time/DateTime;", "asleepStartDate", "getAwakeStartDate", "awakeStartDate", "getEffectiveStartDate", "effectiveStartDate", "", "getEffectiveDurationMillis", "(Lcom/withings/wiscale2/track/data/Track;)J", "effectiveDurationMillis", "getDurationToDisplay", "durationToDisplay", "Lorg/joda/time/Duration;", "getMinutesInMillis", "(Lorg/joda/time/Duration;)J", "minutesInMillis", "getManualStartDateInSeconds", "(Lcom/withings/wiscale2/track/data/Track;)Ljava/lang/Long;", "manualStartDateInSeconds", "getManualEndDateInSeconds", "manualEndDateInSeconds", "getEffectiveEndDate", "effectiveEndDate", "isAutoRecognized", "HealthMate_prodRelease"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TrackKt {
    private static final int[] WALK_DISPLAY_ATTRIB = {2, 3, 7};
    private static final int WALK_WORKOUT_MIN_DURATION = 1200000;

    public static final void addPhoto(Track track, Uri uri) {
        u.j(track, "<this>");
        u.j(uri, "uri");
        String uri2 = uri.toString();
        List<String> uris = track.getUris();
        if (uris != null && uris.contains(uri2)) {
            uri2 = null;
        }
        if (uri2 != null) {
            String uri3 = uri.toString();
            u.i(uri3, "toString(...)");
            track.addUri(uri3);
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            track.setModifiedDate(now);
            track.setSyncedToWs(false);
            int i11 = h.f103738e;
            h.d(new TrackKt$addPhoto$2$1(track));
        }
    }

    public static final int averageHr(Track track) {
        SleepTrackData sleepTrackData;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData != null) {
            return (int) sleepTrackData.getHrAverage();
        }
        return 0;
    }

    public static final float averageSpO2(Track track) {
        SleepTrackData sleepTrackData;
        Float valueOf;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData == null || (valueOf = sleepTrackData.getAverageSpo2()) == null) {
            valueOf = Float.valueOf(0.0f);
        }
        return valueOf.floatValue();
    }

    public static final boolean containsSpO2Vasistas(Track track, SpO2Vasistas vasistas) {
        u.j(track, "<this>");
        u.j(vasistas, "vasistas");
        if (b0.p(getEffectiveStartDate(track), vasistas.getStartDate()) && a.a(getEffectiveEndDate(track), vasistas.getEndDate())) {
            return true;
        }
        return false;
    }

    public static final SparseArray<String> deleteReasons(Track track, Context context) {
        u.j(track, "<this>");
        u.j(context, "context");
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.append(1, context.getString(C1987R.string._DELETE_ACTIVITY_WRONG_DURATION_));
        sparseArray.append(2, context.getString(C1987R.string._DELETE_ACTIVITY_WRONG_TYPE_));
        if (!l.l(new int[]{1, 2, 6, 7}, track.getCategory())) {
            sparseArray.append(4, context.getString(C1987R.string._DELETE_ACTIVITY_STOP_RECOGNITION_));
        }
        sparseArray.append(5, context.getString(C1987R.string._DELETE_ACTIVITY_OTHER_));
        return sparseArray;
    }

    public static final boolean endsOnSameDayItStarted(Track track) {
        u.j(track, "<this>");
        return b0.r(track.getStartDate(), track.getEndDate());
    }

    public static final DateTime getAsleepStartDate(Track track) {
        u.j(track, "<this>");
        if (track.getData() instanceof SleepTrackData) {
            DateTime manualStartDate = track.getManualStartDate();
            if (manualStartDate == null) {
                manualStartDate = track.getStartDate();
            }
            Parcelable data = track.getData();
            u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            DateTime plus = manualStartDate.plus(((SleepTrackData) data).getDurationToSleep());
            u.i(plus, "plus(...)");
            return plus;
        }
        return track.getStartDate();
    }

    public static final DateTime getAwakeStartDate(Track track) {
        u.j(track, "<this>");
        if (track.getData() instanceof SleepTrackData) {
            DateTime manualEndDate = track.getManualEndDate();
            if (manualEndDate == null) {
                manualEndDate = track.getEndDate();
            }
            Parcelable data = track.getData();
            u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            DateTime minus = manualEndDate.minus(((SleepTrackData) data).getDurationToGetUp());
            u.i(minus, "minus(...)");
            return minus;
        }
        return track.getEndDate();
    }

    public static final Object getCoverPicture(Track track) {
        Object obj;
        u.j(track, "<this>");
        String coverPictureUrl = track.getCoverPictureUrl();
        if (coverPictureUrl != null) {
            List<Pathlist> pathlists = track.getPathlists();
            AmazonPictureInfo amazonPictureInfo = null;
            if (pathlists != null) {
                Iterator<T> it = pathlists.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (u.e(((Pathlist) obj).b(), coverPictureUrl)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Pathlist pathlist = (Pathlist) obj;
                if (pathlist != null) {
                    amazonPictureInfo = new AmazonPictureInfo(track.getUserId(), track.getCryptpart(), pathlist, null);
                }
            }
            if (amazonPictureInfo != null) {
                return amazonPictureInfo;
            }
        }
        return track.getCoverPictureUri();
    }

    public static final long getDurationToDisplay(Track track) {
        u.j(track, "<this>");
        if (track.getActivityRecognitionVersion() != null && isAutoRecognized(track)) {
            return getMinutesInMillis(new Duration(track.getDuration()));
        }
        return track.getDuration();
    }

    public static final long getEffectiveDurationMillis(Track track) {
        u.j(track, "<this>");
        return new Duration(getEffectiveStartDate(track), getEffectiveEndDate(track)).getMillis();
    }

    public static final DateTime getEffectiveEndDate(Track track) {
        WorkoutData workoutData;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        DateTime dateTime = null;
        if (data instanceof WorkoutData) {
            workoutData = (WorkoutData) data;
        } else {
            workoutData = null;
        }
        if (workoutData != null) {
            dateTime = workoutData.getDeviceEndDate();
        }
        if (dateTime != null && track.getAttrib() == 3) {
            Parcelable data2 = track.getData();
            u.h(data2, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            DateTime deviceEndDate = ((WorkoutData) data2).getDeviceEndDate();
            u.g(deviceEndDate);
            return deviceEndDate;
        } else if (track.getData() instanceof SleepTrackData) {
            DateTime manualEndDate = track.getManualEndDate();
            if (manualEndDate == null) {
                return track.getEndDate();
            }
            return manualEndDate;
        } else {
            return track.getEndDate();
        }
    }

    public static final DateTime getEffectiveStartDate(Track track) {
        WorkoutData workoutData;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        DateTime dateTime = null;
        if (data instanceof WorkoutData) {
            workoutData = (WorkoutData) data;
        } else {
            workoutData = null;
        }
        if (workoutData != null) {
            dateTime = workoutData.getDeviceStartDate();
        }
        if (dateTime != null && track.getAttrib() == 3) {
            Parcelable data2 = track.getData();
            u.h(data2, "null cannot be cast to non-null type com.withings.workout.workoutdata.WorkoutData");
            DateTime deviceStartDate = ((WorkoutData) data2).getDeviceStartDate();
            u.g(deviceStartDate);
            return deviceStartDate;
        } else if (track.getData() instanceof SleepTrackData) {
            DateTime manualStartDate = track.getManualStartDate();
            if (manualStartDate == null) {
                return track.getStartDate();
            }
            return manualStartDate;
        } else {
            return track.getStartDate();
        }
    }

    public static final Long getManualEndDateInSeconds(Track track) {
        u.j(track, "<this>");
        DateTime manualEndDate = track.getManualEndDate();
        if (manualEndDate == null) {
            return null;
        }
        Long valueOf = Long.valueOf(manualEndDate.getMillis() / 1000);
        if (valueOf.longValue() == 0) {
            return null;
        }
        return valueOf;
    }

    public static final Long getManualStartDateInSeconds(Track track) {
        u.j(track, "<this>");
        DateTime manualStartDate = track.getManualStartDate();
        if (manualStartDate == null) {
            return null;
        }
        Long valueOf = Long.valueOf(manualStartDate.getMillis() / 1000);
        if (valueOf.longValue() == 0) {
            return null;
        }
        return valueOf;
    }

    public static final long getMinutesInMillis(Duration duration) {
        u.j(duration, "<this>");
        return duration.getStandardMinutes() * ((long) DateTimeConstants.MILLIS_PER_MINUTE);
    }

    public static final boolean hasBreathingDisturbance(Track track) {
        SleepTrackData sleepTrackData;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        Integer num = null;
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData != null) {
            num = sleepTrackData.getBreathingEventProbability();
        }
        if (num != null && !isSleepApneaEnabled(track)) {
            return true;
        }
        return false;
    }

    public static final boolean hasBreathingDisturbanceWithoutError(Track track) {
        SleepTrackData sleepTrackData;
        Integer breathingEventProbability;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData == null || (breathingEventProbability = sleepTrackData.getBreathingEventProbability()) == null || breathingEventProbability.intValue() < 0 || isSleepApneaEnabled(track)) {
            return false;
        }
        return true;
    }

    public static final boolean hasRelevantSleepApnea(Track track) {
        SleepTrackData sleepTrackData;
        u.j(track, "<this>");
        if (hasSleepApnea(track)) {
            Parcelable data = track.getData();
            Integer num = null;
            if (data instanceof SleepTrackData) {
                sleepTrackData = (SleepTrackData) data;
            } else {
                sleepTrackData = null;
            }
            if (sleepTrackData != null) {
                num = sleepTrackData.getApneaHypopneaIndex();
            }
            u.g(num);
            if (num.intValue() >= 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasSleepApnea(Track track) {
        SleepTrackData sleepTrackData;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        Integer num = null;
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData != null) {
            num = sleepTrackData.getApneaHypopneaIndex();
        }
        if (num != null && isSleepApneaEnabled(track)) {
            return true;
        }
        return false;
    }

    public static final boolean hasSleepApneaWithError(Track track) {
        SleepTrackData sleepTrackData;
        Integer apneaHypopneaIndex;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData == null || (apneaHypopneaIndex = sleepTrackData.getApneaHypopneaIndex()) == null || apneaHypopneaIndex.intValue() >= 0 || !isSleepApneaEnabled(track)) {
            return false;
        }
        return true;
    }

    public static final boolean hasSleepApneaWithoutError(Track track) {
        SleepTrackData sleepTrackData;
        Integer apneaHypopneaIndex;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData == null || (apneaHypopneaIndex = sleepTrackData.getApneaHypopneaIndex()) == null || apneaHypopneaIndex.intValue() < 0 || !isSleepApneaEnabled(track)) {
            return false;
        }
        return true;
    }

    public static final boolean hasValidAverageSpO2(Track track) {
        u.j(track, "<this>");
        if (averageSpO2(track) >= 0.0f) {
            return true;
        }
        return false;
    }

    public static final List<Track> ignoreWalkAndNotRelevantDuration(List<Track> list) {
        u.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Track track = (Track) obj;
            if (track.getCategory() != 1 || track.getDuration() >= 1200000 || l.l(WALK_DISPLAY_ATTRIB, track.getAttrib())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean isAutoRecognized(Track track) {
        u.j(track, "<this>");
        if (track.getAttrib() != 0 && track.getAttrib() != 5 && track.getAttrib() != 7) {
            return false;
        }
        return true;
    }

    public static final boolean isConfirmed(Track track) {
        u.j(track, "<this>");
        if (track.getCategory() == 36 && !isManual(track) && track.getAttrib() != 7) {
            return false;
        }
        return true;
    }

    public static final boolean isEdit(Track track) {
        u.j(track, "<this>");
        if (track.getManualStartDate() == null && track.getManualEndDate() == null) {
            return false;
        }
        return true;
    }

    public static final boolean isManual(Track track) {
        u.j(track, "<this>");
        if (track.getAttrib() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean isSleepApneaEnabled(Track track) {
        SleepTrackData sleepTrackData;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData != null) {
            return u.e(sleepTrackData.isSleepApneaActivated(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean isSleepDurationCorrect(Track track) {
        u.j(track, "<this>");
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        SleepTrackData sleepTrackData = (SleepTrackData) data;
        if (getEffectiveDurationMillis(track) == sleepTrackData.getDurationOrZero(sleepTrackData.getManualSleepDuration()).getMillis() + sleepTrackData.getDurationOrZero(sleepTrackData.getManualAwakeDuration()).getMillis() + sleepTrackData.getWakeUpDuration().getMillis() + sleepTrackData.getDurationOrZero(sleepTrackData.getUnspecifiedSleepDuration()).getMillis() + sleepTrackData.getDurationOrZero(sleepTrackData.getRemSleepDuration()).getMillis() + sleepTrackData.getDurationOrZero(sleepTrackData.getDeepSleepDuration()).getMillis() + sleepTrackData.getDurationOrZero(sleepTrackData.getLightSleepDuration()).getMillis()) {
            return true;
        }
        return false;
    }

    public static final boolean isValidForSleepDisorderDiagnosis(Track track) {
        SleepTrackData sleepTrackData;
        Duration totalSleep;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData == null || (totalSleep = sleepTrackData.getTotalSleep()) == null || totalSleep.getMillis() <= 18000000) {
            return false;
        }
        return true;
    }

    public static final boolean isWakeUpCountCorrect(Track track, List<Vasistas> aggregatedVasistas) {
        SleepTrackData sleepTrackData;
        u.j(track, "<this>");
        u.j(aggregatedVasistas, "aggregatedVasistas");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData == null) {
            return false;
        }
        Integer wakeUpCount = sleepTrackData.getWakeUpCount();
        int wakeUpCount2 = SleepVasistasKt.getWakeUpCount(aggregatedVasistas);
        if (wakeUpCount == null || wakeUpCount.intValue() != wakeUpCount2) {
            return false;
        }
        return true;
    }

    public static final void setBreathingDisorderIndex(Track track, Integer num) {
        u.j(track, "<this>");
        Parcelable data = track.getData();
        u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        SleepTrackData sleepTrackData = (SleepTrackData) data;
        if (hasSleepApnea(track)) {
            sleepTrackData.setApneaHypopneaIndex(num);
        } else if (hasBreathingDisturbance(track)) {
            sleepTrackData.setBreathingEventProbability(num);
        }
    }

    public static final float usAverageSpO2(Track track) {
        SleepTrackData sleepTrackData;
        Float valueOf;
        u.j(track, "<this>");
        Parcelable data = track.getData();
        if (data instanceof SleepTrackData) {
            sleepTrackData = (SleepTrackData) data;
        } else {
            sleepTrackData = null;
        }
        if (sleepTrackData == null || (valueOf = sleepTrackData.getUSAverageSpo2()) == null) {
            valueOf = Float.valueOf(0.0f);
        }
        return valueOf.floatValue();
    }
}
