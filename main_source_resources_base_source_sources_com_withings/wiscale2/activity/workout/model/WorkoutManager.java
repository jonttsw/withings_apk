package com.withings.wiscale2.activity.workout.model;

import android.content.Context;
import androidx.camera.core.q1;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import bj0.f;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.util.log.Fail;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import com.withings.wiscale2.vo2max.ComputeVo2Max;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import org.joda.time.DateTime;
import u70.h;
import w6.g;
/* compiled from: WorkoutManager.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 o2\u00020\u0001:\u0002opB\u0019\u0012\b\b\u0001\u0010e\u001a\u00020d\u0012\u0006\u0010h\u001a\u00020g¢\u0006\u0004\bm\u0010nJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b \u0010\u001cJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0&2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b)\u0010\"J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J3\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J+\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0016¢\u0006\u0004\b6\u00107J\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b8\u00109J)\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J1\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0019¢\u0006\u0004\b;\u0010>J\u0017\u0010?\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b?\u0010@J+\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\bA\u0010\"J\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ%\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u00190Hj\b\u0012\u0004\u0012\u00020\u0019`I2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\u00020L2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020L2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\tH\u0017¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\bS\u0010\u000fJ\u0015\u0010T\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\bT\u0010\u000fJ\u001d\u0010U\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\bU\u0010RJ\u0015\u0010V\u001a\u00020L2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\bV\u0010PJ\u0017\u0010X\u001a\u0004\u0018\u00010\t2\u0006\u0010W\u001a\u00020\u0010¢\u0006\u0004\bX\u0010@J\u001d\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&2\u0006\u00100\u001a\u00020\u0010¢\u0006\u0004\bY\u0010ZJ\u0019\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0012¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u0004¢\u0006\u0004\b]\u0010^J\u001f\u0010`\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t2\u0006\u0010_\u001a\u00020LH\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006q"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lnm0/y;", "registerListener", "(Lcom/withings/wiscale2/activity/workout/model/WorkoutManager$Listener;)V", "unregisterListener", "", "Lcom/withings/wiscale2/track/data/Track;", "trackList", "saveAll", "(Ljava/util/List;)V", MessageType.TRACK, "save", "(Lcom/withings/wiscale2/track/data/Track;)V", "", NavigationArguments.USER_ID, "Lkotlinx/coroutines/flow/Flow;", "Lbj0/f$b;", "getWorkoutCountByCategory", "(J)Lkotlinx/coroutines/flow/Flow;", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "deviceType", "getTracksForUserForDeviceType", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;I)Ljava/util/List;", "start", "end", "category", "getForUserBetweenDate", "getForUserOverlapping", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Ljava/util/List;", FoodDayFragment.ARG_DAY, "getWorkoutsForUserContainedInADay", "(JLorg/joda/time/DateTime;)Ljava/util/List;", "Landroidx/lifecycle/LiveData;", "getWorkoutsForUserContainedInADayLiveData", "(JLorg/joda/time/DateTime;)Landroidx/lifecycle/LiveData;", "getWorkoutsForUserContainedBetween", "numberOfActivities", "getLastConfirmedTracksCategoriesIdsFor", "(JI)Ljava/util/List;", "attrib", "getLastTrackForUserAndAttrib", "(JI)Lcom/withings/wiscale2/track/data/Track;", "workoutId", "", "limit", "getWorkoutsAround", "(JJJLjava/lang/String;)Ljava/util/List;", "maxDate", "getAllForCategoryBefore", "(JJLorg/joda/time/DateTime;)Ljava/util/List;", "getAllWorkoutsForUser", "(J)Ljava/util/List;", "maxToFetchLimit", "getLastWorkoutsForUserOrderDescending", "(JI)Lkotlinx/coroutines/flow/Flow;", "categoryId", "(JJI)Lkotlinx/coroutines/flow/Flow;", "getLastWorkout", "(J)Lcom/withings/wiscale2/track/data/Track;", "getRelevantWorkoutsInDateRange", "getAllWorkoutsForCategory", "(I)Ljava/util/List;", "", "categories", "getMostRecentWorkoutRelevantForVo2MaxComputing", "(J[J)Lcom/withings/wiscale2/track/data/Track;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCategoryIdsForUser", "(J)Ljava/util/ArrayList;", "", "hasWorkoutOverlapping", "(JLcom/withings/wiscale2/track/data/Track;)Z", "shouldBeDisplayed", "(Lcom/withings/wiscale2/track/data/Track;)Z", "delete", "(JLcom/withings/wiscale2/track/data/Track;)V", "insertForLogin", "saveFromWs", "deleteFromWs", "shouldIgnoreWorkout", "id", "getWorkoutById", "getLiveWorkoutById", "(J)Landroidx/lifecycle/LiveData;", "getAll", "()Lkotlinx/coroutines/flow/Flow;", CervicalMucusRecord.Appearance.CLEAR, "()V", "isFromWS", "insertTrackAndNotify", "(Lcom/withings/wiscale2/track/data/Track;Z)V", "insertOrUpdateSafely", "(Lcom/withings/wiscale2/track/data/Track;)J", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lbj0/f;", "dao", "Lbj0/f;", "Lu70/h;", "listenerManager", "Lu70/h;", "<init>", "(Landroid/content/Context;Lbj0/f;)V", "Companion", "Listener", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class WorkoutManager {
    private static final int ACCEPTED_RECO_VERSION = 1000;
    private static final int IGNORABLE_WALK_DURATION_MILLIS = 1200000;
    public static WorkoutManager instance;
    private final Context context;
    private final bj0.f dao;
    private final h<Listener> listenerManager;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WorkoutManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutManager$Companion;", "", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lbj0/f;", "dao", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "init", "(Landroid/content/Context;Lbj0/f;)Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "get", "()Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "instance", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "getInstance", "setInstance", "(Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;)V", "", "ACCEPTED_RECO_VERSION", "I", "IGNORABLE_WALK_DURATION_MILLIS", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final WorkoutManager get() {
            Fail.h(getInstance(), "You must init WorkoutManager before using it !");
            return getInstance();
        }

        public final WorkoutManager getInstance() {
            WorkoutManager workoutManager = WorkoutManager.instance;
            if (workoutManager != null) {
                return workoutManager;
            }
            u.s("instance");
            throw null;
        }

        public final WorkoutManager init(Context context, bj0.f dao) {
            u.j(context, "context");
            u.j(dao, "dao");
            setInstance(new WorkoutManager(context, dao));
            return getInstance();
        }

        public final void setInstance(WorkoutManager workoutManager) {
            u.j(workoutManager, "<set-?>");
            WorkoutManager.instance = workoutManager;
        }

        private Companion() {
        }
    }

    /* compiled from: WorkoutManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/WorkoutManager$Listener;", "", "", NavigationArguments.USER_ID, "Lcom/withings/wiscale2/track/data/Track;", MessageType.TRACK, "", "isFromWS", "Lnm0/y;", "onWorkoutTrackInserted", "(JLcom/withings/wiscale2/track/data/Track;Z)V", "oldTrack", "newTrack", "onWorkoutTrackUpdated", "(JLcom/withings/wiscale2/track/data/Track;Lcom/withings/wiscale2/track/data/Track;Z)V", "onWorkoutTrackDeleted", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface Listener {
        void onWorkoutTrackDeleted(long j5, Track track, boolean z5);

        void onWorkoutTrackInserted(long j5, Track track, boolean z5);

        void onWorkoutTrackUpdated(long j5, Track track, Track track2, boolean z5);
    }

    public WorkoutManager(Context context, bj0.f dao) {
        u.j(context, "context");
        u.j(dao, "dao");
        this.context = context;
        this.dao = dao;
        this.listenerManager = new h<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delete$lambda$13$lambda$12(long j5, Track existingTrack, Listener listener) {
        u.j(existingTrack, "$existingTrack");
        listener.onWorkoutTrackDeleted(j5, existingTrack, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteFromWs$lambda$21$lambda$20(long j5, Track it, Listener listener) {
        u.j(it, "$it");
        listener.onWorkoutTrackDeleted(j5, it, true);
    }

    public static final WorkoutManager get() {
        return Companion.get();
    }

    public static final WorkoutManager init(Context context, bj0.f fVar) {
        return Companion.init(context, fVar);
    }

    private final long insertOrUpdateSafely(Track track) {
        if (track.getEndDate().isBefore(track.getStartDate())) {
            return -1L;
        }
        return this.dao.a(track);
    }

    private final void insertTrackAndNotify(Track track, boolean z5) {
        track.setDataJson(track.getDataJsonString());
        long insertOrUpdateSafely = insertOrUpdateSafely(track);
        if (insertOrUpdateSafely != -1) {
            track.setId(Long.valueOf(insertOrUpdateSafely));
        }
        if (!z5) {
            ComputeVo2Max.a.a(this.context, track.getUserId(), track, false);
        }
        this.listenerManager.f(new b(track, z5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertTrackAndNotify$lambda$4(Track track, boolean z5, Listener listener) {
        u.j(track, "$track");
        listener.onWorkoutTrackInserted(track.getUserId(), track, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void save$lambda$3$lambda$2(Track track, Track existingTrack, Listener listener) {
        u.j(track, "$track");
        u.j(existingTrack, "$existingTrack");
        listener.onWorkoutTrackUpdated(track.getUserId(), existingTrack, track, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveFromWs$lambda$17$lambda$16(Track track, Track it, Listener listener) {
        u.j(track, "$track");
        u.j(it, "$it");
        listener.onWorkoutTrackUpdated(track.getUserId(), it, track, true);
    }

    public final void clear() {
        this.dao.deleteAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[LOOP:0: B:16:0x0080->B:18:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void delete(final long r9, com.withings.wiscale2.track.data.Track r11) {
        /*
            r8 = this;
            java.lang.String r0 = "track"
            kotlin.jvm.internal.u.j(r11, r0)
            java.lang.Long r0 = r11.getId()
            if (r0 == 0) goto Lbe
            long r0 = r0.longValue()
            bj0.f r2 = r8.dao
            com.withings.wiscale2.track.data.Track r0 = r2.getById(r0)
            if (r0 == 0) goto Lbe
            java.lang.Long r1 = r0.getWsId()
            r2 = 0
            if (r1 == 0) goto L4a
            long r3 = r1.longValue()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            if (r1 == 0) goto L4a
            r0.setSyncedToWs(r2)
            r1 = 1
            r0.setDeleted(r1)
            java.lang.Integer r1 = r11.getDeletionReason()
            r0.setDeletionReason(r1)
            org.joda.time.DateTime r1 = org.joda.time.DateTime.now()
            java.lang.String r3 = "now(...)"
            kotlin.jvm.internal.u.i(r1, r3)
            r0.setModifiedDate(r1)
            r8.insertOrUpdateSafely(r0)
            goto L4f
        L4a:
            bj0.f r1 = r8.dao
            r1.c(r0)
        L4f:
            android.content.Context r1 = r8.context
            long r3 = r11.getUserId()
            java.lang.Long r11 = r0.getId()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.u.j(r1, r5)
            androidx.work.r$a r5 = new androidx.work.r$a
            java.lang.Class<com.withings.wiscale2.vo2max.DeleteVo2Max> r6 = com.withings.wiscale2.vo2max.DeleteVo2Max.class
            r5.<init>(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            nm0.j r4 = new nm0.j
            java.lang.String r6 = "userId"
            r4.<init>(r6, r3)
            nm0.j r3 = new nm0.j
            java.lang.String r6 = "trackId"
            r3.<init>(r6, r11)
            nm0.j[] r3 = new nm0.j[]{r4, r3}
            androidx.work.f$a r4 = new androidx.work.f$a
            r4.<init>()
        L80:
            r6 = 2
            if (r2 >= r6) goto L95
            r6 = r3[r2]
            java.lang.Object r7 = r6.c()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.d()
            r4.b(r6, r7)
            int r2 = r2 + 1
            goto L80
        L95:
            androidx.work.f r2 = r4.a()
            androidx.work.w$a r2 = r5.j(r2)
            androidx.work.r$a r2 = (androidx.work.r.a) r2
            androidx.work.w r2 = r2.b()
            androidx.work.r r2 = (androidx.work.r) r2
            if (r11 == 0) goto Lb2
            androidx.work.impl.n0 r11 = androidx.work.impl.n0.n(r1)
            androidx.work.ExistingWorkPolicy r1 = androidx.work.ExistingWorkPolicy.f19032c
            java.lang.String r3 = "DeleteVo2Max"
            r11.e(r3, r1, r2)
        Lb2:
            u70.h<com.withings.wiscale2.activity.workout.model.WorkoutManager$Listener> r11 = r8.listenerManager
            com.withings.wiscale2.activity.workout.model.c r1 = new com.withings.wiscale2.activity.workout.model.c
            r1.<init>()
            r11.f(r1)
            nm0.y r9 = nm0.y.f85009a
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.model.WorkoutManager.delete(long, com.withings.wiscale2.track.data.Track):void");
    }

    public final void deleteFromWs(final long j5, Track track) {
        final Track track2;
        u.j(track, "track");
        Long id2 = track.getId();
        if (id2 != null) {
            track2 = this.dao.getById(id2.longValue());
        } else {
            Long wsId = track.getWsId();
            if (wsId != null) {
                track2 = this.dao.getByWsId(wsId.longValue());
            } else {
                track2 = null;
            }
        }
        if (track2 != null) {
            this.dao.c(track2);
            this.listenerManager.f(new h.a() { // from class: com.withings.wiscale2.activity.workout.model.d
                @Override // u70.h.a
                public final void e(Object obj) {
                    WorkoutManager.deleteFromWs$lambda$21$lambda$20(j5, track2, (WorkoutManager.Listener) obj);
                }
            });
        }
    }

    public final Flow<List<Track>> getAll() {
        return this.dao.b();
    }

    public final List<Track> getAllForCategoryBefore(long j5, long j11, DateTime maxDate) {
        u.j(maxDate, "maxDate");
        return this.dao.y(j5, j11, maxDate);
    }

    public final List<Track> getAllWorkoutsForCategory(int i11) {
        return this.dao.o(i11);
    }

    public final List<Track> getAllWorkoutsForUser(long j5) {
        return this.dao.p(j5);
    }

    public final ArrayList<Integer> getCategoryIdsForUser(long j5) {
        return new ArrayList<>(this.dao.i(j5));
    }

    public final List<Track> getForUserBetweenDate(long j5, DateTime start, DateTime end, int i11) {
        u.j(start, "start");
        u.j(end, "end");
        return this.dao.r(j5, start, end, i11);
    }

    public final List<Track> getForUserOverlapping(long j5, DateTime start, DateTime end) {
        u.j(start, "start");
        u.j(end, "end");
        return this.dao.u(j5, start, end);
    }

    public final List<Integer> getLastConfirmedTracksCategoriesIdsFor(long j5, int i11) {
        ArrayList<f.a> x11 = this.dao.x(j5, i11, new int[]{2, 0, 7});
        ArrayList arrayList = new ArrayList(x.y(x11, 10));
        for (f.a aVar : x11) {
            arrayList.add(Integer.valueOf(aVar.a()));
        }
        return arrayList;
    }

    public final Track getLastTrackForUserAndAttrib(long j5, int i11) {
        return this.dao.e(i11, j5);
    }

    public final Track getLastWorkout(long j5) {
        return this.dao.z(j5);
    }

    public final Flow<List<Track>> getLastWorkoutsForUserOrderDescending(long j5, int i11) {
        return FlowKt.distinctUntilChanged(this.dao.g(i11, j5));
    }

    public final LiveData<Track> getLiveWorkoutById(long j5) {
        return new WorkoutLiveData(this, j5);
    }

    public final Track getMostRecentWorkoutRelevantForVo2MaxComputing(long j5, long[] categories) {
        u.j(categories, "categories");
        return this.dao.m(j5, categories);
    }

    public final List<Track> getRelevantWorkoutsInDateRange(long j5, DateTime start, DateTime end) {
        u.j(start, "start");
        u.j(end, "end");
        return this.dao.q(j5, start, end);
    }

    public final List<Track> getTracksForUserForDeviceType(long j5, DateTime startDate, DateTime endDate, int i11) {
        u.j(startDate, "startDate");
        u.j(endDate, "endDate");
        return this.dao.k(j5, startDate, endDate, i11);
    }

    public final Track getWorkoutById(long j5) {
        return this.dao.getById(j5);
    }

    public final Flow<List<f.b>> getWorkoutCountByCategory(long j5) {
        return FlowKt.distinctUntilChanged(this.dao.h(j5));
    }

    public final List<Track> getWorkoutsAround(long j5, long j11, long j12, String limit) {
        Object obj;
        int i11;
        int size;
        u.j(limit, "limit");
        ArrayList w11 = this.dao.w(j5, j12);
        Iterator it = w11.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Long id2 = ((Track) obj).getId();
                if (id2 != null && id2.longValue() == j11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        int indexOf = w11.indexOf(obj);
        if (indexOf > Integer.parseInt(limit) / 2) {
            i11 = indexOf - (Integer.parseInt(limit) / 2);
        } else {
            i11 = 0;
        }
        if ((Integer.parseInt(limit) / 2) + indexOf < w11.size()) {
            size = (Integer.parseInt(limit) / 2) + indexOf;
        } else {
            size = w11.size();
        }
        return w11.subList(i11, size);
    }

    public final List<Track> getWorkoutsForUserContainedBetween(long j5, DateTime start, DateTime end) {
        u.j(start, "start");
        u.j(end, "end");
        return this.dao.l(j5, start, end);
    }

    public final List<Track> getWorkoutsForUserContainedInADay(long j5, DateTime day) {
        u.j(day, "day");
        bj0.f fVar = this.dao;
        DateTime withTimeAtStartOfDay = day.withTimeAtStartOfDay();
        u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
        return fVar.l(j5, withTimeAtStartOfDay, hn.a.m(day));
    }

    public final LiveData<List<Track>> getWorkoutsForUserContainedInADayLiveData(long j5, DateTime day) {
        u.j(day, "day");
        bj0.f fVar = this.dao;
        DateTime withTimeAtStartOfDay = day.withTimeAtStartOfDay();
        u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
        return fVar.j(j5, withTimeAtStartOfDay, hn.a.m(day));
    }

    public final boolean hasWorkoutOverlapping(long j5, Track track) {
        ArrayList<Track> n11;
        u.j(track, "track");
        Long id2 = track.getId();
        if (id2 != null) {
            n11 = this.dao.v(j5, id2.longValue(), track.getStartDate(), track.getEndDate());
        } else {
            n11 = this.dao.n(j5, track.getStartDate(), track.getEndDate());
        }
        if (n11.isEmpty()) {
            return false;
        }
        for (Track track2 : n11) {
            if (shouldBeDisplayed(track2)) {
                return true;
            }
        }
        return false;
    }

    public final void insertForLogin(Track track) {
        u.j(track, "track");
        insertTrackAndNotify(track, true);
    }

    public final void registerListener(Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.b(listener);
    }

    public final void save(Track track) {
        y yVar;
        Track workoutById;
        u.j(track, "track");
        Long id2 = track.getId();
        if (id2 != null && (workoutById = getWorkoutById(id2.longValue())) != null) {
            track.setWsId(workoutById.getWsId());
            track.setDataJson(track.getDataJsonString());
            track.setSyncedToWs(false);
            insertOrUpdateSafely(track);
            ComputeVo2Max.a.a(this.context, track.getUserId(), track, true);
            this.listenerManager.f(new g(5, track, workoutById));
            yVar = y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            insertTrackAndNotify(track, false);
        }
    }

    public void saveAll(List<Track> trackList) {
        u.j(trackList, "trackList");
        for (Track track : trackList) {
            save(track);
        }
    }

    public final void saveFromWs(Track track) {
        Track track2;
        u.j(track, "track");
        Long id2 = track.getId();
        y yVar = null;
        if (id2 != null) {
            track2 = this.dao.getById(id2.longValue());
        } else {
            Long wsId = track.getWsId();
            if (wsId != null) {
                track2 = this.dao.getByWsId(wsId.longValue());
            } else {
                track2 = null;
            }
        }
        if (track2 != null) {
            track.setId(track2.getId());
            track.setDataJson(track.getDataJsonString());
            insertOrUpdateSafely(track);
            this.listenerManager.f(new q1(4, track, track2));
            yVar = y.f85009a;
        }
        if (yVar == null) {
            insertTrackAndNotify(track, true);
        }
    }

    public final boolean shouldBeDisplayed(Track track) {
        u.j(track, "track");
        List W = x.W(2, 3, 7);
        if (track.getCategory() == 272 || track.getCategory() == 37 || track.getAttrib() == 20000) {
            return false;
        }
        if (!W.contains(Integer.valueOf(track.getAttrib())) && track.getCategory() == 1 && TrackKt.getEffectiveDurationMillis(track) - track.getPauseDurationMillis() <= 1200000) {
            return false;
        }
        return true;
    }

    public final boolean shouldIgnoreWorkout(Track track) {
        u.j(track, "track");
        if (track.getCategory() != 37 && track.getAttrib() != 20000 && track.getAttrib() <= 1000 && (track.getCategory() != 36 || track.getAttrib() != 0)) {
            return false;
        }
        return true;
    }

    public final void unregisterListener(Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.a(listener);
    }

    public final Flow<List<Track>> getLastWorkoutsForUserOrderDescending(long j5, long j11, int i11) {
        return FlowKt.distinctUntilChanged(this.dao.d(i11, j5, j11));
    }
}
