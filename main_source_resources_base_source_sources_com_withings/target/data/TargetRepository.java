package com.withings.target.data;

import com.withings.comm.wpp.generated.object.Threshold;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.target.Target;
import com.withings.target.WeightGoal;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: TargetRepository.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u0000 ]2\u00020\u0001:\u0001]J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u000eJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH¦@¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b%\u0010\u0016J!\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001fH&¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001fH&¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001fH&¢\u0006\u0004\b+\u0010(J%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001fH&¢\u0006\u0004\b,\u0010*J\u001f\u0010.\u001a\u00020-2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001fH&¢\u0006\u0004\b.\u0010/J-\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b0\u00101J/\u00104\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001fH&¢\u0006\u0004\b4\u00105J\u001e\u00106\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b6\u0010\nJ&\u00107\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b7\u00108J(\u0010;\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010:\u001a\u000209H¦@¢\u0006\u0004\b;\u0010<J\u0019\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\u0004\u0018\u00010=2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\b@\u0010AJ'\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\bB\u0010\u001eJ\u0019\u0010C\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\bC\u0010\u0016J!\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\bD\u0010\u001cJ'\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\bE\u0010\u001eJ\u0019\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\bF\u0010\u0016J!\u0010G\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\bG\u0010\u001cJ'\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\bH\u0010\u001eJ \u0010J\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020=H¦@¢\u0006\u0004\bJ\u0010KJ(\u0010N\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u001fH¦@¢\u0006\u0004\bN\u0010OJ!\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u001fH&¢\u0006\u0004\bP\u0010(J'\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u001fH&¢\u0006\u0004\bQ\u0010*J+\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\bR\u0010SJ \u0010T\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u001fH¦@¢\u0006\u0004\bT\u0010\"J\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\bU\u0010\u000eJ%\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\bV\u0010\u001eJ'\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\bW\u0010\u001eJ\u0019\u0010X\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\bX\u0010\u0016J \u0010[\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020YH¦@¢\u0006\u0004\b[\u0010\\¨\u0006^À\u0006\u0003"}, d2 = {"Lcom/withings/target/data/TargetRepository;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/withings/target/Target;", "getActiveStepTargetsForAllUser", "()Lkotlinx/coroutines/flow/Flow;", "targets", "Lnm0/y;", "saveTargets", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "getAllActivatedTargetsForUserFlow", "(J)Lkotlinx/coroutines/flow/Flow;", "Lorg/joda/time/DateTime;", "mostRecentModified", "(J)Lorg/joda/time/DateTime;", "dateTime", "getAllTargetForUserSince", "(JLorg/joda/time/DateTime;)Ljava/util/List;", "getLastActiveStepTarget", "(J)Lcom/withings/target/Target;", "getLastActiveStepTargetFlow", "getLastActiveStepsTargetOrDefault", "getLastActiveStepsTargetOrDefaultFlow", "date", "getStepsTargetOrDefault", "(JLorg/joda/time/DateTime;)Lcom/withings/target/Target;", "getStepsTargetOrDefaultFlow", "(JLorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "", "goal", "saveStepTarget", "(JILqm0/d;)Ljava/lang/Object;", "getTargetsToSync", "(J)Ljava/util/List;", "getSleepTarget", "hrMeasureType", "getHRLastTarget", "(JI)Lcom/withings/target/Target;", "getHRLastTargetFlow", "(JI)Lkotlinx/coroutines/flow/Flow;", "getHRLastTargetOrDefault", "getHRLastTargetOrDefaultFlow", "Lcom/withings/comm/wpp/generated/object/Threshold;", "getHRThreshold", "(JI)Lcom/withings/comm/wpp/generated/object/Threshold;", "getHRTargetAtDate", "(JILorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "hrValue", "attrib", "createHRTarget", "(JIII)Lcom/withings/target/Target;", "updateHRTarget", "replaceHRThresholds", "(JLjava/util/List;Lqm0/d;)Ljava/lang/Object;", "", "isActivate", "changeHeartRateThresholdActivation", "(JIZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/target/WeightGoal;", "getWeightGoal", "(J)Lcom/withings/target/WeightGoal;", "getWeightGoalAtDate", "(JLorg/joda/time/DateTime;)Lcom/withings/target/WeightGoal;", "getWeightGoalAtDateFlow", "getWeightTarget", "getWeightTargetAtDate", "getWeightTargetAtDateFlow", "getWeightSpeedTarget", "getWeightSpeedTargetAtDate", "getWeightSpeedTargetAtDateFlow", "weightGoal", "saveWeightTarget", "(JLcom/withings/target/WeightGoal;Lqm0/d;)Ljava/lang/Object;", "workoutCategory", "targetValue", "saveWorkoutTarget", "(JIILqm0/d;)Ljava/lang/Object;", "getLastActiveWorkoutTarget", "getLastActiveWorkoutTargetFlow", "getLastWorkoutTargetAtTheEndOfTheWeek", "(JILorg/joda/time/DateTime;)Lcom/withings/target/Target;", "disableWorkoutTarget", "getCurrentHealthGoalTarget", "getTemperatureTargetOrDefaultFlow", "getTemperatureTargetForDay", "getTemperatureTarget", "", "temperatureBaseline", "saveTemperatureTarget", "(JDLqm0/d;)Ljava/lang/Object;", "Companion", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface TargetRepository {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DEFAULT_HIGH_HEART_RATE_THRESHOLD = 140;
    public static final int DEFAULT_LOW_HEART_RATE_THRESHOLD = 35;
    public static final int DEFAULT_SLEEP_TARGET_SECONDS = 28800;
    public static final int DEFAULT_STEP_TARGET = 10000;
    public static final int DEFAULT_TEMPERATURE_TARGET = 37;
    public static final int TARGET_EXPONENT = -3;

    /* compiled from: TargetRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/withings/target/data/TargetRepository$Companion;", "", "()V", "DEFAULT_HIGH_HEART_RATE_THRESHOLD", "", "DEFAULT_LOW_HEART_RATE_THRESHOLD", "DEFAULT_SLEEP_TARGET_SECONDS", "DEFAULT_STEP_TARGET", "DEFAULT_TEMPERATURE_TARGET", "TARGET_EXPONENT", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DEFAULT_HIGH_HEART_RATE_THRESHOLD = 140;
        public static final int DEFAULT_LOW_HEART_RATE_THRESHOLD = 35;
        public static final int DEFAULT_SLEEP_TARGET_SECONDS = 28800;
        public static final int DEFAULT_STEP_TARGET = 10000;
        public static final int DEFAULT_TEMPERATURE_TARGET = 37;
        public static final int TARGET_EXPONENT = -3;

        private Companion() {
        }
    }

    Object changeHeartRateThresholdActivation(long j5, int i11, boolean z5, d<? super y> dVar);

    Target createHRTarget(long j5, int i11, int i12, int i13);

    Object disableWorkoutTarget(long j5, int i11, d<? super y> dVar);

    Flow<List<Target>> getActiveStepTargetsForAllUser();

    Flow<List<Target>> getAllActivatedTargetsForUserFlow(long j5);

    List<Target> getAllTargetForUserSince(long j5, DateTime dateTime);

    Flow<Target> getCurrentHealthGoalTarget(long j5);

    Target getHRLastTarget(long j5, int i11);

    Flow<Target> getHRLastTargetFlow(long j5, int i11);

    Target getHRLastTargetOrDefault(long j5, int i11);

    Flow<Target> getHRLastTargetOrDefaultFlow(long j5, int i11);

    Flow<Target> getHRTargetAtDate(long j5, int i11, DateTime dateTime);

    Threshold getHRThreshold(long j5, int i11);

    Target getLastActiveStepTarget(long j5);

    Flow<Target> getLastActiveStepTargetFlow(long j5);

    Target getLastActiveStepsTargetOrDefault(long j5);

    Flow<Target> getLastActiveStepsTargetOrDefaultFlow(long j5);

    Target getLastActiveWorkoutTarget(long j5, int i11);

    Flow<Target> getLastActiveWorkoutTargetFlow(long j5, int i11);

    Target getLastWorkoutTargetAtTheEndOfTheWeek(long j5, int i11, DateTime dateTime);

    Target getSleepTarget(long j5);

    Target getStepsTargetOrDefault(long j5, DateTime dateTime);

    Flow<Target> getStepsTargetOrDefaultFlow(long j5, DateTime dateTime);

    List<Target> getTargetsToSync(long j5);

    Target getTemperatureTarget(long j5);

    Flow<Target> getTemperatureTargetForDay(long j5, DateTime dateTime);

    Flow<Target> getTemperatureTargetOrDefaultFlow(long j5, DateTime dateTime);

    WeightGoal getWeightGoal(long j5);

    WeightGoal getWeightGoalAtDate(long j5, DateTime dateTime);

    Flow<WeightGoal> getWeightGoalAtDateFlow(long j5, DateTime dateTime);

    Target getWeightSpeedTarget(long j5);

    Target getWeightSpeedTargetAtDate(long j5, DateTime dateTime);

    Flow<Target> getWeightSpeedTargetAtDateFlow(long j5, DateTime dateTime);

    Target getWeightTarget(long j5);

    Target getWeightTargetAtDate(long j5, DateTime dateTime);

    Flow<Target> getWeightTargetAtDateFlow(long j5, DateTime dateTime);

    DateTime mostRecentModified(long j5);

    Object replaceHRThresholds(long j5, List<Target> list, d<? super y> dVar);

    Object saveStepTarget(long j5, int i11, d<? super y> dVar);

    Object saveTargets(List<Target> list, d<? super y> dVar);

    Object saveTemperatureTarget(long j5, double d11, d<? super y> dVar);

    Object saveWeightTarget(long j5, WeightGoal weightGoal, d<? super y> dVar);

    Object saveWorkoutTarget(long j5, int i11, int i12, d<? super y> dVar);

    Object updateHRTarget(List<Target> list, d<? super y> dVar);
}
