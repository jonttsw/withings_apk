package com.withings.workout.category.webservices;

import android.content.Context;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.lastupdate.LastUpdateCheckerKt;
import com.withings.webservices.legacy.lastupdate.UserLastUpdate;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.workout.category.model.WorkoutCategoryMigrationHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.joda.time.DateTime;
/* compiled from: SyncWorkoutCategory.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/withings/workout/category/webservices/SyncWorkoutCategory;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lorg/joda/time/DateTime;", "localLastUpdate", "", "shouldFetch", "(Lorg/joda/time/DateTime;)Z", "Lnm0/y;", "run", "()V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "", NavigationArguments.USER_ID, "J", "Lcom/withings/workout/category/model/WorkoutCategoryManager;", "workoutCategoryManager", "Lcom/withings/workout/category/model/WorkoutCategoryManager;", "Lcom/withings/workout/category/webservices/WorkoutCategoryRemoteRepository;", "workoutCategoryRemoteRepository", "Lcom/withings/workout/category/webservices/WorkoutCategoryRemoteRepository;", "<init>", "(Landroid/content/Context;JLcom/withings/workout/category/model/WorkoutCategoryManager;Lcom/withings/workout/category/webservices/WorkoutCategoryRemoteRepository;)V", "core-data-workout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SyncWorkoutCategory extends BaseSyncAction {
    private final Context context;
    private final long userId;
    private final WorkoutCategoryManager workoutCategoryManager;
    private final WorkoutCategoryRemoteRepository workoutCategoryRemoteRepository;

    public SyncWorkoutCategory(Context context, long j5, WorkoutCategoryManager workoutCategoryManager, WorkoutCategoryRemoteRepository workoutCategoryRemoteRepository) {
        u.j(context, "context");
        u.j(workoutCategoryManager, "workoutCategoryManager");
        u.j(workoutCategoryRemoteRepository, "workoutCategoryRemoteRepository");
        this.context = context;
        this.userId = j5;
        this.workoutCategoryManager = workoutCategoryManager;
        this.workoutCategoryRemoteRepository = workoutCategoryRemoteRepository;
    }

    private final boolean shouldFetch(DateTime dateTime) {
        DateTime dateTime2;
        UserLastUpdate user;
        LastUpdate lastUpdate = getLastUpdate();
        if (lastUpdate != null && (user = lastUpdate.getUser(this.userId)) != null) {
            dateTime2 = user.getSubcategory();
        } else {
            dateTime2 = null;
        }
        if (dateTime != null && dateTime2 != null && !LastUpdateCheckerKt.shouldMakeCallForLastUpdate(dateTime2, dateTime)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof SyncWorkoutCategory;
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() throws Exception {
        long j5;
        Object runBlocking$default;
        DateTime lastUpdate = this.workoutCategoryManager.getLastUpdate();
        if (shouldFetch(lastUpdate)) {
            WorkoutCategoryRemoteRepository withSyncContext = this.workoutCategoryRemoteRepository.withSyncContext(getSyncContext());
            if (lastUpdate != null) {
                j5 = lastUpdate.getMillis() / 1000;
            } else {
                j5 = 0;
            }
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SyncWorkoutCategory$run$activityCategories$1(withSyncContext, this, j5, null), 1, null);
            this.workoutCategoryManager.setActivityCategories((List) runBlocking$default);
            WorkoutCategoryMigrationHelper.get(this.context).setShouldRedownloadCategories(Boolean.FALSE);
        }
    }
}
