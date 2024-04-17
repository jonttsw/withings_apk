package com.withings.favorite.model;

import com.withings.contentproviders.model.content.TaskType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FavoriteCategoryMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"retrieveFavoriteCategory", "Lcom/withings/favorite/model/FavoriteCategory;", "Lcom/withings/contentproviders/model/content/TaskType;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FavoriteCategoryMapperKt {

    /* compiled from: FavoriteCategoryMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                TaskType taskType = TaskType.f35295a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TaskType taskType2 = TaskType.f35295a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TaskType taskType3 = TaskType.f35295a;
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TaskType taskType4 = TaskType.f35295a;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FavoriteCategory retrieveFavoriteCategory(TaskType taskType) {
        u.j(taskType, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return FavoriteCategory.Unknown;
                    }
                    return FavoriteCategory.Recipe;
                }
                return FavoriteCategory.Workout;
            }
            return FavoriteCategory.Article;
        }
        return FavoriteCategory.Discovery;
    }
}
