package com.withings.favorite.model;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavoriteSegmentedCategory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/withings/favorite/model/FavoriteSegmentedCategory;", "", "key", "", RemoteMessageConst.Notification.PRIORITY, "", "analyticsValue", CommonConstant.KEY_DISPLAY_NAME, "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", "getAnalyticsValue", "()Ljava/lang/String;", "getDisplayName", "()I", "getKey", "getPriority", FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, "Article", "Recipe", "Workout", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FavoriteSegmentedCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FavoriteSegmentedCategory[] $VALUES;
    public static final FavoriteSegmentedCategory All = new FavoriteSegmentedCategory(FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, 0, FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, 0, "all_categories", C1987R.string.bookmark_librarySection_All_filter);
    public static final FavoriteSegmentedCategory Article = new FavoriteSegmentedCategory("Article", 1, ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE, 1, "articles", C1987R.string.bookmark_labelArticles);
    public static final FavoriteSegmentedCategory Recipe = new FavoriteSegmentedCategory("Recipe", 2, ConstantsWs.WELLNESS_TASK_TYPE_RECIPE, 2, "recipes", C1987R.string.bookmark_labelRecipes);
    public static final FavoriteSegmentedCategory Workout = new FavoriteSegmentedCategory("Workout", 3, ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT, 3, "workouts", C1987R.string.bookmark_labelWorkouts);
    private final String analyticsValue;
    private final int displayName;
    private final String key;
    private final int priority;

    private static final /* synthetic */ FavoriteSegmentedCategory[] $values() {
        return new FavoriteSegmentedCategory[]{All, Article, Recipe, Workout};
    }

    static {
        FavoriteSegmentedCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private FavoriteSegmentedCategory(String str, int i11, String str2, int i12, String str3, int i13) {
        this.key = str2;
        this.priority = i12;
        this.analyticsValue = str3;
        this.displayName = i13;
    }

    public static a<FavoriteSegmentedCategory> getEntries() {
        return $ENTRIES;
    }

    public static FavoriteSegmentedCategory valueOf(String str) {
        return (FavoriteSegmentedCategory) Enum.valueOf(FavoriteSegmentedCategory.class, str);
    }

    public static FavoriteSegmentedCategory[] values() {
        return (FavoriteSegmentedCategory[]) $VALUES.clone();
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final int getDisplayName() {
        return this.displayName;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getPriority() {
        return this.priority;
    }
}
