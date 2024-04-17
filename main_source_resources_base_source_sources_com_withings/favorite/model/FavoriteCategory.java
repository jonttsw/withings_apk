package com.withings.favorite.model;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavoriteCategory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/withings/favorite/model/FavoriteCategory;", "", RemoteMessageConst.Notification.PRIORITY, "", "key", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getPriority", "()I", DeviceInfo.STR_TYPE_UNKNOWN, "Article", "Discovery", "Recipe", "Workout", "Companion", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FavoriteCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FavoriteCategory[] $VALUES;
    public static final Companion Companion;
    private final String key;
    private final int priority;
    public static final FavoriteCategory Unknown = new FavoriteCategory(DeviceInfo.STR_TYPE_UNKNOWN, 0, 0, "unknown");
    public static final FavoriteCategory Article = new FavoriteCategory("Article", 1, 1, ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE);
    public static final FavoriteCategory Discovery = new FavoriteCategory("Discovery", 2, 1, ConstantsWs.WELLNESS_TASK_TYPE_DISCOVERY);
    public static final FavoriteCategory Recipe = new FavoriteCategory("Recipe", 3, 2, ConstantsWs.WELLNESS_TASK_TYPE_RECIPE);
    public static final FavoriteCategory Workout = new FavoriteCategory("Workout", 4, 3, ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT);

    /* compiled from: FavoriteCategory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005J\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/withings/favorite/model/FavoriteCategory$Companion;", "", "()V", "getCategoryByPriority", "Lcom/withings/favorite/model/FavoriteCategory;", "", "getCategoryByType", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final FavoriteCategory getCategoryByPriority(int i11) {
            FavoriteCategory favoriteCategory = FavoriteCategory.Article;
            if (i11 != favoriteCategory.getPriority() && i11 != FavoriteCategory.Discovery.getPriority()) {
                FavoriteCategory favoriteCategory2 = FavoriteCategory.Recipe;
                if (i11 != favoriteCategory2.getPriority()) {
                    FavoriteCategory favoriteCategory3 = FavoriteCategory.Workout;
                    if (i11 != favoriteCategory3.getPriority()) {
                        return FavoriteCategory.Unknown;
                    }
                    return favoriteCategory3;
                }
                return favoriteCategory2;
            }
            return favoriteCategory;
        }

        public final FavoriteCategory getCategoryByType(String str) {
            u.j(str, "<this>");
            switch (str.hashCode()) {
                case -1984262325:
                    if (str.equals(ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT)) {
                        return FavoriteCategory.Workout;
                    }
                    break;
                case -934914674:
                    if (str.equals(ConstantsWs.WELLNESS_TASK_TYPE_RECIPE)) {
                        return FavoriteCategory.Recipe;
                    }
                    break;
                case -732377866:
                    if (str.equals(ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE)) {
                        return FavoriteCategory.Article;
                    }
                    break;
                case -121207376:
                    if (str.equals(ConstantsWs.WELLNESS_TASK_TYPE_DISCOVERY)) {
                        return FavoriteCategory.Discovery;
                    }
                    break;
            }
            return FavoriteCategory.Unknown;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FavoriteCategory[] $values() {
        return new FavoriteCategory[]{Unknown, Article, Discovery, Recipe, Workout};
    }

    static {
        FavoriteCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new Companion(null);
    }

    private FavoriteCategory(String str, int i11, int i12, String str2) {
        this.priority = i12;
        this.key = str2;
    }

    public static a<FavoriteCategory> getEntries() {
        return $ENTRIES;
    }

    public static FavoriteCategory valueOf(String str) {
        return (FavoriteCategory) Enum.valueOf(FavoriteCategory.class, str);
    }

    public static FavoriteCategory[] values() {
        return (FavoriteCategory[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public final int getPriority() {
        return this.priority;
    }
}
