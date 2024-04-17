package com.withings.library.healthscore.utils;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.healthscore.HealthScoreDataProvider;
import com.withings.library.healthscore.models.api.ActivityAggregate;
import com.withings.library.healthscore.models.api.StepGoal;
import com.withings.library.healthscore.models.internal.activity.ActivityDayWithGoal;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: HealthScoreInputsProvider.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/withings/library/healthscore/utils/HealthScoreInputsProvider;", "", "", "Lcom/withings/library/healthscore/models/api/ActivityAggregate;", "activityAggregates", "Lcom/withings/library/healthscore/models/api/StepGoal;", "stepGoals", "Lcom/withings/library/healthscore/models/internal/activity/ActivityDayWithGoal;", "buildActivityDaysWithGoal", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "", "dateInMillis", "", "getGoalBeforeDate", "(Ljava/util/List;J)I", NavigationArguments.USER_ID, "Lkotlinx/datetime/Instant;", "dateOfScore", "defaultNumberOfWeekOfTheAcquisition", "heartDataNumberOfWeekOfTheAcquisition", "Lcom/withings/library/healthscore/models/internal/HealthScoreInputs;", "provide", "(JLkotlinx/datetime/Instant;IILqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/healthscore/HealthScoreDataProvider;", "healthScoreDataProvider", "Lcom/withings/library/healthscore/HealthScoreDataProvider;", "<init>", "(Lcom/withings/library/healthscore/HealthScoreDataProvider;)V", "HealthScore_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HealthScoreInputsProvider {
    private final HealthScoreDataProvider healthScoreDataProvider;

    public HealthScoreInputsProvider(HealthScoreDataProvider healthScoreDataProvider) {
        u.j(healthScoreDataProvider, "healthScoreDataProvider");
        this.healthScoreDataProvider = healthScoreDataProvider;
    }

    private final List<ActivityDayWithGoal> buildActivityDaysWithGoal(List<ActivityAggregate> list, List<StepGoal> list2) {
        List<ActivityAggregate> list3 = list;
        ArrayList arrayList = new ArrayList(x.y(list3, 10));
        for (ActivityAggregate activityAggregate : list3) {
            arrayList.add(new ActivityDayWithGoal(activityAggregate.getDateInMillis(), activityAggregate.getActiveMinuteVigorous(), activityAggregate.getActiveMinuteModerate(), activityAggregate.getStepsForTheDay(), getGoalBeforeDate(list2, activityAggregate.getDateInMillis())));
        }
        return arrayList;
    }

    private final int getGoalBeforeDate(List<StepGoal> list, long j5) {
        StepGoal stepGoal;
        ListIterator<StepGoal> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                stepGoal = listIterator.previous();
                if (stepGoal.component1() <= j5) {
                    break;
                }
            } else {
                stepGoal = null;
                break;
            }
        }
        StepGoal stepGoal2 = stepGoal;
        if (stepGoal2 != null) {
            return stepGoal2.getGoal();
        }
        return 10000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0394 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0402 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0438 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0470 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0505 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x055a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x076d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x076e  */
    /* JADX WARN: Type inference failed for: r1v75, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object provide(long r34, kotlinx.datetime.Instant r36, int r37, int r38, qm0.d<? super com.withings.library.healthscore.models.internal.HealthScoreInputs> r39) {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.healthscore.utils.HealthScoreInputsProvider.provide(long, kotlinx.datetime.Instant, int, int, qm0.d):java.lang.Object");
    }
}
