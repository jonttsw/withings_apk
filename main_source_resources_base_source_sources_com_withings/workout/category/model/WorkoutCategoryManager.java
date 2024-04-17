package com.withings.workout.category.model;

import android.database.sqlite.SQLiteDatabase;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.d;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m0.t;
import org.joda.time.DateTime;
import sj0.a;
import u70.h;
import x70.b;
import z.e;
/* loaded from: classes5.dex */
public class WorkoutCategoryManager {
    private static WorkoutCategoryManager instance;
    private final a dao;
    private final h<Listener> listenerManager = new h<>();
    private final uj0.a provider;

    /* loaded from: classes5.dex */
    public interface Listener {
        void onCategoriesChanged(List<WorkoutCategory> list);
    }

    public WorkoutCategoryManager(a aVar, uj0.a aVar2) {
        this.dao = aVar;
        this.provider = aVar2;
    }

    private List<WorkoutCategory> filterNotChangedCategories(List<WorkoutCategory> list) {
        List<User> all = this.dao.getAll();
        ArrayList arrayList = new ArrayList();
        for (WorkoutCategory workoutCategory : list) {
            if (lambda$filterNotChangedCategories$2(all, workoutCategory)) {
                arrayList.add(workoutCategory);
            }
        }
        return arrayList;
    }

    public static WorkoutCategoryManager get() {
        WorkoutCategoryManager workoutCategoryManager = instance;
        if (workoutCategoryManager != null) {
            return workoutCategoryManager;
        }
        throw new IllegalStateException("You must call init before");
    }

    private WorkoutCategory getDefaultRunCategory() {
        WorkoutCategory workoutCategory = new WorkoutCategory();
        workoutCategory.setId(2L);
        workoutCategory.setName(this.provider.getString(C1987R.string._RUNNING_));
        workoutCategory.setNameResName(this.provider.getStringResourceNameId(C1987R.string._RUNNING_));
        workoutCategory.setGlyphName("run2");
        workoutCategory.setDistanceRelevant(true);
        workoutCategory.setFeatures(new String[]{"duration", ConstantsWs.SUBCATEGORY_FEATURE_CALORIES_BURNED, "hr", ConstantsWs.SUBCATEGORY_FEATURE_PHOTOS, "distance", ConstantsWs.SUBCATEGORY_FEATURE_PACE, "elevation", ConstantsWs.SUBCATEGORY_FEATURE_WAKE_SMARTPHONE_UP, ConstantsWs.SUBCATEGORY_FEATURE_VO2MAX});
        return workoutCategory;
    }

    private WorkoutCategory getDefaultWalkCategory() {
        WorkoutCategory workoutCategory = new WorkoutCategory();
        workoutCategory.setId(1L);
        workoutCategory.setName(this.provider.getString(C1987R.string._WALKING_));
        workoutCategory.setNameResName(this.provider.getStringResourceNameId(C1987R.string._WALKING_));
        workoutCategory.setGlyphName("walk");
        workoutCategory.setDistanceRelevant(true);
        workoutCategory.setFeatures(new String[]{"duration", ConstantsWs.SUBCATEGORY_FEATURE_CALORIES_BURNED, "hr", ConstantsWs.SUBCATEGORY_FEATURE_PHOTOS, "distance", ConstantsWs.SUBCATEGORY_FEATURE_PACE, "elevation", ConstantsWs.SUBCATEGORY_FEATURE_WAKE_SMARTPHONE_UP});
        return workoutCategory;
    }

    public static WorkoutCategoryManager init(a aVar, uj0.a aVar2) {
        WorkoutCategoryManager workoutCategoryManager = new WorkoutCategoryManager(aVar, aVar2);
        instance = workoutCategoryManager;
        return workoutCategoryManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$filterNotChangedCategories$1(WorkoutCategory workoutCategory, WorkoutCategory workoutCategory2) {
        if (workoutCategory.getId() == workoutCategory2.getId() && !workoutCategory.equals(workoutCategory2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$filterNotChangedCategories$2(List list, WorkoutCategory workoutCategory) {
        return t.g(list, new d(workoutCategory, 3));
    }

    public Map<Long, WorkoutCategory> getAllCategory() {
        List<User> all = this.dao.getAll();
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < all.size(); i11++) {
            WorkoutCategory workoutCategory = (WorkoutCategory) all.get(i11);
            hashMap.put(Long.valueOf(workoutCategory.getId()), workoutCategory);
        }
        return hashMap;
    }

    public WorkoutCategory getDefaultOtherCategory(int i11) {
        WorkoutCategory workoutCategory = new WorkoutCategory();
        workoutCategory.setId(i11);
        workoutCategory.setName(this.provider.getString(C1987R.string._OTHER_));
        workoutCategory.setNameResName(this.provider.getStringResourceNameId(C1987R.string._OTHER_));
        workoutCategory.setGlyphName(HealthConstants.Common.CUSTOM);
        workoutCategory.setDistanceRelevant(false);
        workoutCategory.setFeatures(new String[]{"duration", ConstantsWs.SUBCATEGORY_FEATURE_CALORIES_BURNED, "hr", ConstantsWs.SUBCATEGORY_FEATURE_PHOTOS});
        return workoutCategory;
    }

    public DateTime getLastUpdate() {
        return this.dao.r();
    }

    public List<WorkoutCategory> getWorkoutCategories() {
        return this.dao.q();
    }

    public WorkoutCategory getWorkoutCategory(int i11) {
        WorkoutCategory p11 = this.dao.p(i11);
        if (p11 == null) {
            b.d(getClass().getSimpleName(), android.support.v4.media.a.a("Couldn't find stored WorkoutCategory for category id ", i11), new Object[0]);
            if (i11 > 0) {
                if (i11 == 1) {
                    return getDefaultWalkCategory();
                }
                if (i11 == 2) {
                    return getDefaultRunCategory();
                }
                return getDefaultOtherCategory(i11);
            }
        }
        return p11;
    }

    public void registerListener(Listener listener) {
        this.listenerManager.b(listener);
    }

    public void setActivityCategories(List<WorkoutCategory> list) {
        List<WorkoutCategory> filterNotChangedCategories = filterNotChangedCategories(list);
        a aVar = this.dao;
        SQLiteDatabase writableDatabase = aVar.getOpenHelper().getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            aVar.deleteAll();
            for (WorkoutCategory workoutCategory : list) {
                aVar.insert(workoutCategory);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            this.listenerManager.f(new e(filterNotChangedCategories, 6));
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public void unregisterListener(Listener listener) {
        this.listenerManager.a(listener);
    }
}
