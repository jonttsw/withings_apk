package com.withings.target.data;

import android.content.Context;
import com.withings.comm.wpp.generated.object.Threshold;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import com.withings.target.WeightGoal;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 s2\u00020\u0001:\u0001sB/\b\u0007\u0012\b\b\u0001\u0010i\u001a\u00020h\u0012\u0006\u0010l\u001a\u00020k\u0012\b\b\u0002\u0010n\u001a\u00020!\u0012\b\b\u0002\u0010p\u001a\u00020!¢\u0006\u0004\bq\u0010rJ\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001eJ \u0010#\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\u0016J!\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!H\u0016¢\u0006\u0004\b-\u0010*J%\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!H\u0016¢\u0006\u0004\b.\u0010,J\u001f\u00100\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!H\u0016¢\u0006\u0004\b0\u00101J-\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u00103J/\u00106\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!2\u0006\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020!H\u0016¢\u0006\u0004\b6\u00107J\u001e\u00108\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@¢\u0006\u0004\b8\u0010\nJ&\u00109\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@¢\u0006\u0004\b9\u0010:J(\u0010=\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!2\u0006\u0010<\u001a\u00020;H\u0096@¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010AJ!\u0010B\u001a\u0004\u0018\u00010?2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\bB\u0010CJ'\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u001eJ\u0019\u0010E\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bE\u0010\u0016J\u0019\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bF\u0010\u0016J!\u0010G\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\bG\u0010\u001cJ'\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\bH\u0010\u001eJ\u0019\u0010I\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010\u0016J!\u0010J\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\bJ\u0010\u001cJ'\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u001eJ \u0010M\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020?H\u0096@¢\u0006\u0004\bM\u0010NJ(\u0010Q\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020!2\u0006\u0010P\u001a\u00020!H\u0096@¢\u0006\u0004\bQ\u0010RJ \u0010U\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020SH\u0096@¢\u0006\u0004\bU\u0010VJ!\u0010W\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020!H\u0016¢\u0006\u0004\bW\u0010*J'\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020!H\u0016¢\u0006\u0004\bX\u0010,J+\u0010Y\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bY\u0010ZJ \u0010[\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020!H\u0096@¢\u0006\u0004\b[\u0010$J\u001f\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\\\u0010\u000eJ\u0017\u0010]\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b]\u0010\u0016J\u0017\u0010^\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b^\u0010\u0016J\u001f\u0010_\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020!H\u0002¢\u0006\u0004\b_\u0010*J\u0017\u0010a\u001a\u00020/2\u0006\u0010`\u001a\u00020\u0004H\u0002¢\u0006\u0004\ba\u0010bJ#\u0010c\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\bc\u0010dJ%\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010e*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010o¨\u0006t"}, d2 = {"Lcom/withings/target/data/LocalTargetRepository;", "Lcom/withings/target/data/TargetRepository;", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/withings/target/Target;", "getActiveStepTargetsForAllUser", "()Lkotlinx/coroutines/flow/Flow;", "targets", "Lnm0/y;", "saveTargets", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "getAllActivatedTargetsForUserFlow", "(J)Lkotlinx/coroutines/flow/Flow;", "Lorg/joda/time/DateTime;", "mostRecentModified", "(J)Lorg/joda/time/DateTime;", "dateTime", "getAllTargetForUserSince", "(JLorg/joda/time/DateTime;)Ljava/util/List;", "getLastActiveStepTarget", "(J)Lcom/withings/target/Target;", "getLastActiveStepTargetFlow", "getLastActiveStepsTargetOrDefault", "getLastActiveStepsTargetOrDefaultFlow", "date", "getStepsTargetOrDefault", "(JLorg/joda/time/DateTime;)Lcom/withings/target/Target;", "getStepsTargetOrDefaultFlow", "(JLorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "getTemperatureTargetOrDefaultFlow", "getTemperatureTargetForDay", "", "goal", "saveStepTarget", "(JILqm0/d;)Ljava/lang/Object;", "getTargetsToSync", "(J)Ljava/util/List;", "getSleepTarget", "hrMeasureType", "getHRLastTarget", "(JI)Lcom/withings/target/Target;", "getHRLastTargetFlow", "(JI)Lkotlinx/coroutines/flow/Flow;", "getHRLastTargetOrDefault", "getHRLastTargetOrDefaultFlow", "Lcom/withings/comm/wpp/generated/object/Threshold;", "getHRThreshold", "(JI)Lcom/withings/comm/wpp/generated/object/Threshold;", "getHRTargetAtDate", "(JILorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "hrValue", "attrib", "createHRTarget", "(JIII)Lcom/withings/target/Target;", "updateHRTarget", "replaceHRThresholds", "(JLjava/util/List;Lqm0/d;)Ljava/lang/Object;", "", "isActivate", "changeHeartRateThresholdActivation", "(JIZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/target/WeightGoal;", "getWeightGoal", "(J)Lcom/withings/target/WeightGoal;", "getWeightGoalAtDate", "(JLorg/joda/time/DateTime;)Lcom/withings/target/WeightGoal;", "getWeightGoalAtDateFlow", "getWeightTarget", "getTemperatureTarget", "getWeightTargetAtDate", "getWeightTargetAtDateFlow", "getWeightSpeedTarget", "getWeightSpeedTargetAtDate", "getWeightSpeedTargetAtDateFlow", "weightGoal", "saveWeightTarget", "(JLcom/withings/target/WeightGoal;Lqm0/d;)Ljava/lang/Object;", "workoutCategory", "targetValue", "saveWorkoutTarget", "(JIILqm0/d;)Ljava/lang/Object;", "", "temperatureBaseline", "saveTemperatureTarget", "(JDLqm0/d;)Ljava/lang/Object;", "getLastActiveWorkoutTarget", "getLastActiveWorkoutTargetFlow", "getLastWorkoutTargetAtTheEndOfTheWeek", "(JILorg/joda/time/DateTime;)Lcom/withings/target/Target;", "disableWorkoutTarget", "getCurrentHealthGoalTarget", "getDefaultStepTarget", "getDefaultTemperatureTarget", "getDefaultHRTarget", "target", "createHRThreshold", "(Lcom/withings/target/Target;)Lcom/withings/comm/wpp/generated/object/Threshold;", "setMantissaToZeroIfDeactivatedBeforeDate", "(Lcom/withings/target/Target;Lorg/joda/time/DateTime;)Lcom/withings/target/Target;", "T", "clearAllDataIfMigrationFailed", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lcom/withings/target/data/TargetDataSource;", "dataSource", "Lcom/withings/target/data/TargetDataSource;", "defaultLowHrThreshold", "I", "defaultHighHrThreshold", "<init>", "(Landroid/content/Context;Lcom/withings/target/data/TargetDataSource;II)V", "Companion", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalTargetRepository implements TargetRepository {
    public static final Companion Companion = new Companion(null);
    private static final double MIN_TEMPERATURE_OFFSET = 0.01d;
    private static TargetRepository instance;
    private final Context context;
    private final TargetDataSource dataSource;
    private final int defaultHighHrThreshold;
    private final int defaultLowHrThreshold;

    /* compiled from: LocalTargetRepository.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007J(\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withings/target/data/LocalTargetRepository$Companion;", "", "()V", "MIN_TEMPERATURE_OFFSET", "", "instance", "Lcom/withings/target/data/TargetRepository;", "get", "init", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "dataSource", "Lcom/withings/target/data/TargetDataSource;", "defaultLowHrThreshold", "", "defaultHighHrThreshold", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final TargetRepository get() {
            TargetRepository targetRepository = LocalTargetRepository.instance;
            if (targetRepository != null) {
                return targetRepository;
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }

        public final TargetRepository init(Context context, TargetDataSource dataSource, int i11, int i12) {
            u.j(context, "context");
            u.j(dataSource, "dataSource");
            LocalTargetRepository.instance = new LocalTargetRepository(context, dataSource, i11, i12);
            TargetRepository targetRepository = LocalTargetRepository.instance;
            u.g(targetRepository);
            return targetRepository;
        }

        private Companion() {
        }
    }

    @Inject
    public LocalTargetRepository(Context context, TargetDataSource dataSource, int i11, int i12) {
        u.j(context, "context");
        u.j(dataSource, "dataSource");
        this.context = context;
        this.dataSource = dataSource;
        this.defaultLowHrThreshold = i11;
        this.defaultHighHrThreshold = i12;
    }

    private final <T> Flow<T> clearAllDataIfMigrationFailed(Flow<? extends T> flow) {
        return FlowKt.m83catch(flow, new LocalTargetRepository$clearAllDataIfMigrationFailed$1(this, null));
    }

    private final Threshold createHRThreshold(Target target) {
        int i11;
        Threshold threshold = new Threshold();
        if (target.getMeasureType() == 144) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        threshold.setId(i11);
        threshold.setEnabled(target.isActive() ? (short) 1 : (short) 0);
        threshold.setValue(target.getAsInt());
        return threshold;
    }

    public static final TargetRepository get() {
        return Companion.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Target getDefaultHRTarget(long j5, int i11) {
        int i12;
        DateTime now = DateTime.now();
        if (i11 == 143) {
            i12 = this.defaultLowHrThreshold;
        } else {
            i12 = this.defaultHighHrThreshold;
        }
        int i13 = i12;
        u.g(now);
        return new Target(null, null, j5, 1, i11, Integer.MIN_VALUE, i13, 0, true, null, now, now, now, false, 5, ConstantsWs.WS_STATUS_INVALID_FUTURE_DATE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Target getDefaultStepTarget(long j5) {
        DateTime now = DateTime.now();
        DateTime now2 = DateTime.now();
        DateTime now3 = DateTime.now();
        u.g(now2);
        u.g(now);
        u.g(now3);
        return new Target(null, null, j5, 2, 36, 1, 10000, 0, true, null, now2, now, now3, false, null, 25091, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Target getDefaultTemperatureTarget(long j5) {
        DateTime now = DateTime.now();
        DateTime now2 = DateTime.now();
        DateTime now3 = DateTime.now();
        u.g(now2);
        u.g(now);
        u.g(now3);
        return new Target(null, null, j5, 1, 208, 1, 37, 0, true, null, now2, now, now3, false, null, 25091, null);
    }

    public static final TargetRepository init(Context context, TargetDataSource targetDataSource, int i11, int i12) {
        return Companion.init(context, targetDataSource, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Target setMantissaToZeroIfDeactivatedBeforeDate(Target target, DateTime dateTime) {
        Target target2;
        Target copy$default;
        if (target != null) {
            if (target.getHasBeenManuallyDeactivated()) {
                DateTime deactivated = target.getDeactivated();
                u.g(deactivated);
                if (deactivated.isBefore(dateTime)) {
                    target2 = target;
                    if (target2 != null && (copy$default = Target.copy$default(target2, null, null, 0L, 0, 0, 0, 0, 0, false, null, null, null, null, false, null, 32703, null)) != null) {
                        return copy$default;
                    }
                }
            }
            target2 = null;
            if (target2 != null) {
                return copy$default;
            }
        }
        return target;
    }

    @Override // com.withings.target.data.TargetRepository
    public Object changeHeartRateThresholdActivation(long j5, int i11, boolean z5, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LocalTargetRepository$changeHeartRateThresholdActivation$2(this, j5, i11, z5, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // com.withings.target.data.TargetRepository
    public Target createHRTarget(long j5, int i11, int i12, int i13) {
        DateTime now = DateTime.now();
        u.g(now);
        return new Target(null, null, j5, 1, i11, Integer.MIN_VALUE, i12, 0, true, null, now, now, now, false, Integer.valueOf(i13), ConstantsWs.WS_STATUS_INVALID_FUTURE_DATE, null);
    }

    @Override // com.withings.target.data.TargetRepository
    public Object disableWorkoutTarget(long j5, int i11, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LocalTargetRepository$disableWorkoutTarget$2(this, j5, i11, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<List<Target>> getActiveStepTargetsForAllUser() {
        return clearAllDataIfMigrationFailed(FlowKt.distinctUntilChanged(this.dataSource.getActiveStepTargetsForAllUser()));
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<List<Target>> getAllActivatedTargetsForUserFlow(long j5) {
        return FlowKt.distinctUntilChanged(FlowKt.mapLatest(this.dataSource.getAllActivatedTargetsForUserFlow(j5), new LocalTargetRepository$getAllActivatedTargetsForUserFlow$1(null)));
    }

    @Override // com.withings.target.data.TargetRepository
    public List<Target> getAllTargetForUserSince(long j5, DateTime dateTime) {
        u.j(dateTime, "dateTime");
        return this.dataSource.getAllTargetForUserSince(j5, dateTime);
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getCurrentHealthGoalTarget(long j5) {
        return this.dataSource.getLastActiveTargetByTypeForUserFlow(j5, 5);
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getHRLastTarget(long j5, int i11) {
        return this.dataSource.getLastTargetForUser(j5, 1, i11);
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getHRLastTargetFlow(long j5, int i11) {
        return FlowKt.distinctUntilChanged(this.dataSource.getLastTargetForUserFlow(j5, 1, i11));
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getHRLastTargetOrDefault(long j5, int i11) {
        Target hRLastTarget = getHRLastTarget(j5, i11);
        if (hRLastTarget == null) {
            return getDefaultHRTarget(j5, i11);
        }
        return hRLastTarget;
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getHRLastTargetOrDefaultFlow(long j5, int i11) {
        return FlowKt.mapLatest(FlowKt.distinctUntilChanged(getHRLastTargetFlow(j5, i11)), new LocalTargetRepository$getHRLastTargetOrDefaultFlow$1(this, j5, i11, null));
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getHRTargetAtDate(final long j5, final int i11, DateTime dateTime) {
        u.j(dateTime, "dateTime");
        final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(this.dataSource.getTargetAtTimeFlow(j5, 1, i11, dateTime));
        return new Flow<Target>() { // from class: com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ int $hrMeasureType$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ long $userId$inlined;
                final /* synthetic */ LocalTargetRepository this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1$2", f = "LocalTargetRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LocalTargetRepository localTargetRepository, long j5, int i11) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = localTargetRepository;
                    this.$userId$inlined = j5;
                    this.$hrMeasureType$inlined = i11;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1$2$1 r0 = (com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1$2$1 r0 = new com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r8)
                        goto L4b
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        nm0.l.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        com.withings.target.Target r7 = (com.withings.target.Target) r7
                        if (r7 != 0) goto L42
                        com.withings.target.data.LocalTargetRepository r7 = r6.this$0
                        long r4 = r6.$userId$inlined
                        int r2 = r6.$hrMeasureType$inlined
                        com.withings.target.Target r7 = com.withings.target.data.LocalTargetRepository.access$getDefaultHRTarget(r7, r4, r2)
                    L42:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        nm0.y r7 = nm0.y.f85009a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.target.data.LocalTargetRepository$getHRTargetAtDate$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Target> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, j5, i11), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        };
    }

    @Override // com.withings.target.data.TargetRepository
    public Threshold getHRThreshold(long j5, int i11) {
        return createHRThreshold(getHRLastTargetOrDefault(j5, i11));
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getLastActiveStepTarget(long j5) {
        return this.dataSource.getLastActiveTargetForUser(j5, 2, 36);
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getLastActiveStepTargetFlow(long j5) {
        return clearAllDataIfMigrationFailed(FlowKt.distinctUntilChanged(this.dataSource.getLastActiveTargetForUserFlow(j5, 2, 36)));
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getLastActiveStepsTargetOrDefault(long j5) {
        Target lastActiveStepTarget = getLastActiveStepTarget(j5);
        if (lastActiveStepTarget == null) {
            return getDefaultStepTarget(j5);
        }
        return lastActiveStepTarget;
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getLastActiveStepsTargetOrDefaultFlow(final long j5) {
        final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(getLastActiveStepTargetFlow(j5));
        return new Flow<Target>() { // from class: com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ long $userId$inlined;
                final /* synthetic */ LocalTargetRepository this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1$2", f = "LocalTargetRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LocalTargetRepository localTargetRepository, long j5) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = localTargetRepository;
                    this.$userId$inlined = j5;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1$2$1 r0 = (com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1$2$1 r0 = new com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r8)
                        goto L49
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        nm0.l.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        com.withings.target.Target r7 = (com.withings.target.Target) r7
                        if (r7 != 0) goto L40
                        com.withings.target.data.LocalTargetRepository r7 = r6.this$0
                        long r4 = r6.$userId$inlined
                        com.withings.target.Target r7 = com.withings.target.data.LocalTargetRepository.access$getDefaultStepTarget(r7, r4)
                    L40:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L49
                        return r1
                    L49:
                        nm0.y r7 = nm0.y.f85009a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.target.data.LocalTargetRepository$getLastActiveStepsTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Target> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, j5), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        };
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getLastActiveWorkoutTarget(long j5, int i11) {
        Target lastActiveTargetForUser = this.dataSource.getLastActiveTargetForUser(j5, 4, i11);
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        return setMantissaToZeroIfDeactivatedBeforeDate(lastActiveTargetForUser, now);
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getLastActiveWorkoutTargetFlow(long j5, int i11) {
        return FlowKt.mapLatest(clearAllDataIfMigrationFailed(FlowKt.distinctUntilChanged(this.dataSource.getLastActiveTargetForUserFlow(j5, 4, i11))), new LocalTargetRepository$getLastActiveWorkoutTargetFlow$1(this, null));
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getLastWorkoutTargetAtTheEndOfTheWeek(long j5, int i11, DateTime dateTime) {
        u.g(dateTime);
        DateTime minusMinutes = dateTime.plusWeeks(1).withDayOfWeek(1).withTimeAtStartOfDay().minusMinutes(1);
        TargetDataSource targetDataSource = this.dataSource;
        u.g(minusMinutes);
        Target targetAtTime = targetDataSource.getTargetAtTime(j5, 4, i11, minusMinutes);
        if (targetAtTime != null) {
            return setMantissaToZeroIfDeactivatedBeforeDate(targetAtTime, minusMinutes);
        }
        return null;
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getSleepTarget(long j5) {
        DateTime now = DateTime.now();
        u.g(now);
        return new Target(null, null, j5, 3, 37, 1, 28800, 0, true, null, now, now, now, false, null, 16899, null);
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getStepsTargetOrDefault(long j5, DateTime date) {
        u.j(date, "date");
        Target targetAtTime = this.dataSource.getTargetAtTime(j5, 2, 36, date);
        if (targetAtTime == null) {
            return getDefaultStepTarget(j5);
        }
        return targetAtTime;
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getStepsTargetOrDefaultFlow(final long j5, DateTime date) {
        u.j(date, "date");
        final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(this.dataSource.getTargetAtTimeFlow(j5, 2, 36, date));
        return new Flow<Target>() { // from class: com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ long $userId$inlined;
                final /* synthetic */ LocalTargetRepository this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1$2", f = "LocalTargetRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LocalTargetRepository localTargetRepository, long j5) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = localTargetRepository;
                    this.$userId$inlined = j5;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1$2$1 r0 = (com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1$2$1 r0 = new com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r8)
                        goto L49
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        nm0.l.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        com.withings.target.Target r7 = (com.withings.target.Target) r7
                        if (r7 != 0) goto L40
                        com.withings.target.data.LocalTargetRepository r7 = r6.this$0
                        long r4 = r6.$userId$inlined
                        com.withings.target.Target r7 = com.withings.target.data.LocalTargetRepository.access$getDefaultStepTarget(r7, r4)
                    L40:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L49
                        return r1
                    L49:
                        nm0.y r7 = nm0.y.f85009a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.target.data.LocalTargetRepository$getStepsTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Target> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, j5), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        };
    }

    @Override // com.withings.target.data.TargetRepository
    public List<Target> getTargetsToSync(long j5) {
        return this.dataSource.getTargetToSync(j5);
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getTemperatureTarget(long j5) {
        return this.dataSource.getLastActiveTargetForUser(j5, 1, 208);
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getTemperatureTargetForDay(long j5, DateTime date) {
        u.j(date, "date");
        return this.dataSource.getTargetAtTimeFlow(j5, 1, 208, date);
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getTemperatureTargetOrDefaultFlow(final long j5, DateTime date) {
        u.j(date, "date");
        final Flow<Target> targetAtTimeFlow = this.dataSource.getTargetAtTimeFlow(j5, 1, 208, date);
        return new Flow<Target>() { // from class: com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ long $userId$inlined;
                final /* synthetic */ LocalTargetRepository this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1$2", f = "LocalTargetRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LocalTargetRepository localTargetRepository, long j5) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = localTargetRepository;
                    this.$userId$inlined = j5;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1$2$1 r0 = (com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1$2$1 r0 = new com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r8)
                        goto L49
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        nm0.l.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        com.withings.target.Target r7 = (com.withings.target.Target) r7
                        if (r7 != 0) goto L40
                        com.withings.target.data.LocalTargetRepository r7 = r6.this$0
                        long r4 = r6.$userId$inlined
                        com.withings.target.Target r7 = com.withings.target.data.LocalTargetRepository.access$getDefaultTemperatureTarget(r7, r4)
                    L40:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L49
                        return r1
                    L49:
                        nm0.y r7 = nm0.y.f85009a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.target.data.LocalTargetRepository$getTemperatureTargetOrDefaultFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Target> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, j5), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        };
    }

    @Override // com.withings.target.data.TargetRepository
    public WeightGoal getWeightGoal(long j5) {
        Target weightTarget = getWeightTarget(j5);
        Target weightSpeedTarget = getWeightSpeedTarget(j5);
        if (weightTarget != null && weightSpeedTarget != null) {
            return new WeightGoal(weightTarget.getAsDouble(), weightSpeedTarget.getAsDouble(), null, 4, null);
        }
        return null;
    }

    @Override // com.withings.target.data.TargetRepository
    public WeightGoal getWeightGoalAtDate(long j5, DateTime date) {
        u.j(date, "date");
        Target weightTargetAtDate = getWeightTargetAtDate(j5, date);
        Target weightSpeedTargetAtDate = getWeightSpeedTargetAtDate(j5, date);
        if (weightTargetAtDate != null && weightSpeedTargetAtDate != null) {
            return new WeightGoal(weightTargetAtDate.getAsDouble(), weightSpeedTargetAtDate.getAsDouble(), date);
        }
        return null;
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<WeightGoal> getWeightGoalAtDateFlow(long j5, DateTime date) {
        u.j(date, "date");
        return FlowKt.combine(FlowKt.distinctUntilChanged(getWeightTargetAtDateFlow(j5, date)), FlowKt.distinctUntilChanged(getWeightSpeedTargetAtDateFlow(j5, date)), new LocalTargetRepository$getWeightGoalAtDateFlow$1(date, null));
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getWeightSpeedTarget(long j5) {
        return this.dataSource.getLastActiveTargetForUser(j5, 1, 18);
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getWeightSpeedTargetAtDate(long j5, DateTime date) {
        u.j(date, "date");
        return this.dataSource.getTargetAtTime(j5, 1, 18, date);
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getWeightSpeedTargetAtDateFlow(long j5, DateTime date) {
        u.j(date, "date");
        return FlowKt.distinctUntilChanged(this.dataSource.getTargetAtTimeFlow(j5, 1, 18, date));
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getWeightTarget(long j5) {
        return this.dataSource.getLastActiveTargetForUser(j5, 1, 1);
    }

    @Override // com.withings.target.data.TargetRepository
    public Target getWeightTargetAtDate(long j5, DateTime date) {
        u.j(date, "date");
        return this.dataSource.getTargetAtTime(j5, 1, 1, date);
    }

    @Override // com.withings.target.data.TargetRepository
    public Flow<Target> getWeightTargetAtDateFlow(long j5, DateTime date) {
        u.j(date, "date");
        return FlowKt.distinctUntilChanged(this.dataSource.getTargetAtTimeFlow(j5, 1, 1, date));
    }

    @Override // com.withings.target.data.TargetRepository
    public DateTime mostRecentModified(long j5) {
        return this.dataSource.mostRecentModified(j5);
    }

    @Override // com.withings.target.data.TargetRepository
    public Object replaceHRThresholds(long j5, List<Target> list, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LocalTargetRepository$replaceHRThresholds$2(list, this, j5, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // com.withings.target.data.TargetRepository
    public Object saveStepTarget(long j5, int i11, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LocalTargetRepository$saveStepTarget$2(this, j5, i11, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // com.withings.target.data.TargetRepository
    public Object saveTargets(List<Target> list, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LocalTargetRepository$saveTargets$2(this, list, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106 A[RETURN] */
    @Override // com.withings.target.data.TargetRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object saveTemperatureTarget(long r32, double r34, qm0.d<? super nm0.y> r36) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.data.LocalTargetRepository.saveTemperatureTarget(long, double, qm0.d):java.lang.Object");
    }

    @Override // com.withings.target.data.TargetRepository
    public Object saveWeightTarget(long j5, WeightGoal weightGoal, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LocalTargetRepository$saveWeightTarget$2(this, j5, weightGoal, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // com.withings.target.data.TargetRepository
    public Object saveWorkoutTarget(long j5, int i11, int i12, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LocalTargetRepository$saveWorkoutTarget$2(this, j5, i11, i12, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // com.withings.target.data.TargetRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateHRTarget(java.util.List<com.withings.target.Target> r6, qm0.d<? super nm0.y> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.target.data.LocalTargetRepository$updateHRTarget$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.target.data.LocalTargetRepository$updateHRTarget$1 r0 = (com.withings.target.data.LocalTargetRepository$updateHRTarget$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.target.data.LocalTargetRepository$updateHRTarget$1 r0 = new com.withings.target.data.LocalTargetRepository$updateHRTarget$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$0
            com.withings.target.data.LocalTargetRepository r2 = (com.withings.target.data.LocalTargetRepository) r2
            nm0.l.b(r7)
            goto L3f
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            nm0.l.b(r7)
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
        L3f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r6.next()
            com.withings.target.Target r7 = (com.withings.target.Target) r7
            com.withings.target.data.TargetDataSource r4 = r2.dataSource
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r4.update(r7, r0)
            if (r7 != r1) goto L3f
            return r1
        L5a:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.data.LocalTargetRepository.updateHRTarget(java.util.List, qm0.d):java.lang.Object");
    }

    public /* synthetic */ LocalTargetRepository(Context context, TargetDataSource targetDataSource, int i11, int i12, int i13, m mVar) {
        this(context, targetDataSource, (i13 & 4) != 0 ? 35 : i11, (i13 & 8) != 0 ? 140 : i12);
    }
}
